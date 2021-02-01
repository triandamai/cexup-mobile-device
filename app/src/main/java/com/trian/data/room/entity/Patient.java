package com.trian.data.room.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Patient")
public class Patient {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "nik")
    private String nik;
    @ColumnInfo(name = "sex")
    private String sex;
    @ColumnInfo(name = "address")
    private String address;
    @ColumnInfo(name = "city_born")
    private String city_born;
    @ColumnInfo(name = "date_born")
    private String date_born;

    public Patient(int id, String name, String nik, String sex, String address, String city_born, String date_born) {
        this.id = id;
        this.name = name;
        this.nik = nik;
        this.sex = sex;
        this.address = address;
        this.city_born = city_born;
        this.date_born = date_born;
    }

    @Ignore
    public Patient(String name, String nik, String sex, String address, String city_born, String date_born) {
        this.name = name;
        this.nik = nik;
        this.sex = sex;
        this.address = address;
        this.city_born = city_born;
        this.date_born = date_born;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity_born() {
        return city_born;
    }

    public void setCity_born(String city_born) {
        this.city_born = city_born;
    }

    public String getDate_born() {
        return date_born;
    }

    public void setDate_born(String date_born) {
        this.date_born = date_born;
    }
}
