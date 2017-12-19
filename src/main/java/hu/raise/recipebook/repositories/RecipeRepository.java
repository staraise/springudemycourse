package hu.raise.recipebook.repositories;

import hu.raise.recipebook.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
    //
}
