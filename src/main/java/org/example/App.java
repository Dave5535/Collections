package org.example;


import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {

        challenge4();
    }

    public static void ex1() {
        ArrayList<String> string = new ArrayList<>();
        string.add("Monday");
        string.add("Tuesday");
        string.add("wednesday");
        string.add("Thursday");
        string.add("Friday");
        string.add("Saturday");
        string.add("Sunday");
        System.out.println(string);
    }

    public static void ex2() {
        ArrayList<String> string = new ArrayList<>();
        string.add("Monday");
        string.add("Tuesday");
        string.add("wednesday");
        string.add("Thursday");
        string.add("Friday");
        string.add("Saturday");
        string.add("Sunday");
        for (String days : string)
            System.out.println(days);
    }

    public static void ex3() {
        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("wednesday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        ArrayList<String> day = new ArrayList<>();
        day.add("Thursday");
        week.addAll(3, day);

        for (String days : week)
            System.out.println(days);
    }

    public static void ex4() {
        ArrayList<String> week = new ArrayList<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");

        ArrayList<String> day = new ArrayList<>();
        day.add(week.get(0));
        day.add(week.get(1));
        day.add(week.get(2));
        for (String days : day)
            System.out.println(days);
    }

    public static void ex5() {
        Set<String> week = new HashSet<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
        System.out.println(week);

    }

    public static void ex6() {
        Set<String> week = new HashSet<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
        List<String> list = new ArrayList<>();
        list.addAll(week);
        for (String days : list)
            System.out.println(days);
    }

    public static void ex7() {
        Set<String> names = new HashSet<>();
        names.add("Bengt");
        names.add("Sara");
        names.add("Noel");
        names.add("Dave");
        List<String> sort = new ArrayList<>(names);
        sort.add(sort.get(0));
        sort.add(sort.get(2));
        sort.add(sort.get(1));
        sort.add(sort.get(3));
        System.out.println(sort.get(0) + " " + sort.get(2) + " " +
                sort.get(1) + " " + sort.get(3));
    }

    public static void ex8() {
        Set<String> names = new HashSet<>();
        names.add("Bengt");
        names.add("Sara");
        names.add("Noel");
        names.add("Dave");
        Set<String> sortName = new TreeSet<>(names);
        System.out.println(sortName);
    }

    public static void ex9() {
        Map<Integer, String> car = new HashMap<>();
        car.put(1, "Volvo");
        car.put(2, "Ford");
        car.put(3, "Saab");
        car.put(4, "BMV");
        System.out.println(car);
    }

    public static void ex10() {
        Map<Integer, String> car = new HashMap<>();
        car.put(1, "Volvo");
        car.put(2, "Ford");
        car.put(3, "Saab");
        car.put(4, "BMV");
        for (Map.Entry entry : car.entrySet()) {
            System.out.println("Key: " + entry.getKey());
        }
    }

    public static void ex11() {
        Map<Integer, String> car = new HashMap<>();
        car.put(1, "Volvo");
        car.put(2, "Ford");
        car.put(3, "Saab");
        car.put(4, "BMV");
        for (Map.Entry entry : car.entrySet()) {
            System.out.println("Value: " + entry.getValue());
        }
    }

    public static void ex12() {

        Map<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car("volvo", "V60"));
        cars.put(2, new Car("ford", "focus"));
        cars.put(3, new Car("saab", "60"));
        for (Car car : cars.values()) {
            System.out.println(car.getBrand());
        }


    }

    public static void challenge1() {
        Set<String> week = new TreeSet<>();
        week.add("Monday");
        week.add("Tuesday");
        week.add("wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        week.add("Sunday");
        Set<String> copyWeek = new TreeSet<>();
        copyWeek.add("Saturday");
        copyWeek.add("Sunday");
        week.retainAll(copyWeek);
        System.out.println(week);
    }

    public static void challenge2() {
        Map<String, String> email = new HashMap<>();
        email.put("1", "test.test");
        email.put("2", "email.test");
        Set<String> key = new TreeSet<>();
        for (String i : email.keySet())
            key.add(i);
        System.out.println(key);
    }

    public static void challenge3() {
List<SuperHero> hero = new ArrayList<>();
        hero.add( new SuperHero("Super man",532));
        hero.add( new SuperHero("Ironman",46));
        hero.add( new SuperHero("SpiderMan",19));
        Collections.sort(hero);
        for (SuperHero heroes: hero)
            System.out.println(heroes.getAge() +"  "+heroes.getName());
    }

    public static void challenge4() {
int[] numbers = new int[] {1,4,4,2,6,7};

Set<Integer> num = new TreeSet<>();
for( int i : numbers)
    num.add(i);
        System.out.println(num);

    }


}
