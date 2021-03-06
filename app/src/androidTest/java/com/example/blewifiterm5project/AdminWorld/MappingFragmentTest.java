package com.example.blewifiterm5project.AdminWorld;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.blewifiterm5project.R;
import com.google.firebase.auth.FirebaseAuth;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isSelected;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class MappingFragmentTest {

    private String emailAdmin = "admin@blewifi.com";
    private String passwordAdmin = "admin123";

    private String[] spinnerData = new String[]{"Building 2 Level 1","Building 2 Level 2"};

    //firebase auth
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(AdminHome.class);

    @Before
    public void setUp(){
        if(mAuth.getUid()==""){
            mAuth.signInWithEmailAndPassword(emailAdmin,passwordAdmin);
        }
        onView(withId(R.id.mapping)).perform(click());
        onView(withId(R.id.mappingFragment)).perform(click());
    }

    @Test
    public void testSpinner() throws InterruptedException {
        Thread.sleep(500);
        onView(withId(R.id.map_dropdown)).perform(click());
        onData(is(spinnerData[0])).perform(click());
        onView(withId(R.id.map_dropdown)).check(matches(withSpinnerText(spinnerData[0])));
        Thread.sleep(500);
        onView(withId(R.id.map_dropdown)).perform(click());
        onData(is(spinnerData[1])).perform(click());
        onView(withId(R.id.map_dropdown)).check(matches(withSpinnerText(spinnerData[1])));
    }
}
