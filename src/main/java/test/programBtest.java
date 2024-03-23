package tele.src.main.java.test;
import org.junit.Test;
import tele.src.main.java.programB.Patterns;
import tele.src.main.java.programB.algorithm.Algorithm;
import tele.src.main.java.programB.Converter;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class programBtest {
        @Test
        public void testCodingDecodingH1() {
            byte[][] matrix = Patterns.H1;
            byte[] originalBytes = {'t', 'l', 'd', 'k', 'f','j'};

            // Zakodowanie bajtów
            byte[] codedBytes = Algorithm.menageCodingBytes(originalBytes, matrix);

            // Odkodowanie zakodowanych bajtów
            byte[] decodedBytes = Algorithm.menageDecodingBytes(codedBytes, matrix);

            // Porównanie oryginalnych bajtów z odkodowanymi
            assertArrayEquals(originalBytes, decodedBytes);
        }

        @Test
        public void testCodingDecodingH2() {
            byte[][] matrix = Patterns.H1;
            byte[] originalBytes = {'t', 'l', 'd', 'k', 'f','j'};

            // Zakodowanie bajtów
            byte[] codedBytes = Algorithm.menageCodingBytes(originalBytes, matrix);

            // Odkodowanie zakodowanych bajtów
            byte[] decodedBytes = Algorithm.menageDecodingBytes(codedBytes, matrix);

            // Porównanie oryginalnych bajtów z odkodowanymi
            assertArrayEquals(originalBytes, decodedBytes);
        }

        @Test
        public void testByteNumberTo8bTab(){
            //zapis byte liczby 9
            byte byteNumber = 9;
            //zapis binary liczby 9
            byte[] binaryNumber = {0, 0, 0, 0, 1, 0, 0, 1};
            assertArrayEquals(Converter.byteNumberTo8bTab(byteNumber), binaryNumber);
        }

        @Test
        public void testBinaryChainToByteForm(){
            //zapis byte liczb {9, 9}
            byte[] byteNumbers = {9, 9};
            //zapis binary liczb {9, 9}
            byte[] binaryNumbers = {0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1};
            assertArrayEquals(Converter.binaryChainToByteForm(binaryNumbers), byteNumbers);
        }
}


