package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers= new ArrayList<Speaker>();
        Speaker speaker= new Speaker();
        speaker.setFirstName("prasanth");
        speaker.setLastName("shenoy");
        speakers.add(speaker);
        return speakers;
    }

}
