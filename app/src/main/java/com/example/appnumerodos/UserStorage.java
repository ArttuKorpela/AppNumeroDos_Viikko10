package com.example.appnumerodos;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserStorage {

    private static UserStorage single_instance = null;
    ArrayList<User> users = new ArrayList<>();

    private UserStorage(){}

    public static synchronized UserStorage getInstance() {
        if (single_instance == null){
            single_instance = new UserStorage();
        }
        return single_instance;
    }

    public void addUser(User newUser){

        users.add(newUser);



    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void saveUsers(Context context) {
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("users.data", Context.MODE_PRIVATE));
            userWriter.writeObject(users);
            userWriter.close();
        } catch (IOException e) {
            System.out.println("Käyttäjien tallentaminen ei onnistunut");
        }
    }


    public void loadUsers(Context context) {
        try {
            ObjectInputStream rocketReader = new ObjectInputStream(context.openFileInput("users.data"));
            users = (ArrayList<User>) rocketReader.readObject();
            rocketReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Käyttäjien lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Käyttäjien lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Käyttäjien lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }


}
