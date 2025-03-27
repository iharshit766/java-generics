package com.bridgelabz.mealPlanGenerator;

// MealUtils.java
import java.util.List;

public class MealUtils {
    public static <T extends MealPlan> void generateMealPlan(List<T> meals) {
        if (meals.isEmpty()) {
            System.out.println("❌ No meal plan selected!");
            return;
        }
        System.out.println("✅ Personalized Meal Plan Generated:");
        for (T meal : meals) {
            System.out.println("- " + meal.getMealType());
        }
    }
}
