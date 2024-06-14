import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// package Task01ZOO0702;

import ZOOstructure.zoo.Tiger;
import ZOOstructure.zoo.Elephant;

public class zooRun {
    public static void main(String[] args) {
        List<Tiger> TigerList = new ArrayList<Tiger>();
        List<Elephant> ElephantList = new ArrayList<Elephant>();

        int choice1,choice2;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("+++++  HELLO DEAR VISITER WELCOME TO ZOO MENU +++++\nEnter the operation you want to perform\t1. Enter the new Information  ||  2. Print Existing Information\nEnter : ");
            choice1=sc.nextInt();
            switch (choice1) {
                case 1:
                    System.out.print("To Enter Information Select Animal >> 1. Tiger  2. Elephant\nEnter : ");
                    choice2=sc.nextInt();
                    switch (choice2) {
                        case 1:
                            Tiger tobj = new Tiger();
                            tobj.getInformation();
                            TigerList.add(tobj);
                            break;
                        case 2:
                            Elephant eobj = new Elephant();
                            eobj.getInformation();
                            ElephantList.add(eobj);
                            break;
                    
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;

                    
                case 2:
                    System.out.print("To Print Information Select Animal >> 1. Tiger  2. Elephant\nEnter : ");
                    choice2=sc.nextInt();
                    switch (choice2) {
                        case 1:
                            if(TigerList.size()==0){
                                System.out.println("Sorry, There exist no data on Tigers currently.");
                                break;
                            }
                            for(Tiger i:TigerList){
                                i.printInformation();
                            }
                            break;
                        case 2:
                            if(ElephantList.size()==0){
                                System.out.println("Sorry, There exist no data on Elephants currently.");
                                break;
                            }
                            for(Elephant i:ElephantList){
                                i.printInformation();
                            }
                            break;
                    
                        default:
                            System.out.println("Invalid input");
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            

            System.out.println("\n");
            // sc.close();
        }
    }
    
    
}
