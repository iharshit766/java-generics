package com.bridgelabz.mealPlanGenerator;

// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating meal plans
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal proteinMeal = new HighProteinMeal();

        // Managing meals using generic Meal class
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        vegetarianMeals.addMeal(vegMeal);

        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(veganMeal);

        // Displaying individual meal categories
        System.out.println(" Vegetarian Meals:");
        vegetarianMeals.displayMeals();

        System.out.println("\n Vegan Meals:");
        veganMeals.displayMeals();

        // Using generic method to generate a personalized meal plan
        System.out.println("\n🍽️ Generating Personalized Meal Plan:");
        List<MealPlan> selectedMeals = new ArrayList<>();
        selectedMeals.add(vegMeal);
        selectedMeals.add(proteinMeal);
        MealUtils.generateMealPlan(selectedMeals);
    }
}
