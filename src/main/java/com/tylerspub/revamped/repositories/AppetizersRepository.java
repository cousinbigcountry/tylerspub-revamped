package com.tylerspub.revamped.repositories;

import com.tylerspub.revamped.domain.Appetizers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppetizersRepository extends CrudRepository<Appetizers,Integer> {
}
