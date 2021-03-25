package com.svm.dqms.DaoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.svm.dqms.Dao.HierarchyDao;
import com.svm.dqms.Entity.IosMapping;
import com.svm.dqms.Service.Log;
import com.svm.dqms.dto.Category;
import com.svm.dqms.dto.Child;
import com.svm.dqms.dto.Children;
import com.svm.dqms.dto.MainObject;
import com.svm.dqms.dto.Subcategory;
import com.svm.dqms.model.HierarchyModel;

@Repository
public class HierarchyDaoImplementation implements HierarchyDao {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	Log L;

	@Override
	@Transactional
	public MainObject getHierarchyDetails() {

		Session session = sessionFactory.getCurrentSession();

		String standQuery = "SELECT channel_id ,standard,category,subcategory,contents,positions,item,suffix,status from public.isomapping";

		Query rootQuery = session.createSQLQuery(standQuery);
		List<Object[]> rows = rootQuery.list();
		IosMapping iosmapping = new IosMapping();
		
		List<IosMapping> lsIosmapping = new ArrayList<IosMapping>();
		MainObject mainObj = new MainObject();
		List<Child> lsChild = new ArrayList<Child>();
		Child child = new Child();
		List<Category> lsCategory = new ArrayList<Category>();
		Category categoryObj = new Category();
		List<Subcategory> lsSubcategory = new ArrayList<Subcategory>();
		Subcategory subCategoryObj = new Subcategory();
		List<Children> lsChildren = new ArrayList<Children>();
		Children children = new Children();

		for (Object row : rows) {

			List<?> temp = convertObjectToList(row);
			iosmapping = new IosMapping(temp.get(0).toString(), temp.get(1).toString(), temp.get(2).toString(),
					temp.get(3).toString(), temp.get(4).toString(), temp.get(5).toString(), temp.get(6).toString(),
					temp.get(7).toString(),temp.get(8).toString());
			lsIosmapping.add(iosmapping);

		}

		List<String> uniqueStandard = lsIosmapping.stream().map(IosMapping::getStandard).distinct()
				.collect(Collectors.toList());

		System.out.println(lsIosmapping.size());
		for (String standard : uniqueStandard) {
			List<IosMapping> sameStandardls = lsIosmapping.stream().filter(c -> c.getStandard().equals(standard))
					.collect(Collectors.toList());

			System.out.println("STD - " + standard + " -- " + sameStandardls.size());

			List<String> uniqueCategoryforStandard = sameStandardls.stream().map(IosMapping::getCategory).distinct()
					.collect(Collectors.toList());
			System.out.println("  CatCount - " + uniqueCategoryforStandard.size());

			for (String category : uniqueCategoryforStandard) {
				List<IosMapping> sameCategoryls = sameStandardls.stream().filter(c -> c.getCategory().equals(category))
						.collect(Collectors.toList());
				System.out.println("\tCat - " + category + " -- " + sameCategoryls.size());

				List<String> uniqueSubCategoryforCategory = sameCategoryls.stream().map(IosMapping::getSubcategory)
						.distinct().collect(Collectors.toList());

				System.out.println("\t  SubCatCount - " + uniqueSubCategoryforCategory.size());

				for (String subCategory : uniqueSubCategoryforCategory) {
					List<IosMapping> sameSubcategoryls = sameCategoryls.stream()
							.filter(c -> c.getSubcategory().equals(subCategory)).collect(Collectors.toList());
					System.out.println("\t\tSubCat - " + subCategory + " -- " + sameSubcategoryls.size());

					for (IosMapping iosmap : sameSubcategoryls) {
						children = new Children(Long.parseLong(iosmap.getChannelId()), iosmap.getSubcategory(), iosmap.getContents(), iosmap.getPositions(),
								iosmap.getItem(), iosmap.getSuffix(), iosmap.getSuffix());
						lsChildren.add(children);
					}
					subCategoryObj = new Subcategory(subCategory, lsChildren);
					lsChildren = new ArrayList<Children>();
					lsSubcategory.add(subCategoryObj);

				}
				categoryObj = new Category(category, lsSubcategory);
				lsSubcategory = new ArrayList<Subcategory>();
				lsCategory.add(categoryObj);

			}
			child = new Child(standard, lsCategory);
			lsCategory = new ArrayList<Category>();
			lsChild.add(child);

		}

		mainObj = new MainObject("Standard", lsChild);

		session.flush();
		session.clear();
		return mainObj;
	}

	public static List<?> convertObjectToList(Object obj) {
		List<?> list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			list = Arrays.asList((Object[]) obj);
		} else if (obj instanceof Collection) {
			list = new ArrayList<>((Collection<?>) obj);
		}
		return list;
	}
}
