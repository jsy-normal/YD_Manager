package com.mbvan.mbvan.tsp.vehicle.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mbvan.mbvan.common.domain.IId;


@Entity
@Table(name = "T_VEHICLE")
public class Vehicle  implements java.io.Serializable,IId {


	private static final long serialVersionUID = 4129080538677197195L;
	private Long id;
	private String vin;
	private String model;
	private String plateNumber;
	private Long latestLocationHistoryID;
	private String loadsItems;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "VIN", unique=true, nullable=false, length = 20 )
	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	
	@Column(name = "MODEL", length = 40)
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "PLATE_NUMBER", length = 40)
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@Column(name = "LATEST_LOCATION_HISTORY_ID")
	public Long getLatestLocationHistoryID() {
		return latestLocationHistoryID;
	}

	public void setLatestLocationHistoryID(Long latestLocationHistoryID) {
		this.latestLocationHistoryID = latestLocationHistoryID;
	}

	@Column(name = "loads_items", length = 2000)
	public String getLoadsItems() {
		return loadsItems;
	}

	public void setLoadsItems(String loadsItems) {
		this.loadsItems = loadsItems;
	}

	
}
