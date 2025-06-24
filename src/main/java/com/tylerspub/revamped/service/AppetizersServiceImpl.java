package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Appetizers;
import com.tylerspub.revamped.repositories.AppetizersRepository;
import com.tylerspub.revamped.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppetizersServiceImpl implements AppetizersService {
    private AppetizersRepository appetizersRepository;

    @Autowired
    public AppetizersServiceImpl(AppetizersRepository appetizersRepository) { this.appetizersRepository = appetizersRepository; }

    @Override
    public List<Appetizers> findAll() {return (List<Appetizers>) appetizersRepository.findAll();}

    @Override
    public Appetizers findById(int id) {
        int theIdl = (int)id;
        Optional<Appetizers> result = appetizersRepository.findById(theIdl);

        Appetizers appetizers = null;

        if(result.isPresent()) {
            appetizers = result.get();
        }
        else {
            throw new RuntimeException("Did not find appetizer with id: " + theIdl);
        }
        return appetizers;
    }

    @Override
    public void save(Appetizers appetizers) {
        appetizersRepository.save(appetizers);
    }

    @Override
    public void deleteById(int id) {
        appetizersRepository.deleteById(id);
    }


}
