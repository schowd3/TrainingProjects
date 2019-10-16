package com.antra.service;

import com.antra.aop.LogTime;
import com.antra.repository.MyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{


	@Autowired
	private MyDAO myDAO;

	@LogTime
	public int getTicketPrice() {
		return myDAO.getSomething();
	}
}
