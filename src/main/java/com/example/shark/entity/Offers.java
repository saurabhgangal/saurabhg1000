package com.example.shark.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Offers {
    @Id
    String id ;
    String investor;
    float amount ;
    float equity ;
    String comment;

}
