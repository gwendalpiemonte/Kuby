package ch.heigvd.PicoCLI;

import ch.heigvd.TextToImage.TextToImage;
import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(
        name = "ByteToImage",
        version = "0.1",
        description = "Utility to convert media into an image",
        subcommands = { PicoCLI.ConvertTextToImage.class, PicoCLI.ConvertMusicToImage.class},
        mixinStandardHelpOptions = true)

public class PicoCLI {
    @CommandLine.Command(
            name = "text",
            version = "0.1",
            description = "Conversion of a text file into an image.",
            mixinStandardHelpOptions = true)

    public static class ConvertTextToImage implements Runnable {

        @CommandLine.Option(
                names = {"-i", "--input"},
                required = true,
                description = "Path to the input file.")

        private String inputFile;

        @CommandLine.Option(
                names = {"-o", "--output"},
                required = true,
                description = "Path to the folder where the image will be generated.")

        private String outputFile;

        @CommandLine.Option(
                names = {"-c", "--color"},
                required = false,
                description = "Values = [blue, green, yellow, red, random] : Color of the generated image.")

        private String color = "";

        @CommandLine.Option(
                names = {"-h", "--height"},
                required = false,
                description = "Height of the generated image.")

        private int height = 100;

        @CommandLine.Option(
                names = {"-w", "--width"},
                required = false,
                description = "Width of the generated image.")

        private int width = 100;

        @Override
        public void run() {
            new TextToImage(inputFile, width, height, outputFile, color);
        }
    }

    @CommandLine.Command(
            name = "music",
            version = "0.1",
            description = "Conversion of music into an image.",
            mixinStandardHelpOptions = true)

    public static class ConvertMusicToImage implements Runnable {

        @CommandLine.Option(
                names = {"-i", "--input"},
                required = true,
                description = "Path to the input file.")

        private File inputFile;

        @CommandLine.Option(
                names = {"-o", "--output"},
                required = true,
                description = "Path to the folder where the image will be generated.")

        private File outputFile;

        @CommandLine.Option(
                names = {"-c", "--color"},
                required = false,
                description = "Values = [blue, green, yellow, red, random] : Color of the generated image.")

        private String couleur;

        @CommandLine.Option(
                names = {"-h", "--hight"},
                required = false,
                description = "Height of the generated image.")

        private int hauteur;

        @CommandLine.Option(
                names = {"-w", "--width"},
                required = false,
                description = "Width of the generated image.")

        private int largeur;

        @Override
        public void run() {
            //new TextToImage(inputFile, width, height, outputFile, color);
        }
    }
}
