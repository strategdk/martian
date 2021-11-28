package dk.strateg.martian.marsapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name = "martian")
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Martian {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Martian martian = (Martian) o;
        return id != null && Objects.equals(id, martian.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}