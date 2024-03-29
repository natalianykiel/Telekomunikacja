package tele.src.main.java.programB.algorithm;
import tele.src.main.java.programA.Converter;
import tele.src.main.java.programA.algorithm.Code;
import tele.src.main.java.programA.algorithm.Decode;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
    public static byte[] menageCodingBytes(byte[] bytes, byte[][] matrix) {
        byte[] outputInBytes = new byte[bytes.length];
        byte[] outputInBits = new byte[bytes.length * 16];
        byte[] tempBinary;//= new byte[8];


        for (int i = 0; i < outputInBytes.length; i++) {
            byte b = bytes[i];
            //zwraca 8 bitowa tabele po kodowaniu
            tempBinary = Code.Code(Converter.byteNumberTo8bTab(b), matrix);
            //zapisujemy elementy z tablic 8 bitowych kolo siebie
            for (int j = i * 16; j <= (i * 16) + 15; j++) {
                if (tempBinary.length > j % 16) {
                    outputInBits[j] = tempBinary[j % 16];
                } else {
                    outputInBits[j] = 0;
                }
            }
        }
        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(outputInBits);
        return  outputInBytes;
    }

    public static byte[] menageDecodingBytes(byte[] bytes, byte[][] matrix){
        byte[] outputInBytes = new byte[bytes.length];
        byte[] inputInBits = new byte[matrix[0].length];
        byte[] outputInBits = new byte[bytes.length * 4];
        byte[] tempBinary ;//= new byte[8];
        byte[] temp2;
        int wordLength = 8 + matrix.length;
        boolean a = false;
        int dodatkowa = 0;


        for (int i = 0; i < outputInBytes.length; i++) {
            byte b = bytes[i];
            temp2 = Converter.byteNumberTo8bTab(b);
            for (int j = i * 8; j <= (i * 8) + 7; j++) {
                if (i % 2 != 0 && a == true) {
                    if ((j % 8 < 4 && matrix[0].length == 12) || matrix[0].length == 16) {
                        inputInBits[dodatkowa] = temp2[j % 8];
                        dodatkowa++;
                    }
                }
                else {
                    inputInBits[dodatkowa] = temp2[j % 8];
                    dodatkowa++;
                }

            }
            if (a) {
                a = false;
            } else {
                a = true;
            }

            if (i % 2 == 1) {
                tempBinary = Decode.Decode(inputInBits, matrix);

                for(int j = i/2*8; j <= (i/2 * 8) + 7; j++) {
                    outputInBits[j] = tempBinary[j%8];
                }
                dodatkowa = 0;
            }
        }

        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(outputInBits);
        return outputInBytes;
    }
}
