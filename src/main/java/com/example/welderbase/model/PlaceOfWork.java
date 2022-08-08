package com.example.welderbase.model;

import java.util.ArrayList;
import java.util.List;

public class PlaceOfWork {

    private String nameOfPlace;

    private List<Welder> listOfWelder;

    public void addWelder(Welder welder) {
        listOfWelder.add(welder);
    }

    public void showWelder() {
        for (Welder welder : listOfWelder) {
            System.out.println(welder);
        }
    }

    public PlaceOfWork(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
        this.listOfWelder = new ArrayList<>();
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public List<Welder> getListOfWelder() {
        return listOfWelder;
    }

    public void setListOfWelder(List<Welder> listOfWelder) {
        this.listOfWelder = listOfWelder;
    }

    @Override
    public String toString() {
        return "PlaceOfWork{" +
                "nameOfPlace='" + nameOfPlace + '\'' +
                '}';
    }
}
