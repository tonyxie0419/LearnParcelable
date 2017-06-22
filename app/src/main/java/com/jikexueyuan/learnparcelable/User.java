package com.jikexueyuan.learnparcelable;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by admin on 2017/6/21.
 */

public class User implements Parcelable {

    private int userId;
    private String username;
    private boolean isMale;

    public User(int userId, String username, boolean isMale) {
        this.userId = userId;
        this.username = username;
        this.isMale = isMale;
    }

    private User(Parcel source) {
        userId = source.readInt();
        username = source.readString();
        isMale = source.readInt() == 1;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userId);
        dest.writeString(username);
        dest.writeInt(isMale ? 1 : 0);
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {

        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public boolean isMale() {
        return isMale;
    }
}
