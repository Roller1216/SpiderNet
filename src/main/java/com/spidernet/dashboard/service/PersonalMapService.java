package com.spidernet.dashboard.service;

import com.spidernet.dashboard.entity.PersonalMap;

public interface PersonalMapService
{

    Boolean addPersonalMap(PersonalMap personalMap);

    PersonalMap fetchByEmpId(String employeeId);

    Boolean updatePersonalMap(PersonalMap personalMap);
    
    String findPersonalMapIdByEmpId(String employeeId);
}
