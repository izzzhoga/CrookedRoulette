public class MainProgram {

    public static void main(String[] args) {
        CrookedRoulette Roulette1 = new CrookedRoulette(1, 9);
        Roulette1.printRoulette();
        Roulette1.addCell(1, 45);
        Roulette1.printRoulette();
        Roulette1.addCell(11, 45);
        Roulette1.printRoulette();
        Roulette1.createDiapasones();
        Roulette1.addCell(7, 1);
        Roulette1.printRoulette();
        Roulette1.createDiapasones();
        Roulette1.printRoulette();
        Roulette1.createDiapasones();

        Roulette1.setEqualProbabilities();
        Roulette1.printRoulette();
        Roulette1.createDiapasones();

        int[] arrayOfKey = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayOfValue = new int[]{2, 23, 79, 6, 9, 11, 12, 1, 4, 3};
        CrookedRoulette Roulette2 = new CrookedRoulette(arrayOfKey, arrayOfValue);

        if (Roulette2.startGame(3)) {
            System.out.println("You WIN!");
        } else {
            System.out.println("You LOSE...");
        }

        Roulette2.printRoulette();
        Roulette2.clearRoulette();
        Roulette2.printRoulette();

        Roulette1.printRoulette();
        System.out.println();
        Roulette1.addCell(1, 45);
        Roulette1.addCell(45);
        Roulette1.printRoulette();
        System.out.println();
        Roulette1.removeCell();
        Roulette1.printRoulette();

    }

}
