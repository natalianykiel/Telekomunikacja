package tele.src.main.java.tele;

public class Functions {
    /**
     * Metoda mnożąca macież H1/H2 z tablicą binarną
     * @param matrix
     * @param vector
     * @return tablica błędu (binarna) porównująca ze sobą macież i tablice binarną
     */

    public static byte[] multiplyMatrixByVector(byte[][] matrix, byte[] vector){
        byte[] result = new byte[matrix.length];
        for(int i=0; i < matrix.length; i++){
            byte rowResult = 0;
            for(int j=0; j< vector.length; j++){
                    rowResult ^= (matrix[i][j] & vector[j]);
            }
            result[i] = rowResult;
        }
        return result;
    }


}
