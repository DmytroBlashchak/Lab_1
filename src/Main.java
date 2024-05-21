
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner numberInput = new Scanner(System.in);

        System.out.print("You have to enter 10 numbers (press 'Enter' every time): \n");

        int intA, intB, intC, intD, intE, intF, intG, intX, intY, intZ;

        intA = Integer.parseInt(numberInput.nextLine());
        intB = Integer.parseInt(numberInput.nextLine());
        intC = Integer.parseInt(numberInput.nextLine());
        intD = Integer.parseInt(numberInput.nextLine());
        intE = Integer.parseInt(numberInput.nextLine());
        intF = Integer.parseInt(numberInput.nextLine());
        intG = Integer.parseInt(numberInput.nextLine());
        intX = Integer.parseInt(numberInput.nextLine());
        intY = Integer.parseInt(numberInput.nextLine());
        intZ = Integer.parseInt(numberInput.nextLine());


        int sum = intA + intB + intC + intD + intE + intF + intG + intX + intY + intZ;
        int sub = intA - intB - intC - intD - intE - intF - intG - intX - intY - intZ;
        int mul = intA * intB * intC * intD * intE * intF * intG * intX * intY * intZ;
        int div = intA / intB / intC / intD / intE / intF / intG / intX / intY / intZ;

        System.out.printf("Here is your Sum: %d\n", sum);
        System.out.printf("Here is your Subtraction: %d\n", sub);
        System.out.printf("Here is your Multiplication: %d\n", mul);
        System.out.printf("Here is your Division: %d\n\n", div);

        //Task 2
        String w1 = "Raindrops ", w2 = "tap ", w3 = "gently, ", w4 = "leaves ", w5 = "away ", w6 = "nature's ", w7 = "quiet ";
        String w8 = "melody, ", w9 = "soothes ", w10 = "the soul.";
        String letter = w1+w2+w3+w4+w5+w6+w7+w8+w9+w10;

        System.out.printf("Letter:  %s\n\n", letter);

        //Task 3
        User ivanBortsikh = new User(1, 25, "Ivan", "Bortsikh", 70.5, 175.0);
        User marianDobosh = new User(2, 30, "Marian", "Dobosh", 65.2, 187.5);
        User mykolaTereshchuk = new User(3, 22, "Mykola", "Tereshchuk", 55.8, 168.3);
        User ostapSvidryk = new User(4, 28, "Ostap", "Svidryk", 80.0, 120.2);
        User dmytroBlashchak = new User(5, 35, "Dmytro", "Blashchak", 63.7, 162.8);
        User danyilHrytsiv = new User(6, 26, "Danyil", "Hrytsiv", 75.1, 177.5);
        User mykolaKosar = new User(7, 31, "Mykola", "Kosar", 58.9, 165.7);
        User oleksandrVorontsov = new User(8, 29, "Oleksandr", "Vorontsov", 68.4, 172.4);
        User maksymChernega = new User(9, 24, "Maksym", "Chernega", 72.3, 178.9);
        User vitaliyAntonushin = new User(10, 27, "Vitaliy", "Antonushin", 67.0, 169.6);

        int totalAge = ivanBortsikh.getAge() + marianDobosh.getAge() + mykolaTereshchuk.getAge() +
                ostapSvidryk.getAge() + dmytroBlashchak.getAge() + danyilHrytsiv.getAge() +
                mykolaKosar.getAge() + oleksandrVorontsov.getAge() + maksymChernega.getAge() +
                vitaliyAntonushin.getAge();

        double totalWeight = ivanBortsikh.getWeight() + marianDobosh.getWeight() + mykolaTereshchuk.getWeight() +
                ostapSvidryk.getWeight() + dmytroBlashchak.getWeight() + danyilHrytsiv.getWeight() +
                mykolaKosar.getWeight() + oleksandrVorontsov.getWeight() + maksymChernega.getWeight() +
                vitaliyAntonushin.getWeight();

        double totalHeight = ivanBortsikh.getHeight() + marianDobosh.getHeight() + mykolaTereshchuk.getHeight() +
                ostapSvidryk.getHeight() + dmytroBlashchak.getHeight() + danyilHrytsiv.getHeight() +
                mykolaKosar.getHeight() + oleksandrVorontsov.getHeight() + maksymChernega.getHeight() +
                vitaliyAntonushin.getHeight();

        System.out.println("Sum of ages: " + totalAge);
        System.out.println("Sum of weights: " + totalWeight);
        System.out.println("Sum of heights: " + totalHeight);

//Task 4
Car car1 = new Car(200, 2.0, "Toyota", 2022, false, "Red", true, 12.5);
Car car2 = new Car(180, 1.8, "Honda", 2021, false, "Blue", true, 14.2);
Car car3 = new Car(250, 3.0, "BMW", 2020, false, "Black", true, 10.8);
Car car4 = new Car(150, 1.6, "Ford", 2019, false, "Silver", true, 13.0);
Car car5 = new Car(300, 2.5, "Mercedes", 2018, false, "White", true, 9.5);
Car car6 = new Car(120, 1.4, "Volkswagen", 2017, false, "Green", true, 15.1);
Car car7 = new Car(220, 2.2, "Audi", 2016, false, "Gray", true, 11.3);
Car car8 = new Car(190, 2.0, "Chevrolet", 2015, false, "Yellow", true, 12.8);
Car car9 = new Car(270, 2.8, "Lexus", 2014, false, "Orange", true, 10.2);
Car car10 = new Car(160, 1.6, "Nissan", 2013, false, "Purple", true, 13.7);

double totalEngineVolume = Car.sumEngineVolumes(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);
int totalHorsepower = Car.sumHorsepowers(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        System.out.println("\n\nSum of engine volumes: " + totalEngineVolume);
        System.out.println("Sum of horsepowers: " + totalHorsepower);

//Task 5
int number = 397;

int digit1 = number % 10;
int digit2 = (number / 10) % 10;
int digit3 = number / 100;

int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("\n\nOriginal number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
            }

class   User {
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    // Getters for age, weight, and height
    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}

class Car {
    private int horsepower;
    private double engineVolume;
    private String brand;
    private int year;
    private boolean isElectric;

    private String color;
    private boolean isAutomatic;
    private double fuelEfficiency;

    public Car(int horsepower, double engineVolume, String brand, int year, boolean isElectric,
               String color, boolean isAutomatic, double fuelEfficiency) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public static double sumEngineVolumes(Car... cars) {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getEngineVolume();
        }
        return sum;
    }

    public static int sumHorsepowers(Car... cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getHorsepower();
        }
        return sum;
    }
}
