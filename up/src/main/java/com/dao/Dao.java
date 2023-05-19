package com.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Fileinfo;

@Repository
@Transactional(readOnly = false)
public class Dao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
    @Transactional(readOnly = false)
	public void save(Fileinfo info)
	{
		hibernateTemplate.save(info);
	}

}
