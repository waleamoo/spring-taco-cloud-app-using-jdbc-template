package com.techqwerty.spring_taco_cloud_app.services;

import java.util.Optional;

import com.techqwerty.spring_taco_cloud_app.entities.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
