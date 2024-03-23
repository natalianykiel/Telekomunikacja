package tele.src.main.java.programA.algorithm;
import tele.src.main.java.programA.Converter;

import java.util.Scanner;

public class Algorithm {
    /**
     * Metoda przygotowująca tablice bytes[] do kodowania i wywołująca funkcje kodującą code()
     * @param bytes
     * @param matrix
     * @return zakodowana tablica byte'ów
     */
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

        // Wyświetlanie zawartości outputInBits jako ciągu cyfr
        StringBuilder sb = new StringBuilder();
        int a = 0;
        boolean b = true;
        for (byte outputInBit : outputInBits) {
            if (a == 8) {
                b = false;
                sb.append(" ");
            }

            if (a == 0) {
                b = true;
            }

            if (b) {
                sb.append(outputInBit);
                a++;
            } else {
                a--;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

        a = 0;
        b = true;
        int c = 0;

        // Odczytanie nowej wartości dla outputInBits z konsoli
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź nową wartość dla outputInBits jako ciąg bitów:");
        String bitsString = scanner.nextLine();

        // Sprawdzenie, czy wprowadzony ciąg ma odpowiednią długość
        if (bitsString.length() != sb.length()) {
            System.out.println("Wprowadzony ciąg bitów ma nieprawidłową długość. Powinien mieć długość " + outputInBits.length);
        } else {
            for (int i = 0; i < outputInBits.length; i++) {
                if (a == 8) {
                    b = false;
                    c++;
                }

                if (a == 0) {
                    b = true;
                }

                if (b) {
                    outputInBits[i] = (byte) Character.getNumericValue(bitsString.charAt(c));
                    a++;
                    c++;
                } else {
                    a--;
                }
            }
        }
        scanner.close();


        //konwersja outputu z bits na bytes
        outputInBytes = Converter.binaryChainToByteForm(outputInBits);
        return  outputInBytes;
    }

    /**
     * Metoda przygotowująca tablice bytes[] do dekodowania i wywołująca funkcje kodującą decode()
     * @param bytes
     * @param matrix
     * @return dekodowana tablica byte'ów
     */

    public static byte[] menageDecodingBytes(byte[] bytes, byte[][] matrix){
        byte[] outputInBytes = new byte[bytes.length];
        byte[] inputInBits = new byte[matrix[0].length];
        byte[] outputInBits = new byte[bytes.length * 4];
        byte[] tempBinary ;//= new byte[8];
        byte[] temp2;
        int wordLength = 8 + matrix.length;
        boolean a = false;
        int dodatkowa = 0;


        //convert bytes to Binary

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





