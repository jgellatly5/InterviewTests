package com.gallopdevs.interviewtests.crackingthecodinginterview.chapter_three;

import java.util.LinkedList;

public class Three_Six_A {

    public abstract class Animal {
        private int order;
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public boolean isOlderThan(Animal a) {
            return this.order < a.getOrder();
        }
    }

    public static class AnimalQueue {
        LinkedList<Dog> dogs = new LinkedList<>();
        LinkedList<Cat> cats = new LinkedList<>();
        private int order = 0;

        public void enqueue(Animal a) {
            a.setOrder(order);
            order++;

            if (a instanceof Dog) dogs.addLast((Dog) a);
            else if (a instanceof Cat) cats.addLast((Cat) a);
        }

        public Animal dequeueany() {
            if (dogs.size() == 0) {
                return dequeueCats();
            } else if (cats.size() == 0) {
                return dequeueDogs();
            }
            Dog dog = dogs.peek();
            Cat cat = cats.peek();
            if (dog.isOlderThan(cat)) {
                return dequeueDogs();
            } else {
                return dequeueCats();
            }
        }

        private Animal dequeueDogs() {
            return dogs.poll();
        }

        private Animal dequeueCats() {
            return cats.poll();
        }
    }

    public class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }
}