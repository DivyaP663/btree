/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bproj;

/**
 *
 * @author DivyaPrakash
 */

import java.util.Scanner;
public class btmain extends btreedem{
    
    public static  void main (String [] args) {
        BTree f=btreecon();
    
    
    while(true)
		{  System.out.println("............BTREE...............");
		   System.out.println("Enter your choice");
		   System.out.println("1.BTREE GENERATION");
		   System.out.println("2.DISPLAY");
		   System.out.println("3.SEARCH IN BTREE");
		   System.out.println("4.INSERT NEW VALUE");
                  // System.out.println("5.delete ");
                    System.out.println("5.EXIT");
                    Scanner s = new Scanner(System.in); 
		   int n=s.nextInt();
                   switch(n)
                   {
                   case 1:long st=System.nanoTime();
                       btreecon();System.out.println(btreedem.i);
                       
                       long stp=System.nanoTime();
                       long tot=stp-st;
                        tot=tot/100000;
                       System.out.println("the time taken to for btree generation are "+tot+" mili seconds.");
		          break;
			   
		   case 2:f.print();
		          break;
			   
			   
		   case 3:System.out.println("Enter the p_id to be searched");
		           String var=s.next();
		           
		           long st1=System.nanoTime();
		        	  boolean r= serch(var,f);
		      	long stp1=System.nanoTime();
                       long tot1=stp1-st1;
                       tot1=tot1/100000;
                       System.out.println("the time taken  for search in btree  are "+tot1+" mili seconds.");
                       if(r==false)
                       {
                           System.out.print("enter a valid input\n");
                       }
                       break;
			       
		   case 4:System.out.println("Enter the data to be inserted");
                 
		   System.out.println("enter  p_id:");
		   String p_id=s.next();
		   p_id=p_id.toUpperCase(); 
			 System.out.println("enter patient name:");
			 String patient_name=s.next();
			System.out.println("enter patient gender:");
			 String patient_gender=s.next();
			 System.out.println("enter  patient age:");
			 String patient_age=s.next();
			 System.out.println("enter the patient blood group:");
			 String patient_blood_group=s.next();
			 System.out.println("enter the date of admission:");
			 String date_of_admission=s.next();
			 System.out.println("enter the date of discharge:");
			 String date_of_discharge=s.next();
                         System.out.println("enter the diagnosis:");
			 String diagnosis=s.next();
			      String vt=p_id+","+patient_name+","+patient_gender+","+patient_age+","+patient_blood_group+","+date_of_admission+","+date_of_discharge+","+diagnosis+"";
			      long st2=System.nanoTime();  
                              inst(vt.toString(),f);
                              long stp2=System.nanoTime();
                       long tot2=stp2-st2;
                        tot2=tot2/100000;
                       System.out.println("the time taken  for insertion in btree  are "+tot2+" mili seconds.");
			        break;
                   case 5:System.out.println("Enter the p_id,patient name,patient gender, to be delete ");
                    String sd=s.next();
                    long st3=System.nanoTime(); 
                    extra(sd.toUpperCase());
                       long stp3=System.nanoTime();
                       long tot3=stp3-st3;
                        tot3=tot3/100000;
                       System.out.println("the time taken  for deleting  is "+tot3+" mili seconds.");
                    break;
                   case 6 :System.exit(0);
                }
    
    }   
}
}
