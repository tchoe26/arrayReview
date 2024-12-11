public class array1d_objects {
    Country[] countries = new Country[10];
    public static void main(String[] args) {
        array1d_objects a1dobjects = new array1d_objects();
    }
    public array1d_objects() {
        Country usa = new Country();
        usa.printInfo();

        for (int i=0; i<countries.length; i++) {
            countries[i] = new Country();
            countries[i].setPopulation((int)(Math.random()*1001));
            countries[i].printInfo();
        }
        printArray();
    }

    public void printArray() {
        for (Country country : countries) {
            country.printInfo();
        }
    }

    public int addPopulations() {
        int counter = 0;
        for (Country country : countries) {
            counter += country.getPopulation();
        }
        return counter;
    }

    public double averagePopulations() {
        return (double)addPopulations()/countries.length;
    }
}
