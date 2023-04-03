package com.example.appnumerodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        UserStorage us = UserStorage.getInstance();
        us.loadUsers(context);
    }

    public void switchToLisaaKayttaja(View view) {
        Intent intent = new Intent(this,KysyTiedotActivity.class);
        startActivity(intent);
    }

    public void switchToListaaKayttaja(View view) {
        Intent intent = new Intent(this, ListaaTiedotActivity.class);
        startActivity(intent);
    }

}