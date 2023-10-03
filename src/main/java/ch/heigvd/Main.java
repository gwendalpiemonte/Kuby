package ch.heigvd;

import ch.heigvd.ImageGenerator.ImageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        ImageGenerator img = new ImageGenerator(1000,1000);

        img.GenerateImage();
    }
}