package org.hocviencntt.business.service;

import java.util.List;

import org.hocviencntt.business.model.Business;
import org.hocviencntt.business.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	BusinessRepository businessRepository;

	public List<Business> findByUserName(String username) {
		// TODO Auto-generated method stub
		return businessRepository.findByUserName(username);
	}


	
	

}