package com.sh3h.myatlas;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFirst(View view) {
        //Intent intent = new Intent();
        //intent.setClassName(this, "com.sh3h.mylibrary.TestActivity");
        //startActivity(intent);
		Toast.makeText(this, "update", Toast.LENGTH_LONG).show();
    }

    public void onSecond(View view) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.sh3h.remotebundle.RemoteBundleActivity");
        //intent.setClassName(this, "com.taobao.remotebunle.RemoteBundleActivity");
        startActivity(intent);
    }

    public void onThird(View view) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                Updater.update(getBaseContext());
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        }.execute();
    }
}
