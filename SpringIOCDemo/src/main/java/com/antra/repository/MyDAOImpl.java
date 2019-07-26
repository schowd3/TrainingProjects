package com.antra.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyDAOImpl implements MyDAO {

	@Autowired
	private String message = "123";

	public int getSomething() {
		System.out.println(message);
		return 1;
	}
}
