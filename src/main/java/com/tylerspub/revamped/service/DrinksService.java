package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Drinks;

import java.util.List;

public interface DrinksService {
    public List<Drinks> findAll();
    public Drinks findById(int id);
    public void save(Drinks drinks);
    public void deleteById(int id);
}
