package com.tutorusdude.datatransferobjects.DtoExamples;

public class LaptopStorage {

    LaptopDTO[] dtoValues = new LaptopDTO[5];

    public boolean saveLaptop(LaptopDTO dto){
        if (dto!=null){
            if(dto.grtBrand()!=null && dto.grtBrand().length()>=2){
                if (dto.getStorage() >= 8){
                    if (dto.getOperatingSystem()!=null && dto.getOperatingSystem().length()>4){
                        for (int i = 0; i < dtoValues.length; i++) {
                            if (dtoValues[i]==null){
                                dtoValues[i] = dto;
                                System.out.println("Laptop Data Is Saved Successfully");
                                return true;
                            }
                        }
                    }
                    System.out.println("Given Operating System Is Not valid");
                    return false;
                }
                System.out.println("Given Input Storage Is Not Valid");
                return false;
            }
            System.out.println("Given Brand is Not Valid");
            return false;
        }
        System.out.println("Given Input is Not Valid Please Re-enter");
        return false;
    }

    public LaptopDTO[] readAll(){
        return dtoValues;
    }

    public LaptopDTO findByLaptop(String brandName){
        if (brandName!=null && brandName.length()>=2){
            for (int i = 0; i < dtoValues.length; i++) {
                if (dtoValues[i]!= null){
                    if (dtoValues[i].grtBrand().equals(brandName)){
                        return dtoValues[i];
                    }
                }
            }
            System.out.println("Given Brand Name is not Present");
            return null;
        }
        System.out.println("Given Brand Is not Valid");
        return null;
    }
}
