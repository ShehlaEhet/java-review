package task2;

import java.util.ArrayList;
import java.util.List;

public class State {

    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }

    public List<String> getCities(){
        return this.cities;
    }
}
