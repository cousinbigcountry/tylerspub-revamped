package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Entrees;

import java.util.List;

public interface EntreesService {
    public List<Entrees> findAll();
    public Entrees findById(int id);
    public void save(Entrees entrees);
    public void deleteById(int id);
}
