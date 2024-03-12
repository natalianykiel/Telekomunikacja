package tele.src.main.java.tele;

public class converter {
    /**
     * Metoda konwertujaca slowo byte na tablice binarna
     * @param bytes
     * @return
     */
    public static byte[] byteTabToBinary(byte[] bytes) {
        int iteracje = 0;
        byte[] wynik = new byte[bytes.length * 8];
        for (int i = 0; i < bytes.length; i++) {
            byte[] bits8 = byteTo8BitTable(bytes[i]);
            for (int j = 0; j < 8; j++) {
                wynik[iteracje++] = bits8[j];
            }
        }
        return wynik;
    }

    /**
     * Mtoda konwertująca byte na tablice bitów
     * @param value
     * @return bit array
     */
    public static byte[] byteTo8BitTable(byte value) {
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

    public static byte[] binaryChainToByteForm(byte[] bits) {
        byte[] finalForm = new byte[(bits.length + 7) / 8]; // Ustalamy długość wynikowej tablicy na podstawie długości tablicy bitów wejściowych
        for (int i = 0; i < finalForm.length; i++) {
            byte byteValue = 0;
            for (int j = 0; j < 8; j++) {
                int index = i * 8 + j;
                if (index < bits.length && bits[index] == 1) {
                    byteValue |= (1 << (7 - j)); // Ustawiamy odpowiedni bit na 1, używając przesunięcia bitowego
                }
            }
            finalForm[i] = byteValue;
        }
        return finalForm;
    }


}
