package tele.src.main.java.tele.algorithm;
import tele.src.main.java.tele.Converter;

public class Algorithm {
    public static byte[] menageCodingBytes(byte[] bytes, byte[][] matrix) {
        byte[] outputInBytes = new byte[bytes.length];
        byte[] outputInBits = new byte[bytes.length * 8];
        byte[] tempBinary = new byte[8];

        for (int i = 0; i < outputInBytes.length; i++) {
            byte b = bytes[i];
            //zwraca 8 bitowa tabele po kodowaniu
            tempBinary = Code.Code(Converter.byteNumberTo8bTab(b), matrix);
            //zapisujemy elementy z tablic 8 bitowych kolo siebie
            for (int j = i * 8; j <= (i * 8) + 7; j++) {
                outputInBits[j] = tempBinary[j];
            }
        }
        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(outputInBits);
        return  outputInBytes;
    }

    public static byte[] menageDecodingBytes(byte[] bytes, byte[][] matrix){
        byte[] outputInBytes = new byte[bytes.length];
        byte[] inputInBits = new byte[bytes.length * 8];
        byte[] tempBinary = new byte[8];
        int wordLength = 8 + matrix.length;

        //convert bytes to Binary
        for (int i = 0; i < outputInBytes.length; i++) {
            byte b = bytes[i];
            //zwraca 8 bitowa tabele po kodowaniu
            tempBinary = Decode.Decode(Converter.byteNumberTo8bTab(b), matrix);
            //zapisujemy elementy z tablic 8 bitowych kolo siebie
            for (int j = i * 8; j <= (i * 8) + 7; j++) {
                inputInBits[j] = tempBinary[j];
            }
        }
        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(inputInBits);
        return inputInBits;

    }
}





