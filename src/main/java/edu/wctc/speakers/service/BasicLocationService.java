package edu.wctc.speakers.service;

import edu.wctc.speakers.entity.Location;
import edu.wctc.speakers.repo.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicLocationService implements LocationService {
    private LocationRepository locationRepository;

    @Autowired
    public BasicLocationService(LocationRepository lr) {
        this.locationRepository = lr;
    }

    @Override
    public List<Location> getLocationList() {
        List<Location> list = new ArrayList<>();
        locationRepository.findAllByOrderByCountryAscName().forEach(list::add);
        return list;
    }
}
