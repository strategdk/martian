package dk.strateg.martian.marsapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryId implements Serializable {
    @Column(name = "base_id")
    private Integer baseId;

    @Column(name = "supply_id")
    private Integer supplyId;
}
