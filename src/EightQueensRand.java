import Queen.Queen;

public class EightQueensRand {

    public static boolean solved = false;
    private static int count  =0 ;


    public static void main(String[] args) {

        //generalized, random
        solvePuzzle(12);


    }

    private static void solvePuzzle(int n) {
        while(!solved) {
            Queen[] board = generateRandBoard(n);
            if (isSolution(board, n)) printQueens(board, n);
        }
    }

    private static Queen[] generateRandBoard(int n) {
        Queen board[] = new Queen[n];
        for (int i = 0; i < board.length; i++) {
            board[i] = new Queen(i, (int) (n * Math.random()));
        }
        return board;
    }


    private static void printQueens(Queen[] board, int n) {
        for (int i = 0; i < n; i++) {
            board[i].print();
        }
        System.out.println();
    }



    private static boolean isSolution(Queen[] board, int n) {
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (hitsEachOther(board[i], board[j])) return false;
            }
        }
        solved = true;
        return true;
    }

    private static boolean hitsEachOther(Queen queen0, Queen queen1) {
        return (areHorizontal(queen0, queen1) || areVertical(queen0, queen1) || areDiagonal(queen0, queen1));
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
