package welderbase.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class WorkPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String position;

    @OneToMany
    @JoinColumn(name = "workplace_id")
    private Set<WelderJoints> joints = new HashSet<>();

    public WorkPlace(String position) {
        this.position = position;
    }

    public WorkPlace() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public Set<WelderJoints> getJoints() {
        return joints;
    }

    public void setJoints(Set<WelderJoints> joints) {
        this.joints = joints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkPlace workplace = (WorkPlace) o;

        return position != null ? position.equals(workplace.position) : workplace.position == null;
    }

    @Override
    public int hashCode() {
        return position != null ? position.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", joints=" + joints +
                '}';
    }
}
