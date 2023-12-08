import java.util.Arrays;

public class Country {

    private String nameCountry;
    private String continent;
    private long countPeople;
    private int phoneCodCountry;
    private String capital;
    private String [] Cities;


    public Country(String nameCountry, String continent, long countPeople, int phoneCodCountry, String capital, String... cities) {
        this.nameCountry = nameCountry;
        this.continent = continent;
        this.countPeople = countPeople;
        this.phoneCodCountry = phoneCodCountry;
        this.capital = capital;
        Cities = cities;
    }

    public Country(String nameCountry, String continent, long countPeople, int phoneCodCountry, String capital) {
        this(nameCountry,continent,countPeople,phoneCodCountry,capital,"Киев","Днепр","Львов","Харьков");
    }

    public Country(String nameCountry, String continent, long countPeople, int phoneCodCountry) {
        this(nameCountry,continent,countPeople,phoneCodCountry,"Киев");
    }

    public Country(String nameCountry, String continent, long countPeople) {
        this(nameCountry,continent,countPeople, 380);
    }

    public Country(String nameCountry, String continent) {
        this(nameCountry,continent,40000000);
    }

    public Country(String nameCountry) {
        this(nameCountry,"Европа");
    }

    public Country() {
        this("Украина");
    }


    public void inputCountry(String name, String continent, long countPeople, int phoneCode, String capital, String... cities) {
        this.nameCountry = name;
        this.continent = continent;
        this.countPeople = countPeople;
        this.phoneCodCountry = phoneCode;
        this.capital = capital;
        this.Cities = cities;
    }


    public void outputCountry(Country country) {
        System.out.println("Страна - " + (country.nameCountry != null ? country.nameCountry : ""));
        System.out.println("Континент - " + (country.continent != null ? country.continent : ""));
        System.out.println("Население - " + (country.countPeople != 0 ? country.countPeople : 0));
        System.out.println("Тел.код страны - " + (country.phoneCodCountry != 0 ? country.phoneCodCountry : 0));
        System.out.println("Столица - " + (country.capital != null ? country.capital : ""));
        System.out.println("Города - " + (country.Cities != null ? Arrays.toString(country.Cities) : ""));
    }


    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", continent='" + continent + '\'' +
                ", countPeople=" + countPeople +
                ", phoneCodCountry=" + phoneCodCountry +
                ", capital='" + capital + '\'' +
                ", Cities=" + Arrays.toString(Cities) +
                '}';
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public String getContinent() {
        return continent;
    }

    public long getCountPeople() {
        return countPeople;
    }

    public int getPhoneCodCountry() {
        return phoneCodCountry;
    }

    public String getCapital() {
        return capital;
    }

    public String[] getCities() {
        return Cities;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountPeople(long countPeople) {
        this.countPeople = countPeople;
    }

    public void setPhoneCodCountry(int phoneCodCountry) {
        this.phoneCodCountry = phoneCodCountry;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCities(String[] cities) {
        Cities = cities;
    }
}
