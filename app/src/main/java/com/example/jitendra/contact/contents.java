package com.example.jitendra.contact;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jitendra on 20/4/17.
 */

public class contents implements Parcelable {
    public static final Creator<contents> CREATOR =
            new Creator<contents>() {

                @Override
                public contents createFromParcel(Parcel source) {
                    return new contents(source);
                }

                @Override
                public contents[] newArray(int size) {
                    return new contents[size];
                }

            };
    private String name;
    private String number;
    private String address;
    private int thumbnail;
    private String email;
    private String fax;

    public contents() {
    }

    public contents(String name, String number, String address, int thumbnail, String email, String fax) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.thumbnail = thumbnail;
        this.email = email;
        this.fax = fax;

    }

    private contents(Parcel in) {
        name = in.readString();
        number = in.readString();
        address = in.readString();
        thumbnail = in.readInt();
        email = in.readString();
        fax = in.readString();

    }

    // Getters and setters

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(number);
        dest.writeString(address);
        dest.writeInt(thumbnail);
        dest.writeString(email);
        dest.writeString(fax);


    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

}

