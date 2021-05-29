package com.example.counttoonehundred;

import android.app.Activity;
import android.widget.Toast;

public class CountOdd implements Runnable {


    Activity activity;
    public CountOdd(MainActivity activity, String odd){this.activity = activity;}

    @Override
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        activity.runOnUiThread(() -> Toast.makeText(activity, "Odds are done", Toast.LENGTH_SHORT).show());

    }
}
