package ch.heigvd;

import ch.heigvd.PicoCLI.PicoCLI;

import picocli.CommandLine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        CommandLine main = new CommandLine(new PicoCLI());
        main.execute(args);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Exit code      : ");

        System.out.println("Execution time : " + executionTime + " millisecondes");

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd MM yyyy");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Actual time    : " + formattedTime);

    }
}