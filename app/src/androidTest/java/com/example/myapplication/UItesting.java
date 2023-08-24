package com.example.myapplication;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
public class UItesting {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testSameInputs() {
        // Ingresa la misma palabra en los campos de entrada
        onView(withId(R.id.firstWord)).perform(typeText("hola"));
        onView(withId(R.id.secondWord)).perform(typeText("hola"));

        // Hace clic en el botón
        onView(withId(R.id.button)).perform(click());

        // Verifica que el TextView muestre el mensaje correcto
        onView(withId(R.id.textView)).check(matches(withText("Las palabras son iguales")));
    }
}
