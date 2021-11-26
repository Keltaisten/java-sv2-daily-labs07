package day05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p){
        if(isTheDateOK(p)){
            productList.add(p);
        }
        else{
            throw new IllegalArgumentException("Sell Date is not ok!");
        }
    }

    private boolean isTheDateOK(Product p) {
        boolean bool = false;
        if(p.getDateOfSell().getYear() <= LocalDate.now().getYear()){
            if(p.getDateOfSell().getDayOfYear() <= LocalDate.now().getDayOfYear()){
                bool = true;
            }
        }
     return bool;
    }

    public void writeTheProducts(int month, Path path){
        List<String> pro = new ArrayList<>();
        for(Product p: productList){
            if(p.getDateOfSell().getMonthValue() == month){
                pro.add(p.toString());
            }
        }
        writeToFile(pro);
    }

    public void writeToFile(List<String> pro){
        try {
//            StringBuilder sb = new StringBuilder().append("solidProducts_").append()
                Files.write(Paths.get("result.txt"), pro);
            }catch (IOException ioe){
                throw new IllegalStateException();
            }
    }
}
