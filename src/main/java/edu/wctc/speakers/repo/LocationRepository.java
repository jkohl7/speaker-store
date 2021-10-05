package edu.wctc.speakers.repo;

import edu.wctc.speakers.entity.Location;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Integer> {
    List<Location> findAllByOrderByCountryAscName();
}
