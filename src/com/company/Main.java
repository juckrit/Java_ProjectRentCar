package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Car> carArrayList = new ArrayList<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean run = true;

    public static void main(String[] args) throws IOException {
        createCar(carArrayList);
        printOption();
//        System.out.println(carArrayList.size());
        do {
            System.out.println("Enter Option (Press 0 to Display Available Options)");
            int input = enterNumber();
            switch (input) {
                case 0:
                    printOption();
                    break;
                case 1:
                    displayCar();
                    break;
                case 2:
                    Car rentedCar = rentCar();
                    if (rentedCar!=null){
                        modifyCarStatus(rentedCar);
                        calculatePrice(rentedCar);
                    }else {
                        continue;
                    }
                    break;
                case 3:
                    searchByBrand();
                    break;
                case 4:
                    System.out.println("Shutting Down....");
                    run = false
                    ;
                    break;
                default:
                    System.out.println("Only 1-4!!!");
                    continue;


            }
        } while (run);


    }

    private static void createCar(ArrayList carArrayList) {
        carArrayList.add(new Car("Toyota", "Fortuner", "Auto", "white", "Available", 1500));
        carArrayList.add(new Car("Toyota", "Fortuner", "Auto", "Black", "Available", 1500));
        carArrayList.add(new Car("Toyota", "Fortuner", "Manual", "white", "Available", 1300));
        carArrayList.add(new Car("Toyota", "Fortuner", "Manual", "Black", "Available", 1300));

        carArrayList.add(new Car("Toyota", "Camry", "Auto", "white", "Available", 1000));
        carArrayList.add(new Car("Toyota", "Camry", "Auto", "Black", "Available", 1000));
        carArrayList.add(new Car("Toyota", "Camry", "Manual", "white", "Available", 900));
        carArrayList.add(new Car("Toyota", "Camry", "Manual", "Black", "Available", 900));

        carArrayList.add(new Car("Toyota", "Altis", "Auto", "white", "Available", 800));
        carArrayList.add(new Car("Toyota", "Altis", "Auto", "Black", "Available", 800));
        carArrayList.add(new Car("Toyota", "Altis", "Manual", "white", "Available", 750));
        carArrayList.add(new Car("Toyota", "Altis", "Manual", "Black", "Available", 750));

        carArrayList.add(new Car("Toyota", "Vios", "Auto", "white", "Available", 500));
        carArrayList.add(new Car("Toyota", "Vios", "Auto", "Black", "Available", 500));
        carArrayList.add(new Car("Toyota", "Vios", "Manual", "white", "Available", 400));
        carArrayList.add(new Car("Toyota", "Vios", "Manual", "Black", "Available", 400));

        carArrayList.add(new Car("Honda", "CRV", "Auto", "white", "Available", 1000));
        carArrayList.add(new Car("Honda", "CRV", "Auto", "Black", "Available", 1000));


        carArrayList.add(new Car("Honda", "Accord", "Auto", "white", "Available", 1100));
        carArrayList.add(new Car("Honda", "Accord", "Auto", "Black", "Available", 1100));
        carArrayList.add(new Car("Honda", "Accord", "Manual", "white", "Available", 1050));
        carArrayList.add(new Car("Honda", "Accord", "Manual", "Black", "Available", 1050));

        carArrayList.add(new Car("Honda", "Civic", "Auto", "white", "Available", 900));
        carArrayList.add(new Car("Honda", "Civic", "Auto", "Black", "Available", 900));
        carArrayList.add(new Car("Honda", "Civic", "Manual", "white", "Available", 850));
        carArrayList.add(new Car("Honda", "Civic", "Manual", "Black", "Available", 850));

        carArrayList.add(new Car("Honda", "City", "Auto", "white", "Available", 500));
        carArrayList.add(new Car("Honda", "City", "Auto", "Black", "Available", 500));
        carArrayList.add(new Car("Honda", "City", "Manual", "white", "Available", 400));
        carArrayList.add(new Car("Honda", "City", "Manual", "Black", "Available", 400));

        carArrayList.add(new Car("Misubishi", "Pajero", "Auto", "white", "Available", 1500));
        carArrayList.add(new Car("Misubishi", "Pajero", "Auto", "Black", "Available", 1500));
        carArrayList.add(new Car("Misubishi", "Pajero", "Manual", "white", "Available", 1300));
        carArrayList.add(new Car("Misubishi", "Pajero", "Manual", "Black", "Available", 1300));

        carArrayList.add(new Car("Misubishi", "Triton", "Auto", "white", "Available", 1000));
        carArrayList.add(new Car("Misubishi", "Triton", "Auto", "Black", "Available", 1000));
        carArrayList.add(new Car("Misubishi", "Triton", "Manual", "white", "Available", 900));
        carArrayList.add(new Car("Misubishi", "Triton", "Manual", "Black", "Available", 900));

        carArrayList.add(new Car("Mazda", "Mazda2", "Auto", "white", "Available", 700));
        carArrayList.add(new Car("Mazda", "Mazda2", "Auto", "Black", "Available", 700));
        carArrayList.add(new Car("Mazda", "Mazda2", "Manual", "white", "Available", 600));
        carArrayList.add(new Car("Mazda", "Mazda2", "Manual", "Black", "Available", 600));

        carArrayList.add(new Car("Mazda", "Mazda3", "Auto", "white", "Available", 750));
        carArrayList.add(new Car("Mazda", "Mazda3", "Auto", "Black", "Available", 750));
        carArrayList.add(new Car("Mazda", "Mazda3", "Manual", "white", "Available", 700));
        carArrayList.add(new Car("Mazda", "Mazda3", "Manual", "Black", "Available", 700));


        carArrayList.add(new Car("Nissan", "Teana", "Auto", "white", "Available", 1000));
        carArrayList.add(new Car("Nissan", "Teana", "Auto", "white", "Available", 1000));
        carArrayList.add(new Car("Nissan", "Teana", "Auto", "white", "Available", 1000));
        carArrayList.add(new Car("Nissan", "Teana", "Auto", "white", "Available", 1000));


    }

    private static void displayCar() {
        System.out.println("This is all cars");
        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.printf("%5d --> %s\n", i + 1, carArrayList.get(i).toString());
        }
    }



    private static void printOption() {
        System.out.println("0-> Display Options");
        System.out.println("1-> Display All Cars");
        System.out.println("2-> Rent a Car");
        System.out.println("3-> Search Car by Brand Name");
        System.out.println("4-> Exit Program");

    }

    private static Car rentCar() throws IOException {
        displayCar();
        boolean stayInThisLoop = true;
        int carIndex;
        System.out.println("Enter Car Number to be Rent");
        do {
            carIndex = enterNumber0To49Only();
            stayInThisLoop=false;
        }while (stayInThisLoop);
        System.out.printf("You are going to rent %s\n",carArrayList.get(carIndex));
        int sure = areYouSure();
        if (sure==1){
            return carArrayList.get(carIndex);
        }else {
            return null;
        }


    }

    private static void modifyCarStatus(Car rentedCar){
        rentedCar.setStatus("Rented");
    }

    private static void calculatePrice(Car modifiedCar) throws IOException {
        System.out.printf("You rent %s with %d per day\n",modifiedCar.getModel(),modifiedCar.getPricePerDay());
        boolean stayInThisLoop = true;
        int day = 0;
        do {
            System.out.println("How many day would you like to rent?");
            day = enterNumber();
            stayInThisLoop = false;
        }while (stayInThisLoop);
        int sure = areYouSure();
        if (sure==1){
            System.out.println("-------------------------");
            System.out.printf("You rent %s for %d day(s)\n",modifiedCar.getModel(),day);
            System.out.printf("Total Price = %d\n",modifiedCar.getPricePerDay()*day);
            System.out.println("--------Done-------------");
        }else {
            System.out.println("No Problem, Welcome bye bye...");
        }

    }

    private static int enterNumber() throws IOException {
        int output = -99 ;
        boolean stayInThisLoop = true;
        do {
            try {
                System.out.println("Enter number");
                output = Integer.parseInt(reader.readLine());
                if (output>=0){
                    stayInThisLoop=false;
                    return output;
                }else {
                    System.out.println("Positive Number Only");
                    continue;
                }
            }catch (Throwable t){
                System.out.println("Enter number only!!!");
                continue;
            }

        }while (stayInThisLoop);
        return output;
    }

    private static int enterNumber0To49Only() throws IOException {
        int output = -99 ;
        boolean stayInThisLoop = true;
        do {
            try {
                System.out.println("Enter number 1-49 Only");
                output = Integer.parseInt(reader.readLine());
                if (output>=0&&output<=49){
                    stayInThisLoop=false;
                    return output;
                }else {
                    System.out.println("1-49 Only");
                    continue;
                }
            }catch (Throwable t){
                System.out.println("Enter number only!!!");
                continue;
            }

        }while (stayInThisLoop);

        return output;
    }
    private static int areYouSure() throws IOException {
        int output = -99 ;
        boolean stayInThisLoop = true;
        do {
            try {
                System.out.println("Are you sure?");
                System.out.println("1-> Yes, I am sure ");
                System.out.println("2-> No, Please ignore");
                output = Integer.parseInt(reader.readLine());
                if (output>=0&&output<=49){
                    stayInThisLoop=false;
                    return output;
                }else {
                    System.out.println("1-2 Only");
                    continue;
                }
            }catch (Throwable t){
                System.out.println("Enter number only!!!");
                continue;
            }

        }while (stayInThisLoop);
        return output;
    }

    private static void searchByBrand() throws IOException {
        System.out.println("Enter Brand Name");
        String brandName = reader.readLine();
        int count = 0;
        ArrayList<Car> carFound = new ArrayList<>();
        for (int i=0;i<carArrayList.size();i++){
            if (brandName.equalsIgnoreCase(carArrayList.get(i).getBrandName())){
                count++;
                carFound.add(carArrayList.get(i));
            }
        }
        System.out.println("Found " + count + " car(s)");
        for (int i=0;i<carFound.size();i++){
            System.out.println(carFound.get(i));
        }
    }

}
