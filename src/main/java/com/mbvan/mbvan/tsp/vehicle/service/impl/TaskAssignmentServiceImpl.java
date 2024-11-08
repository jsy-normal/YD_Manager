package com.mbvan.mbvan.tsp.vehicle.service.impl;

import java.util.List;

import com.mbvan.mbvan.common.service.impl.DefaultCrudService;
import com.mbvan.mbvan.common.util.AssertUtil;
import com.mbvan.mbvan.tsp.vehicle.domain.TaskAssignment;
import com.mbvan.mbvan.tsp.vehicle.repository.TaskAssignmentRepository;
import com.mbvan.mbvan.tsp.vehicle.service.TaskAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: fenliang
 * Date: 1/11/13
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Service()
public class TaskAssignmentServiceImpl extends DefaultCrudService<TaskAssignment> implements TaskAssignmentService {
    @Autowired
    TaskAssignmentRepository taskAssignmentRepository;

    @Override
    protected PagingAndSortingRepository<TaskAssignment, Long> getDefaultRepository() {
        return taskAssignmentRepository;
    }

	@Override
	@Transactional
	public TaskAssignment assignTask(TaskAssignment taskAssignment) {
		String vin = taskAssignment.getVin();
		Long taskId = taskAssignment.getTaskId();
		AssertUtil.notEmpty(vin, " vin ");
		AssertUtil.notNull(taskId, " taskId ");
		
		taskAssignment = this.create(taskAssignment);
		return taskAssignment;
	}

	
	@Override
	@Transactional
	public void unassignTask(Long taskAssignmentId) {
		AssertUtil.notNull(taskAssignmentId, " taskAssignmentId ");
		this.delete(taskAssignmentId);
	}
	
	
//	@Override
//	public TaskAssignment findCurrentTaskAssignmentByVin(String vin) {
//		List<TaskAssignment> taList = taskAssignmentRepository.findByVin(vin);
//		if(taList != null && !taList.isEmpty()){
//			TaskAssignment currentTa = taList.get(0);
//			return currentTa;
//		}
//		return null;
//	}
	
	@Override
	public List<TaskAssignment> findTaskAssignmentListByVin(String vin) {
		List<TaskAssignment> taList = taskAssignmentRepository.findByVin(vin);
		return taList;
	}
	
	
}
