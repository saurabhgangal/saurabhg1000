package com.example.shark.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pitches {


    @Id
    @GeneratedValue
    String pitchId;
    String entrepreneur ;
    String pitchTitle;
    String pitchIdea;
    float askAmount ;
    float equity;
    @OneToMany(targetEntity = Offers.class , cascade =  CascadeType.ALL)
    @JoinColumn(name = "of_fk",referencedColumnName = "id")
    private List<Offers> offers;

}
