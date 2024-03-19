package tele.src.main.java.tele;

public class Patterns {
    /**
     * H1-słownik przewidziany dla 1 błędu
     */
    public static final byte[][] H1 = {
            {0, 1, 1, 1, 0, 1, 1, 0,     1, 0, 0, 0},
            {1, 0, 1, 1, 0, 0, 1, 1,     0, 1, 0, 0},
            {1, 1, 0, 1, 1, 0, 0, 1,     0, 0, 1, 0},
            {1, 1, 1, 0, 1, 1, 0, 0,     0, 0, 0, 1},
    };

    /**
     * Słosnik przewidziany dla 2 błędów
     */
    public static final byte[][] H2 ={
            {0, 1, 1, 1, 1, 1, 1, 1,	1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 1, 1, 1,	0, 1, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 1, 1, 1,	0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 1, 1, 1, 1,	0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 1,	0, 0, 0, 0, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 0, 1, 1,	0, 0, 0, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1, 1, 0, 1,	0, 0, 0, 0, 0, 0, 1, 0},
            {1, 1, 1, 1, 1, 1, 1, 0,	0, 0, 0, 0, 0, 0, 0, 1},
    };

}
