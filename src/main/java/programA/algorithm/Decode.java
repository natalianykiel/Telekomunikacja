package tele.src.main.java.programA.algorithm;
import static tele.src.main.java.programA.Functions.multiplyMatrixByVector;
public class Decode {
    /**
     * Metoda dekodująca tablice bitową (8 bitów + bity parzystosci)
     * @param binaryTab
     * @param matrix
     * @return tablica 8 bitów
     */
    public static byte[] Decode(byte[] binaryTab, byte [][] matrix) {
        int numberOfColumns = 8 + matrix.length;
        int numberOfRows = matrix.length;
        byte[] errorTab = new byte[matrix.length + 8];

        errorTab = multiplyMatrixByVector(matrix, binaryTab);
        byte correct = 1;
        for (int i = 0; i < errorTab.length; i++) {

            if (errorTab[i] == 1) {
                correct = 0;
                break;
            }
        }

        int errorBitNumber = -1;
        int errorBitNumber1 = -1;
        int errorBitNumber2 = -1;
        if (correct == 0) {
            //searching matrix column identical with errorTab
            for (int j = 0; j < numberOfColumns; j++) {
                byte identical = 1;
                for (int i = 0; i < numberOfRows; i++) {
                    if (matrix[i][j] != errorTab[i]) {
                        identical = 0;
                        break;
                    }
                }
                if (identical == 1) {
                    errorBitNumber = j;
                    break;
                }
            }

            //searching matrix columns which sum equals errorVector
            if (errorBitNumber == -1 && numberOfRows >= 7) {
                for (int j1 = 0; j1 < numberOfColumns; j1++) {
                    byte identical = 0;
                    for (int j2 = j1 + 1; j2 < numberOfColumns; j2++) {
                        identical = 1;
                        for (int i = 0; i < numberOfRows; i++) {
                            if ((matrix[i][j1] ^ matrix[i][j2]) != errorTab[i]) {
                                identical = 0;
                                break;
                            }
                        }
                        if (identical == 1) {
                            errorBitNumber1 = j1;
                            errorBitNumber2 = j2;
                            break;
                        }
                    }
                    if (identical == 1) {
                        break;
                    }
                }
            }
        }

            //decode and repair
            int numberOfParityBits = matrix.length;
            byte[] tempBinary = new byte[matrix.length+8];
            System.arraycopy(binaryTab, 0, tempBinary, 0, 8);

            if (errorBitNumber != -1) {
                // Korekcja jednego błędu
                tempBinary[errorBitNumber] ^= 1;
            } else if (errorBitNumber1 != -1 && errorBitNumber2 != -1) {
                // Korekcja dwóch błędów
                tempBinary[errorBitNumber1] ^= 1;
                tempBinary[errorBitNumber2] ^= 1;
            }



            byte[] ouputDecoded = new byte[tempBinary.length-numberOfParityBits]; //8
            System.arraycopy(tempBinary, 0, ouputDecoded, 0, ouputDecoded.length);
            return ouputDecoded;

    }
}
