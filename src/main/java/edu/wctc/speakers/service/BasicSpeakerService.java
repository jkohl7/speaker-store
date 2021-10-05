package edu.wctc.speakers.service;

import edu.wctc.speakers.entity.Speaker;
import edu.wctc.speakers.repo.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasicSpeakerService implements SpeakerService {
    private SpeakerRepository speakerRepository;

    @Autowired
    public BasicSpeakerService(SpeakerRepository sr) {
        this.speakerRepository = sr;
    }

    @Override
    public Speaker getSpeaker(int speakerId) {
        Optional<Speaker> s = speakerRepository.findById(speakerId);
        if (s.isPresent()) {
            return s.get();
        }

        return null;
    }

    @Override
    public List<Speaker> getSpeakerList() {
        return null;
    }
}
