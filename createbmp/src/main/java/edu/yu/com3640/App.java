package edu.yu.com3640;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.yu.com3640.Impl.ImageFactory;
import edu.yu.com3640.Impl.RgbTextPixelDataLoader;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) throws IOException {
        logger.info("Application starting");

        if (args.length < 1) {
            logger.fatal("No file path provided. Exiting application.");
            System.exit(1);
        }

        String filePath = args[0];
        logger.info("File path: " + filePath);

        PixelDataLoader loader = new RgbTextPixelDataLoader(filePath);
        Image image = ImageFactory.create24BitBMPImage(loader);
        logger.info("Image Width: " + image.getWidth());
        logger.info("Image Height: " + image.getHeight());

        image.flipHorizontal();
        image.saveToFile(filePath + ".H.bmp");
        image.flipVertical();
        image.saveToFile(filePath + ".V.bmp");
        image.convertToGrayScale();
        image.saveToFile(filePath + ".gray.bmp");

        logger.info("Application exiting");
    }
}
