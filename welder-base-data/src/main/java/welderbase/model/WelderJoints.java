package welderbase.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class WelderJoints extends BaseEntity {

    private String steelGrade;
    private int diametr;

    @ManyToOne
    private WorkPlace workplace;

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

    public WorkPlace getWorkplace() {
        return workplace;
    }

    public void setWorkplace(WorkPlace workplace) {
        this.workplace = workplace;
    }

    public Set<Welder> getWelders() {
        return welders;
    }

    public void setWelders(Set<Welder> welders) {
        this.welders = welders;
    }



    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "WelderJoints{" +
                "steelGrade='" + steelGrade + '\'' +
                ", diametr=" + diametr +
                ", workplace=" + workplace +
                ", welders=" + welders +
                '}';
    }
}
