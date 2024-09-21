package main;

import java.util.*;
public class Main {
    public static void main(String[] args){
		// fill your code here
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose Stall Type");
		System.out.println("1)Gold Stall");
		System.out.println("2)Premium Stall");
		System.out.println("3)Executive Stall");
		int choice = scanner.nextInt();
        switch(choice){
			case 1:
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
				scanner.nextLine();
				String[] goldDetails = scanner.nextLine().split(",");
				GoldStall goldStall = new GoldStall(goldDetails[0], Integer.parseInt(goldDetails[1]), goldDetails[2], Integer.parseInt(goldDetails[3]));
				goldStall.display();
                break;
			case 2:
				System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
				scanner.nextLine();
				String[] premiumDetails = scanner.nextLine().split(",");
				PremiumStall premiumStall = new PremiumStall(premiumDetails[0], Integer.parseInt(premiumDetails[1]), premiumDetails[2], Integer.parseInt(premiumDetails[3]));
				premiumStall.display();
                break;
			case 3:
				System.out.println("Enter Stall details in comma separated(Stall Name, Stall Cost,Owner Name, Number of Screens)");
				scanner.nextLine();
				String[] executiveDetails = scanner.nextLine().split(",");
				ExecutiveStall executiveStall = new ExecutiveStall(executiveDetails[0], Integer.parseInt(executiveDetails[1]), executiveDetails[2], Integer.parseInt(executiveDetails[3]));
				executiveStall.display();
                break;
			default:
				System.out.println("Invalid Stall Type");

		}
		scanner.close();
	}
}
