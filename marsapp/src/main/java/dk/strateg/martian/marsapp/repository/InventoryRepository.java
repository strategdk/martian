package dk.strateg.martian.marsapp.repository;

import dk.strateg.martian.marsapp.entity.Inventory;
import dk.strateg.martian.marsapp.entity.InventoryId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, InventoryId> {
}