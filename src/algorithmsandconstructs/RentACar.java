
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.ArrayList;
import java.util.List;

public class RentACar implements RentACarInterface {
    
    List<CarInterface> cars;
    String name;
    
    public RentACar(){
        cars = new ArrayList<>(); //initialize empty arraylist to store list of cars
        name = "CCT Car Rental  ";
    }
    @Override
    public List<CarInterface> getCars() {

        return cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.cars = cars;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        if ()
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        return cars.size();
    }
    
}
