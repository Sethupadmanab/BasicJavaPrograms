package com.inventorymanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManagement {
 public static void main(String[] args) {
	 
	 Items item = new Items("paste", 15, 5);
//	ArrayList al = new ArrayList();
//	al.add(new Items("paste", 15, 5));
//	al.add(new Items("Soap", 15, 5));
//	al.add(new Items("Brush", 15, 5));
//	al.add(new Items("Oil", 15, 5));
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the item name you need to buy");
	String itemPaste = sc.nextLine();
	if(itemPaste.equals("paste"))
	{
		while(true)
		{
		System.out.println("Enter the no.of item you need to buy for paste");
		 int itemNo = sc.nextInt();
		 switch(itemNo)
		 {
		 case 1:
			 System.out.println("You have purchased one item");
			int counting = itemNo*item.itemCost;
			System.out.println("The cost of your purchased item is :"+" "+ counting);
			break;
			default: System.out.println("Sorry we have only one item of paste in our shop");
			 
		 }
	}
	 
	}
}
}

class Items
{
	String itemName;
	int itemCost;
	int itemQuantity;
	Items(String itemName, int itemCost, int itemQuantity)
	{
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemQuantity = itemQuantity;
	}
}
