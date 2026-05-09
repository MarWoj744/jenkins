package pl.example.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.example.crudapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}