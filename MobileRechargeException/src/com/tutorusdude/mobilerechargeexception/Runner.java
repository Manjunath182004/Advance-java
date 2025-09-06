package com.tutorusdude.mobilerechargeexception;

import com.tutorusdude.mobilerechargeexception.dto.MobileRechargeDto.RechargeRequest;
import com.tutorusdude.mobilerechargeexception.dto.MobileRechargeDto.RechargeResult;
import com.tutorusdude.mobilerechargeexception.dto.PlanDto;
import com.tutorusdude.mobilerechargeexception.exception.InsufficientBalanceException;
import com.tutorusdude.mobilerechargeexception.exception.InvalidRechargeResult;
import com.tutorusdude.mobilerechargeexception.exception.PhoneNumberNotExitsException;
import com.tutorusdude.mobilerechargeexception.exception.PlanNotExitsException;
import com.tutorusdude.mobilerechargeexception.service.MobileRechargeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MobileRechargeService service = new MobileRechargeService();

        // Adding Plans
        List<PlanDto> plans = new ArrayList<PlanDto>();
        plans.add(new PlanDto("28 Days Unlimited Calls 1.5GB/Day", 299));
        plans.add(new PlanDto("28 Days Unlimited Calls 3GB/Day", 599));
        plans.add(new PlanDto("84 Days Unlimited Calls 1.5GB/Day", 719));
        plans.add(new PlanDto("84 Days Unlimited Calls 2GB/Day", 999));
        plans.add(new PlanDto("365 Days Unlimited Calls 2GB/Day", 2999));
        plans.add(new PlanDto("28 Days Unlimited Calls 4GB/Day", 799));
        plans.add(new PlanDto("28 Days Unlimited Calls 6GB/Day", 1199));
        plans.add(new PlanDto("84 Days Unlimited Calls 3GB/Day", 1499));
        plans.add(new PlanDto("28 Days 100 Minutes 1GB/Day", 179));
        plans.add(new PlanDto("28 Days 500 Minutes 1.5GB/Day", 249));
        plans.add(new PlanDto("28 Days Unlimited Calls+SMS 2GB/Day", 449));
        plans.add(new PlanDto("84 Days Unlimited Calls+SMS 2.5GB/Day", 1199));
        plans.add(new PlanDto("56 Days Unlimited Calls 2GB/Day Weekend Bonus", 699));
        plans.add(new PlanDto("28 Days Unlimited Calls 1GB/Day Night Pack", 199));

        for (PlanDto plan : plans){
            service.addPlan(plan);
        }

        while (true) {

            System.out.println("-----Pic Your Choice-------");

            System.out.println("1. Show Available Plans");
            System.out.println("2. Do Recharge");
            System.out.println("3. View Recharge History");
            System.out.println("4. Exit");

            System.out.println("Enter your Choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("----Available Plans---");

                        for (int i = 0; i < plans.size(); i++) {
                            System.out.println((i + 1) + ". " + plans.get(i).getPlanName() + " | ₹" + plans.get(i).getPrice());

                        }
                        break;

                    case 2:
                        System.out.println("Enter Your Phone Number: ");
                        Long phone = scanner.nextLong();

                        System.out.println("Enter your A/C Balance: ");
                        int balance = scanner.nextInt();

                        System.out.println("Select your plan: ");
                        for (int i = 0; i < plans.size(); i++) {
                            System.out.println((i + 1) + ". " + plans.get(i).getPlanName() + " | ₹" + plans.get(i).getPrice());

                        }

                        int planChoice = scanner.nextInt();
                        if (planChoice < 1 || planChoice > plans.size()){
                            System.out.println("Invalid Plan Selection");
                            throw new PlanNotExitsException("Plan Not Exits...");
                        }

                        PlanDto selectedPlan = plans.get(planChoice - 1);
                        doRecharge(service, phone, selectedPlan, balance);
                        break;

                    case 3:
                        System.out.println("Enter your Phone Number to View History: ");
                        Long historyPhone = scanner.nextLong();
                        printRechargeHistory(service, historyPhone);
                        break;


                    case 4:
                        System.out.println("Existing....Thank you!");
                        scanner.close();


                    default:
                        System.out.println("Invalid choice! Please try again.");
                }

            }  catch (InsufficientBalanceException | InvalidRechargeResult | PhoneNumberNotExitsException | PlanNotExitsException e){
                e.printStackTrace();
            }
        }
    }

    private static void doRecharge(MobileRechargeService service, Long phoneNumber, PlanDto plan, int balance) throws InsufficientBalanceException, InvalidRechargeResult, PlanNotExitsException{
        RechargeRequest request = new RechargeRequest(
                phoneNumber,
                plan,
                "prepaid",
                "Jio",
                balance,
                "UPI"
        );

        RechargeResult result = new RechargeResult(false, "", "");
        boolean status = service.doRecharge(request, result);

        System.out.println("--- Recharge Attempt ---");
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Plan: " + plan.getPlanName() + " | ₹" + plan.getPrice());
        System.out.println("Balance: ₹" + balance);
        System.out.println("Message: " + result.getMessage());
    }

    private static void printRechargeHistory(MobileRechargeService service, Long phoneNumber) throws PhoneNumberNotExitsException, PlanNotExitsException {
        System.out.println("--- Recharge History for Phone Number: " + phoneNumber + " ---");
        List<RechargeRequest> history = service.getRechargesByPhone(phoneNumber);

        if (history.isEmpty()) {
            System.out.println("No recharge result for this number. Please recharge!");
        } else {
            int count = history.size();
            for (RechargeRequest r : history) {
                System.out.println("Plan: " + r.getPlan().getPlanName() + " | ₹" + r.getPlan().getPrice());
            }
            System.out.println("Total Successful Recharges: " + count);
        }
    }
}
