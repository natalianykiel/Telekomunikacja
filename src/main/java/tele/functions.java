package tele.src.main.java.tele;

import java.lang.reflect.Array;

public class functions {

    /**
     *
     * @param matrix -H1/H2
     * @param vector -tablica bitów
     * @return
     */
    public static byte[] multiplyMatrixByVector(byte[][] matrix, byte[] vector){
        byte[] result = new byte[matrix.length];
        for(int i=0; i < matrix.length; i++){
            byte rowResult = 0;
            for(int j=0; j< matrix[i].length; j++){
                rowResult ^= matrix[i][j] & vector[j];
            }
            result[i] = rowResult;
        }
        return result;
    }


}
