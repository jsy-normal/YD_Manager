package com.mbvan.mbvan.tsp.vehicle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mbvan.mbvan.common.domain.IId;


@Entity
@Table(name = "T_TASK_ASSIGNMENT")
public class TaskAssignment  implements java.io.Serializable,IId {

	private static final long serialVersionUID = 2229521834578300754L;
	
	private Long id;
	private Long taskId;
	private String vin;




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "TASK_ID")
	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}



	@Column(name = "VIN", length = 20)
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}


}
