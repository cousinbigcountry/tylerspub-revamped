package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Desserts;

import java.util.List;

public interface DessertsService {
    public List<Desserts> findAll();
    public Desserts findById(int id);
    public void save(Desserts desserts);
    public void deleteById(int id);
}
