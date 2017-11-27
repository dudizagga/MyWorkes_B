package com.example.dudizagga.myworkes_b.HelpClass;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dudizagga.myworkes_b.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DudiZagga on 22/11/2017.
 */

public class CardViewAdap extends RecyclerView.Adapter<CardViewAdap.Card> {
    List<UsersDetails> usersDetailses = new ArrayList<>();

    public CardViewAdap(List<UsersDetails> usersDetailses) {
        this.usersDetailses = usersDetailses;
    }

    @Override
    public Card onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        Card c = new Card(v);
        return c;
    }

    @Override
    public void onBindViewHolder(Card holder, int i) {
        holder.user.setText(usersDetailses.get(i).getUser());
        holder.lastname.setText(usersDetailses.get(i).getLastName());
        holder.clazz.setText(usersDetailses.get(i).getClazz());
        holder.room.setText(usersDetailses.get(i).getRoom());
        holder.reason.setText(usersDetailses.get(i).getReason());
        holder.phone.setText(usersDetailses.get(i).getPhone());
    }

    @Override
    public int getItemCount() {
        return usersDetailses.size();
    }

    public static class Card extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView user;
        TextView lastname;
        TextView clazz;
        TextView room;
        TextView reason;
        TextView phone;

        public Card(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card);
            user = itemView.findViewById(R.id.user);
            lastname = itemView.findViewById(R.id.lastname);
            clazz = itemView.findViewById(R.id.clazz);
            room = itemView.findViewById(R.id.room);
            reason = itemView.findViewById(R.id.reason);
            phone = itemView.findViewById(R.id.phone);
        }
    }
}
