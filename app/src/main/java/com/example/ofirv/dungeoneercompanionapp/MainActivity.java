package com.example.ofirv.dungeoneercompanionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int level = 0, health = 0, strength = 0, magic = 0, action = 0, glory = 0, peril = 0;
    TextView levelText, healthText, strengthText, magicText, actionText, gloryText, perilText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_sheet);

        levelText = findViewById(R.id.level);
        healthText = findViewById(R.id.health);
        strengthText = findViewById(R.id.strength);
        magicText = findViewById(R.id.magic);
        actionText = findViewById(R.id.action);
        gloryText = findViewById(R.id.glory);
        perilText = findViewById(R.id.peril);
    }

    public void change(View view)
    {
        switch (view.getId())
        {
            case R.id.level_plus_one:
                level++;
                levelText.setText(String.format("%02d", level));
                break;

            case R.id.level_minus_one:
                level--;
                levelText.setText(String.format("%02d", level));
                break;

            case R.id.health_plus_one:
                health++;
                healthText.setText(String.format("%02d", health));
                break;

            case R.id.health_minus_one:
                health--;
                healthText.setText(String.format("%02d", health));
                break;

            case R.id.strength_plus_one:
                strength++;
                strengthText.setText(String.format("%02d", strength));
                break;

            case R.id.strength_minus_one:
                strength--;
                strengthText.setText(String.format("%02d", strength));
                break;

            case R.id.magic_plus_one:
                magic++;
                magicText.setText(String.format("%02d", magic));
                break;

            case R.id.magic_minus_one:
                magic--;
                magicText.setText(String.format("%02d", magic));
                break;

            case R.id.action_plus_one:
                action++;
                actionText.setText(String.format("%02d", action));
                break;

            case R.id.action_minus_one:
                action--;
                actionText.setText(String.format("%02d", action));
                break;

            case R.id.glory_plus_one:
                glory++;
                gloryText.setText(String.format("%02d", glory));
                break;

            case R.id.glory_minus_one:
                glory--;
                gloryText.setText(String.format("%02d", glory));
                break;

            case R.id.glory_plus_five:
                glory+=5;
                gloryText.setText(String.format("%02d", glory));
                break;

            case R.id.glory_minus_five:
                glory-=5;
                gloryText.setText(String.format("%02d", glory));
                break;

            case R.id.peril_plus_one:
                peril++;
                perilText.setText(String.format("%02d", peril));
                break;

            case R.id.peril_minus_one:
                peril--;
                perilText.setText(String.format("%02d", peril));
                break;

            case R.id.peril_plus_five:
                peril+=5;
                perilText.setText(String.format("%02d", peril));
                break;

            case R.id.peril_minus_five:
                peril-=5;
                perilText.setText(String.format("%02d", peril));
                break;
        }
    }
}
