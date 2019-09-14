package com.gallopdevs.interviewtests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
    private Spinner spinnerQuestion;

    private int minRange = 1;
    private int maxRange = 10;
    private String[] questions;
    ArrayList<Integer> removeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questions = getResources().getStringArray(R.array.questions_array);

        tvQuestion = findViewById(R.id.question);
        bQuestion = findViewById(R.id.btn_question);
        bQuestion.setOnClickListener(v -> {
            if (removeList.size() == maxRange - minRange + 1) {
                tvQuestion.setText("Completed Set!");
                removeList.clear();
            } else {
                int random = generateRandom(minRange, maxRange, removeList);
                Toast.makeText(this, String.valueOf(random), Toast.LENGTH_SHORT).show();
                tvQuestion.setText(questions[random - 1]);
                removeList.add(random);
            }
        });


        spinnerQuestion = findViewById(R.id.spinner_question);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.choices_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerQuestion.setAdapter(adapter);
        spinnerQuestion.setOnItemSelectedListener(this);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "questionScores").build();
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
                maxRange = 13;
                break;
            case 1:
                minRange = 14;
                maxRange = 23;
                break;
            case 2:
                minRange = 24;
                maxRange = 30;
                break;
            case 3:
                minRange = 31;
                maxRange = 38;
                break;
            case 4:
                minRange = 39;
                maxRange = 42;
                break;
            default:
                break;
        }
        removeList.clear();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
