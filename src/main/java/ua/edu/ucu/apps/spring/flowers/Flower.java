package ua.edu.ucu.apps.spring.flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Setter @ToString
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    public Flower() {
        this.sepalLength = 0;
        this.color = FlowerColor.RED;
        this.price = 0;
        this.flowerType = FlowerType.ROSE;
    }

    public String getColor() {
        return color.toString();
    }

    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            price = 0;
        }
        else {
            price = newPrice;
        }
    }
}

