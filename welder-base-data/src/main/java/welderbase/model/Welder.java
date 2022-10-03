package welderbase.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Welder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
                "id=" + id +
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

        return id != null ? id.equals(welder.id) : welder.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
