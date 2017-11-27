package com.example.dudizagga.myworkes_b.HelpClass;

import android.content.Context;
import android.content.SharedPreferences;


public class utlShared {
    private Context context;
    private SharedPreferences MyFavoriteData;
    private SharedPreferences.Editor editor;



    public utlShared(Context context) {
        this.context = context;
        MyFavoriteData = context.getSharedPreferences("Favorites", Context.MODE_PRIVATE);
        editor = MyFavoriteData.edit();
    }

    public void putHospital(String hospital) {
        editor.putString("hospital", hospital);
        editor.commit();
    }

    public String getHospital(String hospital) {
        String c = MyFavoriteData.getString("hospital", hospital);
        return c;
    }
}


