package com.dethimodule4.service;

import com.dethimodule4.model.City;

public interface ICityService extends IGeneralService<City> {
    City findCityByName(String cityName);
}
