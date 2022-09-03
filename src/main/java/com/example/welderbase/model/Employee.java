package com.example.welderbase.model;

public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String Patronymic;
    private String phoneNumber;
    private Double lengthOfService;
    private int age;
    private String specialties;
    private Specialties spec;

    public Employee(String firstName, String lastName, String patronymic, String phoneNumber,
                    Double lengthOfService, int age, String specialties, Specialties spec) {
        this.firstName = firstName;
        this.lastName = lastName;
        Patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.lengthOfService = lengthOfService;
        this.age = age;
        this.specialties = specialties;
        this.spec = spec;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getLengthOfService() {
        return lengthOfService;
    }

    public void setLengthOfService(Double lengthOfService) {
        this.lengthOfService = lengthOfService;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public Specialties getSpec() {
        return spec;
    }

    public void setSpec(Specialties spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lengthOfService=" + lengthOfService +
                ", age=" + age +
                ", specialties='" + specialties + '\'' +
                ", spec=" + spec +
                '}';
    }
}