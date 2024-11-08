package com.mbvan.mbvan.tsp.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mbvan.mbvan.tsp.vehicle.domain.DriverVan;

@Repository
public interface DriverVanRepository extends PagingAndSortingRepository<DriverVan, Long> {
	
	@Query(" select dv from DriverVan dv where dv.vin=?1 and dv.currentFlag = '1' ")
	public List<DriverVan> getCurrentDriverVanByVin(String vin);
	
	@Query(" select dv from DriverVan dv where dv.driverId=?1 and dv.currentFlag = '1' ")
	public List<DriverVan> getCurrentDriverVanByDriver(Long driverId);
	
}