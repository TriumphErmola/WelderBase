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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelderJoints that = (WelderJoints) o;

        if (diametr != that.diametr) return false;
        if (steelGrade != null ? !steelGrade.equals(that.steelGrade) : that.steelGrade != null) return false;
        if (workplace != null ? !workplace.equals(that.workplace) : that.workplace != null) return false;
        return welders != null ? welders.equals(that.welders) : that.welders == null;
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
