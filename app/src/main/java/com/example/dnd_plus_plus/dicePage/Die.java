package com.example.dnd_plus_plus.dicePage;

import android.view.View;

public class Die {
    private int sides;
    private String print;

    public Die(int sides) {
        this.sides = sides;
        this.print = "Roll a d " + this.sides ;
    }

    public int onPressListener() {
        int max = this.sides;
        int min = 1;
        int range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }
}