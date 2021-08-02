package com.kuang._03Map集合存储自定义类型;


import java.util.Objects;

public class Orange {
    private String place;
    private String name;
    private Double price;

    public Orange(String place, String name, Double price) {
        this.place = place;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return Objects.equals(place, orange.place) && Objects.equals(name, orange.name) && Objects.equals(price, orange.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, name, price);
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "place='" + place + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
