package com.trian.data.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.trian.data.room.entity.Patient;

import java.util.List;

@Dao
public interface PatientDao {
    @Query("SELECT * FROM patient")
    List<Patient> getPersonList();

    @Insert
    void insertPatient(Patient patient);

    @Update
    void updatePatient(Patient patient);

    @Delete
    void deletePatient(Patient patient);

}
