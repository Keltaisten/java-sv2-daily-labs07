package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @TempDir
    File tempFolder;

    @BeforeEach
    void init(){
        store.addProduct(new Product("T-shirt", LocalDate.of(2021,11,12),3000));
        store.addProduct(new Product("T-shirt", LocalDate.of(2021,11,12),2000));
        store.addProduct(new Product("T-shirt", LocalDate.of(2021,10,12),3500));
    }

    @Test
    void addProduct() {
    }

    @Test
    void writeTheProducts() {
    }

    @Test
    void writeToFileTest() throws IOException {
//        Path path = tempFolder.toPath().resolve("result.txt");
        
//        List<String> result = Files.readAllLines(path);

//        List<String> result2 = new ArrayList<>();

    }

    public void test() throws IOException{
        List<String> res = new ArrayList<>();
//        List<String> res = new ArrayList<>();
    }
}