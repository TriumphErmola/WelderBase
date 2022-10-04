package welderbase.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Welder extends BaseEntity{

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "welders")
    private Set<WelderJoints> welderJointsSet = new HashSet<>();

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
