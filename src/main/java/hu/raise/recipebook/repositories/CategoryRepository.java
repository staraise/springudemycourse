package hu.raise.recipebook.repositories;

import hu.raise.recipebook.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long>{

    Optional<Category> findByCategoryName(String categoryName);
}
