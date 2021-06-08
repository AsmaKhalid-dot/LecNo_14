package com.example.lecturen014;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.BtnDialog);
    }

    public void Dialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Dialog");
        builder.setMessage("It is a Message of Dialog Box");
        builder.setCancelable(false);
        LayoutInflater inflater=this.getLayoutInflater();
        builder.setView(Inflater.inflate(R.layout.mylayout,null));
        builder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Positive button was clicked",Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Negative Button was clicked",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}