package br.com.fean.inventory_service.infrastructure.repositories;

import br.com.fean.inventory_service.domain.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    Optional<Inventory> findByProductCode(String productCode);
}