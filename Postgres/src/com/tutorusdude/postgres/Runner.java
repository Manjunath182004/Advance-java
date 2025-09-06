package com.tutorusdude.postgres;

import com.tutorusdude.postgres.dto.MobileRechargeDto;
import com.tutorusdude.postgres.repository.MobileRechargeRepository;
import com.tutorusdude.postgres.service.MobileRechargeService;

import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        MobileRechargeService service = new MobileRechargeService(new MobileRechargeRepository());
        MobileRechargeRepository repository = new MobileRechargeRepository();

        // insert
//        MobileRechargeDto dto = new MobileRechargeDto(
//                901134,
//                "1.5/Day limited calls",
//                "Prepaid",
//                "Airtel",
//                500,
//                "Gpay"
//        );
//
//        service.doRecharge(dto);

         //update
//        MobileRechargeDto updateDto = new MobileRechargeDto();
//        updateDto.setSim("Airtel");
//        updateDto.setPlan("Plan-299");
//        service.updateRecharge(updateDto);
//
//        // delete
//        MobileRechargeDto deleteDto = new MobileRechargeDto();
//        deleteDto.setPhoneNumber(901919);
//        service.deleteRecharge(deleteDto);


        // readAll
//        service.getAllRecharges();

        //find by plan
//        List<MobileRechargeDto> planList = service.findByPlan("Plan-299");
//        System.out.println(planList);

        // Get All Plans
//        List<String> plans = service.getAllPlans();
//        System.out.println("Available plans: " + plans);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====== Mobile Recharge Menu =====");
            System.out.println("1. Insert Recharge");
            System.out.println("2. Update Recharge");
            System.out.println("3. Delete Recharge");
            System.out.println("4. Read All Recharge");
            System.out.println("5. Find by plan");
            System.out.println("6. Show All plans");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: // Insert
                    System.out.print("Enter Phone Number: ");
                    int phone = scanner.nextInt();

                    System.out.print("Enter a Plan: ");
                    String plan = scanner.nextLine();

                    scanner.nextLine();

                    System.out.print("Enter Recharge Type (Prepaid/paid): ");
                    String  type = scanner.nextLine();

                    System.out.print("Enter Sim Name: ");
                    String sim = scanner.nextLine();

                    System.out.print("Enter Balance: ");
                    int balance = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Payment Method (Through): ");
                    String through = scanner.nextLine();

                    MobileRechargeDto dto = new MobileRechargeDto(phone, plan, type, sim, balance, through);
                    service.doRecharge(dto);
                    break;

                case 2:// Update
                    scanner.nextLine();
                    System.out.print("Enter Sim Name to update plan: ");
                    String simName = scanner.nextLine();

                    System.out.print("Enter New Plan: ");
                    String newPlan = scanner.nextLine();

                    MobileRechargeDto updateDto = new MobileRechargeDto();
                    updateDto.setSim(simName);
                    updateDto.setPlan(newPlan);
                    service.updateRecharge(updateDto);

                    break;

                case 3: // Delete
                    System.out.print("Enter Phone Number to delete: ");
                    int delPhone = scanner.nextInt();

                    MobileRechargeDto deleteDto = new MobileRechargeDto();
                    deleteDto.setPhoneNumber(delPhone);

                    service.deleteRecharge(deleteDto);
                    break;

                case 4: // Read All
                    List<MobileRechargeDto> all = service.getAllRecharges();
                    System.out.println(all);

                case 5: // Find by Plan
                    scanner.nextLine();
                    System.out.print("Enter Plan to search: ");
                    String searchPlan = scanner.nextLine();

                    List<MobileRechargeDto> planList = service.findByPlan(searchPlan);
                    System.out.println(planList);
                    break;

                case 6: // Show All Plans
                    List<String> plans = service.getAllPlans();
                    System.out.println("Available Plans: " + plans);
                    break;

                case 7: // Exit
                    System.out.println("Exiting program. Bye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        }

    }
}
