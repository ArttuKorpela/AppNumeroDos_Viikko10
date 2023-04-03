package com.example.appnumerodos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class KysyTiedotActivity extends AppCompatActivity {
    private EditText etunimi;
    private EditText sukunimi;
    private EditText email;

    private int image;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kysy_tiedot);

        etunimi = findViewById(R.id.editTextEtunimi);
        sukunimi = findViewById(R.id.editTextSukunimi);
        email = findViewById(R.id.editTextEmail);
        context = this;

    }

    public void addUser(View view) {

        RadioGroup rgAlat = findViewById(R.id.rgAlat);

        RadioGroup rgKuva = findViewById(R.id.rgKuvat);

        switch (rgKuva.getCheckedRadioButtonId()) {
            case R.id.rbKuva1:
                image = R.drawable.screenshot_2023_03_24_012609;
                break;
            case R.id.rbKuva2:
                image = R.drawable.screenshot_2023_03_24_012836;
                break;
        }

        switch (rgAlat.getCheckedRadioButtonId()) {
            case R.id.rbTite:
                User titeUser = new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Tietotekniikka",image);
                setDegree(titeUser);
                UserStorage.getInstance().addUser(titeUser);
                break;
            case R.id.rbTuta:
                User tutaUser = new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Tuotantotalous",image);
                setDegree(tutaUser);
                UserStorage.getInstance().addUser(tutaUser);
                break;
            case R.id.rbSate:
                User sateUser = new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Sähkötekniikka",image);
                setDegree(sateUser);
                UserStorage.getInstance().addUser(sateUser);
                break;
            case R.id.rbLate:
                User lateUser = new User(etunimi.getText().toString(),sukunimi.getText().toString(),email.getText().toString(),"Laskennallinen tekniikka",image);
                setDegree(lateUser);
                UserStorage.getInstance().addUser(lateUser);

                break;
        }




        UserStorage.getInstance().saveUsers(context);
        /*for (User user : UserStorage.getInstance().getUsers()) {
            System.out.println(user.getFirsName());
        }*/
    }

    public void setDegree(User user) {
        CheckBox cbKandi = findViewById(R.id.cbKandi);
        CheckBox cbDippa = findViewById(R.id.cbDI);
        CheckBox cbToht = findViewById(R.id.cbTohtori);
        CheckBox cbMajuri = findViewById(R.id.cbMajuri);

        if (cbKandi.isChecked()) {
            user.setAlempiTutkinto("Kandidaatin tutkinto");
        }
        if (cbDippa.isChecked()) {
            user.setYlempiTutkinto("DI-tutkinto");
        }
        if (cbToht.isChecked()) {
            user.setYlinTutkinto("Tohtorin tutkinto");
        }
        if (cbMajuri.isChecked()) {
            user.setErikoisMaininnat("Saunamajuri");
        }
    }
}