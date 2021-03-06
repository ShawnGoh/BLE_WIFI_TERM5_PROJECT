package com.example.blewifiterm5project.Models;

import java.util.ArrayList;
import java.util.Date;

public class UserClass {
    private String name;
    private String profile_picture;
    private String status="offline";
    private String admin = "N";
    private String email;
    private String statusmessage;
    private int paid_leave;
    private int sick_leave;
    private float payrate = 10;
    private float hoursthismonth = 0;
    private ArrayList<String> Activitylist = new ArrayList<>();
    private ArrayList<String> Activitydatelist = new ArrayList<>();

    private String currentmap = "";
    private ArrayList<Float> usercoordinates;

    // Constructor that creates object with default values and input name, profile_pic and email
    // Mainly used in account creation on admin side.
    public UserClass(String name, String profile_picture, String email) {
        this.name = name;
        this.profile_picture = profile_picture;
        this.email = email;
    }

    // Empty Constructor that creates object with default values
    public UserClass() {
    }

    // Constructor using a UserClass object
    // Mainly called when getting user information from firestore.
    public UserClass(UserClass userClass){
        this.name = userClass.getName();
        this.profile_picture = userClass.getProfile_picture();
        this.email = userClass.getEmail();
        this.admin = userClass.getAdmin();
        this.payrate = userClass.getPayrate();
        this.hoursthismonth = userClass.getHoursthismonth();
        this.Activitylist = userClass.getActivitylist();
        this.Activitydatelist = userClass.getActivitydatelist();
    }

    // Basic Getter and setter methods for all attributes of UserClass
    public ArrayList<Float> getUsercoordinates() {
        return usercoordinates;
    }

    public void setUsercoordinates(ArrayList<Float> usercoordinates) {
        this.usercoordinates = usercoordinates;
    }

    public String getCurrentmap() {
        return currentmap;
    }

    public void setCurrentmap(String currentmap) {
        this.currentmap = currentmap;
    }

    public float getPayrate() {
        return payrate;
    }

    public void setPayrate(float payrate) {
        this.payrate = payrate;
    }

    public float getHoursthismonth() {
        return hoursthismonth;
    }

    public void setHoursthismonth(float hoursthismonth) {
        this.hoursthismonth = hoursthismonth;
    }

    public void setActivitylist(ArrayList<String> activitylist) {
        Activitylist = activitylist;
    }

    public void setActivitydatelist(ArrayList<String> activitydatelist) {
        Activitydatelist = activitydatelist;
    }

    public ArrayList<String> getActivitydatelist() {
        return Activitydatelist;
    }

    public ArrayList<String> getActivitylist() {
        return Activitylist;
    }

    public String getStatusmessage() {
        return statusmessage;
    }

    public void setStatusmessage(String statusmessage) {
        this.statusmessage = statusmessage;
    }

    public int getPaid_leave() {
        return paid_leave;
    }

    public void setPaid_leave(int paid_leave) {
        this.paid_leave = paid_leave;
    }

    public int getSick_leave() {
        return sick_leave;
    }

    public void setSick_leave(int sick_leave) {
        this.sick_leave = sick_leave;
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

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdmin() {
        return admin;
    }
}
