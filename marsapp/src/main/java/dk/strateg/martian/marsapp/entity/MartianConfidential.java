package dk.strateg.martian.marsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "martian_confidential")
@Entity
public class MartianConfidential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "martian_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", length = 32)
    private String firstName;

    @Column(name = "last_name", length = 32)
    private String lastName;

    @Column(name = "base_id")
    private Integer baseId;

    @Column(name = "super_id")
    private Integer superId;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "dna_id", length = 32)
    private String dnaId;

    public String getDnaId() {
        return dnaId;
    }

    public void setDnaId(String dnaId) {
        this.dnaId = dnaId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public Integer getBaseId() {
        return baseId;
    }

    public void setBaseId(Integer baseId) {
        this.baseId = baseId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}