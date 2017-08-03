package org.pltw.examples.createmessage;

import android.app.Activity;
import android.content.Intent;//comment
import android.os.Bundle;
import android.util.Log;

public class ReceiveMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        // Create an intent
        Intent intent = getIntent();

        // Add message intent
        String message = intent.getStringExtra(MainActivity.myKey);

        Log.d("ReceiveMessageActivity", message);
    }
}
