public class array1d {
    int[] numbers = new int[10];

    public static void main(String[] args) {
        array1d a1d = new array1d();
    }

    public array1d() {
        numbers[0] = 54;
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        printArray();
        System.out.println("sum:" + sumArray());

    }

    public void printArray() {
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public int sumArray() {
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }


}
