package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Drinks;
import com.tylerspub.revamped.repositories.DrinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinksServiceImpl implements DrinksService {
    private DrinksRepository drinksRepository;

    @Autowired
    public DrinksServiceImpl(DrinksRepository drinksRepository) { this.drinksRepository = drinksRepository; }

    @Override
    public List<Drinks> findAll() {return (List<Drinks>) drinksRepository.findAll();}
    
    @Override
    public Drinks findById(int id) {
        int theIdl = (int)id;
        Optional<Drinks> result = drinksRepository.findById(theIdl);

        Drinks drinks = null;
        
        if(result.isPresent()) {
            drinks = result.get();
        }
        else {
            throw new RuntimeException("Did not find drinks with id: " + theIdl);
        }
        return drinks;
    }

    @Override
    public void save(Drinks drinks) {
        drinksRepository.save(drinks);
    }

    @Override
    public void deleteById(int id) {
        drinksRepository.deleteById(id);
    }


}
