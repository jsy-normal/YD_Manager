package com.mbvan.mbvan.tsp.vehicle.service;

import org.springframework.transaction.annotation.Transactional;

import com.mbvan.mbvan.common.service.BaseCrudService;
import com.mbvan.mbvan.tsp.vehicle.domain.Vehicle;
import com.mbvan.mbvan.tsp.vehicle.domain.VehicleLocationHistory;

@Transactional(readOnly = true)
public interface VehicleService extends BaseCrudService<Vehicle>{

//	public Vehicle findCarByVin(String vin);
//	
//	public List<Vehicle> findCarsByUserId(Long userId);
//	
//	@Transactional
//	public UserCar addCarToUser(Long userId, Vehicle car);

    public void deleteByVin(String VIN);
    public Vehicle findByVin(String VIN);
//    public CurrentDriverAndTask getCurrentDriverAndTask(String VIN);
    
    public VehicleLocationHistory addVehicleLocationHistory(VehicleLocationHistory vehicleLocationHistory);

    public VehicleLocationHistory findVehicleLocationHistoryById(Long vehicleLocationHistoryId);
}
