package com.gallopdevs.interviewtests;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuestionScoreDao {
    @Query("SELECT * FROM questionScore")
    List<QuestionScore> getScores();

    @Insert
    void insert(QuestionScore score);

    @Delete
    void delete(QuestionScore score);
}
