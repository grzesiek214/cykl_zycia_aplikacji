package com.example.cyklzyciaaplikacji_3pt2gr;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button buttonPlus, buttonMinus;
    TextView textView;
    int punkty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonPlus = findViewById(R.id.button);
        buttonMinus = findViewById(R.id.button2);
        textView = findViewById(R.id.textViewPunkty);

        buttonPlus.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                    }
//                }
//              To jest to samo

                view -> {
                    punkty++;
                    textView.setText(String.valueOf(punkty));
//                    text dziala
//                    textView.setText(Integer.toString(punkty));
                }
        );

        buttonMinus.setOnClickListener(view -> {
            punkty--;
            textView.setText(String.valueOf(punkty));
        });

        Log.i("CZAS", "Wywolana metoda onCreate");
    }

    // https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pl

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CZAS", "Wywolana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CZAS", "Wywolana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CZAS", "Wywolana metoda onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CZAS", "Wywolana metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CZAS", "Wywolana metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CZAS", "Wywolana metoda onDestroy");
    }
}