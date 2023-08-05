package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int count = 0;
        for (int i = 0; i < cathetusLength; i++) {
            int a = count;
            for (int j = 0; j < cathetusLength; j++) {
                if (j == cathetusLength - 1 || j >= cathetusLength - 1 - count) {
                    System.out.print(a + 1);
                    a--;
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < count; j++) {
                System.out.print(j + 2);
            }
            count++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
