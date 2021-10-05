package edu.wctc.speakers.service;

import edu.wctc.speakers.entity.Speaker;

import java.util.List;

public interface SpeakerService {
    Speaker getSpeaker(int speakerId);

    List<Speaker> getSpeakerList();
}
