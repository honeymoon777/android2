package com.example.firstapps.model;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable {
    private String email;
    private String password;

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.email);
        dest.writeString(this.password);
    }

    public void readFromParcel(Parcel source) {
        this.email = source.readString();
        this.password = source.readString();
    }

    protected UserModel(Parcel in) {
        this.email = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<UserModel> CREATOR = new Parcelable.Creator<UserModel>() {
        @Override
        public UserModel createFromParcel(Parcel source) {
            return new UserModel(source);
        }

        @Override
        public UserModel[] newArray(int size) {
            return new UserModel[size];
        }
    };
}
