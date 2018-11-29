package com.example.student1.test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String login= "GAY";
    String password= "GAYSHIT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.bt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT);
                Toast toast2 = Toast.makeText(getApplicationContext(), "Вы ошиблись в логине или пароле!", Toast.LENGTH_SHORT);
                EditText log= findViewById(R.id.log);
                EditText pasw= findViewById(R.id.pas);
                TextView text = findViewById(R.id.tx);
                if(log.getText().toString().equals(login) && pasw.getText().toString().equals(password)) {
                    toast1.show();
                    text.setTextColor(Color.GREEN);
                    text.setText("Верно");
                }else{
                    toast2.show();
                    text.setTextColor(Color.RED);
                    text.setText("Вы ошиблись в логине или пароле!");

                }

            }
        });
    }

}