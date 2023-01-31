package oop.showroom.service;

import oop.showroom.model.Car;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.BrandType;
import oop.showroom.repository.VehicleRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleServiceTest {
    @Test
    public void should_add_new_vehicle() {
        //given
        BrandType brandType = BrandType.AUDI;
        boolean isUsed = false;
        //and
        Vehicle audi = new Car();
        audi.setBrand(brandType);
        audi.setUsed(isUsed);
        //and
        VehicleService vehicleService = new VehicleServiceImpl();
        //and
        assertTrue(VehicleRepository.vehicles.isEmpty());
        //when
        vehicleService.addVehicle(audi);
        //then
        assertFalse(VehicleRepository.vehicles.isEmpty());
        assertEquals(1,VehicleRepository.vehicles.size());
        //and
        Vehicle vehicle = VehicleRepository.vehicles.get(0);
        assertNotNull(vehicle);
        assertEquals(brandType,vehicle.getBrand());
        assertEquals(isUsed,vehicle.isUsed());
    }
}
