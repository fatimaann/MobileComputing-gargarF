package com.example.fatimagargar.gargaf;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
/**
 * Created by Fatima Gargar on 10/4/2016.
 */
public class OnTouchActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_touch);

        final ImageView image = (ImageView) findViewById(R.id.image);

        image.setOnTouchListener(new View.OnTouchListener() {
            float inX, finX, inY, finY;

            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                int e = motionEvent.getAction();
                switch (e) {
                    case MotionEvent.ACTION_DOWN:
                        inX = motionEvent.getX();
                        inY = motionEvent.getY();
                        Toast.makeText(getApplicationContext(), "X= " + inX + " Y= " + inY, Toast.LENGTH_SHORT).show();
                        return true;
                    case MotionEvent.ACTION_UP:
                        finX = motionEvent.getX();
                        finY = motionEvent.getY();
                        if (inX < finX) {
                            Toast.makeText(getApplicationContext(), "X= " + finX + "Y= " + finY + " Swipe Right", Toast.LENGTH_SHORT).show();
                        }
                        if (inX > finX) {
                            Toast.makeText(getApplicationContext(), "X= " + finX + "Y= " + finY + " Swipe Left", Toast.LENGTH_SHORT).show();
                        }
                        if (inY < finY) {
                            Toast.makeText(getApplicationContext(), "X= " + finX + "Y= " + finY + " Swipe Down", Toast.LENGTH_SHORT).show();
                        }
                        if (inY > finY) {
                            Toast.makeText(getApplicationContext(), "X= " + finX + "Y= " + finY + " Swipe Up", Toast.LENGTH_SHORT).show();
                        }
                        return true;

                }
                return false;
            }
        });
    }
}
