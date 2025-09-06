package com.tutorusdude.com;

import com.tutorusdude.com.enumex.*;

public class EnumRunner {

    public static void main(String[] args) {

        Connection connection = Connection.WIRED;
        Connection connection1 = Connection.WIRELESS;

        System.out.println(connection);
        System.out.println(connection1);

        Days day = Days.FRI;
        Days day1 = Days.MON;
        Days day2 = Days.SAT;

        System.out.println(day);
        System.out.println(day1);
        System.out.println(day2);

        Directions directions = Directions.EAST;
        Directions directions1 = Directions.NORTH;
        Directions directions2 = Directions.WEST;
        Directions directions3 = Directions.SOUTH;

        System.out.println(directions);
        System.out.println(directions1);
        System.out.println(directions2);
        System.out.println(directions3);

        Gender gender = Gender.FEMALE;
        Gender gender1 = Gender.MALE;

        System.out.println(gender);
        System.out.println(gender1);

        Months months = Months.APR;
        Months months1 = Months.AUG;
        Months months2 = Months.DEC;

        System.out.println(months);
        System.out.println(months1);
        System.out.println(months2);

        RainbowColours rainbowColours =  RainbowColours.BLUE;
        RainbowColours rainbowColours1 = RainbowColours.GREEN;
        RainbowColours rainbowColours2 = RainbowColours.INDIGO;

        System.out.println(rainbowColours1);
        System.out.println(rainbowColours);
        System.out.println(rainbowColours2);

        Score score = Score.DISTINCTION;
        Score score1 = Score.FIRST_CLASS;
        Score score2 = Score.THIRD_CLASS;

        System.out.println(score1);
        System.out.println(score);
        System.out.println(score2);

        Status status = Status.INACTIVE;
        Status status1 = Status.ACTIVE;

        System.out.println(status);
        System.out.println(status1);

        Switch on = Switch.ON;
        Switch off = Switch.OFF;

        System.out.println(on);
        System.out.println(off);

        FilesType filesType = FilesType.JPG;
        FilesType filesType1 = FilesType.DOCX;

        System.out.println(filesType1);
        System.out.println(filesType);

        OperatingSystem operatingSystem = OperatingSystem.IOS;
        OperatingSystem operatingSystem1 = OperatingSystem.MAC;

        System.out.println(operatingSystem1);
        System.out.println(operatingSystem);

        ThemeMode themeMode = ThemeMode.LIGHT;
        ThemeMode themeMode1 = ThemeMode.DARK;

        System.out.println(themeMode1);
        System.out.println(themeMode);

        Transport transport = Transport.AIR;
        Transport transport1 = Transport.RAIL;

        System.out.println(transport1);
        System.out.println(transport);

        JobType jobType = JobType.CONTRACT;
        JobType jobType1 = JobType.FULL_TIME;

        System.out.println(jobType1);
        System.out.println(jobType);

        Weather weather = Weather.CLOUDY;
        Weather weather1 = Weather.RAINY;

        System.out.println(weather1);
        System.out.println(weather);

        GovernmentIdentity governmentIdentity = GovernmentIdentity.AADHAAR;

        System.out.println(governmentIdentity);

        EnergySources energySources = EnergySources.SOLAR;
        EnergySources energySources1 = EnergySources.NUCLEAR;

        System.out.println(energySources1);
        System.out.println(energySources);

        ShiftType shiftType = ShiftType.NIGHT;
        System.out.println(shiftType);

        MarriedStatus marriedStatus = MarriedStatus.MARRIED;
        System.out.println(marriedStatus);

        BatteryStatus batteryStatus = BatteryStatus.FULL;
        System.out.println(batteryStatus);
    }
}
