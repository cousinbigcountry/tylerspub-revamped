package com.tylerspub.revamped.repositories;


import com.tylerspub.revamped.domain.Entrees;
import com.tylerspub.revamped.domain.Sides;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SidesRepository extends CrudRepository<Sides,Integer> {
}
