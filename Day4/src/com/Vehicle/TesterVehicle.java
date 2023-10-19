package com.Vehicle;

import java.util.Scanner;

public class TesterVehicle {

	public static void main(String[] args) {
		
		int choice, index=0;
		int id=1001;
		
		Vehicle varr[] = new Vehicle[10];
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Add Vehicle\n2. Show All\n3. Edit Color\n4. Edit Price\n5. Edit Name\n6. Remove Vehicle\n7. Exit");
		
		System.out.println("Enter choice: ");
		choice = sc.nextInt();
		
		while(choice!=7)
		{
			switch(choice)
			{
			case 1:
			{
				if(index<varr.length)
				{
					System.out.println("Enter Vehicle Name: ");
					String name = sc.next();
					System.out.println("Enter Vehicle Color: ");
					String color = sc.next();
					System.out.println("Enter Vehicle Price: ");
					double price = sc.nextDouble();
					
					varr[index] = new Vehicle(id, name, color, price);
					
					index++;
					id++;
				}
				
				break;
			}
			case 2: 
			{
				for(Vehicle v : varr)
				{
					System.out.println(v);
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter Id to Edit Color: ");
				int idno = sc.nextInt();
				
				for(Vehicle v : varr)
				{
					if(v != null)
					{
						if(v.getId()==idno)
						{
							System.out.println("Enter New Color: ");
							v.setColour(sc.next());
							
						}
						
					}
				}
				
				break;
				
			}
			case 4: 
			{
				System.out.println("Enter ID to change Price: ");
				int idno  = sc.nextInt();
				
				for(Vehicle v : varr)
				{
					if(v !=null)
					{
						if(v.getId()==idno)
						{
							System.out.println("Enter New Price: ");
							v.setPrice(sc.nextDouble());
						}
					}
				}
				break;
			}
			
			case 5: 
			{
				System.out.println("Enter ID to change Name: ");
				int idno  = sc.nextInt();
				
				for(Vehicle v : varr)
				{
					if(v !=null)
					{
						if(v.getId()==idno)
						{
							System.out.println("Enter New Name: ");
							v.setName(sc.next());
						}
					}
				}
				break;
			}
			
			case 6: 
			{
				System.out.println("Enter ID to Remove: ");
				int idno  = sc.nextInt();
				
				for(int i=0; i<varr.length; i++)
				{
					if(varr[i] !=null)
					{
						if(varr[i].getId()==idno)
						{
							varr[i]=null;
						}
					}
				}
				break;
			}
			default :
			{
				System.out.println("Invalid Choice...!");
			}
			}
			
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
		}
		
	}

}
