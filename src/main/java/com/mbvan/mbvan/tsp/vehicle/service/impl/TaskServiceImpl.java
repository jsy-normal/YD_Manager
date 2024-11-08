package com.mbvan.mbvan.tsp.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbvan.mbvan.common.service.impl.DefaultCrudService;
import com.mbvan.mbvan.tsp.vehicle.domain.Task;
import com.mbvan.mbvan.tsp.vehicle.domain.TaskAssignment;
import com.mbvan.mbvan.tsp.vehicle.repository.TaskAssignmentRepository;
import com.mbvan.mbvan.tsp.vehicle.repository.TaskRepository;
import com.mbvan.mbvan.tsp.vehicle.service.TaskService;

/**
 * Created with IntelliJ IDEA.
 * User: fenliang
 * Date: 1/11/13
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Service()
public class TaskServiceImpl extends DefaultCrudService<Task> implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    TaskAssignmentRepository taskAssignmentRepository;
    
    
    @Override
    protected PagingAndSortingRepository<Task, Long> getDefaultRepository() {
        return taskRepository;  //To change body of implemented methods use File | Settings | File Templates.
    }

	@Override
	@Transactional
	public void delete(Long id) {
		List<TaskAssignment> taList = taskAssignmentRepository.findByTaskId(id);
		if(taList!= null || (taList!= null &&!taList.isEmpty())){
			
		}
		else{
			super.delete(id);
		}
		
	}

	@Override
	public Task getCurrentTaskByVin(String vin){
		Task currentTask = null;
		List<Task> tasks = taskRepository.findCurrentTasksByVin(vin);
		if(tasks != null && !tasks.isEmpty()){
			currentTask = tasks.get(0);
		}
		return currentTask;
	}
	
	
	@Override
	public List<Task> findUnassignedTasks() {
		return taskRepository.findUnassignedTasks();
	}
   
    
    
}
