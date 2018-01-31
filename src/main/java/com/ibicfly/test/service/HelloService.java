package com.ibicfly.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibicfly.test.dao.HelloDao;


@Service
public class HelloService {
	@Autowired
	private HelloDao helloDao;
	public String queryNameById(int id)
	{
		helloDao.getName(id);
		System.out.println("进入service");
		return null;
	}
}
