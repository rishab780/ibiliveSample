package com.example.rishab.ibilivesample.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Rishab on 29-04-2017.
 */

public class LocationsModelClass implements Parcelable {
    public static final Creator<LocationsModelClass> CREATOR = new Creator<LocationsModelClass>() {
        @Override
        public LocationsModelClass createFromParcel(final Parcel in) {
            return new LocationsModelClass(in);
        }

        @Override
        public LocationsModelClass[] newArray(final int size) {
            return new LocationsModelClass[size];
        }
    };
    private String info;
    private int display;

    /**
     * @param in final in
     */

    protected LocationsModelClass(final Parcel in) {
    }


    /**
     * @param info    info abt aobj
     * @param display display picture
     */
    public LocationsModelClass(final String info, final int display) {
        this.info = info;
        this.display = display;
    }

    /**
     *
     * @return creator
     */
    public static Creator<LocationsModelClass> getCREATOR() {
        return CREATOR;
    }

    /**
     *
     * @return info abt location
     */
    public String getInfo() {
        return info;
    }

    /**
     *
     * @param info the info abt location
     */
    public void setInfo(final String info) {
        this.info = info;
    }

    /**
     *
     * @return display picture
     */
    public int getDisplay() {
        return display;
    }

    /**
     *
     * @param display the display picture
     */
    public void setDisplay(final int display) {
        this.display = display;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(info);
        dest.writeInt(display);
    }
}
