package dk.strateg.martian.marsapp.repository;

import dk.strateg.martian.marsapp.entity.Inventory;
import dk.strateg.martian.marsapp.entity.InventoryId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DataJpaTest
class InventoryRepositoryTest {


    @Autowired
    TestEntityManager entityManager;

    @Autowired
    InventoryRepository sut;

    @Test
    void should_save_inventory() {
        final var INVENTORY_ID = new InventoryId(1, 2);
        final var QUANTITY = 100;

        Inventory inventory = new Inventory(INVENTORY_ID, QUANTITY);
        inventory = sut.saveAndFlush(inventory);

        assertEquals(inventory.getId(), INVENTORY_ID);
        var actual = sut.findById(INVENTORY_ID);

        assertTrue(actual.isPresent());
        assertEquals(inventory.getId(), actual.get().getId());
        assertEquals(inventory.getQuantity(), actual.get().getQuantity());
    }
}