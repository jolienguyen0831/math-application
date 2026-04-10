package com.pluralsight;


public class MathApp {
    public static void main(String[] args) {


        //print highest salary between Bob and Gary
        int bobSalary = 10_000;
        int garySalary = 12_000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.printf("The highest salary is $%d%n", highestSalary);

        //print smallest of two variables
        int carPrice = 55_000;
        int truckPrice = 40_000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.printf("The smallest price is $%d%n", smallestPrice);

        //print area of a circle
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.sqrt(radius);
        System.out.printf("The area of circle of radius %.2f is %.2f%n", radius, areaOfCircle);

        //print square root
        double randomNumberSquare = 5.0f;
        double squareRoot = Math.sqrt(randomNumberSquare);
        System.out.printf("Square root of %.2f is %.2f%n",randomNumberSquare, squareRoot);

        //print distance between 2 points
        int x1 = 5, y1 = 10;
        int x2 = 85, y2= 50;
        double distance2Points = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.printf("The distance between (%d,%d) and (%d,%d) is %.2f%n", x1, y1, x2, y2, distance2Points);

        //print absolute value
        float randomValue = -3.8f;
        float absoluteValue = Math.abs(randomValue);
        System.out.printf("The absolute value of %.1f is %.1f%n", randomValue, absoluteValue);

        //print random number
        double randomNumber = Math.random()*10;
        System.out.printf("I get a random number is %.2f%n", randomNumber);

        //calculate days
        int days = 24;
        int oneDayInHours = 24;
        int oneHourInMinutes = 60;
        int oneMinuteInSecond = 60;
        int oneSecondInMillisecond = 1000;
        int totalMinutes = days * oneDayInHours * oneHourInMinutes;
        int totalMillisecond = totalMinutes * oneMinuteInSecond * oneSecondInMillisecond;
        System.out.printf("There are %d minutes in %d days%n", totalMinutes, days);
        System.out.printf("There are %d milliseconds in %d days%n", totalMillisecond, days);



    }
}
