package com.example.dudizagga.myworkes_b.HelpClass;

import android.content.Context;

/**
 * Created by DudiZagga on 22/11/2017.
 */

public class UsersDetails {
    private String user;
    private String lastName;
    private String clazz;
    private String room;
    private String phone;
    private String reason;

    public UsersDetails(String user, String lastName, String clazz, String room, String phone, String reason) {
        this.user = user;
        this.lastName = lastName;
        this.clazz = clazz;
        this.room = room;
        this.phone = phone;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }
    public String getUser() {
        return user;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClazz() {
        return clazz;
    }

    public String getRoom() {
        return room;
    }

    public String getPhone() {
        return phone;
    }
}
