package tele.src.main.java.programA;

public class Converter {
    /**
     * Metoda konwetująca znak byte na tablicę 8 bitową
     * @param value
     * @return 8 bitowa tablica
     */

    public static byte[] byteNumberTo8bTab(byte value) {
        byte[] finalForm = new byte[8];
        int number = value;
        if (number > 0) {
            for (int i = 7; i >= 0; i--) {
                finalForm[i] = (byte) (number % 2 == 1 ? 1 : 0);
                number = number / 2;
            }
        } else {
            number = number * (-1);
            for (int i = 7; i >= 0; i--) {
                finalForm[i] = (byte) (number % 2 == 1 ? 1 : 0);
                number = number / 2;
            }
            for (int i = 0; i < 8; i++) {
                finalForm[i] ^= 1;
            }
            for (int i = 7; i >= 0; i--) {
                if (finalForm[i] == 0) {
                    finalForm[i] = 1;
                    break;
                }
                finalForm[i] = 0;
            }
        }
        return finalForm;
    }

    /**
     * Metoda konwertującą tablicę bitową na tablicę byte'ów
     * @param bits
     * @return tablica byte'ów
     */
    public static byte[] binaryChainToByteForm(byte[] bits) {
        int iterator = 0;
        byte[] finalForm = new byte[bits.length/8];
        for (int i = 0; i < finalForm.length; i++) {
            int upperLimit = 128;
            for (int j = 0; j < 8; j++) {
                if (bits[iterator] == 1) {
                    finalForm[i] += (byte) upperLimit;
                }
                iterator++;
                upperLimit /= 2;
            }
        }
        return finalForm;
    }

}
