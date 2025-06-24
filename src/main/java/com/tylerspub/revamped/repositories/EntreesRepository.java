package com.tylerspub.revamped.repositories;


import com.tylerspub.revamped.domain.Appetizers;
import com.tylerspub.revamped.domain.Entrees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntreesRepository extends CrudRepository<Entrees,Integer> {
}
