package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.repository.VehicleRepository;

import java.util.List;

public class VehicleServiceImpl implements VehicleService {

    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.vehicles.add(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
       return VehicleRepository.vehicles;

    }
}
