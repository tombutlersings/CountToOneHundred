package com.example.counttoonehundred;

import android.app.Activity;
import android.widget.Toast;

public class CountOdd implements Runnable {

    // New WeakReference object.
    private WeakReference<Activity> activity;
    public CountOdd(MainActivity activity, String odd){this.activity = new WeakReference<Activity>(activity);}

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
        final Activity refActivity = activity.get();
        if ( refActivity != null) {
            refActivity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    refActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            Toast.makeText(refActivity, "Odds are done", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            });
        }
    }
}
