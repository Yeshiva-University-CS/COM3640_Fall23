package edu.yu.com3640;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.yu.com3640.Impl.RgbTextPixelDataLoader;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testLoadRgb() throws URISyntaxException {
        String resourceName = "/small.rgb";
        var fullPath = Paths.get(this.getClass().getResource(resourceName).toURI()).toAbsolutePath();

        var loader = new RgbTextPixelDataLoader(fullPath.toString());
        
        assertDoesNotThrow(() -> { 
            var pixelData = loader.loadPixelData();
            assertEquals(24, pixelData.cols());
            assertEquals(24, pixelData.rows());
        });
    }
}
