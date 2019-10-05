package com.example.santoslabexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {
    String c1,c2,c3,c4,c5,c6,c7,c8, com, dataAll;
    EditText edmlt1, edmlt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("SUMMARY");

        FileInputStream reader = null;
        String data = "";
        try {
            reader = openFileInput("data1.txt");
            int token;

            while ((token = reader.read()) != -1) {
                data = data + (char) token;
            }
            String[] tokens = data.split("_");
            c1 = tokens[0];
            com = tokens[1];
        } catch (FileNotFoundException e) {
            Log.d("Error", "File not found...");
        } catch (IOException e) {
            Log.d("Error", "IO Error");
        }



        edmlt1 = findViewById(R.id.editText2);
        edmlt2 = findViewById(R.id.editText3);
        edmlt1.setText(c1);
        edmlt2.setText(com);


    }
    public void dispPrev(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
    public void send(View v){
         Toast.makeText(this, "Registration Sent...", Toast.LENGTH_LONG).show();
    }
}
