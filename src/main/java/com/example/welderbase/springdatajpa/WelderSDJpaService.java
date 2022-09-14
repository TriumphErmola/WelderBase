package com.example.welderbase.springdatajpa;

import com.example.welderbase.model.Welder;
import com.example.welderbase.repository.WelderRepository;
import com.example.welderbase.service.WelderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class WelderSDJpaService implements WelderService {

    private final WelderRepository welderRepository;

    @Autowired
    public WelderSDJpaService(WelderRepository welderRepository) {
        this.welderRepository = welderRepository;
    }

    @Override
    public Set<Welder> findAll() {
        Set<Welder> welders = new HashSet<>();
        welderRepository.findAll().forEach(welders::add);
        return welders;
    }

    @Override
    public Welder findById(Long aLong) {
        return welderRepository.findById(aLong).orElse(null);
    }

    @Override
    public Welder save(Welder object) {
        return welderRepository.save(object);
    }

    @Override
    public void delete(Welder object) {
        welderRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        welderRepository.deleteById(aLong);
    }
}
