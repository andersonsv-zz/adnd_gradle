package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

import com.udacity.gradle.builditbigger.task.EndpointGCETask;

import org.junit.Test;

public class EndpointGCETaskTest extends AndroidTestCase {

        @Test
        public void testVerifyAsyncTask(){
            EndpointGCETask endpointGCETask = new EndpointGCETask(null);
            endpointGCETask.execute();
            String result = null;
            try {
                result = endpointGCETask.get();
            } catch (Exception e) {
                Log.i("Test", e.getMessage());
                e.printStackTrace();
            }
            assertNotNull(result);
        }
}
