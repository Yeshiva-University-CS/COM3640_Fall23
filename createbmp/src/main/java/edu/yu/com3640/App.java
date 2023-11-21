package edu.yu.com3640;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application starting");

        if (args.length < 1) {
            logger.fatal("No file path provided. Exiting application.");
            System.exit(1);
        }

        String filePath = args[0];
        logger.info("File path: " + filePath);


        logger.info("Application exiting");
    }
}
