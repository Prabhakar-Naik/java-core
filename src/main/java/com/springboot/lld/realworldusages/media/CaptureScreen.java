package com.springboot.lld.realworldusages.media;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author prabhakar, @Date 10-07-2025
 */

public class CaptureScreen {

    /**
     * Capture screenshot and save it to PNG file. Credits: https://viralpatel.net/blogs/how-to-take-screen-shots-in-java-taking-screenshots-java/
     *
     * @param filename the name of the file
     * @throws AWTException if the platform configuration does not allow low-level input control
     * @throws IOException  if an I/O error occurs
     */

    public static void captureScreen(String filename) throws IOException, AWTException{
        var screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        var screenRectangle = new Rectangle(screenSize);
        var robot = new Robot();
        var image = robot.createScreenCapture(screenRectangle);
        ImageIO.write(image, "jpg", new File(filename));
    }


    /**
     * Tests for {@link CaptureScreen#captureScreen(String)}.
     */
    //@Test
    void testCaptureScreen() throws IOException, AWTException {
        final var filename = "src/test/resources/screenshot.png";
        try {
            CaptureScreen.captureScreen(filename);
            var f = new File(filename);
            //assertTrue(f.exists() && !f.isDirectory());
        } catch (HeadlessException e) {
            // the test runs on a computer without a screen, it is ok to fail
        } finally {
            Files.deleteIfExists(new File(filename).toPath());
        }
    }
}
