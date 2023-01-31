package oop.showroom.service;

import oop.showroom.exceptions.BadObjectException;
import oop.showroom.exceptions.NotFoundException;
import oop.showroom.model.Vehicle;
import oop.showroom.model.enums.BrandType;
import oop.showroom.repository.VehicleRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static oop.showroom.exceptions.ExceptionMessages.OBJECT_CANT_BE_NULL;
import static oop.showroom.exceptions.ExceptionMessages.OBJECT_NOT_FOUND_BY_PROVIDED_ID;

public class VehicleServiceImpl implements VehicleService {

    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleRepository.add(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return VehicleRepository.getVehicles();
    }

    /**
     * Metoda pozwalająca na pobranie z repozytorium pojazdów danej marki
     *
     * @param brandType marka pojazdu
     * @return lista pojazdów
     */
    @Override
    public List<Vehicle> getVehiclesByBrand(BrandType brandType) {
        Optional.ofNullable(brandType).orElseThrow(() -> new BadObjectException(OBJECT_CANT_BE_NULL));
        return VehicleRepository.getVehicles().stream().filter(v -> brandType.equals(v.getBrand())).collect(Collectors.toList());
    }

    /**
     * Metoda pozwalajca na usuniecie pojazdu o danym id
     *
     * @param id identyfikator pojazdu
     */
    @Override
    public void removeVehicle(Long id) {
        Optional.ofNullable(id).orElseThrow(() -> new BadObjectException(OBJECT_CANT_BE_NULL));
        var vehicle = VehicleRepository.findById(id).orElseThrow(() -> new NotFoundException(OBJECT_NOT_FOUND_BY_PROVIDED_ID));
        VehicleRepository.remove(vehicle);
    }


}
