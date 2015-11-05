package com.appsout.unitconverter;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    // Functions of the Temperature Units
    //This will convert Fahrenheit to Celsius
    public double convertfahrenheittoCelsius(double fahrenheit) { return ((fahrenheit - 32) * 5 / 9); }
    //This will convert Fahrenheit to Kelvin
    public double convertFahrenheittoKelvin(double Fahrenheit) { return (((Fahrenheit + 459.67) * 5) / 9 ); }
    //This will convert Celsius to Fahrenheit
    public double convertcelsiustoFahrenheit(double Celsius) {
        return (((Celsius * 9) /5) + 32);
    }
    //This will convert Celsius to Kelvin
    public double convertCelsiustoKelvin(double celsius) {
        return (celsius + 273.15);
    }
    //This will convert Kelvin to Fahrenheit
    public double convertkelvintoFahrenheit(double Kelvin) {
        return (((Kelvin * 9) / 5) - 459.67);
    }
    //This will convert Kelvin to Celsius
    public double convertKelvintoCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE TEMPERATURE
    public List<String> getTemperatureUnits(String whichItem)
    {
        List <String> l1 =  new ArrayList<String>();
        l1.add("Fahrenheit");
        l1.add("Celsius");
        l1.add("Kelvin");
        if(!whichItem.equals(""))
        {
            for(int i =0;i<l1.size();i++)
            {
                if(l1.get(i).equals(whichItem))
                {
                    l1.remove(i);
                    break;
                }
            }
        }
        return l1;
    }
    //Functions of the Length Units
    //This will convert Millimeter to Centimeter
    public double convertmillimetertoCentimeteer(double Millimeter){
        return  (Millimeter/10.000);
    }
    //This will convert Millimeter to Meter
    public  double convertmillimetertoMeter(double Millimeter){
        return (Millimeter/1000.0);
    }
    //This will convert Millimeter to Kilometer
    public double convertmillimetertoKilometer (double Millimeter){
        return (Millimeter/100000);
    }
    //This will convert Millimeter to Inches
    public double convertmillimetertoInches (double Millimeter){
        return (Millimeter / 25.4);
    }
    //This will convert Millimeter to Feets
    public double convertmillimetertoFeets (double Millimeter){
        return (Millimeter * 0.0032808);
    }
    //This will convert Millimeter to Yards
    public double convertmillimetertoYards (double Millimeter)
    {
        return (Millimeter * 0.0010936);
    }
    //This will convert Millimeter to Miles
    public double convertmillimetertoMiles (double Millimeter)
    {
        return (Millimeter / 1609344);
    }
    //This will convert Centimeter to Millimeters
    public double convertcentimetertoMillimeters (double Centimeter) { return (Centimeter * 10.000); }
    //This will convert Centimeter to Meters
    public double convertcentimetertoMeters (double Centimeter)
    {
        return (Centimeter / 100.0);
    }
    //This will convert Centimeter to Kilometer
    public double convertcentimetertoKilometer (double Centimeter)
    {
        return (Centimeter / 100000);
    }
    //This will convert Centimeter to Inches
    public double convertcentimetertoInches (double Centimeter)
    {
        return (Centimeter * (1 /2.54));
    }
    //This will convert Centmeter to Feets
    public double convertcentimetertoFeets (double Centimeter)
    {
        return (Centimeter * 0.032808);
    }
    //This will convert Centimeter to Yards
    public double convertcentimetertoYards (double Centimeter)
    {
        return (Centimeter * 0.010936);
    }
    //This will convert Centmeter to Miles
    public double convertcentimetertoMiles (double Centimeter)
    {
        return (Centimeter / 160934.4);
    }
    //This will convert Meters to Millimeters
    public double convertmetertoMillimeter (double Meter)
    {
        return (Meter / 0.0010000);
    }
    //This will convert Meters to Centimeter
    public double convertmetertoCentimeter (double Meter)
    {
        return (Meter / 0.010000);
    }
    //This will convert Meters to Kilometer
    public double convertmetertoKilometer (double Meter)
    {
        return (Meter / 1000.0);
    }
    //This will convert Meters to Inches
    public double convertmetertoInches (double Meter)
    {
        return (Meter * 39.370);
    }
    //This will convert Meters to Feet
    public double convertmetertoFeets (double Meter)
    {
        return (Meter * 3.2808);
    }
    //This will convert Meters to Yards
    public double convertmetertoYards (double Meter)
    {
        return (Meter * 1.0936);
    }
    //This will convert Meters to Miles
    public double convertmetertoMiles (double Meter)
    {
        return (Meter * 0.00062137);
    }
    //This will convert Kilometers to Millimeters
    public double convertkilometertoMillimeter (double Kilometer)
    {
        return (Kilometer * 1000000);
    }
    //This will convert Kilometers to Centimeters
    public double convertkilometertoCentimeter (double Kilometer)
    {
        return (Kilometer * 100000);
    }
    //This will convert Kilometers to Meters
    public double convertkilometertoMeter (double Kilometer)
    {
        return (Kilometer * 1000);
    }
    //This will convert Kilometer to Inches
    public double convertkilometertoInches (double Kilometer)

    {
        return (Kilometer * 39370);
    }
    //This will convert Kilometer to Feets
    public double convertkilometertoFeets (double Kilometer)
    {
        return (Kilometer * 3280.8);
    }
    //This will convert Kilometer to Yards
    public double convertkilometertoYards (double Kilometer)
    {
        return (Kilometer * 1093.6);
    }
    //This will convert Kilometer to Miles
    public double convertkilometertoMiles (double Kilometer)
    {
        return (Kilometer * 0.62137);
    }
    //This will convert Inches to Millimeter
    public double convertinchestoMillimeter (double Inches)
    {
        return (Inches / 0.039370);
    }
    //This will convert Inches to Centimeter
    public double convertinchestoCentimeter (double Inches)
    {
        return (Inches / 0.39370);
    }
    //This will convert Inches to Meter
    public double convertinchestoMeter (double Inches)
    {
        return (Inches / 39.370);
    }
    //This will convert Inches to Kilometer
    public double convertinchestoKilometer (double Inches)
    {
        return (Inches / 39370);
    }
    //This will convert Inches to Feet
    public double convertinchestoFeet (double Inches)
    {
        return (Inches * 0.083333);
    }
    //This will convert Inches to Yards
    public double convertinchestoYards (double Inches)
    {
        return (Inches * 0.027778);
    }
    //This will convert Inches to Miles
    public double convertinchestoMiles (double Inches)
    {
        return (Inches / 63360);
    }
    //This will convert Feet to Millimeter
    public double convertfeettoMillimeter (double Feet)
    {
        return (Feet / 0.0032808);
    }
    //This will convert Feet to Centimeter
    public double convertfeettoCentimeter (double Feet)
    {
        return (Feet / 0.032808);
    }
    //This will convert Feet to Meter
    public double convertfeettoMeter (double Feet)
    {
        return (Feet / 3.2808);
    }
    //This will convert Feet to Kilometer
    public double convertfeettoKilometer (double Feet)
    {
        return (Feet / 3280.8);
    }
    //This will convert Feet to Inches
    public double convertfeettoInches (double Feet)
    {
        return (Feet * 12.000);
    }
    //This will convert Feet to Yards
    public double convertfeettoYards (double Feet)
    {
        return (Feet * 0.33333);
    }
    //This will convert Feet to Miles
    public double convertfeettoMiles (double Feet)
    {
        return (Feet * 0.00018939);
    }
    //This will convert Yards to Millimeter
    public double convertyardstoMillimeter (double Yards)
    {
        return (Yards / 0.0010936);
    }
    //This will convert Yards to Centimeter
    public double convertyardstoCentimeter (double Yards)
    {
        return (Yards / 0.010936);
    }
    //This will convert Yards to Meters
    public double convertyardstoMeters (double Yards)
    {
        return (Yards / 1.0936);
    }
    //This will convert Yards to Kilometer
    public double convertyardstoKilometer (double Yards)
    {
        return (Yards / 1093.6);
    }
    //This will convert Yards to Inches
    public double convertyardstoInches (double Yards)
    {
        return (Yards * 36.000);
    }
    //This will convert Yards to Feets
    public double convertyardstoFeet (double Yards)
    {
        return (Yards * 3.000);
    }
    //This will convert Yards to Miles
    public double convertyardstoMiles (double Yards)
    {
        return (Yards / 1760);
    }
    //This will convert Miles to Millimeter
    public double convertmilestomillimeter (double Miles)
    {
        return (Miles * 1609344);
    }
    //This will convert Miles to Centimeters
    public double convertmilestoCentimeter (double Miles)
    {
        return (Miles * 160934.4);
    }
    //This will convert Miles to Meters
    public double convertmilestoMeters (double Miles)
    {
        return (Miles / 0.00062137);
    }
    //This will convert Miles to Kilometers
    public double convertmilestoKilometer (double Miles)
    {
        return (Miles / 0.62137);
    }
    //This will convert Miles to Inches
    public double convertmilestoInches (double Miles)
    {
        return (Miles * 63360);
    }
    //This will convert Miles to Feet
    public double convertmilestoFeet (double Miles)
    {
        return (Miles * 5280.0);
    }
    //This will convert Miles to Yards
    public double convertmilestoYards (double Miles)
    {
        return (Miles * 1760.0);
    }

    //THIS WILL SHOW THE LIST OF THE ITEMS IN THE SPINNER OF THE LENGTH UNIT
    public List<String> lengthsList(String whichItem)
    {
        List <String> list = new ArrayList<String>();
        list.add("Millimeter");
        list.add("Centimeter");
        list.add("Meter");
        list.add("Kilometer");
        list.add("Inch");
        list.add("Feet");
        list.add("Yard");
        list.add("Mile");
        if(!whichItem.equals("")) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(whichItem)) {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }

    //Functions of the Weight Units
    //This will convert Carat to Centigrams
    public double convertCarattoCentigrams (double Carat)
    {
        return (Carat * 20);
    }
    //This will convert Carat to Grains
    public double convertCarattoGrains (double Carat)
    {
        return (Carat / 0.32399);
    }
    //This will convert Carat to Grams
    public double convertCarattoGrams (double Carat)
    {
        return (Carat / 5.0000);
    }
    //This will convert Carat to Kilograms
    public double convertCarattoKilograms (double Carat)
    {
        return (Carat / 5000.0);
    }
    //This will convert Carat to Micrograms
    public double convertCarattoMicrograms (double Carat)
    {
        return (Carat * 5000.0);
    }
    //This will convert Carat to Milligrams
    public double convertCarattoMilligrams (double Carat)
    {
        return (Carat / 0.0050000);
    }
    //This will convert Carat to Ounce
    public double convertCarattoOunce (double Carat)
    {
        return (Carat * 0.0070548);
    }
    //This will convert Carat to Pound
    public double convertCarattoPound (double Carat)
    {
        return (Carat * 0.00044092);
    }
    //This will convert Carat to Tonne
    public double convertCarattoTonne (double Carat)
    {
        return (Carat / 5000000);
    }
    //This will convert Carat to Troy Ounce
    public double convertCarattoTroyOuce (double Carat)
    {
        return (Carat * 0.0064301);
    }
    //This will convert Carat to TroyOunce
    public double convertCarattoTroyPound (double Carat)
    {
        return (Carat * 1866.2);
    }
    //This will convert Centigram to Carat
    public double convertCentigramtoCarat (double Centigram)
    {
        return (Centigram / 20);
    }
    //This will convert Centigram to Grains
    public double convertCentigramtoGrains (double Centigram) { return (Centigram * 0.154323583529); }
    //This will convert Centigram to Grams
    public double convertCentigramtoGrams (double Centigram)
    {
        return (Centigram / 100);
    }
    //This will convert Centigram to Kilograms
    public double convertCentigramtoKilograms (double Centigram)
    {
        return (Centigram / 100000);
    }
    //This will convert Centigram to Microgram
    public double convertCentigramtoMicrogram (double Centigram)
    {
        return (Centigram * 10000);
    }
    //This will convert Centigram to Milligram
    public double convertCentigramtoMilligram (double Centigram)
    {
        return (Centigram * 10);
    }
    //This will convert Centigram to Ounce
    public double convertCentigramtoOunce (double Centigram)
    {
        return (Centigram / 2834.95231);
    }
    //This will convert Centigram to Pound
    public double convertCentigramtoPound (double Centigram)
    {
        return (Centigram / 45359.237);
    }
    //This will convert Centigram to Tonne
    public double convertCentigramtoTonne (double Centigram)
    {
        return (Centigram / 100000000);
    }
    //This will convert Centigram to Troy Ounce
    public double convertCentigramtoTroyOunce (double Centigram) { return (Centigram / 0.000321507465686); }
    //This will convert Centigram to Troy Pound
    public double convertCentigramtoTroyPound (double Centigram) { return (Centigram / 0.0000267922888072); }
    //This will convert Grains to Carat
    public double convertGrainstoCarat (double Grains)
    {
        return (Grains / 0.32399);
    }
    //This will convert Grains to Centigrams
    public double convertGrainstoCentigrams (double Grains)
    {
        return (Grains * 6.479891);
    }
    //This will convert Grains to Grams
    public double convertGrainstoGrams (double Grains)
    {
        return (Grains / 15.432);
    }
    //This will convert Grains to Kilograms
    public double convertGrainstoKilograms (double Grains)
    {
        return (Grains / 15432);
    }
    //This will convert Grains to Micrograms
    public double convertGrainstoMicrograms (double Grains)
    {
        return (Grains * 64798.91);
    }
    //This will convert Grains to Milligrams
    public double convertGrainstoMilligrams (double Grains)
    {
        return (Grains * 0.015432);
    }
    //This will convert Grains to Ounce
    public double convertGrainstoOunce (double Grains)
    {
        return (Grains / 437.50);
    }
    //This will convert Grains to Pound
    public double convertGrainstoPound (double Grains)
    {
        return (Grains * 0.00014286);
    }
    //This will convert Grains to Tonne
    public double convertGrainstoTonne (double Grains)
    {
        return (Grains / 15432000);
    }
    //This will convert Grains to Troy Ounce
    public double convertGrainstoTroyOunce (double Grains)
    {
        return (Grains * 0.0020833);
    }
    //This will convert Grains to Troy Pound
    public double convertGrainstoTroyPound (double Grams)
    {
        return (Grams * 0.00017361);
    }
    //This will convert Grams to Carat
    public double convertGramstoCarat (double Grams)
    {
        return (Grams * 5);
    }
    //This will convert Grams to Centigram
    public double convertGramstoCentigram (double Grams)
    {
        return (Grams * 100);
    }
    //This will convert Grams to Grains
    public double convertGramstoGrains (double Grams)
    {
        return (Grams * 15.432);
    }
    //This will convert Grams to Kilograms
    public double convertGramstoKilograms (double Grams)
    {
        return (Grams / 1000.0);
    }
    //This will convert Grams to Microgram
    public double convertGramstoMicrogram (double Grams)
    {
        return (Grams * 1000000);
    }
    //This will convert Grams to Milligram
    public double convertGramstoMilligram (double Grams)
    {
        return (Grams / 0.0010000);
    }
    //This will convert Grams to Ounce
    public double convertGramstoOunce (double Grams)
    {
        return (Grams * 0.035274);
    }
    //This will convert Grams to Pound
    public double convertGramstoPound (double Grams)
    {
        return (Grams * 0.0022046);
    }
    //This will convert Grams to Tonne
    public double convertGramstoTonne (double Grams)
    {
        return (Grams / 1000000);
    }
    //This will convert Grams to Troy Ounce
    public double convertGramstoTroyOunce (double Grams)
    {
        return (Grams * 0.032151);
    }
    //This will convert Grams to Troy Pound
    public double convertGramstoTroyPound (double Grams)
    {
        return (Grams * 0.0026792);
    }
    //This will convert Kilograms to Carat
    public double convertKilogramtoCarat (double Kilogram)
    {
        return (Kilogram * 5000.0);
    }
    //This will convert Kilograms to Centigram
    public double convertKilogramtoCentigram (double Kilogram)
    {
        return (Kilogram * 100000);
    }
    //This will convert Kilograms to Grains
    public double convertKilogramtoGrains (double Kilogram)
    {
        return (Kilogram * 15432);
    }
    //This will convert Kilograms to Grams
    public double convertKilogramtoGrams (double Kilogram)
    {
        return (Kilogram / 0.0010000);
    }
    //This will convert Kilograms to Micrograms
    public double convertKilogramtoMicrograms (double Kilogram)
    {
        return (Kilogram * 1000000000);
    }
    //This will convert Kilograms to Milligrams
    public double convertKilogramtoMilligrams (double Kilogram)
    {
        return (Kilogram * 1000000);
    }
    //This will convert Kilograms to Ounce
    public double convertKilogramtoOunce (double Kilogram)
    {
        return (Kilogram * 35.274);
    }
    //This will convert Kilograms to Pound
    public double convertKilogramtoPound (double Kilogram)
    {
        return (Kilogram * 2.2046);
    }
    //This will convert Kilograms to Tonnes
    public double convertKilogramtoTonnes (double Kilogram)
    {
        return (Kilogram / 1000.0);
    }
    //This will convert Kilograms to Troy Ounce
    public double convertKilogramtoTroyOunce (double Kilogram)
    {
        return (Kilogram * 32.151);
    }
    //This will convert Kilograms to Troy Pound
    public double convertKilogramtoTroyPound (double Kilogram)
    {
        return (Kilogram * 2.6792);
    }
    //This will convert Micrograms to Carat
    public double convertMicrogramtoCarat (double Microgram)
    {
        return (Microgram * 0.000005);
    }
    //This will convert Micrograms to Centigram
    public double convertMicrogramtoCentigrams (double Microgram)
    {
        return (Microgram * 0.0001);
    }
    //This will convert Micrograms to Grains
    public double convertMicrogramtoGrains (double Microgram)
    {
        return (Microgram * 64798.91);
    }
    //This will convert Micrograms to Grams
    public double convertMicrogramtoGrams (double Microgram)
    {
        return (Microgram / 1000000);
    }
    //This will convert Micrograms to Kilogram
    public double convertMicrogramtoKilogram (double Microgram)
    {
        return (Microgram / 1000000000);
    }
    //This will convert Micrograms to Milligram
    public double convertMicrogramtoMilligram (double Microgram)
    {
        return (Microgram * 0.0010000);
    }
    //This will convert Micrograms to Ounce
    public double convertMicrogramtoOunce (double Microgram)
    {
        return (Microgram / 28349523.1);
    }
    //This will convert Micrograms to Pound
    public double convertMicrogramtoPound (double Microgram)
    {
        return (Microgram / 453592370);
    }
    //This will convert Micrograms to Tonne
    public double convertMicrogramtoTonne (double Microgram) { return (Microgram / 1000000000000.0); }
    //This will convert Micrograms to Troy Ounce
    public double convertMicrogramtoTroyOunce (double Microgram) { return (Microgram / 0.000000032); }
    //This will convert Micrograms to Troy Pound
    public double convertMicrogramtoTroyPound (double Microgram) { return (Microgram * 0.0000000027); }
    //This will convert Milligrams to Carat
    public double convertMilligramstoCarat (double Milligrams)
    {
        return (Milligrams * 0.005);
    }
    //This will convert Milligrams to Centigram
    public double convertMilligramstoCentigram (double Milligrams)
    {
        return (Milligrams / 10);
    }
    //This will convert Milligrams to Grains
    public double convertMilligramstoGrains (double Milligrams)
    {
        return (Milligrams * 0.015432);
    }
    //This will convert Milligrams to Grams
    public double convertMilligramstoGrams (double Milligrams)
    {
        return (Milligrams / 1000.0);
    }
    //This will convert Milligrams to Kilograms
    public double convertMilligramstoKilograms (double Milligrams) { return (Milligrams / 1000000); }
    //This will convert Milligrams to Micrograms
    public double convertMilligramstoMicrograms (double Milligrams) { return (Milligrams / 0.0010000); }
    //This will convert Milligrams to Ounce
    public double convertMilligramstoOunce (double Milligrams)
    {
        return (Milligrams / 28349.5231);
    }
    //This will convert Milligrams to Pound
    public double convertMilligramstoPound (double Milligrams)
    {
        return (Milligrams / 453592.37);
    }
    //This will convert Milligrams to Tonne
    public double convertMilligramstoTonne (double Milligrams)
    {
        return (Milligrams / 1000000000);
    }
    //This will convert Milligrams to Troy Ounce
    public double convertMilligramstoTroyOunce (double Milligrams) { return (Milligrams / 0.000032); }
    //This will convert Milligrams to Troy Pound
    public double convertMilligramstoTroyPound (double Milligrams) { return (Milligrams / 0.00000267922888072); }
    //This will convert Ounce to Carat
    public double convertOuncetoCarat (double Ounce)
    {
        return (Ounce *  141.74762 );
    }
    //This will convert Ounce to Centigrams
    public double convertOuncetoCentigram (double Ounce)
    {
        return (Ounce *  2834.95231);
    }
    //This will convert Ounce to Grains
    public double convertOuncetoGrains (double Ounce)
    {
        return (Ounce *  437.50);
    }
    //This will convert Ounce to Grams
    public double convertOuncetoGrams (double Ounce)
    {
        return (Ounce /  0.035274);
    }
    //This will convert Ounce to Kilograms
    public double convertOuncetoKilograms (double Ounce)
    {
        return (Ounce /  35.274);
    }
    //This will convert Ounce to Micrograms
    public double convertOuncetoMicrograms (double Ounce)
    {
        return (Ounce /  28349523.125);
    }
    //This will convert Ounce to Milligrams
    public double convertOuncetoMilligrams (double Ounce)
    {
        return (Ounce * 28349.523125);
    }
    //This will convert Ounce to Pounds
    public double convertOuncetoPounds (double Ounce)
    {
        return (Ounce * 0.062500);
    }
    //This will convert Ounce to Tonne
    public double convertOuncetoTonne (double Ounce)
    {
        return (Ounce * 0.00002835);
    }
    //This will convert Ounce to Troy Ounce
    public double convertOuncetoTroyOunce (double Ounce)
    {
        return (Ounce * 0.91146);
    }
    //This will convert Ounce to Troy Pound
    public double convertOuncetoTroyPound (double Ounce)
    {
        return (Ounce / 13.166);
    }
    //This will convert Pound to Carat
    public double convertPoundtoCarat (double Pound)
    {
        return (Pound / 0.00044092);
    }
    //This will convert Pound to Centigram
    public double convertPoundtoCentigram (double Pound)
    {
        return (Pound * 0.000022046);
    }
    //This will convert Pound to Grains
    public double convertPoundtoGrains (double Pound)
    {
        return (Pound *  7000.0);
    }
    //This will convert Pound to Grams
    public double convertPoundtoGrams (double Pound)
    {
        return (Pound / 0.0022046);
    }
    //This will convert Pound to Kilograms
    public double convertPoundtoKilograms (double Pound)
    {
        return (Pound / 2.2046);
    }
    //This will convert Pound to Micrograms
    public double convertPoundtoMicrograms (double Pound)
    {
        return (Pound * 453592370);
    }
    //This will convert Pound to Milligrams
    public double convertPoundtoMilligrams (double Pound)
    {
        return (Pound * 453592.37);
    }
    //This will convert Pound to Ounces
    public double convertPoundtoOunces (double Pound)
    {
        return (Pound * 16.000);
    }
    //This will convert Pound to Tonne
    public double convertPoundtoTonne (double Pound)
    {
        return (Pound / 2204.6);
    }
    //This will convert Pound to Troy Ounce
    public double convertPoundtoTroyOunce (double Pound)
    {
        return (Pound * 14.583);
    }
    //This will convert Pound to Troy Pound
    public double convertPoundtoTroyPound (double Pound)
    {
        return (Pound * 1.21527777778);
    }
    //This will convert Tonne to Carat
    public double convertTonnetoCarat (double Tonne)
    {
        return (Tonne * 5000000);
    }
    //This will convert Tonne to Centigrams
    public double convertTonnetoCentigrams (double Tonne)
    {
        return (Tonne * 100000000);
    }
    //This will convert Tonne to Grains
    public double convertTonnetoGrains (double Tonne)
    {
        return (Tonne * 15432000);
    }
    //This will convert Tonne to Grams
    public double convertTonnetoGrams (double Tonne)
    {
        return (Tonne * 1000000);
    }
    //This will convert Tonne to Kilograms
    public double convertTonnetoKilograms (double Tonne)
    {
        return (Tonne / 0.0010000);
    }
    //This will convert Tonne to Micrograms
    public double convertTonnetoMicrograms (double Tonne)
    {
        return (Tonne / 1000000000000.0);
    }
    //This will convert Tonne to Milligrams
    public double convertTonnetoMilligrams (double Tonne)
    {
        return (Tonne * 1000000000);
    }
    //This will convert Tonne to Ounce
    public double convertTonnetoOunce (double Tonne)
    {
        return (Tonne * 35274.0);
    }
    //This will convert Tonne to Pound
    public double convertTonnetoPound (double Tonne)
    {
        return (Tonne * 2204.6);
    }
    //This will convert Tonne to Troy Ounce
    public double convertTonnetoTroyOunce (double Tonne)
    {
        return (Tonne * 32151.0);
    }
    //This will convert Tonne to Troy Pound
    public double convertTonnetoTroyPound (double Tonne)
    {
        return (Tonne * 2679.2);
    }
    //This will convert Troy Ounce to Carat
    public double convertTroyOuncetoCarat (double TroyOunce)
    {
        return (TroyOunce * 155.52);
    }
    //This will convert Troy Ounce to Centigram
    public double convertTroyOuncetoCentigram (double TroyOunce) { return (TroyOunce * 3110.34768000); }
    //This will convert Troy Ounce to Grains
    public double convertTroyOuncetoGrains (double TroyOunce)
    {
        return (TroyOunce * 480.00);
    }
    //This will convert Troy Ounce to Grams
    public double convertTroyOuncetoGrams (double TroyOunce)
    {
        return (TroyOunce / 0.032151);
    }
    //This will convert Troy Ounce to Kilograms
    public double convertTroyOuncetoKilograms (double TroyOunce)
    {
        return (TroyOunce / 32.151);
    }
    //This will convert Troy Ounce to Micrograms
    public double convertTroyOuncetoMicrograms (double TroyOunce) { return (TroyOunce * 31103476.8000); }
    //This will convert Troy Ounce to Milligrams
    public double convertTroyOuncetoMilligrams (double TroyOunce) { return (TroyOunce * 31103.4768000 ); }
    //This will convert Troy Ounce to Ounce
    public double convertTroyOuncetoOunce (double TroyOunce) { return (TroyOunce * 1.0971428571429); }
    //This will convert Troy Ounce to Pound
    public double convertTroyOuncetoPound (double TroyOunce)
    {
        return (TroyOunce * 0.068571);
    }
    //This will convert Troy Ounce to Tonne
    public double convertTroyOuncetoTonne (double TroyOunce)
    {
        return (TroyOunce / 32151.0);
    }
    //This will convert Troy Ounce to Troy Pound
    public double convertTroyOuncetoTroyPound (double TroyOunce)
    {
        return (TroyOunce * 0.083333);
    }
    //This will convert Troy Pound to Carat
    public double convertTroyPoundtoCarat (double TroyPound)
    {
        return (TroyPound * 1866.208608);
    }
    //This will convert Troy Pound to Centigram
    public double convertTroyPoundtoCentigram (double TroyPound) { return (TroyPound * 37324.1721600); }
    //This will convert Troy Pound to Grains
    public double convertTroyPoundtoGrains (double TroyPound)
    {
        return (TroyPound * 5760.0);
    }
    //This will convert Troy Pound to Grams
    public double convertTroyPoundtoGrams (double TroyPound)
    {
        return (TroyPound / 0.0026792);
    }
    //This will convert Troy Pound to Kilograms
    public double convertTroyPoundtoKilograms (double TroyPound)
    {
        return (TroyPound / 2.6792);
    }
    //This will convert Troy Pound to Micrograms
    public double convertTroyPoundtoMicrograms (double TroyPound) { return (TroyPound / 373241721.6); }
    //This will convert Troy Pound to Milligrams
    public double convertTroyPoundtoMilligrams (double TroyPound) { return (TroyPound / 373241.7216); }
    //This will convert Troy Pound to Ounce
    public double convertTroyPoundtoOunce (double TroyPound)
    {
        return (TroyPound / 13.166);
    }
    //This will convert Troy Pound to Pound
    public double convertTroyPoundtoPound (double TroyPound)
    {
        return (TroyPound / 0.82286);
    }
    //This will convert Troy Pound to Tonne
    public double convertTroyPoundtoTonne (double TroyPound)
    {
        return (TroyPound / 0.82286);
    }
    //This will convert Troy Pound to Troy Ounce
    public double convertTroyPoundtoTroyOunce (double TroyPound)
    {
        return (TroyPound / 12.000);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE WEIGHT UNIT
    public List <String> getWeightUnits (String items)
    {
        List <String> list = new ArrayList<String>();
        list.add("Carat");
        list.add("Centigram");
        list.add("Grain");
        list.add("Gram");
        list.add("Kilogram");
        list.add("Microgram");
        list.add("Milligram");
        list.add("Ounce");
        list.add("Pound");
        list.add("Tonne");
        list.add("Troy Ounce");
        list.add("Troy Pound");
        if (!items.equals(""))
        {
            for (int i= 0;i<list.size();i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
    //Functions of the Speed Units
    //This will convert Centimeter/hour to Centimeter/minute
    public double convertCentimeterperhrtoCentimeterpermin(double Centimeter)
    {
        return (Centimeter * 0.01666666666667);
    }
    //This will convert Centimeter/hour to Centimeter/second
    public double convertCentimeterperhrtoCentimeterpers(double Centimeter)
    {
        return (Centimeter * 0.0002777777777778);
    }
    //This will convert Centimeter/hour to Kilometer/hour
    public double convertCentimeterperhrtoKilometerperhr(double Centimeter)
    {
        return (Centimeter * 0.00001);
    }
    //This will convert Centimeter/hour to Kilometer/minute
    public double convertCentimeterperhrtoKilometerpermin(double Centimeter)
    {
        return (Centimeter * 0.000000167);
    }
    //This will convert Centimeter/hour to Kilometer/second
    public double convertCentimeterperhrtoKilometerpers (double Centimeter)
    {
        return (Centimeter * 0.0000000027777777777778);
    }
    //This will convert Centimeter/hour to Meter/hour
    public double convertCentimeterperhrtoMeterperhr (double Centimeter)
    {
        return (Centimeter * 0.01);
    }
    //This will convert Centimeter/hour to Meter/minute
    public double convertCentimeterperhrtoMeterpermin(double Centimeter)
    {
        return (Centimeter * 0.0001666666666667);
    }
    //This will convert Centimeter/hour to Meter/second
    public double convertCentimeterperhrtoMeterpers (double Centimeter)
    {
        return (Centimeter * 0.000002777777777778);
    }
    //This will convert Centimeter/hour to Mile/hour
    public double convertCentimeterperhrtoMileperhr (double Centimeter)
    {
        return (Centimeter / 160934.39998713);
    }
    //This will convert Centimeter/hour to Mile/minute
    public double convertCentimeterperhrtoMilepermin(double Centimeter)
    {
        return (Centimeter * 0.000000104);
    }
    //This will convert Centimeter/hour to Mile/second
    public double convertCentimeterperhrtoMilepers (double Centimeter)
    {
        return (Centimeter / 579363839.95365 );
    }
    //This will convert Centimeter/hour to Foot/hour
    public double convertCentimeterperhrtoFootperhr (double Centimeter)
    {
        return (Centimeter / 30.48);
    }
    //This will convert Centimeter/hour to Foot/minute
    public double convertCentimeterperhrtoFootpermin(double Centimeter)
    {
        return (Centimeter * 0.0005468066491688);
    }
    //This will convert Centimeter/hour to Foot/second
    public double convertCentimeterperhrtoFootpers (double Centimeter)
    {
        return (Centimeter /  91.43999999);
    }
    //This will convert Centimeter/hour to Yard/hour
    public double convertCentimeterperhrtoYardperhr (double Centimeter)
    {
        return (Centimeter * 118.11023622);
    }
    //This will convert Centimeter/hour to Yard/minute
    public double convertCentimeterperhrtoYardpermin(double Centimeter)
    {
        return (Centimeter * 0.0005468066491688);
    }
    //This will convert Centimeter/hour to Yard/second
    public double convertCentimeterperhrtoYardpers (double Centimeter)
    {
        return (Centimeter / 329183.99997367 );
    }
    //This will convert Centimeter/minute to Centimeter/hour
    public double convertCentimeterpermintoCenitmeterperhr (double Centimeter)
    {
        return (Centimeter * 60);
    }
    //This will convert Centimeter/minute to Centimeter/second
    public double convertCentimeterpermintoCentimeterpers(double Centimeter)
    {
        return (Centimeter * 0.01666666666667);
    }
    //This will convert Centimeter/minute to Kilometer/hour
    public double convertCentimeterpermintoKilometerperhr (double Centimeter)
    {
        return (Centimeter * 0.0006);
    }
    //This will convert Centimeter/minute to Kilometer/minute
    public double convertCentimeterpermintoKilometerpermin (double Centimeter)
    {
        return (Centimeter * 0.00001);
    }
    //This will convert Centimeter/minute to Kilometer/second
    public double convertCentimeterpermintoKilometerpers(double Centimeter)
    {
        return (Centimeter * 0.000000167);
    }
    //This will convert Centimeter/minute to Meter/hour
    public double convertCentimeterpermintoMeterperhr (double Centimeter)
    {
        return (Centimeter * 0.6);
    }
    //This will convert Centimeter/minute to Meter/minute
    public double convertCentimeterpermintoMeterpermin (double Centimeter)
    {
        return (Centimeter * 0.01);
    }
    //This will convert Centimeter/minute to Meter/second
    public double convertCentimeterpermintoMeterpers(double Centimeter)
    {
        return (Centimeter * 0.0001666666666667);
    }
    //This will convert Centimeter/minute to Mile/hour
    public double convertCentimeterpermintoMileperhr (double Centimeter)
    {
        return (Centimeter * 0.0003728227153424);
    }
    //This will convert Centimeter/minute to Mile/minute
    public double convertCentimeterpermintoMilepermin (double Centimeter)
    {
        return (Centimeter * 0.000006213711922373);
    }
    //This will convert Centimeter/minute to Mile/second
    public double convertCentimeterpermintoMilepers(double Centimeter)
    {
        return (Centimeter * 0.000000104);
    }
    //This will convert Centimeter/minute to Foot/hour
    public double convertCentimeterpermintoFootperhr (double Centimeter)
    {
        return (Centimeter * 1.968503937008);
    }
    //This will convert Centimeter/minute to Foot/minute
    public double convertCentimeterpermintoFootpermin (double Centimeter)
    {
        return (Centimeter * 0.03280839895013);
    }
    //This will convert Centimeter/minute to Foot/second
    public double convertCentimeterpermintoFootpers(double Centimeter)
    {
        return (Centimeter * 0.0005468066491689);
    }
    //This will convert Centimeter/minute to Yard/hour
    public double convertCentimeterpermintoYardperhr (double Centimeter)
    {
        return (Centimeter * 0.6561679790026);
    }
    //This will convert Centimeter/minute to Yard/minute
    public double convertCentimeterpermintoYardpermin (double Centimeter)
    {
        return (Centimeter * 0.01093613298338);
    }
    //This will convert Centimeter/minute to Yard/second
    public double convertCentimeterpermintoYardpers(double Centimeter)
    {
        return (Centimeter * 0.0001822688830563);
    }
    //This will convert Centimeter/second to Centimeter/hour
    public double convertCentimeterperStoCentimeterperhr(double Centimeter)
    {
        return (Centimeter * 3600);
    }
    //This will convert Centimeter/second to Centimeter/minute
    public double convertCentimeterperStoCentimeterpermin(double Centimeter)
    {
        return (Centimeter * 60);
    }
    //This will convert Centimeter/second to Kilometer/hour
    public double convertCentimeterperStokilometerperhr(double Centimeter)
    {
        return (Centimeter / 27.77777778);
    }
    //This will convert Centimeter/second to Kilometer/minute
    public double convertCentimeterperStoKilometerpermin(double Centimeter)
    {
        return (Centimeter * 0.0006);
    }
    //This will convert Centimeter/second to Kilometer/second
    public double convertCentimeterperStoKilometerpers(double Centimeter)
    {
        return (Centimeter / 100000);
    }
    //This will convert Centimeter/second to Meter/hour
    public double convertCentimeterperStoMeterperhr(double Centimeter)
    {
        return (Centimeter / 36);
    }
    //This will convert Centimeter/second to Meter/minute
    public double convertCentimeterperStoMeterpermin(double Centimeter)
    {
        return (Centimeter * 0.6);
    }
    //This will convert Centimeter/second to Meter/second
    public double convertCentimeterperStoMeterpers(double Centimeter)
    {
        return (Centimeter / 100);
    }
    //This will convert Centimeter/second to Mile/hour
    public double convertCentimeterperStoMileperhr(double Centimeter)
    {
        return (Centimeter / 44.704);
    }
    //This will convert Centimeter/second to Mile/minute
    public double convertCentimeterperStoMilepermin(double Centimeter)
    {
        return (Centimeter * 0.0003728227153424);
    }
    //This will convert Centimeter/second to Mile/second
    public double convertCentimeterperStoMilepers(double Centimeter)
    {
        return (Centimeter / 160934.4);
    }
    //This will convert Centimeter/second to Foot/hour
    public double convertCentimeterperStoFootperhr(double Centimeter)
    {
        return (Centimeter * 118.11023622);
    }
    //This will convert Centimeter/second to Foot/minute
    public double convertCentimeterperStoFootpermin(double Centimeter)
    {
        return (Centimeter * 1.968503937008);
    }
    //This will convert Centimeter/second to Foot/second
    public double convertCentimeterperStoFootpers(double Centimeter)
    {
        return (Centimeter / 30.48);
    }
    //This will convert Centimeter/second to Yard/hour
    public double convertCentimeterperStoYardperhr(double Centimeter)
    {
        return (Centimeter * 39.37007874);
    }
    //This will convert Centimeter/second to Yard/minute
    public double convertCentimeterperStoYardpermin(double Centimeter)
    {
        return (Centimeter * 0.6561679790026);
    }
    //This will convert Centimeter/second to Yard/second
    public double convertCentimeterperStoYardpers(double Centimeter)
    {
        return (Centimeter / 30.48);
    }
    //This will convert Kilometer/hour to Centimeter/hour
    public double convertKilometerperHRtoCentimeterperhr(double Kilometer)
    {
        return (Kilometer * 100000);
    }
    //This will convert Kilometer/hour to Centimeter/minute
    public double convertKilometerperHRtoCentimeterpermin(double Kilometer)
    {
        return (Kilometer * 1666.666666667);
    }
    //This will convert Kilometer/hour to Centimeter/second
    public double convertKilometerperHRtoCentimeterpers(double Kilometer)
    {
        return (Kilometer * 27.77777778);
    }
    //This will convert Kilometer/hour to Kilometer/minute
    public double convertKilometerperHRtoKilometerpermin(double Kilometer)
    {
        return (Kilometer * 0.01666666666667);
    }
    //This will convert Kilometer/hour to Kilometer/second
    public double convertKilometerperHRtoKilometerpers(double Kilometer)
    {
        return (Kilometer / 3600);
    }
    //This will convert Kilometer/hour to Meter/hour
    public double convertKilometerperHRtoMeterperhr(double Kilometer)
    {
        return (Kilometer * 1000);
    }
    //This will convert Kilometer/hour to Meter/minute
    public double convertKilometerperHRtoMeterpermin(double Kilometer)
    {
        return (Kilometer * 16.66666666667);
    }
    //This will convert Kilometer/hour to Meter/second
    public double convertKilometerperHRtoMeterpers(double Kilometer)
    {
        return (Kilometer / 3.6 );
    }
    //This will convert Kilometer/hour to Mile/hour
    public double convertKilometerperHRtoMileperhr(double Kilometer)
    {
        return (Kilometer / 1.609344);
    }
    //This will convert Kilometer/hour to Mile/minute
    public double convertKilometerperHRtoMilepermin(double Kilometer)
    {
        return (Kilometer * 0.01035618653729);
    }
    //This will convert Kilometer/hour to Mile/second
    public double convertKilometerperHRtoMilepers(double Kilometer)
    {
        return (Kilometer / 5793.63839954);
    }
    //This will convert Kilometer/hour to Foot/hour
    public double convertKilometerperHRtoFootperhr(double Kilometer)
    {
        return (Kilometer * 3280.83989528);
    }
    //This will convert Kilometer/hour to Foot/minute
    public double convertKilometerperHRtoFootpermin(double Kilometer)
    {
        return (Kilometer * 54.68066491689);
    }
    //This will convert Kilometer/hour to Foot/second
    public double convertKilometerperHRtoFootpers(double Kilometer)
    {
        return (Kilometer / 1.09728);
    }
    //This will convert Kilometer/hour to Yard/hour
    public double convertKilometerperHRtoYardperhr(double Kilometer)
    {
        return (Kilometer * 1093.61329843);
    }
    //This will convert Kilometer/hour to Yard/minute
    public double convertKilometerperHRtoYardpermin(double Kilometer)
    {
        return (Kilometer * 18.22688830563);
    }
    //This will convert Kilometer/hour to Yard/second
    public double convertKilometerperHRtoYardpers(double Kilometer)
    {
        return (Kilometer / 3.29184);
    }

    //This will convert Kilometer/minute to Centimeter/hour
    public double convertKilometerperMintoCentimeterperhr(double Kilometer)
    {
        return (Kilometer * 6000000);
    }
    //This will convert Kilometer/minute to Centimeter/minute
    public double convertKilometerperMintoCentimeterpermin(double Kilometer)
    {
        return (Kilometer * 100000);
    }
    //This will convert Kilometer/minute to Centimeter/second
    public double convertKilometerperMintoCentimeterpers(double Kilometer)
    {
        return (Kilometer / 1666.666666667);
    }
    //This will convert Kilometer/minute to Kilometer/hour
    public double convertKilometerperMintoKilometerperhr(double Kilometer)
    {
        return (Kilometer * 60);
    }
    //This will convert Kilometer/minute to Kilometer/second
    public double convertKilometerperMintoKilometerpers(double Kilometer)
    {
        return (Kilometer / 0.01666666666667);
    }
    //This will convert Kilometer/minute to Meter/hour
    public double convertKilometerperMintoMeterperhr(double Kilometer)
    {
        return (Kilometer * 60000);
    }
    //This will convert Kilometer/minute to Meter/minute
    public double convertKilometerperMintoMeterpermin(double Kilometer)
    {
        return (Kilometer * 1000);
    }
    //This will convert Kilometer/minute to Meter/second
    public double convertKilometerperMintoMeterpers(double Kilometer)
    {
        return (Kilometer / 16.66666666667);
    }
    //This will convert Kilometer/minute to Mile/hour
    public double convertKilometerperMintoMileperhr(double Kilometer)
    {
        return (Kilometer * 37.28227153424);
    }
    //This will convert Kilometer/minute to Mile/minute
    public double convertKilometerperMintoMilepermin(double Kilometer)
    {
        return (Kilometer * 0.6213711922373);
    }
    //This will convert Kilometer/minute to Mile/second
    public double convertKilometerperMintoMilepers(double Kilometer)
    {
        return (Kilometer / 0.01035618653729);
    }
    //This will convert Kilometer/minute to Foot/hour
    public double convertKilometerperMintoFootperhr(double Kilometer)
    {
        return (Kilometer * 196850.3937008);
    }
    //This will convert Kilometer/minute to Foot/minute
    public double convertKilometerperMintoFootpermin(double Kilometer)
    {
        return (Kilometer * 3280.839895013);
    }
    //This will convert Kilometer/minute to Foot/second
    public double convertKilometerperMintoFootpers(double Kilometer)
    {
        return (Kilometer / 54.68066491689);
    }
    //This will convert Kilometer/minute to Yard/hour
    public double convertKilometerperMintoYardperhr(double Kilometer)
    {
        return (Kilometer * 65616.79790026);
    }
    //This will convert Kilometer/minute to Yard/minute
    public double convertKilometerperMintoYardpermin(double Kilometer)
    {
        return (Kilometer * 1093.613298338);
    }
    //This will convert Kilometer/minute to Yard/second
    public double convertKilometerperMintoYardpers(double Kilometer)
    {
        return (Kilometer / 18.22688830563);
    }
    //This will convert Kilometer/second to Centimeter/hour
    public double convertKilometerperStoCentimeterperhr(double Kilometer)
    {
        return (Kilometer * 359999999.9712);
    }
    //This will convert Kilometer/second to Centimeter/minute
    public double convertKilometerperStoCentimeterpermin(double Kilometer)
    {
        return (Kilometer * 6000000);
    }
    //This will convert Kilometer/second to Centimeter/second
    public double convertKilometerperStoCentimeterpers(double Kilometer)
    {
        return (Kilometer * 100000);
    }
    //This will convert Kilometer/second to Kilometer/hour
    public double convertKilometerperStoKilometerperhr(double Kilometer)
    {
        return (Kilometer * 3600);
    }
    //This will convert Kilometer/second to Kilometer/minute
    public double convertKilometerperStoKilometerpermin(double Kilometer)
    {
        return (Kilometer * 60);
    }
    //This will convert Kilometer/second to Meter/hour
    public double convertKilometerperStoMeterperhr(double Kilometer)
    {
        return (Kilometer * 3600000);
    }
    //This will convert Kilometer/second to Meter/minute
    public double convertKilometerperStoMeterpermin(double Kilometer)
    {
        return (Kilometer * 60000);
    }
    //This will convert Kilometer/second to Meter/second
    public double convertKilometerperStoMeterpers(double Kilometer)
    {
        return (Kilometer * 1000);
    }
    //This will convert Kilometer/second to Mile/hour
    public double convertKilometerperStoMileperhr(double Kilometer)
    {
        return (Kilometer * 2236.936292);
    }
    //This will convert Kilometer/second to Mile/minute
    public double convertKilometerperStoMilepermin(double Kilometer)
    {
        return (Kilometer * 37.28227153424);
    }
    //This will convert Kilometer/second to Mile/second
    public double convertKilometerperStoMilepers(double Kilometer)
    {
        return (Kilometer / 1.609344);
    }
    //This will convert Kilometer/second to Foot/hour
    public double convertKilometerperStoFootperhr(double Kilometer)
    {
        return (Kilometer * 11811023.62 );
    }
    //This will convert Kilometer/second to Foot/minute
    public double convertKilometerperStoFootpermin(double Kilometer)
    {
        return (Kilometer * 196850.3937008);
    }
    //This will convert Kilometer/second to Foot/second
    public double convertKilometerperStoFootpers(double Kilometer)
    {
        return (Kilometer / 3280.839895);
    }
    //This will convert Kilometer/second to Yard/hour
    public double convertKilometerperStoYardperhr(double Kilometer)
    {
        return (Kilometer * 3937007.874);
    }
    //This will convert Kilometer/second to Yards/minute
    public double convertKilometerperStoYardpermin(double Kilometer)
    {
        return (Kilometer * 65616.79790026);
    }
    //This will convert Kilometer/second to Yards/second
    public double convertKilometerperStoYardpers(double Kilometer)
    {
        return (Kilometer * 1093.613298);
    }
    //This will convert Meter/hour to Centimeter/hour
    public double convertMeterperHRtoCentimeterperhr(double Meter)
    {
        return (Meter * 100);
    }
    //This will convert Meter/hour to Centimeter/minute
    public double convertMeterperHRtoCentimeterpermin(double Meter)
    {
        return (Meter * 1.666666666667);
    }
    //This will convert Meter/hour to Centimeter/second
    public double convertMeterperHRtoCentimeterpers(double Meter)
    {
        return (Meter / 36);
    }
    //This will convert Meter/hour to Kilometer/hour
    public double convertMeterperHRtoKilometerperhr(double Meter)
    {
        return (Meter / 1000);
    }
    //This will convert Meter/hour to Kilometer/minute
    public double convertMeterperHRtoKilometerpermin(double Meter)
    {
        return (Meter * 0.00001666666666667);
    }
    //This will convert Meter/hour to Kilometer/second
    public double convertMeterperHRtoKilometerpers(double Meter)
    {
        return (Meter / 3599999.999712);
    }
    //This will convert Meter/hour to Meter/minute
    public double convertMeterperHRtoMeterpermin(double Meter)
    {
        return (Meter * 0.01666666666667);
    }
    //This will convert Meter/hour to Meter/second
    public double convertMeterperHRtoMeterpers(double Meter)
    {
        return (Meter / 3600);
    }
    //This will convert Meter/hour to Miles/hour
    public double convertMeterperHRtoMileperhr(double Meter)
    {
        return (Meter / 1609.34399987);
    }
    //This will convert Meter/hour to Miles/minute
    public double convertMeterperHRtoMilepermin(double Meter)
    {
        return (Meter * 0.00001035618653729);
    }
    //This will convert Meter/hour to Miles/second
    public double convertMeterperHRtoMilepers(double Meter)
    {
        return (Meter / 5793638.3995365);
    }
    //This will convert Meter/hour to Foot/hour
    public double convertMeterperHRtoFootperhr(double Meter)
    {
        return (Meter * 3.280839895 );
    }
    //This will convert Meter/hour to Foot/minute
    public double convertMeterperHRtoFootpermin(double Meter)
    {
        return (Meter * 0.05468066491689);
    }
    //This will convert Meter/hour to Foot/second
    public double convertMeterperHRtoFootpers(double Meter)
    {
        return (Meter / 1097.27999991 );
    }
    //This will convert Meter/hour to Yards/hour
    public double convertMeterperHRtoYardperhr(double Meter)
    {
        return (Meter * 1.093613298 );
    }
    //This will convert Meter/hour to Yard/minute
    public double convertMeterperHRtoYardpermin(double Meter)
    {
        return (Meter * 0.01822688830563);
    }
    //This will convert Meter/hour to Yard/second
    public double convertMeterperHRtoYardpers(double Meter)
    {
        return (Meter / 3291.83999974 );
    }
    //This will convert Meter/minute to Centimeter/hour
    public double convertMeterperMintoCentimeterperhr(double Meter)
    {
        return (Meter * 6000);
    }
    //This will convert Meter/minute to Centimeter/minute
    public double convertMeterperMintoCentimeterpermin(double Meter)
    {
        return (Meter * 100);
    }
    //This will convert Meter/minute to Centimeter/second
    public double convertMeterperMintoCentimeterpers(double Meter)
    {
        return (Meter / 1.666666666667);
    }
    //This will convert Meter/minute to Kilometer/hour
    public double convertMeterperMintoKilometerperhr(double Meter)
    {
        return (Meter * 0.06);
    }
    //This will convert Meter/minute to Kilometer/minute
    public double convertMeterperMintoKilometerpermin(double Meter)
    {
        return (Meter * 0.001);
    }
    //This will convert Meter/minute to Kilometer/second
    public double convertMeterperMintoKilometerpers(double Meter)
    {
        return (Meter / 0.00001666666666667);
    }
    //This will convert Meter/minute to meter/hour
    public double convertMeterperMintoMeterperhr(double Meter)
    {
        return (Meter * 60);
    }
    //This will convert Meter/minute to Meter/second
    public double convertMeterperMintoMeterpers(double Meter)
    {
        return (Meter / 0.01666666666667);
    }
    //This will convert Meter/minute to Miles/hour
    public double convertMeterperMintoMileperhr(double Meter)
    {
        return (Meter * 0.03728227153424);
    }
    //This will convert Meter/minute to Mile/minute
    public double convertMeterperMintoMilepermin(double Meter)
    {
        return (Meter * 0.0006213711922373);
    }
    //This will convert Meter/minute to Mile/second
    public double convertMeterperMintoMilepers(double Meter)
    {
        return (Meter / 0.00001035618653729);
    }
    //This will convert Meter/minute to Foot/hour
    public double convertMeterperMintoFootperhr(double Meter)
    {
        return (Meter * 196.8503937008);
    }
    //This will convert Meter/minute to Foot/minute
    public double convertMeterperMintoFootpermin(double Meter)
    {
        return (Meter * 3.280839895013);
    }
    //This will convert Meter/minute to Foot/second
    public double convertMeterperMintoFootpers(double Meter)
    {
        return (Meter / 0.05468066491689);
    }
    //This will convert Meter/minute to Yards/hour
    public double convertMeterperMintoYardperhr(double Meter)
    {
        return (Meter * 65.61679790026);
    }
    //This will convert Meter/minute to Yards/minute
    public double convertMeterperMintoYardpermin(double Meter)
    {
        return (Meter * 1.093613298338);
    }
    //This will convert Meter/minute to Yards/second
    public double convertMeterperMintoYardpers(double Meter)
    {
        return (Meter / 0.01822688830563);
    }
    //This will convert Meter/second to Centimeter/hour
    public double convertMeterperStoCentimeterperhr(double Meter)
    {
        return (Meter * 360000);
    }
    //This will convert Meter/second to Centimeter/minute
    public double convertMeterperStoCentimeterpermin(double Meter)
    {
        return (Meter * 6000);
    }
    //This will convert Meter/second to Centimeter/second
    public double convertMeterperStoCentimeterpers(double Meter)
    {
        return (Meter * 100);
    }
    //This will convert Meter/second to Kilometer/hour
    public double convertMeterperStoKilometerperhr(double Meter)
    {
        return (Meter * 3.6);
    }
    //This will convert Meter/second to Kilometer/minute
    public double convertMeterperStoKilometerpermin(double Meter)
    {
        return (Meter * 0.06);
    }
    //This will convert Meter/second to Kilometer/second
    public double convertMeterperStoKilometerpers(double Meter)
    {
        return (Meter /  1000);
    }
    //This will convert Meter/second to Meter/hour
    public double convertMeterperStoMeterperhr(double Meter)
    {
        return (Meter * 3600);
    }
    //This will convert Meter/second to Meter/minute
    public double convertMeterperStoMeterpermin(double Meter)
    {
        return (Meter * 60);
    }
    //This will convert Meter/second to Miles/hour
    public double convertMeterperStoMileperhr(double Meter)
    {
        return (Meter * 2.236936292);
    }
    //This will convert Meter/second to Miles/minute
    public double convertMeterperStoMilepermin(double Meter)
    {
        return (Meter * 0.03728227153424);
    }
    //This will convert Meter/second to Miles/second
    public double convertMeterperStoMilepers(double Meter)
    {
        return (Meter /  1609.344);
    }
    //This will convert Meter/second to Foot/hour
    public double convertMeterperStoFootperhr(double Meter)
    {
        return (Meter * 11811.02362);
    }
    //This will convert Meter/second to Foot/minute
    public double convertMeterperStoFootpermin(double Meter)
    {
        return (Meter * 196.8503937008);
    }
    //This will convert Meter/second to Foot/second
    public double convertMeterperStoFootpers(double Meter)
    {
        return (Meter * 0.03280839895);
    }
    //This will convert Meter/second to Yards/hour
    public double convertMeterperStoYardperhr(double Meter)
    {
        return (Meter * 39.37007874);
    }
    //This will convert Meter/second to Yards/minute
    public double convertMeterperStoYardpermin(double Meter)
    {
        return (Meter * 65.61679790026);
    }
    //This will convert Meter/second to Yards/second
    public double convertMeterperStoYardpers(double Meter)
    {
        return (Meter * 1.0936133);
    }
    //This will convert Mile/hour to Centimeter/hour
    public double convertMileperHRtoCentimeterperhr(double Mile)
    {
        return (Mile * 39.37007874);
    }
    //This will convert Mile/hour to Centimeter/minute
    public double convertMileperHRtoCentimeterpermin(double Mile)
    {
        return (Mile * 65.61679790026);
    }
    //This will convert Mile/hour to Centimeter/second
    public double convertMileperHRtoCentimeterpers(double Mile)
    {
        return (Mile * 1.0936133);
    }
    //This will convert Mile/hour to Kilometer/hour
    public double convertMileperHRtoKilometerperhr(double Mile)
    {
        return (Mile * 1.609344);
    }
    //This will convert Mile/hour to Kilometer/minute
    public double convertMileperHRtoKilometerpermin(double Mile)
    {
        return (Mile * 2682.24);
    }
    //This will convert Mile/hour to Kilometer/second
    public double convertMileperHRtoKilometerpers(double Mile)
    {
        return (Mile / 2236.93629205);
    }
    //This will convert Mile/hour to Meter/hour
    public double convertMileperHRtoMeterperhr(double Mile)
    {
        return (Mile * 1609.34399987);
    }
    //This will convert Mile/hour to Meter/minute
    public double convertMileperHRtoMeterpermin(double Mile)
    {
        return (Mile * 26.8224);
    }
    //This will convert Mile/hour to Meter/second
    public double convertMileperHrtoMeterpers(double Mile)
    {
        return (Mile / 2.23693629);
    }
    //This will convert Mile/hour to Mile/minute
    public double convertMileperHRtoMilepermin(double Mile)
    {
        return (Mile * 0.01666666666667);
    }
    //This will convert Mile/hour to Mile/second
    public double convertMileperHRtoMilepers(double Mile)
    {
        return (Mile / 3600);
    }
    //This will convert Mile/hour to Foot/hour
    public double convertMileperHRtoFootperhr(double Mile)
    {
        return (Mile * 5280);
    }
    //This will convert Mile/hour to Foot/minute
    public double convertMileperHRtoFootpermin(double Mile)
    {
        return (Mile * 88);
    }
    //This will convert Mile/hour to Foot/second
    public double convertMileperHRtoFootpers(double Mile)
    {
        return (Mile * 1.466666667);
    }
    //This will convert Mile/hour to Yards/hour
    public double convertMileperHRtoYardperhr(double Mile)
    {
        return (Mile * 1760);
    }
    //This will convert Mile/hour to Yards/minute
    public double convertMileperHRtoYardpermin(double Mile)
    {
        return (Mile * 29.33333333333);
    }
    //This will convert Mile/hour to Yards/second
    public double convertMileperHRtoYardpers(double Mile)
    {
        return (Mile / 2.04545455);
    }
    //This will convert Mile/minute to Centimeter/hour
    public double convertMileperMintoCentimeterperhr(double Mile)
    {
        return (Mile * 9656063.999999);
    }
    //This will convert Mile/minute to Centimeter/minute
    public double convertMileperMintoCentimeterpermin(double Mile)
    {
        return (Mile * 160934.4);
    }
    //This will convert Mile/minute to Centimeter/second
    public double convertMileperMintoCentimeterpers(double Mile)
    {
        return (Mile * 2682.24);
    }
    //This will convert Mile/minute to Kilometer/hour
    public double convertMileperMintoKilometerperhr(double Mile)
    {
        return (Mile * 96.56064);
    }
    //This will convert Mile/minute to Kilometer/minute
    public double convertMileperMintoKilometerpermin(double Mile)
    {
        return (Mile * 1.609344);
    }
    //This will convert Mile/minute to Kilometer/second
    public double convertMileperMintoKilometerpers(double Mile)
    {
        return (Mile * 0.0268224);
    }
    //This will convert Mile/minute to Meter/hour
    public double convertMileperMintoMeterperhr(double Mile)
    {
        return (Mile * 96560.64);
    }
    //This will convert Mile/minute to Meter/minute
    public double convertMileperMintoMeterpermin(double Mile)
    {
        return (Mile * 1609.344);
    }
    //This will convert Mile/minute to Meter/second
    public double convertMileperMintoMeterpers(double Mile)
    {
        return (Mile * 26.8224);
    }
    //This will convert Mile/minute to Mile/hour
    public double convertMileperMintoMileperhr(double Mile)
    {
        return (Mile * 60);
    }
    //This will convert Mile/minute to Mile/second
    public double convertMileperMintoMilepers(double Mile)
    {
        return (Mile * 0.01666666666667);
    }
    //This will convert Mile/minute to Foot/hour
    public double convertMileperMintoFootperhr(double Mile)
    {
        return (Mile * 316800);
    }
    //This will convert Mile/minute to Foot/minute
    public double convertMileperMintoFootpermin(double Mile)
    {
        return (Mile * 5280);
    }
    //This will convert Mile/minute to Foot/second
    public double convertMileperMintoFootpers(double Mile)
    {
        return (Mile * 88);
    }
    //This will convert Mile/minute to Yard/hour
    public double convertMileperMintoYardperhr(double Mile)
    {
        return (Mile * 105600);
    }
    //This will convert Mile/minute to Yard/minute
    public double convertMileperMintoYardpermin(double Mile)
    {
        return (Mile * 1760);
    }
    //This will convert Mile/minute to Yard/second
    public double convertMileperMintoYardpers(double Mile)
    {
        return (Mile * 29.33333333333);
    }
    //This will convert Mile/second to Centimeter/hour
    public double convertMileperStoCentimeterperhr(double Mile)
    {
        return (Mile * 579363839.95365);
    }
    //This will convert Mile/second to Centimeter/minute
    public double convertMileperStoCentimeterpermin(double Mile)
    {
        return (Mile * 9656063.999999);
    }
    //This will convert Mile/second to Centimeter/second
    public double convertMileperStoCentimeterpers(double Mile)
    {
        return (Mile * 160934.4);
    }
    //This will convert Mile/second to Kilometer/hour
    public double convertMileperStoKilometerperhr(double Mile)
    {
        return (Mile * 5793.63839954);
    }
    //This will convert Mile/second to Kilometer/minute
    public double convertMileperStoKilometerpermin(double Mile)
    {
        return (Mile * 96.56064);
    }
    //This will convert Mile/second to Kilometer/second
    public double convertMileperStoKilometerpers(double Mile)
    {
        return (Mile * 1.609344);
    }
    //This will convert Mile/second to Meter/hour
    public double convertMileperStoMeterperhr(double Mile)
    {
        return (Mile * 5793638.3995365);
    }
    //This will convert Mile/second to Meter/minute
    public double convertMileperStoMeterpermin(double Mile)
    {
        return (Mile * 96560.64);
    }
    //This will convert Mile/second to Meter/second
    public double convertMileperStoMeterpers(double Mile)
    {
        return (Mile * 1609.344);
    }
    //This will convert Mile/second to Mile/hour
    public double convertMileperStoMileperhr(double Mile)
    {
        return (Mile * 3600);
    }
    //This will convert Mile/second to Mile/minute
    public double convertMileperStoMilepermin(double Mile)
    {
        return (Mile * 60);
    }
    //This will convert Mile/second to Foot/hour
    public double convertMileperStoFootperhr(double Mile)
    {
        return (Mile * 19008000);
    }
    //This will convert Mile/second to Foot/minute
    public double convertMileperStoFootpermin(double Mile)
    {
        return (Mile * 316800);
    }
    //This will convert Mile/second to Foot/second
    public double convertMileperStoFootpers(double Mile)
    {
        return (Mile * 5280);
    }
    //This will convert Mile/second to Yard/hour
    public double convertMileperStoYardperhr(double Mile)
    {
        return (Mile * 6336000);
    }
    //This will convert Mile/second to Yard/minute
    public double convertMileperStoYardpermin(double Mile)
    {
        return (Mile * 105600);
    }
    //This will convert Mile/second to Yard/second
    public double convertMileperStoYardpers(double Mile)
    {
        return (Mile * 1760);
    }
    //This will convert Foot/hour to Centimeter/hour
    public double convertFootperHRtoCentimeterperhr(double Foot)
    {
        return (Foot * 30.48);
    }
    //This will convert Foot/hour to Centimeter/minute
    public double convertFootperHRtoCentimeterpermin(double Foot)
    {
        return (Foot * 0.508);
    }
    //This will convert Foot/hour to Centimeter/Foot
    public double convertFootperHRtoCentimeterpers(double Foot)
    {
        return (Foot / 118.11023622);
    }
    //This will convert Foot/hour to Kilometer/hour
    public double convertFootperHRtoKilometerperhr(double Foot)
    {
        return (Foot / 3280.83989528);
    }
    //This will convert Foot/hour to Kilometer/minute
    public double convertFootperHRtoKilometerpermin(double Foot)
    {
        return (Foot * 0.00000508);
    }
    //This will convert Foot/hour to Kilometer/second
    public double convertFootperHRtoKilometerpers(double Foot)
    {
        return (Foot / 11811023.622047);
    }
    //This will convert Foot/hour to Meter/hour
    public double convertFootperHRtoMeterperhr(double Foot)
    {
        return (Foot / 3.2808);
    }
    //This will convert Foot/hour to Meter/minute
    public double convertFootperHRtoMeterpermin(double Foot)
    {
        return (Foot * 0.00508);
    }
    //This will convert Foot/hour to Meter/second
    public double convertFootperHRtoMeterpers(double Foot)
    {
        return (Foot / 11811.02362205);
    }
    //This will convert Foot/hour to Mile/hour
    public double convertFootperHRtoMileperhr(double Foot)
    {
        return (Foot / 5280);
    }
    //This will convert Foot/hour to Mile/minute
    public double convertFootperHRtoMilepermin(double Foot)
    {
        return (Foot * 0.000003156565656566);
    }
    //This will convert Foot/hour to Mile/second
    public double convertFootperHRtoMilepers(double Foot)
    {
        return (Foot / 19008000);
    }
    //This will convert Foot/hour to Foot/minute
    public double convertFootperHRtoFootpermin(double Foot)
    {
        return (Foot * 0.01666666666667);
    }
    //This will convert Foot/hour to Foot/second
    public double convertFootperHRtoFootpers(double Foot)
    {
        return (Foot / 3600);
    }
    //This will convert Foot/hour to Yard/hour
    public double convertFootperHRtoYardperhr(double Foot)
    {
        return (Foot * 0.3333333333);
    }
    //This will convert Foot/hour to Yard/minute
    public double convertFootperHRtoYardpermin(double Foot)
    {
        return (Foot * 0.005555555555556);
    }
    //This will convert Foot/hour to Yard/second
    public double convertFootperHRtoYardpers(double Foot)
    {
        return (Foot * 0.00009259259259259);
    }
    //This will convert Foot/minute to Centimeter/hour
    public double convertFootperMintoCentimeterperhr(double Foot)
    {
        return (Foot * 1828.8);
    }
    //This will convert Foot/minute to Centimeter/minute
    public double convertFootperMintoCentimeterpermin(double Foot)
    {
        return (Foot * 30.48);
    }
    //This will convert Foot/minute to Centimeter/second
    public double convertFootperMintoCentimeterpers(double Foot)
    {
        return (Foot * 0.508);
    }
    //This will convert Foot/minute to Kilometer/hour
    public double convertFootperMintoKilometerperhr(double Foot)
    {
        return (Foot * 0.018288);
    }
    //This will convert Foot/minute to Kilometer/minute
    public double convertFootperMintoKilometerpermin(double Foot)
    {
        return (Foot * 0.0003048);
    }
    //This will convert Foot/minute to Kilometer/second
    public double convertFootperMintoKilometerpers(double Foot)
    {
        return (Foot * 0.00000508);
    }
    //This will convert Foot/minute to Meter/hour
    public double convertFootperMintoMeterperhr(double Foot)
    {
        return (Foot * 18.288);
    }
    //This will convert Foot/minute to Meter/minute
    public double convertFootperMintoMeterpermin(double Foot)
    {
        return (Foot * 0.3048);
    }
    //This will convert Foot/minute to meter/second
    public double convertFootperMintoMeterpers(double Foot)
    {
        return (Foot * 0.00508);
    }
    //This will convert Foot/minute to Mile/hour
    public double convertFootperMintoMileperhr(double Foot)
    {
        return (Foot * 0.01136363636364);
    }
    //This will convert Foot/minute to Mile/minute
    public double convertFootperMintoMilepermin(double Foot)
    {
        return (Foot * 0.0001893939393939);
    }
    //This will convert Foot/minute to Mile/second
    public double convertFootperMintoMilepers(double Foot)
    {
        return (Foot * 0.000003156565656565);
    }
    //This will convert Foot/minute to Foot/hour
    public double convertFootperMintoFootperhr(double Foot)
    {
        return (Foot * 59.99999999999);
    }
    //This will convert Foot/minute to Foot/second
    public double convertFootperMintoFootpers(double Foot)
    {
        return (Foot * 0.01666666666666);
    }
    //This will convert Foot/minute to Yard/hour
    public double convertFootperMintoYardperhr(double Foot)
    {
        return (Foot * 19.99999999999);
    }
    //This will convert Foot/minute to Yard/minute
    public double convertFootperMintoYardpermin(double Foot)
    {
        return (Foot * 0.3333333333333);
    }
    //This will convert Foot/minute to Yard/second
    public double convertFootperMintoYardpers(double Foot)
    {
        return (Foot * 0.005555555555556);
    }
    //This will convert Foot/second to Centimeter/hour
    public double convertFootperStoCentimeterperhr(double Foot)
    {
        return (Foot * 109727.99999122);
    }
    //This will convert Foot/second to Centimeter/minute
    public double convertFootperStoCentimeterpermin(double Foot)
    {
        return (Foot * 1828.8);
    }
    //This will convert Foot/second to Centimeter/second
    public double convertFootperStoCentimeterpers(double Foot)
    {
        return (Foot * 30.48);
    }
    //This will convert Foot/second to Kilometer/hour
    public double convertFootperStoKilometerperhr(double Foot)
    {
        return (Foot * 1.09728);
    }
    //This will convert Foot/second to Kilometer/minute
    public double convertFootperStoKilometerpermin(double Foot)
    {
        return (Foot * 0.018288);
    }
    //This will convert Foot/second to Kilometer/second
    public double convertFootperStoKilometerpers(double Foot)
    {
        return (Foot / 3280.83989501);
    }
    //This will convert Foot/second to Meter/hour
    public double convertFootperStoMeterperhr(double Foot)
    {
        return (Foot * 1097.27999991);
    }
    //This will convert Foot/second to Meter/minute
    public double convertFootperStoMeterpermin(double Foot)
    {
        return (Foot * 18.288);
    }
    //This will convert Foot/second to Meter/second
    public double convertFootperStoMeterpers(double Foot)
    {
        return (Foot / 3.2808);
    }
    //This will convert Foot/second to Mile/hour
    public double convertFootperStoMileperhr(double Foot)
    {
        return (Foot / 1.46666667);
    }
    //This will convert Foot/second to Mile/minute
    public double convertFootperStoMilepermin(double Foot)
    {
        return (Foot * 0.01136363636364);
    }
    //This will convert Foot/second to Mile/second
    public double convertFootperStoMilepers(double Foot)
    {
        return (Foot / 5280 );
    }
    //This will convert Foot/second to Foot/hour
    public double convertFootperStoFootperhr(double Foot)
    {
        return (Foot * 3600);
    }
    //This will convert Foot/second to Foot/minute
    public double convertFootperStoFootpermin(double Foot)
    {
        return (Foot * 60);
    }
    //This will convert Foot/second to Yard/hour
    public double convertFootperStoYardperhr(double Foot)
    {
        return (Foot * 1200);
    }
    //This will convert Foot/second to Yard/minute
    public double convertFootperStoYardpermin(double Foot)
    {
        return (Foot * 20);
    }
    //This will convert Foot/second to Yard/second
    public double convertFootperStoYardpers(double Foot)
    {
        return (Foot / 3);
    }
    //This will convert Yards/hour to Centimeter/hour
    public double convertYardsperHRtoCentimeterperhr(double Yards)
    {
        return (Yards * 91.43999999);
    }
    //This will convert Yards/hour to Centimeter/minute
    public double convertYardsperHRtoCentimeterpermin(double Yards)
    {
        return (Yards * 1.524);
    }
    //This will convert Yards/hour to Centimeter/second
    public double convertYardsperHRtoCentimeterpers(double Yards)
    {
        return (Yards / 39.37007874);
    }
    //This will convert Yards/hour to Kilometer/hour
    public double convertYardsperHRtoKilometerperhr(double Yards)
    {
        return (Yards / 1093.61329843);
    }
    //This will convert Yards/hour to Kilometer/minute
    public double convertYardsperHRtoKilometerpermin(double Yards)
    {
        return (Yards * 0.00001524);
    }
    //This will convert Yards/hour to Kilometer/second
    public double convertYardsperHRtoKilometerpers(double Yards)
    {
        return (Yards / 3937007.8740157);
    }
    //This will convert Yards/hour to Meter/hour
    public double convertYardsperHRtoMeterperhr(double Yards)
    {
        return (Yards / 1.0936133);
    }
    //This will convert Yards/hour to Meter/minute
    public double convertYardsperHRtoMeterpermin(double Yards)
    {
        return (Yards * 0.01524);
    }
    //This will convert Yards/hour to Meter/second
    public double convertYardsperHRtoMeterpers(double Yards)
    {
        return (Yards / 3937.00787402);
    }
    //This will convert Yards/hour to Mile/hour
    public double convertYardsperHRtoMileperhr(double Yards)
    {
        return (Yards / 1760);
    }
    //This will convert Yards/hour to Mile/minute
    public double convertYardsperHRtoMilepermin(double Yards)
    {
        return (Yards * 0.000009469696969697);
    }
    //This will convert Yards/hour to Mile/second
    public double convertYardsperHRtoMilepers(double Yards)
    {
        return (Yards / 6336000.0000253);
    }
    //This will convert Yards/hour to Foot/hour
    public double convertYardsperHRtoFootperhr(double Yards)
    {
        return (Yards * 3);
    }
    //This will convert Yards/hour to Foot/minute
    public double convertYardsperHRtoFootpermin(double Yards)
    {
        return (Yards * 0.05);
    }
    //This will convert Yards/hour to Foot/second
    public double convertYardsperHRtoFootpers(double Yards)
    {
        return (Yards / 1200);
    }
    //This will convert Yards/hour to Yard/minute
    public double convertYardsperHRtoYardpermin(double Yards)
    {
        return (Yards * 0.01666666666667);
    }
    //This will convert Yards/hour to Yard/second
    public double convertYardsperHRtoYardpers(double Yards)
    {
        return (Yards / 3600);
    }
    //This will convert Yards/minute to Centimeter/hour
    public double convertYardsperMintoCentimeterperhr(double Yards)
    {
        return (Yards * 5486.4);
    }
    //This will convert Yards/minute to Centimeter/minute
    public double convertYardsperMintoCentimeterpermin(double Yards)
    {
        return (Yards * 91.44);
    }
    //This will convert Yards/minute to Centimeter/second
    public double convertYardsperMintoCentimeterpers(double Yards)
    {
        return (Yards / 1.524);
    }
    //This will convert Yards/minute to Kilometer/hour
    public double convertYardsperMintoKilometerperhr(double Yards)
    {
        return (Yards * 0.054864);
    }
    //This will convert Yards/minute to Kilometer/minute
    public double convertYardsperMintoKilometerpermin(double Yards)
    {
        return (Yards * 0.0009144);
    }
    //This will convert Yards/minute to Kilometer/second
    public double convertYardsperMintoKilometerpers(double Yards)
    {
        return (Yards / 0.00001524);
    }
    //This will convert Yards/minute to Meter/hour
    public double convertYardsperMintoMeterperhr(double Yards)
    {
        return (Yards * 54.864);
    }
    //This will convert Yards/minute to Meter/minute
    public double convertYardsperMintoMeterpermin(double Yards)
    {
        return (Yards * 0.9144);
    }
    //This will convert Yards/minute to Meter/second
    public double convertYardsperMintoMeterpers(double Yards)
    {
        return (Yards / 0.01524);
    }
    //This will convert Yards/minute to Mile/hour
    public double convertYardsperMintoMileperhr(double Yards)
    {
        return (Yards * 0.03409090909091);
    }
    //This will convert Yards/minute to Mile/minute
    public double convertYardsperMintoMilepermin(double Yards)
    {
        return (Yards * 0.0005681818181818);
    }
    //This will convert Yards/minute to Mile/second
    public double convertYardsperMintoMilepers(double Yards)
    {
        return (Yards / 0.000009469696969697);
    }
    //This will convert Yards/minute to Foot/hour
    public double convertYardsperMintoFootperhr(double Yards)
    {
        return (Yards * 180);
    }
    //This will convert Yards/minute to Foot/minute
    public double convertYardsperMintoFootpermin(double Yards)
    {
        return (Yards * 3);
    }
    //This will convert Yards/minute to Foot/second
    public double convertYardsperMintoFootpers(double Yards)
    {
        return (Yards / 0.05);
    }
    //This will convert Yards/minute to Yard/hour
    public double convertYardsperMintoYardperhr(double Yards)
    {
        return (Yards * 60);
    }

    //This will convert Yards/minute to Yard/second
    public double convertYardsperMintoYardpers(double Yards)
    {
        return (Yards / 0.01666666666667);
    }
    //This will convert Yards/second to Centimeter/hour
    public double convertYardsperStoCentimeterperhr(double Yards)
    {
        return (Yards * 329183.99997367);
    }
    //This will convert Yards/Second to Centimeter/minute
    public double convertYardsperStoCentimeterpermin(double Yards)
    {
        return (Yards * 5486.4);
    }
    //This will convert Yards/second to Centimeter/second
    public double convertYardsperStoCentimeterpers(double Yards)
    {
        return (Yards * 91.44);
    }
    //This will convert Yards/second to Kilometer/hour
    public double convertYardsperStoKilometerperhr(double Yards)
    {
        return (Yards * 3.29184);
    }
    //This will convert Yards/Second to Kilometer/minute
    public double convertYardsperStoKilometerpermin(double Yards)
    {
        return (Yards * 0.054864);
    }
    //This will convert Yards/second to Kilometer/second
    public double convertYardsperStoKilometerpers(double Yards)
    {
        return (Yards / 1093.61329834);
    }
    //This will convert Yards/second to Meter/hour
    public double convertYardsperStoMeterperhr(double Yards)
    {
        return (Yards * 3291.83999974);
    }
    //This will convert Yards/Second to Meter/minute
    public double convertYardsperStoMeterpermin(double Yards)
    {
        return (Yards * 54.864);
    }
    //This will convert Yards/second to Meter/second
    public double convertYardsperStoMeterpers(double Yards)
    {
        return (Yards / 1.0936133);
    }
    //This will convert Yards/second to Mile/hour
    public double convertYardsperStoMileperhr(double Yards)
    {
        return (Yards * 2.045454545);
    }
    //This will convert Yards/Second to Mile/minute
    public double convertYardsperStoMilepermin(double Yards)
    {
        return (Yards * 0.03409090909091);
    }
    //This will convert Yards/second to Mile/second
    public double convertYardsperStoMilepers(double Yards)
    {
        return (Yards / 1760);
    }
    //This will convert Yards/second to Foot/hour
    public double convertYardsperStoFootperhr(double Yards)
    {
        return (Yards * 10800);
    }
    //This will convert Yards/Second to Foot/minute
    public double convertYardsperStoFootpermin(double Yards)
    {
        return (Yards * 180);
    }
    //This will convert Yards/second to Foot/second
    public double convertYardsperStoFootpers(double Yards)
    {
        return (Yards * 3);
    }
    //This will convert Yards/second to Yard/hour
    public double convertYardsperStoYardperhr(double Yards)
    {
        return (Yards * 3600);
    }
    //This will convert Yards/Second to Yard/minute
    public double convertYardsperStoYardpermin(double Yards)
    {
        return (Yards * 60);
    }

    public List <String> getSpeedUnits (String items)
    {
        List <String> list = new ArrayList<String>();
        list.add("Centimeter/hour");
        list.add("Centimeter/minute");
        list.add("Centimeter/second");
        list.add("Kilometer/hour");
        list.add("Kilometer/minute");
        list.add("Kilometer/second");
        list.add("Meter/hour");
        list.add("Meter/minute");
        list.add("Meter/second");
        list.add("Mile/hour");
        list.add("Mile/minute");
        list.add("Mile/second");
        list.add("Foot/hour");
        list.add("Foot/minute");
        list.add("Foot/second");
        list.add("Yard/hour");
        list.add("Yard/minute");
        list.add("Yard/second");
        if (!items.equals(""))
        {
            for (int i=0; i<list.size();i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }

    //This will convert Square Centimeter to Square Meter
    public double convertSqCentimetertoSqMeter (double Cenitmeter)
    {
        return (Cenitmeter * 10000);
    }
    //This will convert Square Centimeter to Square Kilometer
    public double convertSqCentimetertoSqKilometer (double Cenitmeter)
    {
        return (Cenitmeter * 10000000000.0);
    }
    //This will convert Square Centimeter to Square Inches
    public double convertSqCentimetertoSqInches (double Cenitmeter)
    {
        return (Cenitmeter * 6.4516);
    }
    //This will convert Square Centimeter to Square Foot
    public double convertSqCentimetertoSqFoot (double Cenitmeter)
    {
        return (Cenitmeter / 929.0304);
    }
    //This will convert Square Centimeter to Square Yards
    public double convertSqCentimetertoSqYards (double Cenitmeter)
    {
        return (Cenitmeter / 8361.2736);
    }
    //This will convert Square Centimeter to Square Mile
    public double convertSqCentimetertoSqMiles (double Cenitmeter)
    {
        return (Cenitmeter / 25899881103.36);
    }
    //This will convert Square Centimeter to Acre
    public double convertSqCentimetertoAcre (double Cenitmeter)
    {
        return (Cenitmeter / 40468564.224);
    }
    //This will convert Square meter to Square Centimeter
    public double convertSqMetertoSqCentimeter (double Meter)
    {
        return (Meter * 10000 );
    }
    //This will convert Square meter to Square Kilometer
    public double convertSqMetertoSqKilometer (double Meter)
    {
        return (Meter / 1000000);
    }
    //This will convert Square meter to Square Inches
    public double convertSqMetertoSqInches (double Meter)
    {
        return (Meter / 0.00064516);
    }
    //This will convert Square meter to Square Foot
    public double convertSqMetertoSqFoot (double Meter)
    {
        return (Meter / 0.09290304);
    }
    //This will convert Square meter to Square Yards
    public double convertSqMetertoSqYards (double Meter)
    {
        return (Meter / 0.83612736);
    }
    //This will convert Square meter to Square Miles
    public double convertSqMetertoSqMiles (double Meter)
    {
        return (Meter / 2589988.110336);
    }
    //This will convert Square meter to Square Arce
    public double convertSqMetertoAcre (double Meter)
    {
        return (Meter / 4046.8564224);
    }
    //This will convert Square Kilometer to Square Centimeter
    public double convertSqKilometertoSqCenitmeter (double Kilometer)
    {
        return (Kilometer * 10000000000.0);
    }
    //This will convert Square Kilometer to Square Meter
    public double convertSqKilometertoSqMeter (double Kilometer)
    {
        return (Kilometer * 1000000);
    }
    //This will convert Square Kilometer to Square Inches
    public double convertSqKilometertoSqInches (double Kilometer)
    {
        return (Kilometer * 1550003100.0062);
    }
    //This will convert Square Kilometer to Square Foot
    public double convertSqKilometertoSqFoot (double Kilometer)
    {
        return (Kilometer * 10763910.41671);
    }
    //This will convert Square Kilometer to Square Yards
    public double convertSqKilometertoSqYards (double Kilometer)
    {
        return (Kilometer * 1195990.046);
    }
    //This will convert Square Kilometer to Square Miles
    public double convertSqKilometertoSqMiles (double Kilometer)
    {
        return (Kilometer / 2.58998811);
    }
    //This will convert Square Kilometer to Acre
    public double convertSqKilometertoArce (double Kilometer)
    {
        return (Kilometer / 0.00404686);
    }
    //This will convert Square Inches to Square Centimeter
    public double convertSqInchestoSqCentimeter (double Inches)
    {
        return (Inches * 6.4516);
    }
    //This will convert Square Inches to Square meter
    public double convertSqInchestoSqmeter (double Inches)
    {
        return (Inches * 0.00064516);
    }
    //This will convert Square Inches to Square Kilometer
    public double convertSqInchestoSqKilometer (double Inches)
    {
        return (Inches * 0.00000000064516);
    }
    //This will convert Square Inches to Square Foot
    public double convertSqInchestoSqFoot (double Inches)
    {
        return (Inches * 0.006944444444);
    }
    //This will convert Square Inches to Square Yards
    public double convertSqInchestoSqYards (double Inches)
    {
        return (Inches / 1296);
    }
    //This will convert Square Inches to Square Miles
    public double convertSqInchestoSqMiles (double Inches)
    {
        return (Inches / 4014489600.0);
    }
    //This will convert Square Inches to Arce
    public double convertSqInchestoArce (double Inches)
    {
        return (Inches / 6272640);
    }
    //This will convert Square Foot to Square Centimeter
    public double convertSqFoottoSqCentimeter (double Foot)
    {
        return (Foot * 929.0304);
    }
    //This will convert Square Foot to Square Meter
    public double convertSqFoottoSqMeter (double Foot)
    {
        return (Foot * 0.09290304);
    }
    //This will convert Square Foot to Square Kilometer
    public double convertSqFoottoSqKilometer (double Foot)
    {
        return (Foot / 10764000);
    }
    //This will convert Square Foot to Square Inches
    public double convertSqFoottoSqInches (double Foot)
    {
        return (Foot * 144);
    }
    //This will convert Square Foot to Square Yards
    public double convertSqFoottoSqYards (double Foot)
    {
        return (Foot / 9);
    }
    //This will convert Square Foot to Square Miles
    public double convertSqFoottoSqMiles (double Foot)
    {
        return (Foot / 27878400);
    }
    //This will convert Square Foot to Arce
    public double convertSqFoottoArce (double Foot)
    {
        return (Foot / 43560);
    }
    //This will convert Square Yards to Square Centimeter
    public double convertSqYardstoSqCentimeter (double Yard)
    {
        return (Yard * 8361.2736);
    }
    //This will convert Square Yards to Square Meter
    public double convertSqYardstoSqMeter (double Yard)
    {
        return (Yard * 0.83612736);
    }
    //This will convert Square Yards to Square Kilometer
    public double convertSqYardstoSqKilometer (double Yard)
    {
        return (Yard / 1196000);
    }
    //This will convert Square Yards to Square Inches
    public double convertSqYardstoSqInches (double Yard)
    {
        return (Yard * 1296);
    }
    //This will convert Square Yards to Square Foot
    public double convertSqYardstoSqFoot (double Yard)
    {
        return (Yard * 9);
    }
    //This will convert Square Yards to Square Miles
    public double convertSqYardstoSqMiles (double Yard)
    {
        return (Yard / 3097600);
    }
    //This will convert Square Yards to Acre
    public double convertSqYardstoAcre (double Yard)
    {
        return (Yard / 4840);
    }
    //This will convert Square Miles to Square Centimeter
    public double convertSqMilestoSqCentimeter (double Mile)
    {
        return (Mile * 25899881103.36);
    }
    //This will convert Square Miles to Square Meter
    public double convertSqMilestoSqMeter (double Mile)
    {
        return (Mile *2589988.110336);
    }
    //This will convert Square Miles to Square Kilometer
    public double convertSqMilestoSqKilometer (double Mile)
    {
        return (Mile * 2.58998811);
    }
    //This will convert Square Miles to Square Inches
    public double convertSqMilestoSqInches (double Mile)
    {
        return (Mile * 4014489600.0);
    }
    //This will convert Square Miles to Square Foot
    public double convertSqMilestoSqFoot (double Mile)
    {
        return (Mile * 27878400);
    }
    //This will convert Square Miles to Square Yards
    public double convertSqMilestoSqYards (double Mile)
    {
        return (Mile * 3097600);
    }
    //This will convert Square Miles to Acre
    public double convertSqMilestoAcre (double Mile)
    {
        return (Mile * 640);
    }
    //This will convert Acre to Square Centimeter
    public double convertAcretoSqCentimeter (double Acre)
    {
        return (Acre * 40468564.224);
    }
    //This will convert Acre to Square Meter
    public double convertAcretoSqMeter (double Acre)
    {
        return (Acre * 4046.8564224);
    }
    //This will convert Acre to Square Kilometer
    public double convertAcretoSqKilometer (double Acre)
    {
        return (Acre * 0.00404686);
    }
    //This will convert Acre to Square Inches
    public double convertAcretoSqInches (double Acre)
    {
        return (Acre * 6272640);
    }
    //This will convert Acre to Square Foot
    public double convertAcretoSqFoot (double Acre)
    {
        return (Acre * 43560);
    }
    //This will convert Acre to Square Yards
    public double convertAcretoSqYards (double Acre)
    {
        return (Acre * 4840);
    }
    //This will convert Acre to Square Miles
    public double convertAcretoSqMiles (double Acre)
    {
        return (Acre / 640);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE AREA UNIT
    public List<String> getAreaUnits (String items)
    {
        List<String> list = new ArrayList<String>();
        list.add("Square Centimeter");
        list.add("Square meter");
        list.add("Square Kilometer");
        list.add("Square Inch");
        list.add("Square Foot");
        list.add("Square Yard");
        list.add("Square Mile");
        list.add("Acre");
        if (!items.equals(""))
        {
            for (int i=0; i<list.size(); i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
    //Functions of the Volume Units
    //This will convert Milliliter to Liter
    public double convertMillilitertoLiter (double MilliLiter)
    {
        return (MilliLiter / 1000);
    }
    //This will convert Milliliter to  Cubic Meter
    public double convertMillilitertoCubicMeter (double MilliLiter)
    {
        return (MilliLiter / 1000000);
    }
    //This will convert Milliliter to  Cubic Foot
    public double convertMillilitertoCubicFoot (double MilliLiter)
    {
        return (MilliLiter /28316.846592);
    }
    //This will convert Milliliter to  Cubic Yard
    public double convertMillilitertoCubicYard (double MilliLiter)
    {
        return (MilliLiter / 764554.85798);
    }
    //This will convert Milliliter to  Gallons
    public double convertMillilitertoGallons (double MilliLiter)
    {
        return (MilliLiter / 3785.411784);
    }
    //This will convert Liters to MilliLiters
    public double convertLiterstoMilliliter (double Liter)
    {
        return (Liter * 1000);
    }
    //This will convert Liters to Cubic Meter
    public double convertLiterstoCubicMeter (double Liter)
    {
        return (Liter / 1000);
    }
    //This will convert Liters to Cubic Foot
    public double convertLiterstoCubicFoot (double Liter)
    {
        return (Liter / 28.31684659);
    }
    //This will convert Liters to Cubic Yard
    public double convertLiterstoCubicYards (double Liter)
    {
        return (Liter / 764.55485798);
    }
    //This will convert Liters to Gallons
    public double convertLiterstoGallons (double Liter)
    {
        return (Liter / 3.78541178);
    }
    //This will convert Cubic Meter to MilliLiter
    public double convertCubicMetertoMilliLiter (double Meter)
    {
        return (Meter * 1000000);
    }
    //This will convert Cubic Meter to Liters
    public double convertCubicMetertoLiters (double Meter)
    {
        return (Meter * 1000);
    }
    //This will convert Cubic Meter to Cubic Foot
    public double convertCubicMetertoCubicFoot (double Meter)
    {
        return (Meter / 0.02831685);
    }
    //This will convert Cubic Meter to Cubic Yard
    public double convertCubicMetertoCubicYard (double Meter)
    {
        return (Meter / 0.76455486);
    }
    //This will convert Cubic Meter to Gallons
    public double convertCubicMetertoGallons (double Meter)
    {
        return (Meter / 0.00378541);
    }

    //This will convert Cubic Foot to MilliLiter
    public double convertCubicFoottoMilliLiter (double Foot)
    {

        return (Foot * 28316.846592);
    }
    //This will convert Cubic Foot to Liter
    public double convertCubicFoottoLiter (double Foot)
    {

        return (Foot * 28.31684659);
    }
    //This will convert Cubic Foot to Cubic Meter
    public double convertCubicFoottoCubicMeter (double Foot)
    {

        return (Foot * 0.02831685);
    }
    //This will convert Cubic Foot to Cubic Yard
    public double convertCubicFoottoCubicYard (double Foot)
    {

        return (Foot / 27);
    }
    //This will convert Cubic Foot to Gallons
    public double convertCubicFoottoGallons (double Foot)
    {

        return (Foot * 7.480519481);
    }
    //This will convert Cubic Yard to MilllLiter
    public double convertCubicYardtoMilliLiter (double Yard)
    {

        return (Yard * 764554.85798);
    }
    //This will convert Cubic Yard to Liter
    public double convertCubicYardtoLiter (double Yard)
    {

        return (Yard * 764.55485798);
    }
    //This will convert Cubic Yard to Cubic Meter
    public double convertCubicYardtoCubicMeter (double Yard)
    {

        return (Yard * 0.76455486);
    }
    //This will convert Cubic Yard to Cubic Foot
    public double convertCubicYardtoCubicFoot (double Yard)
    {

        return (Yard * 27);
    }
    //This will convert Cubic Yard to Gallon
    public double convertCubicYardtoGallon (double Yard)
    {

        return (Yard * 201.974);
    }
    //This will convert Gallon to MilliLiters
    public double convertGallonstoMilliLiters (double Gallons)
    {

        return (Gallons * 3785.411784);
    }
    //This will convert Gallon to Liters
    public double convertGallonstoLiters (double Gallons)
    {

        return (Gallons * 3.78541178);
    }
    //This will convert Gallon to Cubic Meters
    public double convertGallonstoCubicMeter (double Gallons)
    {

        return (Gallons * 0.00378541);
    }
    //This will convert Gallon to Cubic Foot
    public double convertGallonstoCubicFoot (double Gallons)
    {

        return (Gallons / 7.4805);
    }
    //This will convert Gallon to Cubic Yards
    public double convertGallonstoCubicYards (double Gallons)
    {

        return (Gallons * 201.974);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE VOLUME UNIT
    public List<String> getVolumeUnits (String items)
    {
        List<String> list = new ArrayList<String>();
        list.add("MilliLiter");
        list.add("Liter");
        list.add("Cubic Meter");
        list.add("Cubic Foot/Feet");
        list.add("Cubic Yard");
        list.add("Gallon");
        //list.add("KiloLiter");
        //list.add("Cubic Inch");
        //list.add("Pint");
        //list.add("Quart");
        //list.add("Barrel");
        if (!items.equals(""))
        {
            for (int i=0; i<list.size(); i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
    //Functions of the Time Units
    //This will convert Millisecond to Seconds
    public double convertMillisecondtoSeconds (double Millisecond)
    {
        return (Millisecond * 0.001);
    }
    //This will convert Millisecond to Minutes
    public double convertMillisecondtoMinutes (double Millisecond)
    {
        return (Millisecond * 0.000016667);
    }
    //This will convert Millisecond to Hours
    public double convertMillisecondtoHours (double Millisecond)
    {
        return (Millisecond * 0.000000278);
    }
    //This will convert Millisecond to Days
    public double convertMillisecondtoDays (double Millisecond)
    {
        return (Millisecond * 0.000000012);
    }
    //This will convert Millisecond to Weeks
    public double convertMillisecondtoWeeks (double Millisecond)
    {
        return (Millisecond * 0.000000002);
    }
    //This will convert Milliseconds to Months
    public double convertMillisecondtoMonths (double Millisecond)
    {
        return (Millisecond * 0.000000000381);
    }
    //This will convert Millisecond to Years
    public double convertMillisecondtoYears (double Millisecond)
    {
        return (Millisecond * 0.0000000000317);
    }
    //This will convert Millisecond to Leap Years
    public double convertMillisecondtoLeapyears (double Millisecond)
    {
        return (Millisecond * 0.0000000000316);
    }
    //This will convert Millisecond to Decade
    public double convertMillisecondtoDecade (double Millisecond)
    {
        return (Millisecond * 0.00000000000317);
    }
    //This will convert Second to Millisecond
    public double convertSecondtoMillisecond (double second)
    {
        return (second );
    }
    //This will convert Second to Minute
    public double convertSecondtoMinute (double second)
    {
        return (second * 1000);
    }
    //This will convert Second to Hours
    public double convertSecondtoHours (double second)
    {
        return (second * 0.000277778);
    }
    //This will convert Second to Days
    public double convertSecondtoDays (double second)
    {
        return (second * 0.000011574);
    }
    //This will convert Second to Weeks
    public double convertSecondtoWeeks (double second)
    {
        return (second * 0.000001653);
    }
    //This will convert Second to Months
    public double convertSecondtoMonths (double second)
    {
        return (second * 0.000000381);
    }
    //This will convert Second to Years
    public double convertSecondtoYears (double second)
    {
        return (second * 0.000000032);
    }
    //This will convert Second to Leap Year
    public double convertSecondtoLeapYear (double second)
    {
        return (second * 0.000000032);
    }
    //This will convert Second to Decade
    public double convertSecondtoDecade (double second)
    {
        return (second * 0.000000003);
    }
    //This will convert Minute to Milliseconds
    public double convertMinutetoMilliseconds (double Minute)
    {
        return (Minute * 60000);
    }
    //This will convert Minute to Seconds
    public double convertMinutetoSeconds (double Minute)
    {
        return (Minute * 60);
    }
    //This will convert Minute to Hours
    public double convertMinutetoHours (double Minute)
    {
        return (Minute * 0.016666667);
    }
    //This will convert Minute to Days
    public double convertMinutetoDays (double Minute)
    {
        return (Minute * 0.000694444);
    }
    //This will convert Minute to Weeks
    public double convertMinutetoWeeks (double Minute)
    {
        return (Minute * 0.000099206);
    }
    //This will convert Minute to Months
    public double convertMinutetoMonths (double Minute)
    {
        return (Minute * 0.000022831);
    }
    //This will convert Minute to Years
    public double convertMinutetoYears (double Minute)
    {
        return (Minute * 0.000001903);
    }
    //This will convert Minute to Leap Years
    public double convertMinutetoleapYear (double Minute)
    {
        return (Minute * 0.000001897);
    }
    //This will convert Minute to Decade
    public double convertMinutetoDecade (double Minute)
    {
        return (Minute * 0.00000019);
    }
    //This will convert Hour to Millisecond
    public double convertHourtoMillisecond (double Hour)
    {
        return (Hour * 3600000);
    }
    //This will convert Hour to Second
    public double convertHourtoSecond (double Hour)
    {
        return (Hour * 3600);
    }
    //This will convert Hour to Minute
    public double convertHourtoMinute (double Hour)
    {
        return (Hour * 60);
    }
    //This will convert Hour to Days
    public double convertHourtodays (double Hour)
    {
        return (Hour * 0.041666667);
    }
    //This will convert Hour to Weeks
    public double convertHourtoWeeks (double Hour)
    {
        return (Hour * 0.005952381);
    }
    //This will convert Hour to Months
    public double convertHourtoMonths (double Hour)
    {
        return (Hour * 0.001369863);
    }
    //This will convert Hour to Years
    public double convertHourtoYears (double Hour)
    {
        return (Hour * 0.000114155);
    }
    //This will convert Hour to Leap Year
    public double convertHourtoleapYear (double Hour)
    {
        return (Hour * 0.000113843);
    }
    //This will convert Hour to Decade
    public double convertHourtoDecade (double Hour)
    {
        return (Hour * 0.000011416);
    }
    //This will convert Days to Millisecond
    public double convertDaystoMillisecond (double Days)
    {
        return (Days * 86400000);
    }
    //This will convert Days to Second
    public double convertDaystoSecond (double Days)
    {
        return (Days * 86400);
    }
    //This will convert Days to Minute
    public double convertDaystoMinute (double Days)
    {
        return (Days * 1440);
    }
    //This will convert Days to Hours
    public double convertDaystoHours (double Days)
    {
        return (Days * 24);
    }
    //This will convert Days to Weeks
    public double convertDaystoWeeks (double Days)
    {
        return (Days * 0.142857143);
    }
    //This will convert Days to Months
    public double convertDaystoMonths (double Days)
    {
        return (Days * 0.032876712);
    }
    //This will convert Days to years
    public double convertDaystoYears (double Days)
    {
        return (Days * 0.002739726);
    }
    //This will convert Days to Leap Year
    public double convertDaystoLeapYear (double Days)
    {
        return (Days * 0.00273224);
    }
    //This will convert Days to Decade
    public double convertDaystoDecade (double Days)
    {
        return (Days * 0.000273973);
    }
    //This will convert Weeks to Milliseconds
    public double convertWeekstoMilliseconds (double Weeks)
    {
        return (Weeks * 604800000);
    }
    //This will convert Weeks to Seconds
    public double convertWeekstoSeconds (double Weeks)
    {
        return (Weeks * 604800);
    }
    //This will convert Weeks to Minute
    public double convertWeekstoMinute (double Weeks)
    {
        return (Weeks * 10080);
    }
    //This will convert Weeks to Hours
    public double convertWeekstoHours (double Weeks)
    {
        return (Weeks * 168);
    }
    //This will convert Weeks to Days
    public double convertWeekstoDays (double Weeks)
    {
        return (Weeks * 7);
    }
    //This will convert Weeks to Months
    public double convertWeekstoMonths (double Weeks)
    {
        return (Weeks * 0.230136986);
    }
    //This will convert Weeks to Years
    public double convertWeekstoYears (double Weeks)
    {
        return (Weeks * 0.019178082);
    }
    //This will convert Weeks to Leap Years
    public double convertWeekstoLeapYear (double Weeks)
    {
        return (Weeks * 0.019125683);
    }
    //This will convert Weeks to Decade
    public double convertWeekstoDecade (double Weeks)
    {
        return (Weeks * 0.001917808);
    }
    //This will convert Months to Millisecond
    public double convertMonthstoMillisecond (double Months)
    {
        return (Months * 2628000000.0);
    }
    //This will convert Months to Second
    public double convertMonthstoSecond (double Months)
    {
        return (Months * 2628000);
    }
    //This will convert Months to Minute
    public double convertMonthstoMinute (double Months)
    {
        return (Months * 43800);
    }
    //This will convert Months to Hours
    public double convertMonthstoHours (double Months)
    {
        return (Months * 730);
    }
    //This will convert Months to Days
    public double convertMonthstoDays (double Months)
    {
        return (Months * 30.416666667);
    }
    //This will convert Months to Weeks
    public double convertMonthstoWeeks (double Months)
    {
        return (Months * 4.345238095);
    }
    //This will convert Months to Years
    public double convertMonthstoYears (double Months)
    {
        return (Months * 0.083333333);
    }
    //This will convert Months to Leap Years
    public double convertMonthstoLeapYears (double Months)
    {
        return (Months * 0.083105647);
    }
    //This will convert Months to Decade
    public double convertMonthstoDecade (double Months)
    {
        return (Months  * 0.008333333);
    }
    //This will convert years to Milliseconds
    public double convertYearstoMilliseconds (double Years)
    {
        return (Years * 31536000000000.0);
    }
    //This will convert years to Seconds
    public double convertYearstoSeconds (double Years)
    {
        return (Years * 31536000);
    }
    //This will convert years to Minutes
    public double convertYearstoMinutes (double Years)
    {
        return (Years * 525600);
    }
    //This will convert years to Hours
    public double convertYearstoHours (double Years)
    {
        return (Years * 8760);
    }
    //This will convert years to days
    public double convertYearstoDays (double Years)
    {
        return (Years * 365);
    }
    //This will convert years to Weeks
    public double convertYearstoWeeks (double Years)
    {
        return (Years * 52.142857143);
    }
    //This will convert years to Months
    public double convertYearstoMonths (double Years)
    {
        return (Years * 12);
    }
    //This will convert years to Leap Years
    public double convertYearstoLeapYears (double Years)
    {
        return (Years * 0.99726776);
    }
    //This will convert years to Decade
    public double convertYearstoDecade (double Years)
    {
        return (Years * 0.1);
    }
    //This will convert Leap Years to Millisecond
    public double convertleapYeartoMillisecond (double Years)
    {
        return (Years * 316224000000000.0);
    }
    //This will convert Leap Years to Second
    public double convertleapYeartoSecond (double Years)
    {
        return (Years * 31622400);
    }
    //This will convert Leap Years to Minute
    public double convertleapYeartoMinute (double Years)
    {
        return (Years * 527040);
    }
    //This will convert Leap Years to Hours
    public double convertleapYeartoHours (double Years)
    {
        return (Years * 8784);
    }
    //This will convert Leap Years to Days
    public double convertleapYeartodays (double Years)
    {
        return (Years * 366);
    }
    //This will convert Leap Years to Weeks
    public double convertleapYearstoWeeks (double Years)
    {
        return (Years * 52.285714286);
    }
    //This will convert Leap Years to Months
    public double convertleapYeartoMonths (double Years)
    {
        return (Years * 12.032876712);
    }
    //This will convert Leap Years to Years
    public double convertleapYeartoYears (double Years)
    {
        return (Years * 1.002739726);
    }
    //This will convert Leap Years to Decade
    public double convertleapYeartoDecade (double Years)
    {
        return (Years * 0.100273973);
    }
    //This will convert Decade to Millisecond
    public double convertDecadetoMillisecond (double decade)
    {
        return (decade * 315360000000000.0);
    }
    //This will convert Decade to Second
    public double convertDecadetoSecond (double decade)
    {
        return (decade* 315360000);
    }
    //This will convert Decade to Minute
    public double convertDecadetoMinute (double decade)
    {
        return (decade * 5256000);
    }
    //This will convert Decade to Hours
    public double convertDecadetoHours (double decade)
    {
        return (decade * 87600);
    }
    //This will convert Decade to Days
    public double convertDecadetoDays (double decade)
    {
        return (decade * 3650);
    }
    //This will convert Decade to Weeks
    public double convertDecadetoWeeks (double decade)
    {
        return (decade * 521.428571429);
    }
    //This will convert Decade to Months
    public double convertDecadetoMonths (double decade)
    {
        return (decade * 120);
    }
    //This will convert Decade to Years
    public double convertDecadetoYears (double decade)
    {
        return (decade * 10);
    }
    //This will convert Decade to Leap Year
    public double convertDecadetoLeapYears (double decade)
    {
        return (decade * 9.972677596);
    }
    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE TIME UNIT
    public List<String> getTimeUnits (String items)
    {
        List<String> list = new ArrayList<String>();
        list.add("Milliseconds");
        list.add("Seconds");
        list.add("Minutes");
        list.add("Hours");
        list.add("Days");
        list.add("Weeks");
        list.add("Months");
        list.add("Years");
        list.add("Leap Years");
        list.add("Decade");
        if (!items.equals(""))
        {
            for (int i =0; i<list.size(); i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
    //Functions of the Fuel Consumption Units
    //This will convert Liter/Kilometer to Liters/Miles
    public double convertLiterperKMtoLitersperMi (double Liters)
    {
        return (Liters * 1.60934398);
    }
    //This will convert Liter/Kilometer to Gallons/Kilometer
    public double convertLiterperKMtoGallonsperKM (double Liters)
    {
        return (Liters / 3.7854);
    }
    //This will convert Liter/Kilometer to Gallons/Miles
    public double convertLiterperKMtoGallonsperMi (double Liters)
    {
        return (Liters * 0.42514371);
    }
    //This will convert Liter/Miles to Liter/Kilometer
    public double convertLiterperMItoLiterperKM (double Liters)
    {
        return (Liters / 1.6093);
    }
    //This will convert Liter/Miles to Gallons/Kilometer
    public double convertLiterperMItoGallonperKM (double Liters)
    {
        return (Liters * 0.16414891);
    }
    //This will convert Liter/Miles to Gallons/Miles
    public double convertLiterperMItoGallonperMI (double Liters)
    {
        return (Liters / 3.7854);
    }
    //This will convert Gallons/Kilometer to Liters/Kilometer
    public double convertGallonsperKMtoLitersperKM (double Gallons)
    {
        return (Gallons * 3.78541178);
    }
    //This will convert Gallons/Kilometer to Liters/Miles
    public double convertGallonsperKMtoLitersperMI (double Gallons)
    {
        return (Gallons * 6.09202966);
    }
    //This will convert Gallons/Kilometer to Gallons/Miles
    public double convertGallonsperKMtoGallonsperMI (double Gallons)
    {
        return (Gallons * 1.609344021);
    }
    //This will convert Gallons/Miles to Liters/Kilometer
    public double convertGallonsperMItoLitersperKM (double Gallons)
    {
        return (Gallons * 2.3521458);
    }
    //This will convert Gallons/Miles to Liters/Miles
    public double convertGallonsperMItoLitersperMI (double Gallons)
    {
        return (Gallons * 3.78541168);
    }
    //This will convert Gallons/Miles to Gallons/Kilometer
    public double convertGallonsperMItoGallonsperKM (double Gallons)
    {
        return (Gallons / 1.6093);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE FUEL CONSUMPTOION UNIT
    public List<String> getFuelConsumption (String items)
    {
        List<String> list = new ArrayList<String>();
        list.add("Liters/Kilometer");
        list.add("Liters/Miles");
        list.add("Gallons/Kilometer");
        list.add("Gallons/Miles");

        if (!items.equals(""))
        {
            for (int i =0; i<list.size(); i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
    //Functions of the Pressure Units
    //This will convert Atmosphere to Bar
    public double convertAtmospheretoBar (double Atmosphere)
    {
        return (Atmosphere * 1.01325);
    }
    //This will convert Atmosphere to Pascal
    public double convertAtmospheretoPascal (double Atmosphere)
    {
        return (Atmosphere * 101325);
    }
    //This will convert Atmosphere to Pound/ Square Inches
    public double convertAtmospheretoPoundperInch (double Atmosphere)
    {
        return (Atmosphere * 14.69594877549);
    }
    //This will convert Atmosphere to Torr
    public double convertAtmospheretoTorr (double Atmosphere)
    {
        return (Atmosphere * 759.9999999998);
    }
    //This will convert Bar to Atmosphere
    public double convertBartoAtmosphere (double Bar)
    {
        return (Bar * 0.986923266716);
    }
    //This will convert Bar to Pascal
    public double convertBartoPascal (double Bar)
    {
        return (Bar * 100000);
    }
    //This will convert Bar to Pound/ Suqare Inch
    public double convertBartoPoundperSQInches (double Bar)
    {
        return (Bar * 14.503773773);
    }
    //This will convert Bar to Torr
    public double convertBartoTorr (double Bar)
    {
        return (Bar * 750.061682704);
    }
    //This will convert Pascal to Atmosphere
    public double convertPascaltoAtmosphere (double Pascal)
    {
        return (Pascal * 0.00000986923266716);
    }
    //This will convert Pascal to Bar
    public double convertPascaltoBar (double Pascal)
    {
        return (Pascal * 0.00001);
    }
    //This will convert Pascal to Pound/ Square Inch
    public double convertPascaltoPoundperSqInches (double Pascal)
    {
        return (Pascal * 0.00014503773773);
    }
    //This will convert Pascal to Torr
    public double convertPascaltoTorr (double Pascal)
    {
        return (Pascal * 0.00750061682704);
    }
    //This will convert Pound/Square Inch to Atmosphere
    public double convertPoundperSqInchtoAtmosphere (double Pound)
    {
        return (Pound * 0.06804596390998);
    }
    //This will convert Pound/Square Inch to Bar
    public double convertPoundperSqInchtoBar (double Pound)
    {
        return (Pound * 0.06894757293178);
    }
    //This will convert Pound/Square Inch to Pascal
    public double convertPoundperSqInchtoPascal (double Pound)
    {
        return (Pound * 6894.757293178);
    }
    //This will convert Pound/Square Inch to Torr
    public double convertPoundperSqInchtoTorr (double Pound)
    {
        return (Pound * 51.71493257157);
    }
    //This will convert Torr to Atmosphere
    public double convertTorrtoAtmosphere (double Torr)
    {
        return (Torr * 0.001315789473685);
    }
    //This will convert Torr to Bar
    public double convertTorrtoBar (double Torr)
    {
        return (Torr * 0.001333223684211);
    }
    //This will convert Torr to Pascal
    public double convertTorrtoPascal (double Torr)
    {
        return (Torr * 133.3223684211);
    }
    //This will convert Torr to Pound/Square Inch
    public double convertTorrtoPoundperSqInch (double Torr)
    {
        return (Torr * 0.0193367747046);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE PRESSURE UNIT
    public List<String> getPressureUnits (String items)
    {
        List<String> list = new ArrayList<String>();
        list.add("Atmosphere");
        list.add("Bar");
        list.add("Pascal");
        list.add("Pound/Square Inch");
        list.add("Torr");
        //list.add("Millibar");
        //list.add("Kilogram/Square cm");
        //list.add("Kilogram/Square m");
        //list.add("KiloPascal");
        //list.add("Millimeter of Mercury");
        //list.add("Hectopascal");
        //list.add("Pound/Square foot");
        if (!items.equals(""))
        {
            for (int i =0; i<list.size(); i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
    // Functions of the Force Units
    //This will convert Dynes to Kilograms Force
    public double convertDynestoKilogramForce (double Dynes)
    {
        return (Dynes * 0.000001019716);
    }
    //This will convert Dynes to Kip
    public double convertDynestoKip (double Dynes)
    {
        return (Dynes * 0.000000002248);
    }
    //This will convert Dynes to Newtons
    public double convertDynestoNewtons (double Dynes)
    {
        return (Dynes * 0.00001 );
    }
    //This will convert Dynes to Pound Force
    public double convertDynestoPoundForce (double Dynes)
    {
        return (Dynes * 0.0000022480894387);
    }
    //This will convert Dynes to Ton Force
    public double convertDynestoTonForce (double Dynes)
    {
        return (Dynes * 0.000000001019716213);
    }
    //This will convert Kilogram Force to Dynes
    public double convertKGForcetoDynes (double Kilogram)
    {
        return (Kilogram * 980665.2048217);
    }
    //This will convert Kilogram Force to Kip
    public double convertKGForcetoKip (double Kilogram)
    {
        return (Kilogram * 0.002204535380439);
    }
    //This will convert Kilogram Force to Newton
    public double convertKGForcetoNewton (double Kilogram)
    {
        return (Kilogram * 9.806652048217);
    }
    //This will convert Kilogram Force to Pound Force
    public double convertKGForcetoPoundForce (double Kilogram)
    {
        return (Kilogram * 2.20462308986);
    }
    //This will convert Kilogram Force to Tons Force
    public double convertKGForcetoTonsForce (double Kilogram)
    {
        return (Kilogram * 0.001000000208882);
    }
    //This will convert Kip to Dynes
    public double convertKiptoDynes (double Kip)
    {
        return (Kip * 444839857.6512);
    }
    //This will convert Kip to Kilogram Force
    public double convertKiptoKGForce (double Kip)
    {
        return (Kip * 453.6103202847);
    }
    //This will convert Kip to Newton
    public double convertKiptoNewtons (double Kip)
    {
        return (Kip * 4448.398576512);
    }
    //This will convert Kip to Pound Force
    public double convertKiptoPoundForce (double Kip)
    {
        return (Kip * 1000.039785899);
    }
    //This will convert Kip to Tons Force
    public double convertKiptoTonsFrce (double Kip)
    {
        return (Kip * 0.4536104150356);
    }
    //This will convert Newton to Dynes
    public double convertNewtonstoDynes (double Newton)
    {
        return (Newton * 100000);
    }
    //This will convert Newton to Kilogram Force
    public double convertNewtonstoKgForce (double Newton)
    {
        return (Newton * 0.1019716);
    }
    //This will convert Newton to Kip
    public double convertNewtonstoKip (double Newton)
    {
        return (Newton * 0.0002248);
    }
    //This will convert Newton to Pound Force
    public double convertNewtonstoPoundForce (double Newton)
    {
        return (Newton * 0.22480894387);
    }
    //This will convert Newton to Tons Force
    public double convertNewtonstoTonsForce (double Newton)
    {
        return (Newton * 0.0001019716213);
    }
    //This will convert Pound Force to Dynes
    public double convertLBForcetoDynes (double Pound)
    {
        return (Pound * 444822.1600019 );
    }
    //This will convert Pound Force to kilogram Force
    public double convertLBForcetoKgForce (double Pound)
    {
        return (Pound * 0.4535922737085);
    }
    //This will convert Pound Force to kip
    public double convertLBForcetoKip (double Pound)
    {
        return (Pound * 0.0009999602156843);
    }
    //This will convert Pound Force to Newtons
    public double convertLBForcetoNewton (double Pound)
    {
        return (Pound * 4.448221600019);
    }
    //This will convert Pound Force to Tons Force
    public double convertLBForcetoTonsForce (double Pound)
    {
        return (Pound * 0.0004535923684556);
    }
    //This will convert Tons Force to Dynes
    public double convertTonsForcetoDynes (double Tons)
    {
        return (Tons * 980664999.9788);
    }
    //This will convert Tons Force to Kilogram Force
    public double convertTonsForcetoKgForce (double Tons)
    {
        return (Tons * 999.9997911184);
    }
    //This will convert Tons Force to Kip
    public double convertTonsForcetoKip (double Tons)
    {
        return (Tons * 2.20453491995);
    }
    //This will convert Tons Force to Newton
    public double convertTonsForcetoNewtons (double Tons)
    {
        return (Tons * 9806.649999788);
    }
    //This will convert Tons Force to Pound Force
    public double convertTonsForcetoLbForce (double Tons)
    {
        return (Tons * 2204.622629355);
    }

    //THIS WILL SHOW THE ITEMS IN THE SPINNER OF THE FORCE UNIT
    public List<String> getForceUnits (String items)
    {
        List<String> list = new ArrayList<String>();
        list.add("Dynes");
        list.add("Kilograms Force");
        list.add("Kip");
        list.add("Newtons");
        list.add("Pound Force");
        list.add("Tons Force");
        /*list.add("Atomic Unit of Force");
        list.add("Crinal");
        list.add("Grams Force");
        list.add("Kilograms meter/second square");
        list.add("Joules per Cenitmeters");
        list.add("KiloNewtons");
        list.add("Kilopounds Force");
        list.add("MilliNewtons");
        list.add("Ounces Force");
        list.add("Pounds Force Foot/Inches");*/
        if (!items.equals(""))
        {
            for (int i =0; i<list.size(); i++)
            {
                if (list.get(i).equals(items))
                {
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
}