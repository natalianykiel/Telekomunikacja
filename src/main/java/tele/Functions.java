package tele.src.main.java.tele;

public class Functions {

    public static byte[] multiplyMatrixByVector(byte[][] matrix, byte[] vector){
        byte[] result = new byte[matrix.length];
        //System.out.println("MATRIX : "+matrix.length + " " + matrix);
        for(int i=0; i < matrix.length; i++){
            byte rowResult = 0;
            System.out.println("MATRIX I: "+matrix[i].length + "  VECTOR: " +vector.length + " " + vector);
            for(int j=0; j< matrix[i].length; j++){
                    //System.out.println("I: " + i + " J: " + j);
                    rowResult ^= (matrix[i][j] & vector[j]);
            }
            result[i] = rowResult;
        }
        return result;
    }


}
