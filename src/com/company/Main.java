package com.company;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(3, 3, 3);

        System.out.println(time.toString());
        time.addHour(93);
        System.out.println(" ");
        System.out.println("Hora: " + time.getHour());
        time.addMinute(225);
        System.out.println("Minuto: " + time.getMinute());
        time.addSecond(3662);
        System.out.println("Segundo: " + time.getSecond());
        System.out.println(" ");
        System.out.println(time.toString());

        System.out.println(" ");
        time.setTime(12, 57, 35);

        System.out.println(time.toString());
        time.addHour(90);
        System.out.println(" ");
        System.out.println("Hora: " + time.getHour());
        time.addMinute(79);
        System.out.println("Minuto: " + time.getMinute());
        time.addSecond(983);
        System.out.println("Segundo: " + time.getSecond());
        System.out.println(" ");
        System.out.println(time.toString());
    }

}