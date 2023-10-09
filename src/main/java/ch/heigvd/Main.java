package ch.heigvd;

import ch.heigvd.PicoCLI.PicoCLI;

import picocli.CommandLine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        CommandLine main = new CommandLine(new PicoCLI());
        main.execute(args);

        System.out.println("Conversion done !");

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd MM yyyy");
        String formattedTime = currentTime.format(formatter);
        System.out.println(formattedTime);
    }
}