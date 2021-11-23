package day01;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        this.name = checkName(name);
        this.yearOfBirth = checkTheAge(yearOfBirth);
    }

    public int checkTheAge(int yearOfBirth){
        if((LocalDate.now().getYear() - yearOfBirth) <= 120){
            return yearOfBirth;
        }else {
            throw new IllegalArgumentException("Idősebb mint 120 év");
        }
    }

    public String checkName(String name){
        if(name != null && name.trim().contains(" ")){
            return name;
        }else{
            throw  new IllegalArgumentException("Nem adtad meg a kereszt vagy vezetéknevet");
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
