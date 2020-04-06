package com.sample.selectable.recyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Artist implements Parcelable {

    private String id;
    private String name;
    private Status status;


    public Artist(String id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    protected Artist(Parcel in) {
        id = in.readString();
        name = in.readString();
        status = Status.values()[in.readInt()];
    }

    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.status.ordinal());
    }

    public enum Status{
        ACTIVE,
        INACTIVE
    }
}
