package hu.raise.recipebook.repositories;

import hu.raise.recipebook.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientsRepository extends CrudRepository<Ingredient, Long>{
}
