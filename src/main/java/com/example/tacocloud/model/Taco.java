package com.example.tacocloud.model;

import java.util.List;
// end::allButValidation[]

// tag::allButValidation[]
import lombok.Data;

@Data
public class Taco {

    // end::allButValidation[]

    // tag::allButValidation[]
    private String name;
    // end::allButValidation[]

    // tag::allButValidation[]
    private List<String> ingredients;

}