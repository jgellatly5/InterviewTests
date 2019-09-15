package com.gallopdevs.interviewtests;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class QuestionScore {

    public QuestionScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @PrimaryKey
    public @NonNull String name;

    @ColumnInfo(name = "score")
    public int score;
}
