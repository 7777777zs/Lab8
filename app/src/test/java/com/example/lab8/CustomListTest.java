package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList mockCityList() {
        CustomList cityList = new CustomList(null, new ArrayList<>());
        cityList.addCity(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    @Test
    void testAdd() {
        CustomList cityList = mockCityList();
        assertEquals(1, cityList.getCount());
        City city = new City("Regina", "Saskatchewan");
        cityList.addCity(city);
        assertEquals(2, cityList.getCount());
    }

}
