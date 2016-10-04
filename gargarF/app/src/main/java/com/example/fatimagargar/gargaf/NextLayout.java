package com.example.fatimagargar.gargaf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

/**
 * Created by Fatima Gargar on 8/5/2016.
 */
public class NextLayout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextlayout);

        final Button touch = (Button) findViewById(R.id.touch);

        touch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(NextLayout.this,OnTouchActivity.class);
                startActivity(intent);

            }

        });

    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();

    }

}
