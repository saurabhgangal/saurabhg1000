package com.example.shark.controller;

import com.example.shark.dto.newOfferRequest;
import com.example.shark.entity.Pitches;
import com.example.shark.repositry.OffersRepositry;
import com.example.shark.repositry.PitchesReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController {

    @Autowired
    private OffersRepositry offersRepositry;

    @Autowired
    private PitchesReposity pitchesReposity;

    @PostMapping("/placeOffers")
    public  Pitches placeOffer(@RequestBody newOfferRequest request){
        return pitchesReposity.save(request.getPitches());
    }
    @GetMapping("")
    public List<Pitches> findAllOffers(){
        return pitchesReposity.findAll();
    }

}
