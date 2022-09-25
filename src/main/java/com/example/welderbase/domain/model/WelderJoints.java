package com.example.welderbase.domain.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class WelderJoints {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String steelGrade;
    private int diametr;

    @ManyToMany
    @JoinTable(name = "welder_joint",joinColumns = @JoinColumn(name = "welder_joint_id"),
    inverseJoinColumns = @JoinColumn(name = "welder_id"))
    private Set<Welder> welders = new HashSet<>();

    public WelderJoints(String steelGrade, int diametr) {
        this.steelGrade = steelGrade;
        this.diametr = diametr;
    }

    public WelderJoints() {
    }

    public String getSteelGrade() {
        return steelGrade;
    }

    public void setSteelGrade(String steelGrade) {
        this.steelGrade = steelGrade;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public Set<Welder> getWelders() {
        return welders;
    }

    public void setWelders(Set<Welder> welders) {
        this.welders = welders;
    }

    @Override
    public String toString() {
        return "WelderJoints{" +
                "id=" + id +
                ", steelGrade='" + steelGrade + '\'' +
                ", diametr=" + diametr +
                ", welders=" + welders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelderJoints that = (WelderJoints) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
