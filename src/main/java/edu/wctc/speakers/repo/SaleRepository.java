package edu.wctc.speakers.repo;

import edu.wctc.speakers.entity.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SaleRepository extends CrudRepository<Sale, Integer> {
    List<Sale> findAllBySpeakerIdOrderByBoughtAt(int speakerId);
}
