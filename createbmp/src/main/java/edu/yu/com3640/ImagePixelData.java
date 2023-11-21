package edu.yu.com3640;

import java.util.ArrayList;

public class ImagePixelData {

    public final int columns;
    public final ArrayList<Pixel[]> pixelData;

    public ImagePixelData(int columns) {
        this.columns = columns;
        this.pixelData = new ArrayList<>();
    }

    public void addRow(Pixel[] row) {
        if (row.length != this.columns) {
            throw new IllegalArgumentException("Row length must match number of columns");
        }
        this.pixelData.add(row);
    }

    public int rows() {
        return this.pixelData.size();
    }

    public int cols() {
        return this.columns;
    }

    public Pixel getPixel(int row, int col) {
        return this.pixelData.get(row)[col];
    }

    public void setPixel(int row, int col, Pixel pixel) {
        this.pixelData.get(row)[col] = pixel;
    }

}
