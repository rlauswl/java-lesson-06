package kr.easw.lesson06;


public class AbstractionExample {

    public static void main(String[] args) {
        new Car("Car").run();
        new Bicycle("Bicycle").run();
        new Motorcycle("Motorcycle").run();
    }

    abstract static class Vehicle {
        private final String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void run();
    }

    static class Car extends Vehicle {
        public Car(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Car is running!");
        }
    }


    static class Bicycle extends Vehicle{
        public Bicycle(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Bicycle is running!");
        }
    }

    static class Motorcycle extends Vehicle{
        public Motorcycle(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Motorcycle is running!");
        }
    }
}
