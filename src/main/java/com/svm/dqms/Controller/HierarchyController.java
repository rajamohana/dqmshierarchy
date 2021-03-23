package com.svm.dqms.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svm.dqms.Dao.HierarchyDao;


@CrossOrigin
@RestController
@RequestMapping("/api/hierarchy/")
public class HierarchyController {
	
	@Autowired
	HierarchyDao hierarchyDao;
	
	@RequestMapping(method = RequestMethod.GET, value = "/gethierarchydetails/")
	public String  getHierarchyDetails(){
		
		hierarchyDao.getHierarchyDetails();
		
		return null;
	}
	
}
