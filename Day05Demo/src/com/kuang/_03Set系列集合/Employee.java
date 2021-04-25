package com.kuang._03Set系列集合;

public class Employee implements Comparable<Employee>{
    private String name;
    private double money;
    private int age;

    public Employee(String name, double money, int age) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // this表示当前对象， o表示被比较对象
        return this.age - o.age;
    }
}
