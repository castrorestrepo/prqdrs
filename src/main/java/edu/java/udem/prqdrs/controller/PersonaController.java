/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqdrs.controller;

import edu.java.udem.prqdrs.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/personas")
public class PersonaController {
    
    PersonaService personaService = null;

    @Autowired
    PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
}

