package homework02;

import java.util.DoubleSummaryStatistics;

public class CiConverter {
    public static void main(String[] args) {

        double meter = 120;
        double inches = 98;
        double miles = 45;
        double km = 43;
        double lbs = 55;
        double kg=56;
        double speedKM=60;
        double speedMiles=45;

        double converterMeter, converterInches;
        double converterKm,converterMiles;
        double converterPound, converterKg;
        double converterSpeedKm,converterSpeedMiles;

        //1
        converterMeter = inches / 39.37 ;
        System.out.println("Convert Inches " + inches + " into Meter: " + converterMeter +" m");
        //1
        converterInches= meter * 39.37 ;
        System.out.println("Convert Meter " + meter + " into Inches: " + converterInches +" inc");

        //2
        converterKm = miles * 1.609;
        System.out.println("Convert miles " + miles + " into km: " + converterKm +" km");
        //2
        converterMiles = km / 1.609;
        System.out.println("Convert km " + km + " into miles: " + converterMiles +" miles");

        //3
        converterKg = lbs / 2.2046;
        System.out.println("Convert LBS " + lbs + " lbs into kg: " + converterKg +" kg");
        //3
        converterPound = kg * 2.2046;
        System.out.println("Convert kg " + kg + " kg into lbs: " + converterPound +" lbs");

        //4
        converterSpeedKm = speedMiles * 1.609;
        System.out.println("Convert Speed  " + speedMiles + " miles/hr into km/hr: " + converterSpeedKm +" km/hr");
        //4
        converterSpeedMiles = speedKM / 1.609;
        System.out.println("Convert speed km/hr " + speedKM + "km/hr into miles: " + converterSpeedMiles +" miles/hr");
    }
}
