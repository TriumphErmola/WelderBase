package com.example.welderbase.service.map;

import com.example.welderbase.model.Welder;
import com.example.welderbase.service.WelderServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class WelderServiceMap extends AbstractMapService<Welder,Long> implements WelderServiceImpl {
    @Override
    public Set<Welder> findAll() {
        return null;
    }

    @Override
    public Welder findById(Long aLong) {
        return null;
    }

    @Override
    public Welder save(Welder object) {
        return null;
    }

    @Override
    public void delete(Welder object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
