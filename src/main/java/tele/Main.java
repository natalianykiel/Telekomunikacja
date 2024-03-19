package tele.src.main.java.tele;
import tele.src.main.java.tele.algorithm.Algorithm;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filePath = "src/main/java/tele/start.txt"; // Zmień na właściwą ścieżkę
        String outputPath = "src/main/java/tele/mid.txt"; // Zmień na właściwą ścieżkę
        String finalPath = "src/main/java/tele/end.txt"; // Zmień na właściwą ścieżkę
        byte[][] matrix = Patterns.H1;

        try {
            byte[] fileBytes = readAllBytesFromFile(filePath);
            System.out.println("Pobrano " + fileBytes.length + " bajtów z pliku.");


            byte[] codedBytes = Algorithm.menageCodingBytes(fileBytes, matrix);

            // Zapisz codedBytes do pliku
            writeAllBytesToFile(outputPath, codedBytes);
            System.out.println("Zapisano " + codedBytes.length + " bajtów do pliku wynikowego.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd: " + e.getMessage());
        }

        try {
            byte[] fileBytes = readAllBytesFromFile(outputPath);
            System.out.println("Pobrano " + fileBytes.length + " bajtów z pliku.");

            byte[] uncodedBytes = Algorithm.menageDecodingBytes(fileBytes, matrix);

            // Zapisz codedBytes do pliku
            writeAllBytesToFile(finalPath, uncodedBytes);
            System.out.println("Zapisano " + uncodedBytes.length + " bajtów do pliku wynikowego.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd: " + e.getMessage());
        }

    }

    private static byte[] readAllBytesFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readAllBytes(path);
    }

    private static void writeAllBytesToFile(String filePath, byte[] bytes) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, bytes);
    }
}


