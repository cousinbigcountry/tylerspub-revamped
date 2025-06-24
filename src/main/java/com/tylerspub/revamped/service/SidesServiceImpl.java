package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Sides;
import com.tylerspub.revamped.repositories.SidesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SidesServiceImpl implements SidesService {
    private SidesRepository sidesRepository;

    @Autowired
    public SidesServiceImpl(SidesRepository sidesRepository) { this.sidesRepository = sidesRepository; }

    @Override
    public List<Sides> findAll() {return (List<Sides>) sidesRepository.findAll();}
    
    @Override
    public Sides findById(int id) {
        int theIdl = (int)id;
        Optional<Sides> result = sidesRepository.findById(theIdl);

        Sides sides = null;
        
        if(result.isPresent()) {
            sides = result.get();
        }
        else {
            throw new RuntimeException("Did not find sides with id: " + theIdl);
        }
        return sides;
    }

    @Override
    public void save(Sides sides) {
        sidesRepository.save(sides);
    }

    @Override
    public void deleteById(int id) {
        sidesRepository.deleteById(id);
    }


}
