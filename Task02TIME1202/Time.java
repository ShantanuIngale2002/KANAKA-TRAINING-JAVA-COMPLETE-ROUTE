package Task02TIME1202;

import java.util.ArrayList;
import java.util.Scanner;

import Task02TIME1202.TimeTemplate.CreateTime.CreateObj;

public class Time {
    public static void main(String[] args) {
        ArrayList<CreateObj> TimeList = new ArrayList<CreateObj>();
        ArrayList<Integer> indice = new ArrayList<Integer>();
        int printChoice=0; int indiChoice=0; int indiLimit;

        int superSwitchChoice,store;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n\n+++++  HELLO DEAR VISITER WELCOME TO TIME MENU +++++\nEnter the operation you want to perform\n1. Enter the new TIME  ||  2. Add Existing Times || 3. Print All Existing Times\nEnter : ");
            
            superSwitchChoice=sc.nextInt();

            switch (superSwitchChoice) {
                
                case 1:{
                    CreateObj obj=new CreateObj();
                    System.out.print("Enter the hours : ");
                    store=sc.nextInt();
                    while(!obj.setHour(store)){
                        System.out.print("\nInvalid Hour, Enter the hours again : ");
                        store=sc.nextInt();
                    }
                    System.out.print("Enter the Minutes : ");
                    store=sc.nextInt();
                    while(!obj.setMinute(store)){
                        System.out.print("\nInvalid Minutes, Enter the Minutes again : ");
                        store=sc.nextInt();
                    }
                    System.out.print("Enter the Seconds : ");
                    store=sc.nextInt();
                    while(!obj.setSecond(store)){
                        System.out.print("\nInvalid Seconds, Enter the Seconds again : ");
                        store=sc.nextInt();
                    }
                    System.out.println("Time is Successfully Added");
                    TimeList.add(obj);

                    if(TimeList.size()==1){
                        TimeList.add(obj);
                    }

                    break;
                }

                    
                case 2:{
                    System.out.println("Total Number of Active Time are "+(TimeList.size()-1));
                    if(TimeList.size()<3){
                        System.out.println("Unsufficient amount of Objects, Must Add some");
                        continue;
                    }
                    CreateObj obj=new CreateObj();

                    while(true){
                        System.out.print("Choose the option :\t1. Add the required Times only   2. Add all Time\t Choose : ");
                        printChoice=sc.nextInt();
                        if(printChoice==1){
                            System.out.print("Enter the number of elements you want to add (max is "+(TimeList.size()-1)+") : ");
                            indiLimit=sc.nextInt();
                            if(indiLimit<=0 || indiLimit>=TimeList.size()){
                                System.out.println("Invalid input for number of elements.");
                                continue;
                            }
                            while(indiLimit>0){
                                System.out.print("Enter the unselected index between {1 to "+(TimeList.size()-1)+"} : ");
                                indiChoice=sc.nextInt();
                                if(indice.contains(indiChoice)){
                                    System.out.println("Index "+indiChoice+" is already selected.");
                                    continue;
                                }
                                indice.add(indiChoice);
                                indiLimit-=1;
                            }
                            for(Integer i : indice){
                                System.out.println("Obj"+i+" is     "+TimeList.get(i).getHour()+" Hrs.  "+TimeList.get(i).getMinute()+" Mins.  "+TimeList.get(i).getSecond()+" Secs.");
                                obj.addTime_two(obj, TimeList.get(i));
                            }
                            break;
                        }
                        else if(printChoice==2){
                            for(int i=1;i<TimeList.size();i++){
                                System.out.println("Obj"+i+" is     "+TimeList.get(i).getHour()+" Hrs.  "+TimeList.get(i).getMinute()+" Mins.  "+TimeList.get(i).getSecond()+" Secs.");
                                obj.addTime_two(obj, TimeList.get(i));
                            }
                            break;
                        }
                        else{
                            System.out.println("Invalid Add operation Choice.");
                            continue;
                        }
                    }
                    

                    System.out.println("\nThe total Addition becomes : "+obj.getHour()+" Hrs.  "+obj.getMinute()+" Mins.  "+obj.getSecond()+" Secs.");
                    break;
                }

                case 3:{
                    if(TimeList.size()==0){
                        System.out.println("Unsufficient amount of Objects (ie. 0), So Must Add some.");
                        continue;
                    }
                    for(int i=1;i<TimeList.size();i++){
                        System.out.println(i+". "+" Hours : "+TimeList.get(i).getHour()+"  Minutes : "+TimeList.get(i).getMinute()+"  Seconds : "+TimeList.get(i).getSecond());
                    }
                    break;
                }
            
            

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            

            // System.out.println("\n\n\n");
            // sc.close();
        }
    }
}

