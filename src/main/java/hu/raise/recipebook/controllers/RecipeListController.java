package hu.raise.recipebook.controllers;

import hu.raise.recipebook.repositories.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeListController{
    private RecipeRepository recipeRepository;

    public RecipeListController(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping(name = "/recipes")
    public String getRecipeList(Model model){
        model.addAttribute("recipes", this.recipeRepository.findAll());
        return "recipes";
    }
}
