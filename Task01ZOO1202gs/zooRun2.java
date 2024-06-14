import ZOOstructure02.zoo2.Tiger;
import ZOOstructure02.zoo2.Elephant;
import java.util.ArrayList;
import java.util.Scanner;

public class zooRun2 {
    public static void main(String[] args) {
        ArrayList<Tiger> TigerList = new ArrayList<Tiger>();
        ArrayList<Elephant> ElephantList = new ArrayList<Elephant>();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int choice1,choice2;
        String tempString;
        float tempFloat;

        while (true) {
            System.out.print("\n\n+++++  HELLO DEAR VISITER WELCOME TO ZOO MENU +++++\nEnter the operation you want to perform\t1. Enter the new Information  ||  2. Print Existing Information\nEnter : ");
            choice1=sc.nextInt();
            switch (choice1) {
                case 1:{
                    System.out.print("\nTo Enter Information Select Animal >> 1. Tiger  2. Elephant\nEnter : ");
                    choice2=sc.nextInt();
                    switch (choice2) {
                        case 1:
                            Tiger tobj = new Tiger();
                            System.out.print("\nEnter the Tiger ID : ");
                            tempString=sc2.nextLine();
                            tobj.setTNameID(tempString);
                            System.out.print("Enter the Tiger Furr Color : ");
                            tempString=sc2.nextLine();
                            tobj.setFurColor(tempString);
                            System.out.print("Enter the Tiger Type (D/W) : ");
                            tempString=sc2.nextLine();
                            tobj.setType(tempString);
                            System.out.print("Enter the Tiger Origin : ");
                            tempString=sc2.nextLine();
                            tobj.setOrigin(tempString);
                            System.out.print("Enter the Tiger Age : ");
                            tempFloat=sc.nextFloat();
                            tobj.setAge(tempFloat);
                            System.out.print("Enter the Tiger Height : ");
                            tempFloat=sc.nextFloat();
                            tobj.setHeight(tempFloat);
                            System.out.print("Enter the Tiger Weight : ");
                            tempFloat=sc.nextFloat();
                            tobj.setWeight(tempFloat);
                            
                            TigerList.add(tobj);
                            break;

                        case 2:
                            Elephant eobj = new Elephant();
                            System.out.print("\nEnter the Elephant ID : ");
                            tempString=sc2.nextLine();
                            eobj.setENameID(tempString);
                            System.out.print("Enter the Elephant Skin Color : ");
                            tempString=sc2.nextLine();
                            eobj.setSkinColor(tempString);
                            System.out.print("Enter the Elephant Type (D/W) : ");
                            tempString=sc2.nextLine();
                            eobj.setType(tempString);
                            System.out.print("Enter the Elephant Origin : ");
                            tempString=sc2.nextLine();
                            eobj.setOrigin(tempString);
                            System.out.print("Enter the Elephant Age : ");
                            tempFloat=sc.nextFloat();
                            eobj.setAge(tempFloat);
                            System.out.print("Enter the Elephant Height : ");
                            tempFloat=sc.nextFloat();
                            eobj.setHeight(tempFloat);
                            System.out.print("Enter the Elephant Weight : ");
                            tempFloat=sc.nextFloat();
                            eobj.setWeight(tempFloat);

                            ElephantList.add(eobj);
                            break;
                    
                        default:
                            System.out.println("\nInvalid input");
                            break;
                        
                    }
                    break;
                }
                case 2:{
                    System.out.print("\nTo Print Information Select Animal >> 1. Tiger  2. Elephant\nEnter : ");
                    choice2=sc.nextInt();
                    switch (choice2) {
                        case 1:
                            if(TigerList.size()==0){
                                System.out.println("\nNo Tiger Records, Must Add Some");
                                continue;
                            }
                            for(Tiger obj:TigerList){
                                System.out.println("\nTiger ID         : "+obj.getTNameID());
                                System.out.println("Tiger Furr Color : "+obj.getFurColor());
                                System.out.println("Tiger Type       : "+obj.getType());
                                System.out.println("Tiger Origin     : "+obj.getOrigin());
                                System.out.println("Tiger Age        : "+obj.getAge());
                                System.out.println("Tiger Height     : "+obj.getHeight());
                                System.out.println("Tiger Weight     : "+obj.getWeight());
                            }
                            break;
                        case 2:
                            if(ElephantList.size()==0){
                                System.out.println("\nNo Elphants Records, Must Add Some");
                                continue;
                            }
                            for(Elephant obj:ElephantList){
                                System.out.println("\nElephant ID         : "+obj.getENameID());
                                System.out.println("Elephant Furr Color : "+obj.getSkinColor());
                                System.out.println("Elephant Type       : "+obj.getType());
                                System.out.println("Elephant Origin     : "+obj.getOrigin());
                                System.out.println("Elephant Age        : "+obj.getAge());
                                System.out.println("Elephant Height     : "+obj.getHeight());
                                System.out.println("Elephant Weight     : "+obj.getWeight());
                            }
                            break;
                    
                        default:
                            System.out.println("\nInvalid input");
                            break;
                    }
                    break;
                }

            }
        }
    }
}


// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// // package Task01ZOO0702;

// import ZOOstructure.zoo.Tiger;
// import ZOOstructure.zoo.Elephant;

// public class zooRun {
//     public static void main(String[] args) {
//         
//         while (true) {
//             System.out.print("+++++  HELLO DEAR VISITER WELCOME TO ZOO MENU +++++\nEnter the operation you want to perform\t1. Enter the new Information  ||  2. Print Existing Information\nEnter : ");
//             choice1=sc.nextInt();
//             switch (choice1) {
//                 case 1:
//                     System.out.print("To Enter Information Select Animal >> 1. Tiger  2. Elephant\nEnter : ");
//                     choice2=sc.nextInt();
//                     switch (choice2) {
//                         case 1:
//                             Tiger tobj = new Tiger();
//                             tobj.getInformation();
//                             TigerList.add(tobj);
//                             break;
//                         case 2:
//                             Elephant eobj = new Elephant();
//                             eobj.getInformation();
//                             ElephantList.add(eobj);
//                             break;
                    
//                         default:
//                             System.out.println("Invalid input");
//                             break;
//                     }
//                     break;

                    
//                 case 2:
//                     System.out.print("To Print Information Select Animal >> 1. Tiger  2. Elephant\nEnter : ");
//                     choice2=sc.nextInt();
//                     switch (choice2) {
//                         case 1:
//                             if(TigerList.size()==0){
//                                 System.out.println("Sorry, There exist no data on Tigers currently.");
//                                 break;
//                             }
//                             for(Tiger i:TigerList){
//                                 i.printInformation();
//                             }
//                             break;
//                         case 2:
//                             if(ElephantList.size()==0){
//                                 System.out.println("Sorry, There exist no data on Elephants currently.");
//                                 break;
//                             }
//                             for(Elephant i:ElephantList){
//                                 i.printInformation();
//                             }
//                             break;
                    
//                         default:
//                             System.out.println("Invalid input");
//                             break;
//                     }
//                     break;

//                 default:
//                     System.out.println("Invalid Input");
//                     break;
//             }
            

//             System.out.println("\n");
//             // sc.close();
//         }
//     }
    
    
// }
