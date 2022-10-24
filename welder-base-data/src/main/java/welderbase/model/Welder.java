package welderbase.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "welders")
public class Welder extends BaseEntity{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "welder")
    private Set<WelderJoints> welderJointsSet = new HashSet<>();

    @ManyToOne
    private WorkPlace workPlace;

    public Welder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public Welder() {
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

    public Set<WelderJoints> getWelderJointsSet() {
        return welderJointsSet;
    }

    public void setWelderJointsSet(Set<WelderJoints> welderJointsSet) {
        this.welderJointsSet = welderJointsSet;
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Welder{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", welderJointsSet=" + welderJointsSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Welder welder = (Welder) o;

        if (firstName != null ? !firstName.equals(welder.firstName) : welder.firstName != null) return false;
        if (lastName != null ? !lastName.equals(welder.lastName) : welder.lastName != null) return false;
        return welderJointsSet != null ? welderJointsSet.equals(welder.welderJointsSet) : welder.welderJointsSet == null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
