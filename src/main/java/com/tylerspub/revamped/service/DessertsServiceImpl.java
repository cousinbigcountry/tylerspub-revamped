package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Desserts;
import com.tylerspub.revamped.repositories.DessertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DessertsServiceImpl implements DessertsService {
    private DessertsRepository dessertsRepository;

    @Autowired
    public DessertsServiceImpl(DessertsRepository dessertsRepository) { this.dessertsRepository = dessertsRepository; }

    @Override
    public List<Desserts> findAll() {return (List<Desserts>) dessertsRepository.findAll();}
    
    @Override
    public Desserts findById(int id) {
        int theIdl = (int)id;
        Optional<Desserts> result = dessertsRepository.findById(theIdl);

        Desserts desserts = null;
        
        if(result.isPresent()) {
            desserts = result.get();
        }
        else {
            throw new RuntimeException("Did not find desserts with id: " + theIdl);
        }
        return desserts;
    }

    @Override
    public void save(Desserts desserts) {
        dessertsRepository.save(desserts);
    }

    @Override
    public void deleteById(int id) {
        dessertsRepository.deleteById(id);
    }


}
