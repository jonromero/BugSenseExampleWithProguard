package com.bugsense.proguardtest;

import android.app.Activity;
import android.os.Bundle;

import com.bugsense.trace.BugSenseHandler;

public class ProguardBugSenseActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		BugSenseHandler.setup(this, "60cf748f");
		throw new RuntimeException("exception requested by user");
    }
}