package ch.heigvd.TextToImage;

import ch.heigvd.ImageGenerator.ImageGenerator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextToImage {

    /**
     * Constructor of the class that will convert the text to an image
     * @param inputPath = the path where the prompt will come
     * @param width = the width of the image
     * @param height = the height of the image
     * @param outputPath = the path where to write the image
     * @param colorProfile = the color profile
     */
    public TextToImage(String inputPath, int width, int height, String outputPath, String colorProfile) {

        ImageGenerator imageGenerator = new ImageGenerator(outputPath, width, height, readBytes(inputPath), colorProfile);
        imageGenerator.GenerateImage();
    }

    // Read bytes from the text given in the inputPath
    private byte[] readBytes(String inputPath) {
        byte[] data = null;

        try (FileInputStream fis = new FileInputStream(inputPath);
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            // Define the size of the data array to be returned
            int fileSize = (int) new File(inputPath).length();
            data = new byte[fileSize];

            // Write bytes into data and check all bytes are read
            int bytesRead = bis.read(data);
            if (bytesRead != fileSize) {
                throw new RuntimeException("The lecture of your file didn't work. Please retry.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
