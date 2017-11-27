package com.example.dudizagga.myworkes_b;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.BackendlessDataQuery;
import com.backendless.persistence.QueryOptions;
import com.example.dudizagga.myworkes_b.HelpClass.CardViewAdap;
import com.example.dudizagga.myworkes_b.HelpClass.Carmel;
import com.example.dudizagga.myworkes_b.HelpClass.Users;
import com.example.dudizagga.myworkes_b.HelpClass.UsersDetails;
import com.example.dudizagga.myworkes_b.HelpClass.utlShared;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s;
    String hospital;
    utlShared u;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Backendless.initApp(this, "8722B260-2741-E229-FF80-B13B0CD73100", "79260CF7-C991-4449-FF75-D54D102D9100");
        setPointer();
    }

    private void setPointer() {
        this.context = this;
        u = new utlShared(context);
        s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Hospital, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(this);


    }

    public void btn(View v) {
        u.putHospital(hospital);
        Log.e("hospital",hospital);
        startActivity(new Intent(this, FragmetsBase.class));


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       // hospital = adapterView.getItemAtPosition(i).toString();
        hospital = adapterView.getItemAtPosition(i).toString();
        u.putHospital(hospital);
        Log.e("hospital",hospital);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
