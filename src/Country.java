public class Country {

    private String name;
    private String continent;
    private int population;
    private double gdp;

    public Country() {
        continent = "europe";
        population = 5;
        gdp = 10.4;
        name = "russia";
    }

    public void printInfo() {
        System.out.println(continent);
        System.out.println(population);
        System.out.println(gdp);
        System.out.println(name);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
