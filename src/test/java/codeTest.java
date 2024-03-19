package tele.src.test.java;
import org.junit.Test;
import tele.src.main.java.tele.Patterns;
import tele.src.main.java.tele.algorithm.Algorithm;
import java.util.Arrays;

public class codeTest {

    @Test
    public void testCodingDecoding() {
        byte[][] matrix = Patterns.H1; // Wybierz odpowiednią macierz do testu
        byte[] originalBytes = {'t','l' , 'd', 'k', 'f','j'}; // Dla przykładu zakładamy 5 bajtów


        // Zakodowanie bajtów
        byte[] codedBytes = Algorithm.menageCodingBytes(originalBytes, matrix);

        // Odkodowanie zakodowanych bajtów
        byte[] decodedBytes = Algorithm.menageDecodingBytes(codedBytes, matrix);

        System.out.println(Arrays.toString(originalBytes));
        System.out.println(Arrays.toString(codedBytes));
        System.out.println(Arrays.toString(decodedBytes));

        // Porównanie oryginalnych bajtów z odkodowanymi
        //assertArrayEquals(originalBytes, decodedBytes);
    }
}

