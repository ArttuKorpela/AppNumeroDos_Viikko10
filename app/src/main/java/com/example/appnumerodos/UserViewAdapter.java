package com.example.appnumerodos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserViewAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserViewAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.nimi.setText(users.get(position).getFirsName() + " " + users.get(position).getLastName());
        holder.email.setText(users.get(position).getEmail());
        holder.ala.setText(users.get(position).getDegreeProgram());
        holder.userimageView.setImageResource(users.get(position).getImage());
        holder.erikoismaininta.setText(users.get(position).getErikoisMaininnat());

        if (users.get(position).getAlempiTutkinto() != null) {
            holder.tutkinto1.setText(users.get(position).getAlempiTutkinto());
        } else {
            holder.tutkinto1.setVisibility(View.GONE);
        }

        if (users.get(position).getYlempiTutkinto() != null) {
            holder.tutkinto2.setText(users.get(position).getYlempiTutkinto());
        } else {
            holder.tutkinto2.setVisibility(View.GONE);
        }

        if (users.get(position).getYlinTutkinto() != null) {
            holder.tutkinto3.setText(users.get(position).getYlinTutkinto());
        } else {
            holder.tutkinto3.setVisibility(View.GONE);
        }

        if (users.get(position).getErikoisMaininnat() != null) {
            holder.erikoismaininta.setText(users.get(position).getErikoisMaininnat());
        } else {
            holder.erikoismaininta.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return users.size();
    }




}
