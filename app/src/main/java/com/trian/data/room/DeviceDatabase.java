package com.trian.data.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.trian.data.room.dao.PatientDao;
import com.trian.data.room.entity.Patient;

@Database(entities = {Patient.class},exportSchema = false,version = 1)
public abstract class DeviceDatabase extends RoomDatabase {
    private static  final String DB_NAME = "device_cexup";
    private static DeviceDatabase instance;
    public static synchronized DeviceDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),DeviceDatabase.class,DB_NAME).fallbackToDestructiveMigration().build();

        }
        return instance;
    }

    public  abstract PatientDao patientDao();
}
