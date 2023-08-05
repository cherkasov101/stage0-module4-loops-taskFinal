package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int count = 1;
        for (int i = 0; i < power; i++) {
            count *= numberToPrint;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
