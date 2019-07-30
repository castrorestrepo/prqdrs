/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.java.udem.prqdrs.service;

import edu.java.udem.prqdrs.dao.PersonaRepository;
import edu.java.udem.prqdrs.dto.PersonaDto;
import edu.java.udem.prqdrs.entities.PersonaEntity;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class PersonaServiceImpl implements PersonaService {
    
    PersonaRepository personaRepository;
    @Autowired
    public PersonaServiceImpl( PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    
    @Override
    public PersonaDto addUser(PersonaDto user) {
       return this.getDTO(personaRepository.save(this.getEntity(user)));
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser(PersonaDto user) {
        personaRepository.delete(this.getEntity(user));

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonaDto> getPersonas() {
        List<PersonaDto> list = new ArrayList<PersonaDto>();
        List<PersonaEntity> list2 = this.personaRepository.findAll();
        list2.stream().forEach(p -> list.add(this.getDTO(p)));
        
        return list;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PersonaDto getPersonaByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private PersonaDto getDTO(PersonaEntity user) {
        ModelMapper modelMapper = new ModelMapper();
        PersonaDto dto = modelMapper.map(user, PersonaDto.class);
        return dto;
    }

    private PersonaEntity getEntity(PersonaDto user) {
        ModelMapper modelMapper = new ModelMapper();
        PersonaEntity entity = modelMapper.map(user, PersonaEntity.class);
        return entity;
    }

}

