package com.example.counttoonehundred;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class CountEven extends Thread {

    Activity activity;
    public CountEven(MainActivity activity, String even){this.activity = activity;}
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        activity.runOnUiThread(() -> Toast.makeText(activity, "Evens are done", Toast.LENGTH_SHORT).show());
    }
}
