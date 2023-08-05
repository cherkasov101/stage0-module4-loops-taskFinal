package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int count = 0;
        for (int i = 0; i < cathetusLength; i++) {
            int a = count;
            for (int j = 0; j < cathetusLength; j++) {
                if (j >= cathetusLength - 1 - count) {
                    System.out.print("*");
                    a--;
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
