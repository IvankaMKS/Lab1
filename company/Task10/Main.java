package com.company.Task10;

public class Main {
    public static void main(final String[] args) {
        final int n=7;
        final Day [] days = new Day[n];

        days[0] = new Day (NameOfDay.monday,TypeOfWeather.hot,12.1,630,61);
        days[1] = new Day (NameOfDay.tuesday,TypeOfWeather.winny,14.4,740,69);
        days[2] = new Day (NameOfDay.wednesday,TypeOfWeather.hot,14.8,590,70);
        days[3] = new Day (NameOfDay.thursday,TypeOfWeather.rainy,13.9,570,64);
        days[4] = new Day (NameOfDay. friday,TypeOfWeather.sunny,16.0,590,48);
        days[5] = new Day (NameOfDay. saturday,TypeOfWeather.warm,17.8,610,56);
        days[6] = new Day (NameOfDay.sunday,TypeOfWeather.snowy,19.2,780,72);
        printWeatherCalendar (days);
    }
    private static void printWeatherCalendar(final Day [] days){
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}



