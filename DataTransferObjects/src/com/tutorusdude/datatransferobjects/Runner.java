package com.tutorusdude.datatransferobjects;

import com.tutorusdude.datatransferobjects.DtoExamples.LaptopDTO;
import com.tutorusdude.datatransferobjects.DtoExamples.LaptopStorage;

public class Runner {

    public static void main(String[] args) {

        LaptopDTO laptopDTO = new LaptopDTO("Hp", "Silver", 20000, 16, "Windows 12");

        LaptopStorage laptopStorage = new LaptopStorage();

        laptopStorage.saveLaptop(laptopDTO);

//         LaptopDTO[] laptopValues = laptopStorage.readAll();
//
//        for (int i = 0; i < laptopValues.length; i++) {
//            System.out.println(laptopValues[i].getColour());
//        }

        LaptopDTO findLaptop = laptopStorage.findByLaptop("Hp");

        System.out.println("Laptop colour is : "  + findLaptop.getColour());
        System.out.println("Laptop OS is : " + findLaptop.getOperatingSystem());
        System.out.println("Laptop Brand is : " + findLaptop.grtBrand());
        System.out.println("Laptop Storage is : " + findLaptop.getStorage());
        System.out.println("Laptop Prize is : " + findLaptop.getPrize());



    }
}
