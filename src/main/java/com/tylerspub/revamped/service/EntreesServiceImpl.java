package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Entrees;
import com.tylerspub.revamped.repositories.EntreesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntreesServiceImpl implements EntreesService {
    private EntreesRepository entreesRepository;

    @Autowired
    public EntreesServiceImpl(EntreesRepository entreesRepository) { this.entreesRepository = entreesRepository; }

    @Override
    public List<Entrees> findAll() {return (List<Entrees>) entreesRepository.findAll();}
    
    @Override
    public Entrees findById(int id) {
        int theIdl = (int)id;
        Optional<Entrees> result = entreesRepository.findById(theIdl);

        Entrees entrees = null;
        
        if(result.isPresent()) {
            entrees = result.get();
        }
        else {
            throw new RuntimeException("Did not find entrees with id: " + theIdl);
        }
        return entrees;
    }

    @Override
    public void save(Entrees entrees) {
        entreesRepository.save(entrees);
    }

    @Override
    public void deleteById(int id) {
        entreesRepository.deleteById(id);
    }


}
