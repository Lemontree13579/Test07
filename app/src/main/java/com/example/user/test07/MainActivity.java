package com.example.user.test07;

import android.content.DialogInterface;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText_user = (EditText) findViewById(R.id.editText_user);
                EditText editText_password = (EditText) findViewById(R.id.editText_password);

                if(editText_user.getText().toString().equals("123") && editText_password.getText().toString().equals("abc")){

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Success")
                            .setTitle("Dialog");

                    builder.setPositiveButton("sure", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "selectRightButton", Toast.LENGTH_LONG).show();}
                    });
                    builder.show();
                }

                else{
                    Toast.makeText(MainActivity.this, "Error!", Toast.LENGTH_LONG).show();
                }

            }

        });

    }

}






