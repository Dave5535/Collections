package org.example;

import java.util.Objects;

public class SuperHero implements Comparable<SuperHero> {
    private int sequencer =0;
    private int id;
    private String name;
    private int age;

    public SuperHero(){
        this.id = (sequencer++);
    }
public SuperHero(String name,int age){
        setName(name);
        setAge(age);
}



    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(SuperHero getAge) {
        if (this.getAge() > getAge.getAge()){
            return 1;
        } else if (this.getAge() < getAge.getAge()) {
            return -1;
        }else
        return 0;
    }
}
