package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;

import com.udacity.gradle.builditbigger.task.EndpointGCETask;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class EndpointGCETaskTest extends AndroidTestCase {

    @Test
    public void iTest() throws Exception {
        EndpointGCETask task = new EndpointGCETask();
        task.execute(InstrumentationRegistry.getContext());
        String joke = task.get(5, TimeUnit.SECONDS);
        Assert.assertNotNull(joke);
    }
}
