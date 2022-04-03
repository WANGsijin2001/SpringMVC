package com.atguigu.mvc.dao.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Goods implements Serializable {
    private int id;
    private String Goodname;
    private double value;
    private String date_of_manufacture;
    private String quality_guarantee_period;
    private String Supplier;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setGoodname(String goodname) {
        Goodname = goodname;
    }
    public String getGoodname() {
        return Goodname;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
    public void setDate_of_manufacture(String date_of_manufacture) {
        this.date_of_manufacture = date_of_manufacture;
    }
    public String getDate_of_manufacture() {
        return date_of_manufacture;
    }
    public void setQuality_guarantee_period(String quality_guarantee_period) {
        this.quality_guarantee_period = quality_guarantee_period;
    }
    public String getQuality_guarantee_period() {
        return quality_guarantee_period;
    }
    public void setSupplier(String supplier) {
        Supplier = supplier;
    }
    public String getSupplier() {
        return Supplier;
    }
}

