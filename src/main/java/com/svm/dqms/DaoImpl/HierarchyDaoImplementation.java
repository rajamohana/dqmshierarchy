package com.svm.dqms.DaoImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.svm.dqms.Dao.HierarchyDao;
import com.svm.dqms.Service.Log;
import com.svm.dqms.model.HierarchyModel;

@Repository
public class HierarchyDaoImplementation implements HierarchyDao {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	Log L;

	@Override
	@Transactional
	public List<String> getHierarchyDetails() {

        
		
		Session session = sessionFactory.getCurrentSession();
		
		String standQuery = "SELECT DISTINCT standard from public.isomapping";
		Query rootQuery = session.createSQLQuery(standQuery);
		List<Object[]> rows = rootQuery.list();
		List<String> standardcol = new ArrayList<String>(); 
		for(Object row:rows)
		{
			String s = (String)row.toString();
			if(!s.equals("(No mapping in 2018)"))
			{
				standardcol.add(s);
			}
			
			
		}
		standardcol.forEach(System.out::println);
		session.flush();
		session.clear();
		
		Session session2 = sessionFactory.getCurrentSession();
		List<String> jsmeamotmain = new ArrayList<String>();
		List<String> jsmeaoilmain = new ArrayList<String>();
		List<String> jsmeanavmain = new ArrayList<String>();
		List<String> jsmeamacmain = new ArrayList<String>();
		
		Map<String,List<String>> mainlist = new HashMap<>();
		
		for(String stand: standardcol)
		{
			
			if(stand.equals("jsmea_mot")) {
				String jsmeamot = "SELECT DISTINCT category from public.isomapping where standard = '"+stand+"'";
				Query jsmeamotquery = session2.createSQLQuery(jsmeamot);
				List<Object[]> jsmemotlist = jsmeamotquery.list();
				for(Object row:jsmemotlist)
				{
					String s = (String)row.toString();
					jsmeamotmain.add(s);
				}
				mainlist.put(stand, jsmeamotmain);
			}
			else if(stand.equals("jsmea_oil")){
				String jsmeaoil = "SELECT DISTINCT category from public.isomapping where standard = '"+stand+"'";
				Query jsmeaoilquery = session2.createSQLQuery(jsmeaoil);
				List<Object[]> jsmeoillist = jsmeaoilquery.list();
				for(Object row:jsmeoillist)
				{
					String s = (String)row.toString();
					jsmeaoilmain.add(s);
				}
				mainlist.put(stand, jsmeaoilmain);
			}
			else if(stand.equals("jsmea_nav")) {
				String jsmeanav = "SELECT DISTINCT category from public.isomapping where standard = '"+stand+"'";
				Query jsmeanavquery = session2.createSQLQuery(jsmeanav);
				List<Object[]> jsmenavlist = jsmeanavquery.list();
				for(Object row:jsmenavlist)
				{
					String s = (String)row.toString();
					jsmeanavmain.add(s);
				}
				mainlist.put(stand, jsmeanavmain);
			}
			else if(stand.equals("jsmea_mac")) {
			
				String jsmeamac = "SELECT DISTINCT category from public.isomapping where standard = '"+stand+"'";
				Query jsmeamacquery = session2.createSQLQuery(jsmeamac);
				List<Object[]> jsmemaclist = jsmeamacquery.list();
				for(Object row:jsmemaclist)
				{
					String s = (String)row.toString();
					jsmeamacmain.add(s);
				}
				mainlist.put(stand, jsmeamacmain);
				
			}
			
			
		}
		session2.flush();
		session2.clear();
		//System.out.println(jsmeamotmain);
		//System.out.println(jsmeamacmain);
		//System.out.println(jsmeaoilmain);
		//System.out.println(mainlist);
		
       List<HierarchyModel> hmodel = new ArrayList<>();
		Session session3 = sessionFactory.getCurrentSession();
		String query ="SELECT channel_id,standard,category,subcategory,contents from public.isomapping";
		Query allfields = session3.createSQLQuery(query);
		List<Object[]> allfieldslist = allfields.list();
		
		for(Object[] obj:allfieldslist)
		{
			HierarchyModel hm = new HierarchyModel();
			hm.setChannel_id(obj[0].toString());
			hm.setStandard(obj[1].toString());
			hm.setCategory(obj[2].toString());
			hm.setSubcategory(obj[3].toString());
			hmodel.add(hm);
		}
		
		System.out.println(hmodel);
		for(String jsval:jsmeaoilmain) {
		for(HierarchyModel hm:hmodel) {
			if(jsval.equals(hm.getCategory())) {
		
			
			System.out.println(hm.getChannel_id()+"  "+hm.getStandard()+"  "+hm.getCategory()+" "+hm.getSubcategory());
		
			}
			}
		}
		
		return null;
	}
}
