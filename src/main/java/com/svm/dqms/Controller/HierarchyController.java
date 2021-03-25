package com.svm.dqms.Controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.svm.dqms.Dao.HierarchyDao;
import com.svm.dqms.dto.MainObject;

@CrossOrigin
@RestController
@RequestMapping("/api/hierarchy/")
public class HierarchyController {

	@Autowired
	HierarchyDao hierarchyDao;

	@RequestMapping(method = RequestMethod.GET, value = "/gethierarchydetails/")
	public MainObject  getHierarchyDetails() {

		//ResponseEntity<Object>
		//return new ResponseEntity<>(hierarchyDao.getHierarchyDetails().toMap(), HttpStatus.OK);
		return hierarchyDao.getHierarchyDetails();
	}

}
