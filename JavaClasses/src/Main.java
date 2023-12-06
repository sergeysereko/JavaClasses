import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        Human human1 = new Human();
        Human human2 = new Human("Евгений");
        Human human3 = new Human("Анатолий", "Анатольевич");
        Human human4 = new Human("Иван","Иванов","Иваненко");
        Human human5 = new Human("Сидр","Сидоров","Сидоренко","01-01-1999");
        Human human6 = new Human("Тест","Тестович","Тест","02-02-2022","+3807894512");
        Human human7 = new Human("Игорь","Игоревич","Игоренко","03-03-1985","+3805045678","Киев");
        Human human8 = new Human("Олег","Олегович","Олегов","04-04-1995","+380677894512","Днепропетровск","Украниа");
        Human human9 = new Human("Александр","Александрович","Александров","05-05-2000","+380931597823","Варшава","Польша","pl. Bankowy 3/5" + "00-950");

        human1.outputDataHuman(human1);
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());


        System.out.print("Введите Фамилию: ");
        String last = scanner.nextLine();
        System.out.print("Введите Имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите Отчество: ");
        String middle = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        String birthday = scanner.nextLine();
        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine();
        System.out.print("Введите город: ");
        String city = scanner.nextLine();
        System.out.print("Введите страну: ");
        String country = scanner.nextLine();
        System.out.print("Введите адрес: ");
        String address = scanner.nextLine();

        Human human10 = new Human();
        human10.inputDataHuman(last,name,middle,birthday,phone,city,country,address);
        System.out.println(human10.toString());

        //// тестирование класса City
        City city1 = new City();
        City city2 = new City("Никополь");
        City city3 = new City("Кривой-Рог","Днепропетровская обл.");
        City city4 = new City("Киев","Киевская обл.","Украина");
        City city5 = new City("Одесса","Одесская обл.","Украина",993120);
        City city6 = new City("Харьков","Харьковская обл.","Украина",141900, 61000);
        City city7 = new City("Львов","Львовская обл.","Украина",717273,79007,32);

        city1.outputDataCity(city1);
        System.out.println(city2.toString());
        System.out.println(city3.toString());
        System.out.println(city4.toString());
        System.out.println(city5.toString());
        System.out.println(city6.toString());
        System.out.println(city7.toString());

        System.out.print("Введите название города: ");
        String ci = scanner.nextLine();
        System.out.print("Введите область: ");
        String region = scanner.nextLine();
        System.out.print("Введите страну: ");
        String countr = scanner.nextLine();
        System.out.print("Введите количество жителей в городе: ");
        Integer countP = scanner.nextInt();
        System.out.print("Введите индекс города: ");
        Integer postcode = scanner.nextInt();
        System.out.print("Введите телефонный код города: ");
        Integer phonecode = scanner.nextInt();


        City city8 = new City();
        city8.inputDataCity(ci,region,countr,countP,postcode,phonecode);
        System.out.println(city8.toString());

    }
}
