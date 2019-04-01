package com.example.android.inclassassignment09_linga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference animalRef = database.getReference("Animal");
    private DatabaseReference animalsRef = database.getReference("Different Animal");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {animalRef.setValue(new Animal("Cat",4,false));}
    public void add(View view) {
        animalsRef.push().setValue(new Animal("Lama",4,true));}

}
