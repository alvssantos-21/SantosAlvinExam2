package com.example.santoslabexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
EditText com;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ACTIVITY REGISTRATION");
        c1 =findViewById(R.id.checkBox);
        c2 =findViewById(R.id.checkBox2);
        c3 =findViewById(R.id.checkBox3);
        c4 =findViewById(R.id.checkBox4);
        c5 =findViewById(R.id.checkBox5);
        c6 =findViewById(R.id.checkBox6);
        c7 =findViewById(R.id.checkBox7);
        c8 =findViewById(R.id.checkBox8);

        com =findViewById(R.id.editText);
    }

    public void save(View v){

        String data ="";
        String add = "";
        if (c1.isChecked()== true){
            add = c1.getText().toString();
            data = add;
        }else {}

        if (c2.isChecked()== true){
            add = c2.getText().toString();
            data = data +"\n"+ add;
        }else{}
        if (c3.isChecked()== true){
            add = c3.getText().toString();
            data = data +"\n"+ add;
        }else{}
        if (c4.isChecked()== true){
            add = c4.getText().toString();
            data = data +"\n"+ add;
        }else{}
        if (c5.isChecked()== true){
            add = c5.getText().toString();
            data = data +"\n"+ add;
        }else{}
        if (c6.isChecked()== true){
            add = c6.getText().toString();
            data = data +"\n"+ add;
        }else{}
        if (c7.isChecked()== true){
            add = c7.getText().toString();
            data = data +"\n"+ add;
        }else{}
        if (c8.isChecked()== true){
            add = c8.getText().toString();
            data = data +"\n"+ add;
        }else{}



        String datacom = com.getText().toString();

        data = data +"_"+datacom;

        /**/        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data1.txt", MODE_PRIVATE);
            writer.write(data.getBytes());

        } catch (FileNotFoundException e) {
            Log.d("Error", "File not found...");
        }
        catch (IOException e){
            Log.d("Error", "IO Error");
        }
        finally{
            try {
                writer.close();
            } catch (IOException e) {
                Log.d("Error", "File not found...");
            }
            Toast.makeText(this, "data saved...", Toast.LENGTH_LONG).show();

        }
    }
    public void dispNext(View v){
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }




}
