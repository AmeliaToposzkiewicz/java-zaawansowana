package oop.showroom.service;

import oop.showroom.model.Vehicle;

import java.util.List;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();
}
