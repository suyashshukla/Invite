package com.example.suyashshukla.invite;

/**
 * Created by Suyash Shukla on 25-Oct-17.
 */

public class Teachers {
    private String name;
    private String designation;
    int android_src;

public Teachers(String i_name,String i_designation,int i_android_src){
    name = i_name;
    designation = i_designation;
    android_src = i_android_src;
}

public String getName(){
    return name;
}

public String getDesignation(){
    return designation;
}

public int getAndroid_src(){
    return android_src;
}

}

