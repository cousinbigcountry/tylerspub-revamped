package com.tylerspub.revamped.repositories;


import com.tylerspub.revamped.domain.Brunch;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrunchRepository extends CrudRepository<Brunch,Integer> {
}
