public class array2d {
    int[][] numbers = new int[4][5];
    public static void main(String[] args) {
        array2d array2d = new array2d();
    }

    public array2d() {
        for (int r=0; r<numbers.length; r++) {
            for (int c = 0; c<numbers[r].length; c++) {
                numbers[r][c] = (int)(Math.random()*101);
            }
        }
        printArray();
        System.out.println(sum2d());

    }

    public void printArray() {
        for (int r=0; r<numbers.length; r++) {
            for (int c = 0; c<numbers[r].length; c++) {
                System.out.print(numbers[r][c] + ",");
            }
            System.out.println();
        }
    }

    public int sum2d() {
        int sum = 0;
        for (int r=0; r<numbers.length; r++) {
            for (int c=0; c<numbers[r].length; c++) {
                sum += numbers[r][c];
            }
        }
        return sum;
    }

    public double average2d() {
        int length = 0;
        for (int r=0; r<numbers.length; r++) {
            for (int c=0; c<numbers[r].length; c++) {
                length++;
            }
        }
        return (double) sum2d() /length;
    }

}
