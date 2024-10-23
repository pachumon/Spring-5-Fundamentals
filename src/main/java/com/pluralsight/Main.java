package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SpeakerService service= new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}