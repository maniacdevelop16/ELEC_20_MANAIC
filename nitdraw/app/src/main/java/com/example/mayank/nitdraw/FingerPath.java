package com.example.mayank.nitdraw;

/**
 * Created by Mayank on 01-02-2020.
 */
import android.graphics.Path;

public class FingerPath {

    public int color;
    public int strokeWidth;
    public Path path;

    public FingerPath(int color, int strokeWidth, Path path) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}