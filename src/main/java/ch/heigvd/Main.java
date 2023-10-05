package ch.heigvd;

import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(name = "ByteToImage", mixinStandardHelpOptions = true, version = "0.1",
        description = "Utilitaire pour convertir un media en image", subcommands = { Main.TextToImage.class, Main.MusicToImage.class})
public class Main {
    @CommandLine.Command(name = "text", mixinStandardHelpOptions = true, version = "0.1",
            description = "Converstion d'un fichier texte en image.")
    public static class TextToImage implements Runnable {

        @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Chemin du fichier d'entrée.")
        private File inputFile;

        @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Chemin de l'image générée.")
        private File outputFile;

        @CommandLine.Option(names = {"-c", "--color"}, required = false, description = "Couleur de l'image générée.")
        private String couleur;

        @CommandLine.Option(names = {"-h", "--hight"}, required = false, description = "Couleur de l'image générée.")
        private String hauteur;

        @CommandLine.Option(names = {"-w", "--width"}, required = false, description = "Largeur de l'image générée.")
        private String largeur;

        @Override
        public void run() {
            Main.TextToImage txtImg = new Main.TextToImage();
        }
    }




    @CommandLine.Command(name = "music", mixinStandardHelpOptions = true, version = "0.1",
            description = "Converstion d'une musique en image.")
    public static class MusicToImage implements Runnable {

        @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Chemin du fichier d'entrée.")
        private File inputFile;

        @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Chemin de l'image générée.")
        private File outputFile;

        @CommandLine.Option(names = {"-c", "--color"}, required = false, description = "Couleur de l'image générée.")
        private String couleur;

        @CommandLine.Option(names = {"-h", "--hight"}, required = false, description = "Couleur de l'image générée.")
        private String hauteur;

        @CommandLine.Option(names = {"-w", "--width"}, required = false, description = "Largeur de l'image générée.")
        private String largeur;

        @Override
        public void run() {
            MusicToImage musImg = new MusicToImage();
        }
    }

    public static void main(String[] args) {
        CommandLine main = new CommandLine(new Main());
        main.execute(args);
    }
}

