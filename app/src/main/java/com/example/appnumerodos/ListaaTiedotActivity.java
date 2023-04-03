package com.example.appnumerodos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListaaTiedotActivity extends AppCompatActivity {

    private UserStorage storage;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaa_tiedot);
        storage = UserStorage.getInstance();
        recyclerView = findViewById(R.id.user_view_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Collections.sort(storage.getUsers(), new Comparator<User>(){
           public int compare(User u1, User u2) {
               return u1.getFirsName().compareToIgnoreCase(u2.getFirsName());
           }
        });
        recyclerView.setAdapter(new UserViewAdapter(getApplicationContext(), storage.getUsers()));
    }
}