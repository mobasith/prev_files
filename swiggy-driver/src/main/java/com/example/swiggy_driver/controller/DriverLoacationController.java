package com.example.swiggy_driver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swiggy_driver.service.DriverLocationService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class DriverLoacationController {

    @Autowired
    DriverLocationService driverLocationService;

    @PutMapping("/locations")
    public ResponseEntity<Map<String, String>> updateLocation() {
        int range = 100;
        while (range > 0) {
            String cordinates = Math.random() + " , " + Math.random();
            // System.out.println(Math.random() + " , " + Math.random());
            driverLocationService.updateLocation(cordinates);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            range--;
        }
        return new ResponseEntity<>(Map.of("message", "Location Updated!"), HttpStatus.OK);
    }
}
