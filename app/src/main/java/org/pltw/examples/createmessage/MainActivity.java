package org.pltw.examples.createmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String myKey = "org.pltw.examples.myKey";
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmitButton = (Button) findViewById(R.id.button_submit); // comment lkjlkj hkjh

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =
                        new Intent(MainActivity.this, ReceiveMessageActivity.class);

                intent.putExtra(MainActivity.myKey, "Here is a message");
                startActivity(intent);
            }
        });
    }
}
