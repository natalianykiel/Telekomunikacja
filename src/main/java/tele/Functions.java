package tele.src.main.java.tele;

public class Functions {

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
