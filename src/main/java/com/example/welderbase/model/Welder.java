package com.example.welderbase.model;

public class Welder extends Employee{

    private String naks;
    private Specialties spec;

    public Welder() {
    }

    public Welder(String firstName, String lastName, String patronymic, String phoneNumber, Double lengthOfService, int age, String specialties, Specialties spec, String naks, Specialties spec1) {
        super(firstName, lastName, patronymic, phoneNumber, lengthOfService, age, specialties, spec);
        this.naks = naks;
        this.spec = spec1;
    }


    public String getNaks() {
        return naks;
    }

    @Override
    public Specialties getSpec() {
        return spec;
    }

    public void setNaks(String naks) {
        this.naks = naks;
    }

    @Override
    public void setSpec(Specialties spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Welder{" +
                "naks='" + naks + '\'' +
                ", spec=" + spec +
                '}';
    }
}
