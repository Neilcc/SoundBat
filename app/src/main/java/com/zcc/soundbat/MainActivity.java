package com.zcc.soundbat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private EditText sendNumbers;
    private EditText receivedNumbers;
    private Button sendBtn;
    private Button startListenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendNumbers = findViewById(R.id.et_numbers_to_send);
        receivedNumbers = findViewById(R.id.et_numbers_received);
        sendBtn = findViewById(R.id.btn_send);
        startListenBtn = findViewById(R.id.btn_start_listen);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
