package com.example.dudizagga.myworkes_b;

import android.app.Fragment;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.persistence.QueryOptions;
import com.example.dudizagga.myworkes_b.HelpClass.BneZion;
import com.example.dudizagga.myworkes_b.HelpClass.CardViewAdap;
import com.example.dudizagga.myworkes_b.HelpClass.Carmel;
import com.example.dudizagga.myworkes_b.HelpClass.Rambam;
import com.example.dudizagga.myworkes_b.HelpClass.UsersDetails;
import com.example.dudizagga.myworkes_b.HelpClass.utlShared;

import java.util.ArrayList;
import java.util.List;

public class Connect extends Fragment {
    Context context;
    LinearLayout base;
    utlShared u;
    RecyclerView rs;
    LinearLayoutManager lin;
    List<UsersDetails> usersDetailses = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        View connect = inflater.inflate(R.layout.activity_connect, base, false);
        u = new utlShared(context);
        rs = connect.findViewById(R.id.recycler_c);
        lin = new LinearLayoutManager(context);
        rs.setHasFixedSize(true);
        rs.setLayoutManager(lin);
        utlShared u = new utlShared(context);
        // Backendless.Data.mapTableToClass(tableName, Users.class);
        Toast.makeText(context, "frag c", Toast.LENGTH_SHORT).show();
        switch (u.getHospital("hospital")) {
            case "Carmel":
                // Backendless.Data.mapTableToClass(tableName, Users.class);
                Backendless.Persistence.of(Carmel.class).find(new AsyncCallback<List<Carmel>>() {
                    @Override
                    public void handleResponse(List<Carmel> response) {
                        for (int i = 0; i < response.size(); i++) {
                            if (response.get(i).reason.equals("connect")) {
                                UsersDetails userd = new UsersDetails(response.get(i).user, response.get(i).lastName,
                                        response.get(i).clazz, response.get(i).roomNumber,
                                        response.get(i).phoneNumber, response.get(i).reason);
                                usersDetailses.add(userd);
                                CardViewAdap c = new CardViewAdap(usersDetailses);
                                rs.setAdapter(c);
                                c.notifyDataSetChanged();
                                Log.e("reson", response.get(i).reason);
                            }
                        }
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {

                    }
                });
                break;
            case "Rambam":
                Backendless.Persistence.of(Rambam.class).find(new AsyncCallback<List<Rambam>>() {
                    @Override
                    public void handleResponse(List<Rambam> response) {
                        for (int i = 0; i < response.size(); i++) {
                            if (response.get(i).reason.equals("connect")) {
                                UsersDetails userd = new UsersDetails(response.get(i).user, response.get(i).lastName,
                                        response.get(i).clazz, response.get(i).roomNumber,
                                        response.get(i).phoneNumber, response.get(i).reason);
                                usersDetailses.add(userd);
                                CardViewAdap c = new CardViewAdap(usersDetailses);
                                rs.setAdapter(c);
                                c.notifyDataSetChanged();
                                Log.e("reson", response.get(i).reason);
                            }
                        }
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {

                    }
                });
                break;
            case "BneZion":
                Backendless.Persistence.of(BneZion.class).find(new AsyncCallback<List<BneZion>>() {
                    @Override
                    public void handleResponse(List<BneZion> response) {
                        for (int i = 0; i < response.size(); i++) {
                            if (response.get(i).reason.equals("connect")) {
                                UsersDetails userd = new UsersDetails(response.get(i).user, response.get(i).lastName,
                                        response.get(i).clazz, response.get(i).roomNumber,
                                        response.get(i).phoneNumber, response.get(i).reason);
                                usersDetailses.add(userd);
                                CardViewAdap c = new CardViewAdap(usersDetailses);
                                rs.setAdapter(c);
                                c.notifyDataSetChanged();
                                Log.e("reson", response.get(i).reason);
                            }
                        }
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {

                    }
                });
                break;

        }

        return connect;
    }


}
