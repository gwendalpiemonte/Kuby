package ch.heigvd.MusicToImage;

import ch.heigvd.ImageGenerator.ImageGenerator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MusicToImage {
    /**
     * Constructor of the class that will convert the text to an image
     * @param inputPath = the path where the prompt will come
     * @param width = the width of the image
     * @param height = the height of the image
     * @param outputPath = the path where to write the image
     * @param colorProfile = the color profile
     */
    public MusicToImage(String inputPath, int width, int height, String outputPath, String colorProfile) {
        readBytes(inputPath);
        //ImageGenerator imageGenerator = new ImageGenerator(outputPath, width, height, readBytes(inputPath), colorProfile);
        //imageGenerator.GenerateImage();
    }

    // Read bytes from the music given in the inputPath
    private byte[] readBytes(String inputPath) {
        byte[] data = null;

        try {
            FileInputStream fileMP3 = new FileInputStream(inputPath);

            // Define the size of the data array to be returned
            int fileSize = (int) new File(inputPath).length();
            data = new byte[fileSize];

            int bytesRead = fileMP3.read(data);

            if (bytesRead != fileSize) {
                throw new RuntimeException("The lecture of your file didn't work. Please retry.");
            }

            fileMP3.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(data.length);
        //for(int i = 0; i< data.length; ++i){
        //    System.out.println(data[i]);
        //}

        return data;
    }
}
