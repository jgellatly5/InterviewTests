package com.gallopdevs.interviewtests;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {QuestionScore.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract QuestionScoreDao questionScoreDao();
}
