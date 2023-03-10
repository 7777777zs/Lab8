package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    @Test
    void testAddException() {
        CustomList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);
        assertThrows( IllegalArgumentException.class, () -> {
            cityList.addCity(city); });
    }
    @Test
    public void testHasCity() {
        CustomList cityList = mockCityList();
        City city1 = mockCity();
        cityList.addCity(city1);
        City city2 = new City("Calgary", "Alberta");
        assertTrue(cityList.hasCity(city1));
        assertFalse(cityList.hasCity(city2));
    }
    @Test
    void testDelete() {
        CustomList cityList = mockCityList();
        City city1 = new City("Charlottetown", "Prince Edward Island");
        cityList.addCity(city1);
        City city2 = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city2);
        cityList.deleteCity(city1);
        assertFalse(cityList.hasCity(city1));
        cityList.deleteCity(city2);
        assertFalse(cityList.hasCity(city2));
    }
    @Test
    void testDeleteException() {
        CustomList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        assertThrows( IllegalArgumentException.class, () -> {
            cityList.deleteCity(city); });
    }
//    @Test
//    void testCount() {
//        CustomList cityList = mockCityList();
//        assertEquals(1, cityList.countCities());
//        City city = new City("Charlottetown", "Prince Edward Island");
//        cityList.addCity(city);
//        assertEquals(2, cityList.countCities());
//        cityList.deleteCity(city);
//        assertEquals(1, cityList.countCities());
//
//    }
}
