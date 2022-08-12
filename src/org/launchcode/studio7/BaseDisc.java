package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class BaseDisc {

    private String discData;
    private HashMap<String, String> discInfo;
    private boolean isInserted;
    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    private String title;

    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData = "";
        this.discInfo = new HashMap<String, String>();
        this.isInserted = false;

        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;

        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));
    }

    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", String.valueOf(title));
    }

    protected void writeDate(String data){
        this.discData += data;
    }

    public String readData(){
        return this.discData;
    }

    public HashMap<String, String> getInfo(){
        return this.discInfo;
    }

    public void insert(){
        this.isInserted = true;
    }

//    Getters
    public boolean isInserted() {
        return isInserted;
    }

    public int getStorageCapacity() {
        return storageCapacityInMB;
    }

    public int getSpinSpeed() {
        return spinSpeedInRPM;
    }
}
