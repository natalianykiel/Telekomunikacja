package tele.src.test.java;

import org.junit.Test;
import tele.src.main.java.tele.Patterns;
import tele.src.main.java.tele.algorithm.Algorithm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class codeTest {

    @Test
    public void testCodingDecoding() {
        byte[][] matrix = Patterns.H1; // Wybierz odpowiednią macierz do testu
        byte[] originalBytes = {1, 2, 3, 4, 5}; // Dla przykładu zakładamy 5 bajtów

        // Zakodowanie bajtów
        byte[] codedBytes = Algorithm.menageCodingBytes(originalBytes, matrix);

        // Odkodowanie zakodowanych bajtów
        byte[] decodedBytes = Algorithm.menageDecodingBytes(codedBytes, matrix);

        // Porównanie oryginalnych bajtów z odkodowanymi
        assertArrayEquals(originalBytes, decodedBytes);
    }

}

