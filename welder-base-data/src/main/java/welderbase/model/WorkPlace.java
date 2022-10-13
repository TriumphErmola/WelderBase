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
