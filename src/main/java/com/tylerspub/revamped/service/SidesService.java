package com.tylerspub.revamped.service;


import com.tylerspub.revamped.domain.Sides;

import java.util.List;

public interface SidesService {
    public List<Sides> findAll();
    public Sides findById(int id);
    public void save(Sides sides);
    public void deleteById(int id);
}
