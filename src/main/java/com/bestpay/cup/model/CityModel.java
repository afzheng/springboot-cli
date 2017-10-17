package com.bestpay.cup.model;

import java.io.Serializable;

public class CityModel implements Serializable {
    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    private static final long serialVersionUID = 1L;
    private int cityID;
    private String cityName;
    private int proID;
    //默认构造函数
    public CityModel(){

    }
    public CityModel(int cityID,String cityName,int proID){
        this.cityID = cityID;
        this.cityName = cityName;
        this.proID = proID;
    }
}
