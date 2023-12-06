/*Задание 2
Создайте класс «Город». Необходимо хранить в по-
лях класса: название города, название региона, название
страны, количество жителей в городе, почтовый индекс
города, телефонный код города. Реализуйте методы клас-
са для ввода данных, вывода данных, реализуйте доступ
к отдельным полям через методы класса.*/

public class City {
    private String name;
    private String region;
    private String country;
    private int countPeople;
    private int postcode;
    private int phoneCode;

    public City(String name, String region, String country, int countPeople, int postcode, int phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.countPeople = countPeople;
        this.postcode = postcode;
        this.phoneCode = phoneCode;
    }

    public City(String name, String region, String country, int countPeople, int postcode) {
        this(name,region,country,countPeople,postcode,562);
    }
    public City(String name, String region, String country, int countPeople) {
        this(name,region,country,countPeople,49000);
    }
    public City(String name, String region, String country) {
        this(name,region,country,180000);
    }
    public City(String name, String region) {
        this(name,region,"Украина");
    }
    public City(String name) {
        this(name,"Днепропетровская обл.");
    }
    public City() {
        this("Никополь");
    }


    public void inputDataCity(String name, String region, String country, int countPeople, int postcode, int phoneCode) {

        if (name == null || region == null || country == null || countPeople == 0 ||
                postcode == 0 || phoneCode == 0) {
            System.out.print("Все параметры должны быть не null");
        }

        this.name = name;
        this.region = region;
        this.country = country;
        this.countPeople = countPeople;
        this.postcode = postcode;
        this.phoneCode = phoneCode;
    }

    public void outputDataCity(City city)
    {
        System.out.println("Город - " + (city.name != null ? city.name : "Неизвестен"));
        System.out.println("Регион - " + (city.region != null ? city.region : "Неизвестен"));
        System.out.println("Страна - " + (city.country != null ? city.country : "Неизвестен"));
        System.out.println("Население - " + (city.countPeople != 0 ? city.countPeople : 0 ));
        System.out.println("Индекс - " + (city.postcode != 0 ? city.postcode  : 0));
        System.out.println("Тел.код - " + (city.phoneCode != 0 ? city.phoneCode : 0));
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", countPeople=" + countPeople +
                ", postcode=" + postcode +
                ", phoneCode=" + phoneCode +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public int getPostcode() {
        return postcode;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }
}
