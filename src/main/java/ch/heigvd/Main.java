package ch.heigvd;

import ch.heigvd.TextToImage.TextToImage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

        @Override
        public void run() {
            TextToImage txtImg = new TextToImage();
        }
    }

    @CommandLine.Command(name = "music", mixinStandardHelpOptions = true, version = "0.1",
            description = "Converstion d'une musique en image.")
    public static class MusicToImage implements Runnable {

        @CommandLine.Option(names = {"-i", "--input"}, required = true, description = "Chemin du fichier d'entrée.")
        private File inputFile;

        @CommandLine.Option(names = {"-o", "--output"}, required = true, description = "Chemin de l'image générée.")
        private File outputFile;

        @Override
        public void run() {
            MusicToImage musImg = new MusicToImage();
        }
    }

    public static void main(String[] args) {
        new CommandLine(new Main()).execute(args);
    }
}