/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;

enum amount
{
    QUATERLY{
        public String toString() {
            return "QUATERLY";
        }
    },
    MONTHLY{
        public String toString() {
            return "MONTHLY";
        }
    },
    YEARLY{
        public String toString() {
            return "YEARLY";
        }
    },
    ONE_TIME{
        public String toString() {
            return "ONE_TIME";
        }
    };
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
	   // for(int i=0;i<10;i++)
	   // {
	   //     System.out.println();
	   //     int policynumber = sc.nextInt();
	   //     sc.nextLine();
	   //     String policyName = sc.nextLine();
	   //     String holderName = sc.nextLine();
	   //     String address = sc.nextLine();
	   //     String amount = sc.nextInt();
	   // }
	   
	   //HashMap<Integer,Insurance> hm = new HashMap<Integer,Insurance>();
	   //hm.put(321,new Insurance(312,"I","GHY","RT-Nagar",amount.QUATERLY.toString()));
	   //hm.put(456,new Insurance(456,"Q","DRE","BT-Nagar",amount.MONTHLY.toString()));
	   //hm.put(123,new Insurance(123,"C","SLO","Veeranpalya",amount.YEARLY.toString()));
	   //hm.put(321,new Insurance(321,"H","KIO","Sultanpalya",amount.ONE_TIME.toString()));
	   //hm.put(213,new Insurance(213,"S","ASE","Manoranpalya",amount.QUATERLY.toString()));
	   //hm.put(678,new Insurance(678,"L","JUK","Tech Park",amount.YEARLY.toString()));
	   //hm.put(823,new Insurance(823,"E","AQW","Manyata",amount.ONE_TIME.toString()));
	   //hm.put(908,new Insurance(908,"J","HYU","Cognizant",amount.MONTHLY.toString()));
	   //hm.put(231,new Insurance(231,"A","WER","Mysore",amount.QUATERLY.toString()));
	   //hm.put(555,new Insurance(555,"G","SED","Banglore",amount.MONTHLY.toString()));
	   
	   ArrayList<Insurance> hm = new ArrayList<Insurance>();
	   hm.add(new Insurance(312,"I","GHY","RT-Nagar",amount.QUATERLY.toString()));
	   hm.add(new Insurance(456,"Q","DRE","BT-Nagar",amount.MONTHLY.toString()));
	   hm.add(new Insurance(123,"C","SLO","Veeranpalya",amount.YEARLY.toString()));
	   hm.add(new Insurance(321,"H","KIO","Sultanpalya",amount.ONE_TIME.toString()));
	   hm.add(new Insurance(213,"S","ASE","Manoranpalya",amount.QUATERLY.toString()));
	   hm.add(new Insurance(678,"L","JUK","Tech Park",amount.YEARLY.toString()));
	   hm.add(new Insurance(823,"E","AQW","Manyata Park",amount.ONE_TIME.toString()));
	   hm.add(new Insurance(908,"J","HYU","Cognizant",amount.MONTHLY.toString()));
	   hm.add(new Insurance(231,"A","WER","hyderabad",amount.QUATERLY.toString()));
	   hm.add(new Insurance(555,"G","SED","Banglore",amount.MONTHLY.toString()));
	   
	   System.out.println("Enter below Number to do Sorting : ");
	   System.out.println("1. Sort By PolicyNumber");
	   System.out.println("2. Sort By PolicyName");
	   System.out.println("3. Sort By HolderName");
	   System.out.println("4. Sort By Address");
	   System.out.println("5. Sort By Amount");
	   
	   int choice = sc.nextInt();
	   sc.nextLine();
	   System.out.println("Order by ASC or DESC, type here");
	   String order = sc.nextLine().toUpperCase();
	   switch(choice)
	   {
	       case 1:
	           Collections.sort(hm,new SortByPolicyNumber(order));
	           break;
	       case 2:
	           Collections.sort(hm,new SortByPolicyName(order));
	           break;
	       case 3:
	           Collections.sort(hm,new SortByHolderName(order));
	           break;
	       case 4:
	           Collections.sort(hm,new SortByAddress(order));
	           break;
	       case 5:
	           Collections.sort(hm,new SortByAmount(order));
	           break;
	   }
	   
	   System.out.println("NUMBER\t"+"P_NAME\t"+"H_NAME\t"+"Address\t\t"+"Amount\t");
	   
	   for(Insurance in : hm)
	   {
	       System.out.print(in.getPolicyNumber()+"\t"+ in.getPolicyName() + "\t"+in.getHolderName() + "\t"+ in.getAddress()+"\t" + in.getAmount()+"\n");
	   }
	}
}
