package dk.strateg.martian.marsapp.entity;


import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// https://zetcode.com/springboot/crudrepository/

@Entity
public class Martian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long martianId;
    String firstName;
    String lastName;
    Integer baseId;
    Integer superId;

    public Martian(Long martianId, String firstName, String lastName, Integer baseId, Integer superId) {
        this.martianId = martianId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseId = baseId;
        this.superId = superId;
    }

    public Martian() {
    }

    public Long getMartianId() {
        return martianId;
    }

    public void setMartianId(Long martianId) {
        this.martianId = martianId;
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

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    @Override
    public String toString() {
        return "\nMartian{" +
                "martianId=" + martianId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseId=" + baseId +
                ", superId=" + superId +
                '}';
    }
}
