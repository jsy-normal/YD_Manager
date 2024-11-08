package com.mbvan.mbvan.common.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.mbvan.mbvan.common.domain.IId;
import com.mbvan.mbvan.common.service.BaseCrudService;
import com.mbvan.mbvan.common.util.RequestUtil;


public abstract class DefaultCrudService<T extends IId>  implements BaseCrudService<T>{

	protected abstract PagingAndSortingRepository<T, Long> getDefaultRepository();
	
	
	public T findById(Long id) {
		return getDefaultRepository().findOne(id);
	}
	
	@Transactional
	public void delete(Long id) {
		getDefaultRepository().delete(id);
	}
	
	@Transactional
	public T create(T t) {
		return getDefaultRepository().save(t);
	}
	
	@Transactional
	public T update(T t) {
		T persist = getDefaultRepository().findOne(t.getId());
		RequestUtil.copyNotNullField(t, persist);
		return getDefaultRepository().save(persist);
	}

	public Iterable<T> findAll() {
		return getDefaultRepository().findAll();
	}

	public Page<T> findByPage(int pageNumber, int pageSize) {
		Pageable pageable = new PageRequest(pageNumber, pageSize);
		return getDefaultRepository().findAll(pageable);
	}
}
