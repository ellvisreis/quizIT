package com.augusto.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


        private Button buttonTestar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        buttonTestar1 = findViewById(R.id.buttonTestar1);

        buttonTestar1.setOnClickListener(new.ViewOnClickListener(){
            @Override
                    public void onClick(View view){

            }
        });



                
    }
}