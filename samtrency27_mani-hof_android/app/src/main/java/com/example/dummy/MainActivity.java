package com.example.dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello World!");
    }
}

public void ThisIsANewMethod () {

int[] list = {1, 2, 3, 4, 1, 2, 3};

System.out.println("This is a new function.");
System.out.println("New Line.");
System.out.println("Second Line.");
System.out.println("Third Line.");
}
