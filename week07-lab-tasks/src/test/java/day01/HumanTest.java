package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human = new Human("John Doe", 1980);

    @Test
    void testCheckTheAgeWithWrongAge() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human("Jack Doe", 121));
        assertEquals("Idősebb mint 120 év", iae.getMessage());
    }

    @Test
    void testCheckNameWithWrongName(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human("John", 32));
        assertEquals("Nem adtad meg a kereszt vagy vezetéknevet", iae.getMessage());
    }

    @Test
    void testCheckNameWithNull(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Human(null, 32));
        assertEquals("Nem adtad meg a kereszt vagy vezetéknevet", iae.getMessage());
    }

    @Test
    void testCheckTheAgeWithGoodName(){
        String name = human.checkName("John Doe");
        assertEquals("John Doe", name);
    }

    @Test
    void testCheckTheAgeWithGoodAge(){
        int age = human.checkTheAge(1980);
        assertEquals(1980, age);
    }


}