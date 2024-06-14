package ZOOstructure;

import java.util.*;


public class zoo{

    public static class Animal{
        public String Type,Origin;
        public float Age,Height,Weight;

        public Animal(){
            Type="Invalid";
            Origin="Invalid";
            Age=000;
            Height=000;
            Weight=000;
        }

        public void AnimalGetInfo(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Type (D/W) : ");
            Type = sc.nextLine();
            if(Type=="D" || Type=="d"){Type="Domestic";}
            else{Type="Wild";}
            System.out.print("Enter the Origin : ");
            Origin = sc.nextLine();
            System.out.print("Enter the Age : ");
            Age = sc.nextFloat();
            System.out.print("Enter the Height(m) : ");
            Height = sc.nextFloat();
            System.out.print("Enter the Weight(kg) : ");
            Weight = sc.nextFloat();

            // sc.close();
        }

        public void AnimalPrintInfo(){
            System.out.println("Type : "+Type);
            System.out.println("Origin : "+Origin);
            System.out.println("Age : "+Age);
            System.out.println("Height: "+Height);
            System.out.println("Weight : "+Weight);
        }

    }


    
    public static class Tiger extends Animal{
        public String TNameID,FurColor;

        public Tiger(){
            TNameID="0000";
            FurColor="Invalid";
        }

        public void getInformation(){
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter the tiger's TNameID : ");
            TNameID = sc.nextLine();
            System.out.print("Enter the FurColor : ");
            FurColor = sc.nextLine();

            AnimalGetInfo();
            
            // sc.close();
        }

        public void printInformation(){
            System.out.println("\nTNameID : "+TNameID);
            System.out.println("FurColor : "+FurColor);

            AnimalPrintInfo();
        }


        
    }
    public static class Elephant extends Animal{
        public String EnameID,SkinColor;

        public Elephant(){
            EnameID="Invalid";
            SkinColor="Invalid";
        }

        public void getInformation(){
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter the Elephant's ENameID : ");
            EnameID = sc.nextLine();
            System.out.print("Enter the SkinColor : ");
            SkinColor = sc.nextLine();

            AnimalGetInfo();

            // sc.close();
        }

        public void printInformation(){
            System.out.println("\nENameID: "+EnameID);
            System.out.println("SkinColor: "+SkinColor);

            AnimalPrintInfo();
        }

    }
}



// public class zoo{
//     public static void main(String[] args) {
//         System.out.println("Hello there");
//     }
// }

