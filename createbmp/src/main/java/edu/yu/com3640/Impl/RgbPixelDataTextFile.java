package edu.yu.com3640.Impl;

import edu.yu.com3640.ImagePixelData;
import edu.yu.com3640.PixelDataLoader;

public class RgbPixelDataTextFile implements PixelDataLoader {

    private final String filePath;

    public RgbPixelDataTextFile(String filePath) {
        this.filePath = filePath;
    }

    public ImagePixelData loadPixelData() {
        // load the file and parse in the contents line by line
        // using streams, create a PixelData object and return it

        throw new UnsupportedOperationException("Not yet implemented " + filePath);
    }

}
