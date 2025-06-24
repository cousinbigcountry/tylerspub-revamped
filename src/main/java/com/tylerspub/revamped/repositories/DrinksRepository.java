package com.tylerspub.revamped.repositories;


import com.tylerspub.revamped.domain.Appetizers;
import com.tylerspub.revamped.domain.Drinks;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DrinksRepository extends CrudRepository<Drinks,Integer> {
}
