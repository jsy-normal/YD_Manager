package com.mbvan.mbvan.tsp.vehicle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mbvan.mbvan.common.domain.IId;


@Entity
@Table(name = "T_DRIVER_VAN")
public class DriverVan  implements java.io.Serializable,IId {

	private static final long serialVersionUID = 2229521834578300754L;
	
	private Long id;
	private Long driverId;
	private String vin;
	private String currentFlag; //1 current, 0 history


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Column(name = "DRIVER_ID")
	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	@Column(name = "VIN", length = 20)
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Column(name = "CURRENT_FLAG", length = 2)
	public String getCurrentFlag() {
		return currentFlag;
	}

	public void setCurrentFlag(String currentFlag) {
		this.currentFlag = currentFlag;
	}




	
	
	
}
