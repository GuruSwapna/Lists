package com.example.enchanter_swapna.listdemoactivity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by enchanter-swapna on 13/6/17.
 */

public class allnumbers_main implements Parcelable{
    String id;
    String numbers;
    String abc;

    protected allnumbers_main(Parcel in) {
        id = in.readString();
        numbers = in.readString();
        abc = in.readString();
    }

    public static final Creator<allnumbers_main> CREATOR = new Creator<allnumbers_main>() {
        @Override
        public allnumbers_main createFromParcel(Parcel in) {
            return new allnumbers_main(in);
        }

        @Override
        public allnumbers_main[] newArray(int size) {
            return new allnumbers_main[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(numbers);
        dest.writeString(abc);
    }
}
