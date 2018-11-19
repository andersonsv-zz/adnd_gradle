package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.task.EndpointGCETask;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(AndroidJUnit4.class)
public class EndpointGCETaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void tellJokeTest() throws Exception {
        EndpointGCETask endpointGCETask = new EndpointGCETask(mActivityTestRule.getActivity(), null);
        endpointGCETask.execute(mActivityTestRule.getActivity());

        String result = endpointGCETask.get();
        assertThat(result.isEmpty(), is(false));
    }
}
