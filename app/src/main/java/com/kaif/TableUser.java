package com.kaif;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TableUser {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "contact_name")
    public String contact_name;

    @ColumnInfo(name = "phone_no")
    public String phone_no;
    @ColumnInfo(name = "PRIORITY")
    public int priority;

    public TableUser(int uid, String contact_name, String phone_no, int priority) {
        this.uid = uid;
        this.contact_name = contact_name;
        this.phone_no = phone_no;
        this.priority = priority;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}