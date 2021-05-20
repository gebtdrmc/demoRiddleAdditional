package sg.edu.rp.c346.id20047223.demoriddleadditional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.tvans);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");

        if(questionsSelected.equals("Q1")){
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        } else if(questionsSelected.equals("Q2")) {
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }
    }
}