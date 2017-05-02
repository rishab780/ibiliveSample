package com.example.rishab.ibilivesample.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Rishab on 29-04-2017.
 */

public class LocationsModelClass implements Parcelable {

    protected LocationsModelClass(Parcel in) {
    }

    public static final Creator<LocationsModelClass> CREATOR = new Creator<LocationsModelClass>() {
        @Override
        public LocationsModelClass createFromParcel(Parcel in) {
            return new LocationsModelClass(in);
        }

        @Override
        public LocationsModelClass[] newArray(int size) {
            return new LocationsModelClass[size];
        }
    };
    private String info;
    private int display;

    public LocationsModelClass(String info, int display) {
        this.info = info;
        this.display = display;
    }

    public static Creator<LocationsModelClass> getCREATOR() {
        return CREATOR;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(info);
        dest.writeInt(display);
    }
}
