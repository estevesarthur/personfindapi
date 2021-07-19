package com.personfind.personfindapi.repository;

import com.personfind.personfindapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    }