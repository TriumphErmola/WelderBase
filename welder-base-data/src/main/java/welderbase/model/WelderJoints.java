package welderbase.model;

import javax.persistence.*;


@Entity
@Table(name = "welder_joints")
public class WelderJoints extends BaseEntity {

    @Column(name = "steel_grade")
    private String steelGrade;
    @Column(name = "diametr")
    private int diametr;

    @ManyToOne
    @JoinColumn(name = "welder_id")
    private Welder welder;

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

    public Welder getWelder() {
        return welder;
    }

    public void setWelder(Welder welder) {
        this.welder = welder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WelderJoints that = (WelderJoints) o;

        if (diametr != that.diametr) return false;
        if (steelGrade != null ? !steelGrade.equals(that.steelGrade) : that.steelGrade != null) return false;
        return welder != null ? welder.equals(that.welder) : that.welder == null;
    }

    @Override
    public int hashCode() {
        int result = steelGrade != null ? steelGrade.hashCode() : 0;
        result = 31 * result + diametr;
        result = 31 * result + (welder != null ? welder.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WelderJoints{" +
                "steelGrade='" + steelGrade + '\'' +
                ", diametr=" + diametr +
                ", welder=" + welder +
                '}';
    }
}
