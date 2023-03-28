import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CrookedRoulette {

    HashMap map = new HashMap();
    ArrayList<Integer> diapason = new ArrayList<Integer>();

    // The class constructor creates a HashMap for a range of cells, the area of the cells is the same
    CrookedRoulette(int a, int b) {
        int cellSize = 100 / (b - a + 1);
        for (int i = a; i <= b; i++) {
            map.put(i, cellSize);
        }
    }

    // The class constructor creates a HashMap.
    // Requires an array of keys and values. Arrays must be the same size.
    CrookedRoulette(int[] keyArray, int[] valueArray) {
        if (keyArray.length != valueArray.length) {
            throw new ArrayIndexOutOfBoundsException("Arrays have different lengths!");
        } else {
            for (int i = 0; i < keyArray.length; i++) {
                map.put(keyArray[i], valueArray[i]);
            }
        }
    }

    // Creating a list of ranges for each number
    // (implementation of probabilities of numbers falling out)
    public void createDiapasones() {
        diapason.clear();
        int sum = 0;
        diapason.add(sum);
        for (Object key : map.keySet()) {
            Object value = map.get(key);
            sum += (int) value;
            diapason.add(sum);
        }
        for (int item : diapason) {
            System.out.println(item);
        }
    }

    // Checks if the input number matches with a random result
    public boolean startGame(int inputNumber) {
        createDiapasones();
        int randomResult = getResult();
        System.out.println("The result of determining the range: " + randomResult);
        if (inputNumber == randomResult) {
            return true;
        } else {
            return false;
        }
    }

    // Gets a random result of the game
    public int getResult() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(diapason.get(diapason.size() - 1));
        for (int item : diapason) {
            if (randomNumber < item) {
                System.out.println("Random number for determining the range: " + randomNumber);
                System.out.println("Range index: " + diapason.indexOf(item));
                return diapason.indexOf(item);
            }
        }
        return -1;
    }

    // We add a cell indicating the number and the probability of occurrence.
    // If such a cell number exists, then the probability will be overwritten
    public void addCell(int number, int data) {
        map.put(number, data); // ИЗМЕНИТЬ НА ДОБАВЛЕНИЕ СЛЕДУЮЩЕГО ЧИСЛА ПО ИНДЕКСУ DIAPASONE
    }

    // Deleting a cell by its key
    public void removeCell(int number) {
        map.remove(number);
    }

    // Set equal probabilities for all roulette cells
    public void setEqualProbabilities() {
        int valueToSet = (int) 100 / (map.size());
        for (Object key : map.keySet()) {
            map.put(key, valueToSet);
        }
    }

    public void printRoulette() {
        int sum = 0;
        for (Object key : map.keySet()) {
            Object value = map.get(key);
            sum += (int) value;
            System.out.println("key: " + key + "   value: " + value);
        }
    }

//    private static boolean checkInputArrayOfValues(int[] inputArray) {
//        int sum = 0;
//        for (int number : inputArray) {
//            sum += number;
//        }
//        if (sum == 100) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
