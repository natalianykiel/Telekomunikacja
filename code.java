package tele;
import tele.functions;

import static tele.converter.binaryChainToByteForm;
import static tele.functions.multiplyMatrixByVector;

public class code {

    public static byte[] codeWord(byte[] byteWord, byte[][] matrix) {
        int numberOfParityBits = matrix.length;

        byte[] binaryText = converter.byteTabToBinary(byteWord);
        // Utworzenie kopii słowa do zakodowania
        byte[] encoded = new byte[binaryText.length + numberOfParityBits];
        for (int i = 0; i < binaryText.length; i++) {
            encoded[i] = binaryText[i];
        }
        // Dodanie zerowych bitów parzystości na koniec słowa
        for (int i = binaryText.length; i < encoded.length; i++) {
            encoded[i] = 0;
        }
        // Obliczenie bitów parzystości i ich dodanie do zakodowanego słowa
        byte[] parityBits = multiplyMatrixByVector(matrix, binaryText);
        for (int i = 0; i < numberOfParityBits; i++) {
            encoded[binaryText.length + i] = parityBits[i];
        }

        /*byte[] finalBytes = new byte[encoded.length / 8];
        for (int i = 0; i < finalBytes.length; i++) {
            byte[] byteChunk = new byte[8];
            System.arraycopy(encoded, i * 8, byteChunk, 0, 8);
            finalBytes[i] = binaryChainToByteForm(byteChunk)[0];
        }
        return finalBytes;
        */
        return binaryChainToByteForm(encoded);
    }

}


