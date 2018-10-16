public class MonteCarlo {

    public static final int MAX_TRIALS = 10000;

    public static void main(String[] args) {

        displayProbTable(10);

//        chanceSuccess(50, 250, MAX_TRIALS);

        howManyChildren(0.5,MAX_TRIALS);

    }

    private static void displayProbTable(int n) {
        for (int j = 0; j <= n ; j++) {
            System.out.println(j + "\t" + expectedEndDistance(j));
        }

    }

    private static double howManyChildren(double probBoy, int maxTrials) {
        Boolean isBoy = false;
        Boolean isGirl = false;
        int count = 0;
        for (int i = 0; i < maxTrials; i++) {
            if (Math.random() < probBoy) isGirl = true;
                else isBoy = true;
            count++;
            if (isGirl && isBoy ) break;
        }
        return count;
    }

    private static void chanceSuccess(int money, int goalAmount, int maxTrials) {
        int count = 0;
        int sumTurns = 0;
        for (int trial = 0; trial < maxTrials; trial++) {
            money = makeBet(money);
            if (money == goalAmount) count++;
            if (count == 1) sumTurns += trial;
        }
        double expectedVal = (double)(sumTurns)/maxTrials;
        double prob = sumTurns;

    }

    private static int makeBet(int money) {
        if (Math.random() < 0.5) return money - 1;
            return money + 1;
    }

    private static double expectedEndDistance(int n) {
        double sumDistance = 0;
        for (int stepNum = 0; stepNum < MAX_TRIALS; stepNum++) {
            double distance = getEndDistance(n);
            sumDistance += distance;
        }
        return sumDistance/MAX_TRIALS;
    }


    private static double getEndDistance(int n) {
        int x = 0, y = 0;
        for (int stepNum = 0; stepNum < n; stepNum++) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0) x++;
            if (direction == 1) x--;
            if (direction == 2) y++;
            if (direction == 3) y--;
        }
        return distanceFromOrigin(x,y);
    }

    private static double distanceFromOrigin(int x, int y) {
        return Math.sqrt(x*x  + y*y);
    }

    private static void probTable(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "\t" + expectedEndDistance(i));
        }
    }

    private static double willTargetHitOnWalk(int x, int y, int n) {
        int count = 0;
        for (int i = 0; i < MAX_TRIALS ; i++) {
            if (hitTargetOnWalk(x,y,n)) count++;
        }
        return ( (double) count)/10000.0;
    }

    private static boolean hitTargetOnWalk(int xFinal, int yFinal, int n) {
        int x = 0, y = 0;
        for (int stepNum = 0; stepNum < n; stepNum++) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0) x++;
            if (direction == 1) x--;
            if (direction == 2) y++;
            if (direction == 3) y--;
            if((x == xFinal) && (y == yFinal)) return true;
        }
        return false;
    }





}
