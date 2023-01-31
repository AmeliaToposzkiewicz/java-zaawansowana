package oop.showroom.service;

import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.BrandType;

import java.util.List;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();

    List<Vehicle> getVehiclesByBrand(BrandType brandType);

    void removeVehicle(Long id);
}
