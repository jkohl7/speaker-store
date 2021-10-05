package edu.wctc.speakers.repo;

import edu.wctc.speakers.entity.Speaker;
import org.springframework.data.repository.CrudRepository;

public interface SpeakerRepository extends CrudRepository<Speaker, Integer> {

}
