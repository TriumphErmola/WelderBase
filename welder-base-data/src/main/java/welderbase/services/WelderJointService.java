package welderbase.services;

import welderbase.model.WelderJoints;

import java.util.Set;

public interface WelderJointService {

    WelderJoints findById(Long id);

    Set<WelderJoints> findAll();

    WelderJoints save(WelderJoints welderJoints);
}
