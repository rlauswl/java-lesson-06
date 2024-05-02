package kr.easw.lesson06;

public class ImplementationExample {

    public static void main(String[] args) {
        new Dog().speak();
        new Cat().speak();
        new Horse().speak();
    }

    interface Animal {
        void speak();
    }

    final static class Dog implements Animal {
        private void bark() {
            System.out.println("Bark!");
        }

        @Override
        public void speak() {
            bark();
        }
    }


    static class Cat implements Animal{
        private void meow() {
            System.out.println("Meow!");
        }

        @Override
        public void speak() {
            meow();
        }
    }

    static class Horse implements Animal{
        private void neigh() {
            System.out.println("Neigh!");
        }

        @Override
        public void speak() { neigh();}
    }
}
