package tele.src.main.java.tele.algorithm;

import static tele.src.main.java.tele.Functions.multiplyMatrixByVector;

public class Code {

        public static byte[] Code(byte[] binaryTab, byte [][] matrix){
            int numberOfParityBits = matrix.length;

            byte[] tempBinary = new byte[8+numberOfParityBits];
            byte[] parityBitsResult = new byte[matrix.length];

            System.arraycopy(binaryTab, 0, tempBinary, 0, 8);

            for(int j=8; j<tempBinary.length; j++){
                tempBinary[j] = 0;
            }

            //nie wiem czy sie zmiesci
            parityBitsResult = multiplyMatrixByVector(matrix, tempBinary);

            System.arraycopy(parityBitsResult, 0, tempBinary, 8, numberOfParityBits);

            System.out.println(tempBinary);

            return tempBinary;
        }
}




