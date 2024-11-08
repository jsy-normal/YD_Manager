package com.mbvan.mbvan.tsp.vehicle.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mbvan.mbvan.common.service.BaseCrudService;
import com.mbvan.mbvan.tsp.vehicle.domain.Task;

/**
 * Created with IntelliJ IDEA.
 * User: fenliang
 * Date: 1/11/13
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional(readOnly = true)
public interface TaskService extends BaseCrudService<Task> {

	public List<Task> findUnassignedTasks();
	
	public Task getCurrentTaskByVin(String vin);
	
}
