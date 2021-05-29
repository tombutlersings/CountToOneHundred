package com.example.counttoonehundred;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    Context context = getApplicationContext();
//    CharSequence text = "Hello toast!";
//    int duration = Toast.LENGTH_SHORT;

    final String toast = "Counting has stopped";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void OddCounter(View view){
        new Thread(new CountOdd(MainActivity.this, "odd")).start();
//
//
//        CountOdd odd = new CountOdd();
//        Thread oThread = new Thread(odd, "Odd Thread: ");
////        Toast toast = Toast.makeText(context, "Odd counting has started...", duration);

//        oThread.start();
//        toast.show();
    }
    public void EvenCounter(View view){
        new Thread(new CountEven(MainActivity.this, "even")).start();
//        CountEven even = new CountEven();
//        Thread eThread = new Thread(even, "Even Thread: ");
////        Toast toast = Toast.makeText(context, "Even counting has started...", duration);
//        eThread.start();
//        toast.show();
    }

}