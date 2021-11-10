package com.example.scooterrentservice.repositories;

import com.example.scooterrentservice.models.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent, Long> {
}
