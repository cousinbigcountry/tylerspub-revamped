package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Brunch;
import com.tylerspub.revamped.repositories.BrunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrunchServiceImpl implements BrunchService {
    private BrunchRepository brunchRepository;

    @Autowired
    public BrunchServiceImpl(BrunchRepository brunchRepository) { this.brunchRepository = brunchRepository; }

    @Override
    public List<Brunch> findAll() {return (List<Brunch>) brunchRepository.findAll();}

    @Override
    public Brunch findById(int id) {
        int theIdl = (int)id;
        Optional<Brunch> result = brunchRepository.findById(theIdl);

        Brunch brunch = null;

        if(result.isPresent()) {
            brunch = result.get();
        }
        else {
            throw new RuntimeException("Did not find brunch with id: " + theIdl);
        }
        return brunch;
    }

    @Override
    public void save(Brunch brunch) {
        brunchRepository.save(brunch);
    }

    @Override
    public void deleteById(int id) {
        brunchRepository.deleteById(id);
    }



}
