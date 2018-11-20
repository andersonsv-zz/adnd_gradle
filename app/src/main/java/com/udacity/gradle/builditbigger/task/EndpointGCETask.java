package com.udacity.gradle.builditbigger.task;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

import andersonsv.com.br.showjokelib.ShowJokeActivity;

import static andersonsv.com.br.showjokelib.util.ExtraUtil.EXTRA_GCE_RESULT;

public class EndpointGCETask extends AsyncTask<Context, Void, String> {
    private static MyApi myApiService = null;
    private Context mContext;
    private ProgressBar progressBar;

    private EndpointGCECallback<String> mCallBack;
    public Exception mException;

    public EndpointGCETask(Context context, ProgressBar progressBar, EndpointGCECallback callback)
    {
        this.mContext = context;
        this.progressBar = progressBar;
        this.mCallBack = callback;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if(progressBar!=null)
            progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected String doInBackground(Context...params) {
        if(myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // - 10.0.2.2 ip local
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            myApiService = builder.build();
        }

        //mContext = params[0];

        try {
            return myApiService.jokeService().execute().getData();
        } catch (IOException e) {
            mException = e;
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        if (mCallBack != null) {
            if (mException == null) {
                mCallBack.onSuccess(result);
            } else {
                mCallBack.onFailure(mException);
            }
        }

        if(progressBar!=null)
            progressBar.setVisibility(View.GONE);
    }
}
