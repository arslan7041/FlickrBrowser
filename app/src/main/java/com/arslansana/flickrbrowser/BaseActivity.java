package com.arslansana.flickrbrowser;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    static final String FLICKR_QUERY = "FLICKR_QUERY";
    static final String PHOTO_TRANSFER = "PHOTO_TRANSFER";

    // creates toolbar with or without home button
    void activateToolbar(boolean enableHome){
        Log.d(TAG, "activateToolbar: starts");
        ActionBar actionBar = getSupportActionBar(); // get reference to actionBar
        if(actionBar == null){ // if null, define toolbar, then get reference to actionbar
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); // inflate toolbar

            if(toolbar != null){
                setSupportActionBar(toolbar); // set toolbar in place
                actionBar = getSupportActionBar(); // get reference to actionbar
            }
        }

        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(enableHome); // display home button if enableHome = true, else no
        }
    }
}
