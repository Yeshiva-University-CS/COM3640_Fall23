package edu.yu.com3640.Impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import edu.yu.com3640.ImagePixelData;
import edu.yu.com3640.Pixel;
import edu.yu.com3640.PixelDataLoader;

public class RgbTextPixelDataLoader implements PixelDataLoader {

    private final String filePath;

    public RgbTextPixelDataLoader(String filePath) {
        this.filePath = filePath;
    }

    public ImagePixelData loadPixelData() throws IOException {
        List<Pixel[]> rowData = Files.lines(Paths.get(this.filePath))
                .map(line -> Arrays.stream(line.split(",")) // Create a stream from the array
                        .map(cell -> {
                            String[] rgb = cell.split(":");
                            int red = Integer.parseInt(rgb[0]);
                            int green = Integer.parseInt(rgb[1]);
                            int blue = Integer.parseInt(rgb[2]);
                            return new Pixel(red, green, blue);
                        })
                        .toArray(Pixel[]::new)) // Collect pixels into an array
                .collect(Collectors.toList()); // Collect rows into a list

        var pixelData = new ImagePixelData(rowData.get(0).length);
        rowData.forEach(row -> pixelData.addRow(row));
        return pixelData;
    }

}
