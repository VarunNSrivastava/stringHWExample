import Queen.Queen;

public class EightQueens {


    private static int count  =0 ;

    public static void main(String[] args) {

        Queen queens[] = new Queen[8];


        for (int a = 0; a < 8 ; a++) {
            for (int b = 0; b < 8 ; b++) {
                for (int c = 0; c < 8 ; c++) {
                    for (int d = 0; d < 8; d++) {
                        for (int e = 0; e< 8 ; e++) {
                            for (int f = 0; f < 8; f++) {
                                for (int g = 0; g < 8 ; g++) {
                                    for (int h = 0; h < 8 ; h++) {
                                        queens[0] = new Queen(a,0);
                                        queens[1] = new Queen(b,1);
                                        queens[2] = new Queen(c,2);
                                        queens[3] = new Queen(d,3);
                                        queens[4] = new Queen(e,4);
                                        queens[5] = new Queen(f,5);
                                        queens[6] = new Queen(g,6);
                                        queens[7] = new Queen(h,7);

                                         if (isSolution(queens)) {
                                             printQueens(queens);
                                             count++;
                                         }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);


    }

    private static void printQueens(Queen[] queens) {
        for (int i = 0; i < 8; i++) {
           queens[i].print();
        }
        System.out.println();
    }



    private static boolean isSolution(Queen[] queens) {
        for (int i = 0; i < 7 ; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (hitsEachOther(queens[i], queens[j])) return false;
            }
        }
        return true;
    }

    private static boolean hitsEachOther(Queen queen0, Queen queen1) {
        if (areHorizontal(queen0, queen1) || areVertical(queen0, queen1) || areDiagonal(queen0, queen1)) return true;

        return false;
    }

    private static boolean areDiagonal(Queen queen0, Queen queen1) {
        if (queen0.getX() - queen1.getX() == queen0.getY() - queen1.getY()) return true;
            else if (queen0.getX() - queen1.getX() == queen1.getY() - queen0.getY()) return true;
        return false;
    }


    private static boolean areVertical(Queen queen0, Queen queen1) {
        return( queen0.getY() == queen1.getY());
    }

    private static boolean areHorizontal(Queen queen0, Queen queen1) {
        return( queen0.getX() == queen1.getX());
    }

}
