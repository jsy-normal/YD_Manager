package com.mbvan.mbvan.common.service;

import org.springframework.data.domain.Page;

public interface BaseCrudService<T> {

	public T findById(Long id) ;
	
	public void delete(Long id) ;
	

	public T create(T t) ;

	public T update(T t) ;

	public Iterable<T> findAll() ;

	public Page<T> findByPage(int pageNumber, int pageSize) ;
	
}
