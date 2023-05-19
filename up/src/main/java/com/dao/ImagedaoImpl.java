package com.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Fileinfo;

@Service
@Transactional(readOnly = false)
public class ImagedaoImpl implements Imagedao{
    
	@Autowired
	Dao dao;
	
	
	@Override
    @Transactional(readOnly = false)
	public void save(Fileinfo fileinfo) {
		// TODO Auto-generated method stub
		dao.save(fileinfo);
		
	}

}
