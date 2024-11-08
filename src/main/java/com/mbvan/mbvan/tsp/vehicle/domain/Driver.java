package com.mbvan.mbvan.tsp.vehicle.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mbvan.mbvan.common.domain.IId;


@Entity
@Table(name = "T_DRIVER")
public class Driver implements java.io.Serializable,IId {

	private static final long serialVersionUID = -1098691516672915961L;

	private Long id;
	private String name;
	private String licenseNumber;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 40)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LICENSE_NUMBER", length = 40)
	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

}
