package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {
    CourierFileManager courierFileManager = new CourierFileManager();
    Courier courier = new Courier();

    @Test
    void crateCourierByFileTest() {
        IllegalStateException ise = assertThrows(IllegalStateException.class, ()-> courierFileManager.crateCourierByFile(Paths.get("src/test/resources/NOK.txt")));
        assertEquals("Unable to read file", ise.getMessage());
    }

    @Test
    void crateCourierByFileTest2() {
        courier = courierFileManager.crateCourierByFile(Paths.get("src/test/resources/rides.txt"));
        assertEquals("Ride: dayOfWeek = 2, numberOfRide = 1, rideInKm = 10", courier.getRides().get(2).toString());

    }
}