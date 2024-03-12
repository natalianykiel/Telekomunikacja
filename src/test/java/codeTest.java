package tele.src.test.java;

import org.junit.jupiter.api.Test;
import tele.src.main.java.tele.algorithm.code;
import tele.src.main.java.tele.patterns;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class codeTest {

    @Test
    public void testCodeWord() {
        byte[][] matrix = patterns.H1;
        byte[] word = {65, 66, 67};

        // Spodziewany wynik dla powyższego słowa i macierzy H1
        byte[] expected = {0, -91, 64, 0, -64, -126, 64, 0, 65, 66, 67};

        // Wywołanie metody codeWord i sprawdzenie czy wynik jest taki sam jak oczekiwany
        byte[] result = code.codeWord(word, matrix);

    }
}

