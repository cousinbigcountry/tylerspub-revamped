package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Brunch;

import java.util.List;

public interface BrunchService {
    public List<Brunch> findAll();
    public Brunch findById(int id);
    public void save(Brunch brunch);
    public void deleteById(int id);
}
