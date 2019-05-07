package com.wipro.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.model.MainModel;

@Repository("mainDao")
public class MainDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public String toStore(MainModel mainModel)
	{
		sessionFactory.getCurrentSession().save(mainModel);
		return "show";
	}
}
