package com.gallopdevs.interviewtests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.room.Room;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView tvQuestion;
    private Button bQuestion;
    private Button bCompleted;
    private Spinner spinnerQuestion;

    private int minRange = 1;
    private int maxRange = 10;
    private int random = 0;
    private boolean alreadyMarked;
    private String[] questions;
    ArrayList<Integer> removeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "questionScores")
                .allowMainThreadQueries()
                .build();
        QuestionScoreDao questionScoreDao = db.getQuestionScoreDao();

        questions = getResources().getStringArray(R.array.questions_array);

        tvQuestion = findViewById(R.id.question);
        bQuestion = findViewById(R.id.btn_question);
        bCompleted = findViewById(R.id.btn_completed);
        bQuestion.setOnClickListener(v -> {
            bCompleted.setVisibility(View.VISIBLE);
            if (removeList.size() == maxRange - minRange + 1) {
                tvQuestion.setText("Completed Set!");
                removeList.clear();
            } else {
                random = generateRandom(minRange, maxRange, removeList);
                Toast.makeText(this, String.valueOf(random), Toast.LENGTH_SHORT).show();
                tvQuestion.setText(questions[random - 1]);
                removeList.add(random);
                alreadyMarked = false;
            }
        });
        bCompleted.setOnClickListener(v -> {
            if (!alreadyMarked) {
                QuestionScore questionScore = new QuestionScore(questions[random - 1], 1);
                questionScoreDao.insert(questionScore);
                Toast.makeText(this, "Adding score", Toast.LENGTH_SHORT).show();
                alreadyMarked = true;
            }
        });
        spinnerQuestion = findViewById(R.id.spinner_question);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerQuestion.setAdapter(adapter);
        spinnerQuestion.setOnItemSelectedListener(this);
    }

    public int generateRandom(int start, int end, ArrayList<Integer> excludeRows) {
        Random rand = new Random();
        int range = ((end - start) + 1);

        int random = rand.nextInt(range) + start;
        while(excludeRows.contains(random)) {
            random = rand.nextInt(range) + start;
        }

        return random;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                minRange = 1;
                maxRange = 37;
                break;
            case 1:
                minRange = 38;
                maxRange = 47;
                break;
            case 2:
                minRange = 48;
                maxRange = 54;
                break;
            case 3:
                minRange = 55;
                maxRange = 62;
                break;
            case 4:
                minRange = 63;
                maxRange = 66;
                break;
            case 5:
                minRange = 67;
                maxRange = 73;
                break;
            case 6:
                minRange = 74;
                maxRange = 80;
                break;
            case 7:
                minRange = 81;
                maxRange = 87;
                break;
            default:
                break;
        }
        removeList.clear();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.stats) {
            Intent intent = new Intent(MainActivity.this, StatsActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
