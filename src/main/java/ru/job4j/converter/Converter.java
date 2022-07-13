package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float euroToRubble(float value) {
        return value * 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRubble(float value) {
        return value * 60;
    }

    public static float euroToDollar(float value) {
        return value * 70 / 60;
    }

    public static float dollarToEuro(float value) {
        return value * 60 / 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(150);
        System.out.println("150 rubles are " + dollar + " dollars.");
        float euroToRub = Converter.euroToRubble(2);
        System.out.println("2 euro are " + euroToRub + " rubbles.");
        float dollarToRub = Converter.dollarToRubble(2);
        System.out.println("2 dollars are " + dollarToRub + " rubbles.");
        float euroToDol = Converter.euroToDollar(20);
        System.out.println("10 euro are " + euroToDol + " dollars.");
        float dolToEuro = Converter.dollarToEuro(10);
        System.out.println("10 dollars are " + dolToEuro + " euro.");
    }

}
