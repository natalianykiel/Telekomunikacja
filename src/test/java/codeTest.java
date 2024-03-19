package tele.src.test.java;

import org.testng.annotations.Test;
import tele.src.main.java.tele.Patterns;
import tele.src.main.java.tele.algorithm.Algorithm;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class codeTest {

    @Test
    public void testCodingDecodingH1() {
        byte[][] matrix = Patterns.H1; // Wybierz odpowiednią macierz do testu
        byte[] originalBytes = {'t','l' , 'd', 'k', 'f','j'}; // Dla przykładu zakładamy 5 bajtów


        // Zakodowanie bajtów
        byte[] codedBytes = Algorithm.menageCodingBytes(originalBytes, matrix);

        // Odkodowanie zakodowanych bajtów
        byte[] decodedBytes = Algorithm.menageDecodingBytes(codedBytes, matrix);


        // Porównanie oryginalnych bajtów z odkodowanymi
        assertArrayEquals(originalBytes, decodedBytes);
    }

    @Test
    public void testCodingDecodingH2() {
        byte[][] matrix = Patterns.H1; // Wybierz odpowiednią macierz do testu
        byte[] originalBytes = {'t','l' , 'd', 'k', 'f','j'}; // Dla przykładu zakładamy 5 bajtów


        // Zakodowanie bajtów
        byte[] codedBytes = Algorithm.menageCodingBytes(originalBytes, matrix);

        // Odkodowanie zakodowanych bajtów
        byte[] decodedBytes = Algorithm.menageDecodingBytes(codedBytes, matrix);


        // Porównanie oryginalnych bajtów z odkodowanymi
        assertArrayEquals(originalBytes, decodedBytes);
    }
}

