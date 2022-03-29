package com.lsh.home.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsh.home.model.dao.HomeDao;

@Service
public class HomeService {
	@Autowired
	private HomeDao dao;
	
}
