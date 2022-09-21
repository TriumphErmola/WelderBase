package com.example.welderbase.repository;

import com.example.welderbase.domain.model.Welder;
import org.springframework.data.repository.CrudRepository;

public interface WelderRepository extends CrudRepository<Welder,Long> {
}
