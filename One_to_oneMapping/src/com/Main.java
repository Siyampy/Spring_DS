package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Integer mobileNumber;
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		Contact c = new Contact();
		System.out.println("Enter the number of contact-address pair:");
		Integer strength = Integer.parseInt(buff.readLine());
		
		ArrayList<Address> add=new ArrayList<Address>();
		ArrayList<Contact> con=new ArrayList<Contact>();
		for(int i=0;i<strength;i++)
		{
			System.out.println("Enter the address " + (i+1) + ":");
			String address = buff.readLine();
			String[] addressList=address.split(",");
			System.out.println("Enter the contact " + (i+1) + ":");
			String contact = buff.readLine();
			String[] contactList=contact.split(",");
			Address ad =new Address();
			ad.setAddressLine1(addressList[0]);
			ad.setAddressLine2(addressList[1]);
			ad.setCity(addressList[2]);
			ad.setState(addressList[3]);
			ad.setPincode(Integer.parseInt(addressList[4]));
			Contact co=new Contact();
			co.setMobile(Integer.parseInt(contactList[0]));
			co.setAlternateMobile(Integer.parseInt(contactList[1]));
			co.setLandline(Integer.parseInt(contactList[2]));
			co.setEmail(contactList[3]);
			co.setAddress(ad);
			ad.setContact(co);
			add.add(ad);
			con.add(co);			
		}
		System.out.println("Enter the mobile of the contact to be searched:" 
				);
		mobileNumber=Integer.parseInt(buff.readLine());		
		for(Address a:add)
		{int mNo=a.getContact().getMobile();
			if(mNo==mobileNumber)
			{
				System.out.println(a.getAddressLine1());
				System.out.println(a.getAddressLine2());
				System.out.println(a.getCity());
				System.out.println(a.getState());
				System.out.println(a.getPincode());
			}
		}
		
		

	}

}
