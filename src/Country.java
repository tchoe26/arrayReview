public class Country {

    private String name;
    private String continent;
    private int population;
    private double GDP;

    public Country() {
        continent = "europe";
        population = 5;
        GDP = 10.4;
        name = "russia";
    }

    public void printInfo() {
        System.out.println(continent);
        System.out.println(population);
        System.out.println(GDP);
        System.out.println(name);
    }

}
