package com.mbvan.mbvan.tsp.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mbvan.mbvan.tsp.vehicle.domain.TaskAssignment;

@Repository
public interface TaskAssignmentRepository extends PagingAndSortingRepository<TaskAssignment, Long> {
	
	
	@Query(" select ta from TaskAssignment ta where ta.vin = ?1 order by ta.id desc ")
	public List<TaskAssignment> findByVin(String vin);
    
    public List<TaskAssignment> findByTaskId(long taskId);
    
}