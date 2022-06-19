package com.kaif;

public class IndivisualContact {
    String Name;
    String PhoneNo;
    int PRIORITY;

    public IndivisualContact(String name, String phoneNo, int PRIORITY) {
        Name = name;
        PhoneNo = phoneNo;
        this.PRIORITY = PRIORITY;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(int PRIORITY) {
        this.PRIORITY = PRIORITY;
    }
}
