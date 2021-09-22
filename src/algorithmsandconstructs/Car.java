/*
Name: Guilherme Stach, Felipe Zepeda
Date: 22-Sep-21
Program name: Car.java
 */
package algorithmsandconstructs;
import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.Map;

public abstract class Car implements CarInterface
{
    //Declaration of variables
    private String make;
    private boolean createAvailability;
    private boolean Availability;
    private boolean isAvailable;
    private double rate;
    private int ID;
    private int day;
    private int month;
    private int year;
    //Constructor
    public Car()
    {
        this.make = make;
        this.Availability = Availability;
        this.createAvailability = createAvailability;
        this.isAvailable = isAvailable;
        this.rate = rate;
        this.ID = ID;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Method for creating Availability
    public boolean createAvailability()
    {
        if (createAvailability == true)
        {
            return createAvailability;
        }   
        return false;
    }
    //Methos for making cars
    public String getMake()
    {
        return make;
    }
    //Method for setting cars
    public void setMake(String NewMake)
    {
        make = NewMake;
    }
    //Method for getting a rate
    @Override
    public double getRate()
    {
        return rate;
    }
    //Method for setting a rate
    @Override
    public void setRate(double NewRate)
    {
        rate = NewRate;
    }
    //Method for getting availability
    public boolean getAvailability()
    {
        if (Availability == true)
        {
            return Availability;
        }   
        return false;
    }
    //Method for setting availability
    public void setAvailability(boolean NewAvailability)
    {
        Availability = NewAvailability;
    }
    //Method for getting an ID
    @Override
    public int getId()
    {
        return ID;
    }
    //Method for checking the condition if available or not
    public int getDay()
    {
        return day;
    }
    public void setDay (int NewDay)
    {
        day = NewDay;
    }
    public int getMonth()
    {
        return month;
    }
    public void setMonth (int NewMonth)
    {
        day = NewMonth;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear (int NewYear)
    {
        day = NewYear;
    }    
    @Override
    public boolean isAvailable(Month month, int day)
    {
        if (day == 0)
        {
           return isAvailable = true; 
        }
        return isAvailable = false;
    }
    @Override
    public boolean book(Month month, int day)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
