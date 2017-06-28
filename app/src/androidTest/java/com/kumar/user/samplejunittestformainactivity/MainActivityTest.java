package com.kumar.user.samplejunittestformainactivity;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by User on 6/28/2017.
 */
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mainActivity=null;


    //before executing the test case
    @Before
    public void setUp() throws Exception {

        mainActivity=mainActivityActivityTestRule.getActivity();

    }

    @Test
    public void testLaunch(){

        View view=mainActivity.findViewById(R.id.tv);
        assertNotNull(view);

    }

    //after executing the test case


    @After
    public void tearDown() throws Exception {
        mainActivity=null;

    }

}