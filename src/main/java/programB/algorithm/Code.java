package tele.src.main.java.programB.algorithm;
import tele.src.main.java.programB.Functions;

import static tele.src.main.java.programA.Functions.multiplyMatrixByVector;
public class Code {

    public static byte[] Code(byte[] binaryTab, byte [][] matrix){
        int numberOfParityBits = matrix.length;

        byte[] tempBinary = new byte[8+numberOfParityBits];
        byte[] parityBitsResult = new byte[matrix.length];

        System.arraycopy(binaryTab, 0, tempBinary, 0, 8);
        for(int j=8; j<tempBinary.length; j++){
            tempBinary[j] = 0;
        }

        parityBitsResult = multiplyMatrixByVector(matrix, tempBinary);
        System.arraycopy(parityBitsResult, 0, tempBinary, 8, numberOfParityBits);
        return tempBinary;
    }
}










