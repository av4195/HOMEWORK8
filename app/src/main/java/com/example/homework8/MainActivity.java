package com.example.homework8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tV1up;
    TextView tV1down;
    EditText eT1;
    ImageView iV1;
    Button btn1;

    TextView tV2up;
    ImageView iV2;
    TextView tV2down;
    EditText eT2;
    Button btn2;

    TextView tV3up;
    TextView tV3down;
    EditText eT3;
    ImageView iV3;
    Button btn3;

    int num;
    int num1;
    int NUM;
    int num02;
    int num3;
    int num03;
    int answer;
    int answer2;
    int answer3;
    int answer0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        tV1up = findViewById(R.id.tV1up);
        tV1down = findViewById(R.id.tV1down);
        tV2up = findViewById(R.id.tV2up);
        tV2down = findViewById(R.id.tV2down);
        tV3up = findViewById(R.id.tV3up);
        tV3down = findViewById(R.id.tV3down);

        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3= findViewById(R.id.eT3);



    }
    public void newGame(View view) {
        Random random = new Random();
        num = random.nextInt(90) + 10;
        tV1up.setText(""+num);
        num1 = random.nextInt(90) + 10;
        tV1down.setText(""+num1);
        tV2up.setVisibility(View.INVISIBLE);
        tV2down.setVisibility(View.INVISIBLE);
        iV2.setVisibility(View.INVISIBLE);
        eT2.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);

        tV3up.setVisibility(View.INVISIBLE);
        tV3down.setVisibility(View.INVISIBLE);
        iV3.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

    }
    public void stage01(View view) {
        String st = eT1.getText().toString();
        answer = Integer.parseInt(st);

        if (answer == (num + num1)) {
            iV1.setImageResource(R.drawable.img);
        } else {
            iV1.setImageResource(R.drawable.img_1);
        }

        Random random = new Random();
        NUM = random.nextInt(90) + 10;
        tV2up.setText("" + NUM);
        num02 = random.nextInt(90) + 10;
        tV2down.setText("" + num02);

        tV2up.setVisibility(View.VISIBLE);
        tV2down.setVisibility(View.VISIBLE);

        iV2.setVisibility(View.VISIBLE);
        eT2.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);

    }

    public void stage02(View view) {

        String st = eT2.getText().toString();
        answer2 = Integer.parseInt(st);
        if (answer2 == (NUM + num02)) {
            iV2.setImageResource(R.drawable.img);
        } else {
            iV2.setImageResource(R.drawable.img_1);
        }

        Random random = new Random();
        num3 = random.nextInt(90) + 10;
        tV3up.setText(""+num3);
        num03 = random.nextInt(90) + 10;
        tV3down.setText(""+num03);

        tV3up.setVisibility(View.VISIBLE);
        tV3down.setVisibility(View.VISIBLE);

        iV3.setVisibility(View.VISIBLE);
        eT3.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    public void stage03(View view) {
        String st = eT3.getText().toString();
        answer3 = Integer.parseInt(st);
        if (answer3 == (num3 + num03)) {
            iV3.setImageResource(R.drawable.img);
        } else {
            iV3.setImageResource(R.drawable.img_1);
        }

    }
}