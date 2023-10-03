package ch.heigvd.ImageGenerator;

// Java program to demonstrate
// creation of random pixel image

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageGenerator
{
    private int imgWidth, imgHeight;

    public ImageGenerator(int width, int height){
        imgWidth = width;
        imgHeight = height;
    }

    public void GenerateImage() {
        // Create buffered image object
        BufferedImage img = null;
        img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_ARGB);

        // file object
        File f = null;

        // create random values pixel by pixel
        for (int y = 0; y < imgHeight; y++)
        {
            for (int x = 0; x < imgWidth; x++)
            {
                // generating values less than 256
                int a = (int)(Math.random()*256);
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);

                //pixel
                int p = (a<<24) | (r<<16) | (g<<8) | b;

                img.setRGB(x, y, p);
            }
        }

        // write image
        try
        {
            f = new File("images/testimage"+ imgWidth +"x"+imgHeight+".png");
            ImageIO.write(img, "png", f);
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
