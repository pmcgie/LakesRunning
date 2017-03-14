package com.Paul_McGie;

import java.util.ArrayList;
import java.util.Collections;


public class LakeRunning {

    //Variables should be private
    private String name;
    private ArrayList<Double> time;

    //Constructor
    public LakeRunning(String lakeName) {
        this.name = lakeName;
        this.time = new ArrayList <Double>(); //Store all times for lake
    }

    //Add time to ArrayList
    public void addTime(double lakeTime) {
        time.add(lakeTime);
    }

    //gets best time
    public double getBestTime() {
        double BestTime = Collections.min(this.time,null);
        return BestTime;
    }

    //gets lake name
    public String getName() {
        return name;
    }

    //sets lake name
    public void setName(String name) {
        this.name = name;
    }

    //gets times
    public ArrayList<Double> getTime() {
        return time;
    }

    //sets times
    public void setTime(ArrayList<Double> time) {
        this.time = time;
    }
}

