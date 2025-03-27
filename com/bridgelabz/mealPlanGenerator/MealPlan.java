package com.bridgelabz.mealPlanGenerator;

// MealPlan.java
public interface MealPlan {
    String getMealType();
}

// Vegetarian Meal
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian Meal Plan";
    }
}

// Vegan Meal
class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan Meal Plan";
    }
}

// Keto Meal
class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto Meal Plan";
    }
}

// High-Protein Meal
class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein Meal Plan";
    }
}
