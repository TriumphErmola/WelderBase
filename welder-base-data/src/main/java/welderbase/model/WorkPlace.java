package welderbase.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class WorkPlace extends BaseEntity{


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

        WorkPlace workPlace = (WorkPlace) o;

        if (position != null ? !position.equals(workPlace.position) : workPlace.position != null) return false;
        return joints != null ? joints.equals(workPlace.joints) : workPlace.joints == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
                "position='" + position + '\'' +
                ", joints=" + joints +
                '}';
    }
}
