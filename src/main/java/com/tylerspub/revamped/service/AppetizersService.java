package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Appetizers;

import java.util.List;

public interface AppetizersService {
    public List<Appetizers> findAll();
    public Appetizers findById(int id);
    public void save(Appetizers appetizers);
    public void deleteById(int id);
}
