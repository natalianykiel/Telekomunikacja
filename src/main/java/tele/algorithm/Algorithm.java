package tele.src.main.java.tele.algorithm;
import tele.src.main.java.tele.Converter;

import java.util.Arrays;

public class Algorithm {
    public static byte[] menageCodingBytes(byte[] bytes, byte[][] matrix) {
        //System.out.println(bytes.length);
        byte[] outputInBytes = new byte[bytes.length];
        byte[] outputInBits = new byte[bytes.length * 16];
        byte[] tempBinary;//= new byte[8];


        for (int i = 0; i < outputInBytes.length; i++) {
            byte b = bytes[i];
            //zwraca 8 bitowa tabele po kodowaniu
            tempBinary = Code.Code(Converter.byteNumberTo8bTab(b), matrix);

            //System.out.println(i + ". " + Converter.byteNumberTo8bTab(b));
            System.out.println(i + ". " + Arrays.toString(tempBinary));

            //zapisujemy elementy z tablic 8 bitowych kolo siebie
            for (int j = i * 16; j <= (i * 16) + 15; j++) {
                if (tempBinary.length > j % 16) {
                    outputInBits[j] = tempBinary[j % 16];
                } else {
                    outputInBits[j] = 0;
                }
            }

            System.out.println(Arrays.toString(outputInBits));

        }

        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(outputInBits);
        return  outputInBytes;
    }

    public static byte[] menageDecodingBytes(byte[] bytes, byte[][] matrix){
        byte[] outputInBytes = new byte[bytes.length];
        byte[] inputInBits = new byte[bytes.length * 8];
        byte[] tempBinary ;//= new byte[8];
        int wordLength = 8 + matrix.length;
        boolean a = false; //!!!!!! ZMIENIC NAZWE a JEST DLA BECZKI HEHE XD LOL
        int dodatkowaZmienna = 0; // hehe


        //convert bytes to Binary
        for (int i = 0; i < outputInBytes.length; i++) {
            byte b = bytes[i];
            //zwraca 8 bitowa tabele po kodowaniu
            tempBinary = Decode.Decode(Converter.byteNumberTo8bTab(b), matrix);
            //System.out.println(i + ". " + tempBinary);
            System.out.println(i + ". " + Arrays.toString(Converter.byteNumberTo8bTab(b)));

            //zapisujemy elementy z tablic 8 bitowych kolo siebie
            for (int j = i * 8; j <= (i * 8) + 7; j++) {
                if(matrix[0].length == 12 && a == true){
                    if(j%8<4){
                        inputInBits[dodatkowaZmienna] = tempBinary[j%8];
                        dodatkowaZmienna++;
                    }
                }else {
                    inputInBits[dodatkowaZmienna] = tempBinary[j%8];
                    dodatkowaZmienna++;
                }
            }

            if(a){
                a = false;
            }else {
                a = true;
            }
        }
        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(inputInBits);
        return outputInBytes;

    }
}





