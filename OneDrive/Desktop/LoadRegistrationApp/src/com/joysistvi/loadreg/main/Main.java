
package com.joysistvi.loadreg.main;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double loadBalance = 100.0;
    
    
    public static void main(String[] args) {
        // clearScreen  
        validateUssdCode();
         
         while (true) {
             // Exceptions Handling: trycatch statement
             validateUssdCode();
         }
         
    }
    
    
   public static void validateUssdCode() {
        System.out.println("Dial *123# to access Sun Services ");
       System.out.println("Enter USSD Code:  ");
       String ussdCode = scanner.nextLine();
       
       // validation
       if (ussdCode.isEmpty() || !ussdCode.equals("*123#")) {
           System.out.println("Invalid USSD Code. Exiting...");
           System.exit(0); // 
       }
       
       mainMenu();
       
       
   } 
    public static  void mainMenu() {
        System.out.println("**   Load Registration   **");
        System.out.println("   [1] Power of All Promos");
        System.out.println("   [2] Magic Data Promos");
        System.out.println("   [3] All Data Promo");
        System.out.println("   [4] High Volume Magic Data");
        System.out.println("   [5] Check Balance");
        System.out.println("   [6] Exit");
        System.out.print("Enter Your Choice: ");
        
        int mainMenuChoice = scanner.nextInt();
        
        switch(mainMenuChoice) {
            case 1:
                PowerofAllPromo();
                break;
             
            case 2:
               MagicDataPromo();
                break;
                
            case 3:
                AllDataPromo();
                break;
                
            case 4: 
                GigaPromo();
                break;
            
            case 5:
                HighVolumeMagicDataPromo();
                break;
                
            case 6:
               checkBalance();
                break;
               
            default: 
                System.out.println("Invalid Choice!");
        }
        
    }
    
    public static void PowerofAllPromo() {
        System.out.println("   Enjoy Power All Promos!");
        System.out.println("    [1] 7 Day for P99 | 8 GB open-access data + Unlimited TikTok everyday + Unli Texts to All Networks.");
        System.out.println("    [2] 7 Days for P149 | 12 GB open-access data + Unlimited TikTok everyday + Unli Calls & Texts to All Networks.");
        System.out.println("    [3] Back");
        int PowerofAllPromo = scanner.nextInt();
        
        System.out.print("Enter Your Choice: ");
        
        switch (PowerofAllPromo) {
            case 1:
                break;
             
            case 2:
                break;
                
            case 3:
                break;
                   
            default:
                System.out.println("Invalid Choice!");
        }
    }
    
    public static void MagicDataPromo() {
        System.out.println("   Enjoy Magic Data Promo! (No Expiry Data) ");
        System.out.println("   [1] No Expiry for P99 | 2 GB open-access data.");
        System.out.println("   [2] No Expiry for P149 | 2 GB open-access data + 50 mins All-Net Calls + 50 All-Net Texts. | 24 GB open-access data.");
        System.out.println("   [3] No Expiry for P149 | 24 GB open-access data.");
        System.out.println("   [4] Back");
        int MagicDataPromo = scanner.nextInt();
        
        System.out.print("Enter your Choice: ");
        
        switch (MagicDataPromo) {
            case 1: 
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
                
            default:
                System.out.println("Invalid Choice");
        }
        
    }
    
    public static void AllDataPromo() {
        System.out.println("     Enjoy All Data Promo!");
        System.out.println("      [1] 7 Days for P99 | 6 GB shareable data for all sites.");
        System.out.println("      [2] 7 Days for 149 | 6 GB shareable data for all sites + Unlimited Calls & Texts to All Networks.");
        System.out.println("      [3] Back");
        int AllDataPromo = scanner.nextInt();
        
        System.out.print("Enter Your Choice: ");
        
        switch (AllDataPromo) {
            case 1:
                break;
                
            case 2:
                break;
                
            case 3: 
                break;
                
            default:
                System.out.println("Invalid Choice");
        }
        
        
    }

    public static void GigaPromo() {
        System.out.println("        Enjoy Giga Promos!");
        System.out.println("        [1] Giga video 99 for 7 Days | 2 GB open-access data + 1 GB every day for YouTube, Netflix, and Smart Livestream.");
        System.out.println("        [2] Giga Stories for 7 Days | 2 GB open-access data + 1 GB every day for TikTok, Instagram, Facebook, and X (Twitter)");
        System.out.println("        [3] Back");
        int GigaPromo = scanner.nextInt();
        
        System.out.print("Enter Your Choice: ");
        
        switch (GigaPromo) {
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            default:
                System.out.println("Invalid Choice!");
        }
    }
   
    public static void HighVolumeMagicDataPromo() {
        System.out.println("      Enjoy High Volume Magic Data Promos");
        System.out.println("      [1] Magic Data 499 | No Expiry! | 36 GB open-access data.");
        System.out.println("      [2] Magic Data 599 | No Expiry | 48 GB open-access data.");
        System.out.println("      [3] Magic Data +749 | No Expiry! | 48 GB open-access data + 300 mins All-Net Calls + 300 All-Net Texts.");
        System.out.println("      [4] Back");
        int HighVolumeMagicDataPromo = scanner.nextInt();
        
        System.out.print("Enter Your Choice: ");
        
        switch (HighVolumeMagicDataPromo) {
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4: 
                break;
                
            default:
                System.out.println("Invalid Choice!");
                
        }
    }
    
    public static void SubcriptionConfirmation(String promo, int days, int price) {
        System.out.println("-> Get " + promo + "good for" + days + "Day/s for " + price);
        System.out.println("      [1] Subscribe");
        System.out.println("      [2] Back");
        System.out.println("      [3] Exit");
        System.out.println("Enter Your Choice: ");
        int ConfirmationChoice = scanner.nextInt();
        
        if (ConfirmationChoice == 1) {
            if (loadBalance >= price) {
                loadBalance -= price;
               
                System.out.println("You have enough balance!");
                
                System.out.println("Remaining Balance: P" + loadBalance);
                14
            } else {
            System.out.println("Insufficient Load Balance");
            }
        } else if (ConfirmationChoice == 2) {
            mainMenu();
        } else if (ConfirmationChoice == 3) {
            System.out.println("Thank you for using this!");
        } else {
            System.out.println("Invalid Choice!");
        }
        
        
       
    }
    
       public static void checkBalance() {
            System.out.println("Your current load balance is P" + loadBalance);
           
                
            }
        }
 

  //  Dial Code 
    /*  Main Menu 
       Balance 
       Text Only
       Call Only
        Combo
       Go Surf
    
      */  
