package com.bridgelabz.mealPlanGenerator;

// Meal.java
import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public void displayMeals() {
        for (T meal : meals) {
            System.out.println(meal.getMealType());
        }
    }
}
