
/*Задание 1
Реализуйте класс «Человек». Необходимо хранить
в полях класса: ФИО, дату рождения, контактный теле-
фон, город, страну, домашний адрес. Реализуйте методы
класса для ввода данных, вывода данных, реализуйте
доступ к отдельным полям через методы класса.*/


public class Human {
    private String name;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

    public Human(String name, String middleName, String lastName, String dateOfBirth,
                 String phone, String city, String country, String address) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public Human(String name, String middleName, String lastName, String dateOfBirth,
                 String phone, String city, String country) {
        this(name,middleName,lastName,dateOfBirth,phone,city,country,"Шевченко 200/6");
    }

    public Human(String name, String middleName, String lastName, String dateOfBirth,
                 String phone, String city) {
        this(name,middleName,lastName,dateOfBirth,phone,city,"Украина");
    }
    public Human(String name, String middleName, String lastName, String dateOfBirth,
                 String phone) {
        this(name,middleName,lastName,dateOfBirth,phone, "Никополь");
    }
    public Human(String name, String middleName, String lastName, String dateOfBirth) {
        this(name,middleName,lastName,dateOfBirth,"+380505555555");
    }
    public Human(String name, String middleName, String lastName) {
        this(name,middleName,lastName,"1990, 5, 15");
    }
    public Human(String name, String middleName) {
        this(name,middleName,"Петров");
    }
    public Human(String name) {
        this(name,"Петрович");
    }
    public Human() {
        this("Петр");
    }

    public void inputDataHuman(String name, String middleName, String lastName, String dateOfBirth,
                               String phone, String city, String country, String address) {

        if (name == null || middleName == null || lastName == null || dateOfBirth == null ||
                phone == null || city == null || country == null || address == null) {
            System.out.print("Все параметры должны быть не null");
        }

        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void outputDataHuman(Human human)
    {
        System.out.println("Фамилия - " + (human.lastName != null ? human.lastName : ""));
        System.out.println("Имя - " + (human.name != null ? human.name : ""));
        System.out.println("Отчество - " + (human.middleName != null ? human.middleName : ""));
        System.out.println("День рождения - " + (human.dateOfBirth != null ? human.dateOfBirth : ""));
        System.out.println("Телефон - " + (human.phone != null ? human.phone : ""));
        System.out.println("Город - " + (human.city != null ? human.city : ""));
        System.out.println("Страна - " + (human.country != null ? human.country : ""));
        System.out.println("Адресс - " + (human.address != null ? human.address : ""));
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}