package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int points = 0;


    /**
     * This method checks right or wrong.
     */
    private int pointsTotal() {

        /**
         * Question Serie 1.
         */
        RadioButton Q_1_A_1 = findViewById(R.id.Q_1_A_1);
        boolean isQ_1_A_1 = Q_1_A_1.isChecked();

        RadioButton Q_1_A_2 = findViewById(R.id.Q_1_A_2);
        boolean isQ_1_A_2 = Q_1_A_2.isChecked();

        RadioButton Q_1_A_3 = findViewById(R.id.Q_1_A_3);
        boolean isQ_1_A_3 = Q_1_A_3.isChecked();

        if (isQ_1_A_1) {
            points = points + 1;
        }
        if (isQ_1_A_2) {
            points = points + 0;
        }
        if (isQ_1_A_3) {
            points = points + 0;
        }

        /**
         * Question Serie 2.
         */
        RadioButton Q_2_A_1 = findViewById(R.id.Q_2_A_1);
        boolean isQ_2_A_1 = Q_2_A_1.isChecked();

        RadioButton Q_2_A_2 = findViewById(R.id.Q_2_A_2);
        boolean isQ_2_A_2 = Q_2_A_2.isChecked();

        RadioButton Q_2_A_3 = findViewById(R.id.Q_2_A_3);
        boolean isQ_2_A_3 = Q_2_A_3.isChecked();

        if (isQ_2_A_1) {
            points = points + 0;
        }
        if (isQ_2_A_2) {
            points = points + 1;
        }
        if (isQ_2_A_3) {
            points = points + 0;
        }

        /**
         * Question Serie 3.
         */
        RadioButton Q_3_A_1 = findViewById(R.id.Q_3_A_1);
        boolean isQ_3_A_1 = Q_3_A_1.isChecked();

        RadioButton Q_3_A_2 = findViewById(R.id.Q_3_A_2);
        boolean isQ_3_A_2 = Q_3_A_2.isChecked();

        RadioButton Q_3_A_3 = findViewById(R.id.Q_3_A_3);
        boolean isQ_3_A_3 = Q_3_A_3.isChecked();

        if (isQ_3_A_1) {
            points = points + 0;
        }
        if (isQ_3_A_2) {
            points = points + 0;
        }
        if (isQ_3_A_3) {
            points = points + 1;
        }

        /**
         * Question Serie 4.
         */
        RadioButton Q_4_A_1 = findViewById(R.id.Q_4_A_1);
        boolean isQ_4_A_1 = Q_4_A_1.isChecked();

        RadioButton Q_4_A_2 = findViewById(R.id.Q_4_A_2);
        boolean isQ_4_A_2 = Q_4_A_2.isChecked();

        RadioButton Q_4_A_3 = findViewById(R.id.Q_4_A_3);
        boolean isQ_4_A_3 = Q_4_A_3.isChecked();

        if (isQ_4_A_1) {
            points = points + 1;
        }
        if (isQ_4_A_2) {
            points = points + 0;
        }
        if (isQ_4_A_3) {
            points = points + 0;
        }

        /**
         * Question Serie 5.
         */
        RadioButton Q_5_A_1 = findViewById(R.id.Q_5_A_1);
        boolean isQ_5_A_1 = Q_5_A_1.isChecked();

        RadioButton Q_5_A_2 = findViewById(R.id.Q_5_A_2);
        boolean isQ_5_A_2 = Q_5_A_2.isChecked();

        RadioButton Q_5_A_3 = findViewById(R.id.Q_5_A_3);
        boolean isQ_5_A_3 = Q_5_A_3.isChecked();

        if (isQ_5_A_1) {
            points = points + 0;
        }
        if (isQ_5_A_2) {
            points = points + 1;
        }
        if (isQ_5_A_3) {
            points = points + 0;
        }


        /**
         * Question Serie 6.
         */
        RadioButton Q_6_A_1 = findViewById(R.id.Q_6_A_1);
        boolean isQ_6_A_1 = Q_6_A_1.isChecked();

        RadioButton Q_6_A_2 = findViewById(R.id.Q_6_A_2);
        boolean isQ_6_A_2 = Q_6_A_2.isChecked();

        RadioButton Q_6_A_3 = findViewById(R.id.Q_6_A_3);
        boolean isQ_6_A_3 = Q_6_A_3.isChecked();

        if (isQ_6_A_1) {
            points = points + 0;
        }
        if (isQ_6_A_2) {
            points = points + 0;
        }
        if (isQ_6_A_3) {
            points = points + 1;
        }


        /**
         * Question Serie 7.
         */
        RadioButton Q_7_A_1 = findViewById(R.id.Q_7_A_1);
        boolean isQ_7_A_1 = Q_7_A_1.isChecked();

        RadioButton Q_7_A_2 = findViewById(R.id.Q_7_A_2);
        boolean isQ_7_A_2 = Q_7_A_2.isChecked();

        RadioButton Q_7_A_3 = findViewById(R.id.Q_7_A_3);
        boolean isQ_7_A_3 = Q_7_A_3.isChecked();

        if (isQ_7_A_1) {
            points = points + 1;
        }
        if (isQ_7_A_2) {
            points = points + 0;
        }
        if (isQ_7_A_3) {
            points = points + 0;
        }


        /**
         * Question Serie 8.
         */
        RadioButton Q_8_A_1 = findViewById(R.id.Q_8_A_1);
        boolean isQ_8_A_1 = Q_8_A_1.isChecked();

        RadioButton Q_8_A_2 = findViewById(R.id.Q_8_A_2);
        boolean isQ_8_A_2 = Q_8_A_2.isChecked();

        RadioButton Q_8_A_3 = findViewById(R.id.Q_8_A_3);
        boolean isQ_8_A_3 = Q_8_A_3.isChecked();

        if (isQ_8_A_1) {
            points = points + 0;
        }
        if (isQ_8_A_2) {
            points = points + 1;
        }
        if (isQ_8_A_3) {
            points = points + 0;
        }


        /**
         * Question Serie 9.
         */
        RadioButton Q_9_A_1 = findViewById(R.id.Q_9_A_1);
        boolean isQ_9_A_1 = Q_9_A_1.isChecked();

        RadioButton Q_9_A_2 = findViewById(R.id.Q_9_A_2);
        boolean isQ_9_A_2 = Q_9_A_2.isChecked();

        RadioButton Q_9_A_3 = findViewById(R.id.Q_9_A_3);
        boolean isQ_9_A_3 = Q_9_A_3.isChecked();

        if (isQ_9_A_1) {
            points = points + 0;
        }
        if (isQ_9_A_2) {
            points = points + 0;
        }
        if (isQ_9_A_3) {
            points = points + 1;
        }


        /**
         * Question Serie 10.
         */
        RadioButton Q_10_A_1 = findViewById(R.id.Q_10_A_1);
        boolean isQ_10_A_1 = Q_10_A_1.isChecked();

        RadioButton Q_10_A_2 = findViewById(R.id.Q_10_A_2);
        boolean isQ_10_A_2 = Q_10_A_2.isChecked();

        RadioButton Q_10_A_3 = findViewById(R.id.Q_10_A_3);
        boolean isQ_10_A_3 = Q_10_A_3.isChecked();

        if (isQ_10_A_1) {
            points = points + 1;
        }
        if (isQ_10_A_2) {
            points = points + 0;
        }
        if (isQ_10_A_3) {
            points = points + 0;
        }
        return points;
    }


    /**
     * This method checks the total.
     */
    public void checkPoints(View view) {
        points = pointsTotal();
        display();
    }

    /**
     * This method displays the points on the screen.
     */
    private void display() {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        if (points == 10) {
            Toast.makeText(this, "Amazing! " + name + "!" + "\nYou have everything right! " + "\nScore: " + points + "/10", Toast.LENGTH_LONG).show();
        }

        if (points >= 6) {
            Toast.makeText(this, "Congratulations " + name + "!" + "\nYou did great! :D " + "\nScore: " + points + "/10", Toast.LENGTH_LONG).show();
        }

        if (points < 6) {
            Toast.makeText(this, "You can do better " + name + "\nStart over :/ " + "\nScore: " + points + "/10", Toast.LENGTH_LONG).show();
        }

    }


    /**
     * Resets the game
     */
    //public void reset (View v) {

}



