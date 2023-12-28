package chapter8;

import ArrayExecise.InvalidInputException;

public class Cylinder {
    private double radius = 1;
    private double height = 1;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else throw new InvalidInputException("Radius value invalid");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else throw new InvalidInputException("Height value invalid");
    }

    public double calculateCylinderVolume() {
        double volume = (radius * radius) * height * Math.PI;
        System.out.println();
        String approxVolume = String.format("%.2f", volume);
        return Double.parseDouble(approxVolume);
    }
}
