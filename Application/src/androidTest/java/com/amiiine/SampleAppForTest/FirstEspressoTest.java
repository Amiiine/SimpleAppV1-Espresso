package com.amiiine.SampleAppForTest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Amine on 26/12/2016.
 */

@RunWith(AndroidJUnit4.class)
public class FirstEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void firstTest() {
        // Click on the Click Me button
        onView(withId(R.id.clickHereButton)).perform(click());
        // Check that the text is displayed on the second activity
        onView(withId(R.id.resultTextView)).check(matches(withText("Welcome to the coolest app ever")));
    }

}
