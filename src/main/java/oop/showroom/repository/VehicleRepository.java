package oop.showroom.repository;

import oop.showroom.exceptions.BadObjectException;
import oop.showroom.exceptions.ExceptionMessages;
import oop.showroom.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static oop.showroom.exceptions.ExceptionMessages.OBJECT_CANT_BE_NULL;

public class VehicleRepository {
    private static Long id = 0L;

    private static final List<Vehicle> vehicles = new ArrayList<>();

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }

    public static void add(Vehicle vehicle) {
        vehicle.setId(id);
        id++;
    }

    public static void remove(Long id) {
        vehicles.removeIf(vehicle -> id.equals(vehicle.getId()));
    }
    public static void remove(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    public static Optional<Vehicle> findById(Long id) {
        var result = vehicles.stream().filter(v -> id.equals(v.getId())).toList();
        return Optional.ofNullable(result.get(0));
    }
}
