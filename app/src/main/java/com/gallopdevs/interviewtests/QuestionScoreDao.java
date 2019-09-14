package com.gallopdevs.interviewtests;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuestionScoreDao {
    @Query("SELECT * FROM questionScore")
    List<QuestionScore> getAll();

    @Insert
    void insertAll(QuestionScore... scores);

    @Delete
    void delete(QuestionScore score);
}
