package com.example.appnumerodos;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userimageView;
    TextView nimi, email, ala, erikoismaininta, tutkinto1, tutkinto2, tutkinto3;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userimageView = itemView.findViewById(R.id.imageView);
        nimi = itemView.findViewById(R.id.txtNimi);
        email = itemView.findViewById(R.id.txtEmail);
        ala = itemView.findViewById(R.id.txtAla);
        erikoismaininta = itemView.findViewById(R.id.txtErikoismaininnat);
        tutkinto1 = itemView.findViewById(R.id.txtKandi);
        tutkinto2 = itemView.findViewById(R.id.txtDI);
        tutkinto3 = itemView.findViewById(R.id.txtTohtori);
    }
}
