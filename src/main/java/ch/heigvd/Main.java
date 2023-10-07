package ch.heigvd;

import ch.heigvd.TextToImage.TextToImage;

import picocli.CommandLine;
import java.io.File;

@CommandLine.Command(name = "ByteToImage", mixinStandardHelpOptions = true, version = "0.1",
        description = "Utilitaire pour convertir un media en image", subcommands = { Main.ConvertTextToImage.class, Main.ConvertMusicToImage.class})
public class Main {
    @CommandLine.Command(name = "text", mixinStandardHelpOptions = true, version = "0.1",
            description = "Converstion d'un fichier texte en image.")
    public static class ConvertTextToImage implements Runnable {

        @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Chemin du fichier d'entrée.")
        private String inputFile;

        @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Chemin de l'image générée.")
        private String outputFile;

        @CommandLine.Option(names = {"-c", "--color"}, required = false, description = "Values = [blue, green, yellow, red, random] : Couleur de l'image générée.")
        private String couleur = "";

        @CommandLine.Option(names = {"-h", "--hight"}, required = false, description = "Hauteur de l'image générée.")
        private int hauteur = 100;

        @CommandLine.Option(names = {"-w", "--width"}, required = false, description = "Largeur de l'image générée.")
        private int largeur = 100;

        @Override
        public void run() {
            new TextToImage(inputFile, largeur, hauteur, outputFile, couleur);
        }
    }

    @CommandLine.Command(name = "music", mixinStandardHelpOptions = true, version = "0.1",
            description = "Converstion d'une musique en image.")
    public static class ConvertMusicToImage implements Runnable {

        @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Chemin du fichier d'entrée.")
        private File inputFile;

        @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Chemin de l'image générée.")
        private File outputFile;

        @CommandLine.Option(names = {"-c", "--color"}, required = false, description = "Couleur de l'image générée.")
        private String couleur;

        @CommandLine.Option(names = {"-h", "--hight"}, required = false, description = "Hauteur de l'image générée.")
        private int hauteur;

        @CommandLine.Option(names = {"-w", "--width"}, required = false, description = "Largeur de l'image générée.")
        private int largeur;

        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
        CommandLine main = new CommandLine(new Main());
        main.execute(args);
    }
}

