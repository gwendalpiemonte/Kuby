package ch.heigvd;

import ch.heigvd.ImageGenerator.ImageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {

        String prompt = "abc xyz";

        ImageGenerator img = new ImageGenerator("images",100, 100, prompt.getBytes(), "green");
        img.GenerateImage();
    }
}