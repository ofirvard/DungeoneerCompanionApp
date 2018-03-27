package com.example.ofirv.dungeoneercompanionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int level = 1, health = 6, glory = 0, peril = 0;
    TextView levelText, healthText, strengthText, magicText, actionText, gloryText, perilText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_sheet);

        levelText = findViewById(R.id.level);
        healthText = findViewById(R.id.health);
        gloryText = findViewById(R.id.glory);
        perilText = findViewById(R.id.peril);
    }

    public void changeLevel(View view)
    {
        switch (view.getId())
        {
            case R.id.level_plus_one:
                level++;
                break;

            case R.id.level_minus_one:
                if (level > 1) level--;
                break;
        }
        levelText.setText(String.format("%02d", level));
    }

    public void changeHealth(View view)
    {
        switch (view.getId())
        {
            case R.id.health_plus_one:
                health++;
                break;

            case R.id.health_minus_one:
                if (health > 0) health--;
                break;
        }
        healthText.setText(String.format("%02d", health));
    }

    public void changeGlory(View view)
    {
        switch (view.getId())
        {
            case R.id.glory_plus_one:
                glory++;
                break;

            case R.id.glory_minus_one:
                glory--;
                break;

            case R.id.glory_plus_five:
                glory += 5;
                break;

            case R.id.glory_minus_five:
                glory -= 5;
                break;
        }
        if (glory < 0)
            glory = 0;
        gloryText.setText(String.format("%02d", glory));
    }

    public void changePeril(View view)
    {
        switch (view.getId())
        {
            case R.id.peril_plus_one:
                peril++;
                break;

            case R.id.peril_minus_one:
                peril--;
                break;

            case R.id.peril_plus_five:
                peril += 5;
                break;

            case R.id.peril_minus_five:
                peril -= 5;
                break;
        }
        if (peril < 0)
            peril = 0;
        perilText.setText(String.format("%02d", peril));
    }
}
