package org.example.homework.exer1;

public class Car {
    public int topSpeed;
    public int numWheels;

    public int yearOfProduction;

    private GearBox gearBox;

    public Car() {
    }


    public Car(int speed, int numWheels, int yearOfProduction, GearBox gearBox) {
        this.topSpeed = speed;
        this.numWheels = numWheels;
        this.yearOfProduction = yearOfProduction;
        this.gearBox = gearBox;
    }


    @SuperMethod(run = true)
    public double calculateAverageSpeed(double distance, double time) {
        if (time <= 0) {
            throw new IllegalArgumentException("Czas musi być większy od zera.");
        }

        return distance / time;
    }
    public boolean isOlderThan(int year) {
        return yearOfProduction < year;
    }

    public void displayCarInfo() {
        System.out.println("Informacje o samochodzie:");
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Liczba kół: " + numWheels);
        System.out.println("Rok produkcji: " + yearOfProduction);
        if (gearBox != null) {
            System.out.println("Skrzynia biegów: " + gearBox.getGearType());
        } else {
            System.out.println("Skrzynia biegów nieustawiona.");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", numWheels=" + numWheels +
                ", yearOfProduction=" + yearOfProduction +
                ", gearBox=" + gearBox +
                '}';
    }
}
