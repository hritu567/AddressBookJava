package com.bridgelabz;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
public class AddressBook {

	public static void main(String[] args) throws IOException {
		int end=1;
		int repeat1=1;
		int repeat2=1;
		int repeat3=1;
		int repeat4=1;
		int repeat5=1;
		int repeat6=1;
		int repeat7=1;
		int edit1=1,edit2=1,edit3=1,edit4=1,edit5=1,edit6=1,edit7=1;
		while (end==1) {
			String firstName=null,lastName=null,mobileNo=null,dist=null,state=null,pinCode=null,emailId=null;
			String name="^[A-Za-z]{3,}";
			String pin="^[0-9]{6}";
			String mobile="^[0-9]{10}";
			String email="^[a-zA-Z0-9]{3,}[@][a-z]{2,}[.][a-z]{2,3}";
			Scanner sc = new Scanner(System.in);
			System.out.println("1)create a new user address 2)search the user address 3)edit the user data 4)delete the user address\n");
			int want=sc.nextInt();
			if (want==1) {
				while (repeat1==1) {
				System.out.println("enter the first name\n");
				firstName=sc.next();
				Pattern p1=Pattern.compile(name);
				Matcher m1=p1.matcher(firstName);
				if(m1.matches()) {
					System.out.println(firstName+" is valid");
				     repeat1++;}
				else
					System.out.println(firstName+" is invalid");
				}
				while (repeat2==1) {
					System.out.println("enter the second name");
					lastName=sc.next();
					Pattern p2=Pattern.compile(name);
					Matcher m2=p2.matcher(lastName);
					if(m2.matches()) {
						System.out.println("valid "+lastName);
						repeat2++;}
					else
						System.out.println("invalid "+lastName);
				}
				while (repeat3==1) {
					System.out.println("enter the district name ");
					dist=sc.next();
					Pattern p3=Pattern.compile(name);
					Matcher m3=p3.matcher(dist);
					if (m3.matches()) {
						System.out.println("valid "+dist);
						repeat3++;}
					else
						System.out.println("invalid "+dist);
				}
				while (repeat4==1) {
					System.out.println("enter the state");
					state=sc.next();
					Pattern p4=Pattern.compile(name);
					Matcher m4=p4.matcher(state);
					if (m4.matches()) {
						System.out.println("valid "+state);
						repeat4++;}
					else
						System.out.println("invalid "+state);
				}
				while (repeat5==1) {
					System.out.println("enter the  mobile ");
					mobileNo=sc.next();
					Pattern p5=Pattern.compile(mobile);
					Matcher m5=p5.matcher(mobileNo);
					if (m5.matches()) {
						System.out.println("valid "+mobileNo);
						repeat5++;}
					else
						System.out.println("invalid "+mobileNo);
				}
				while (repeat6==1) {
					System.out.println("enter the  email ");
					emailId=sc.next();
					Pattern p6=Pattern.compile(email);
					Matcher m6=p6.matcher(emailId);
					if (m6.matches()) {
						System.out.println("valid "+emailId);
						repeat6++;}
					else
						System.out.println("invalid "+emailId);
				}
				while (repeat7==1) {
					System.out.println("enter the  pincode ");
					pinCode=sc.next();
					Pattern p7=Pattern.compile(pin);
					Matcher m7=p7.matcher(pinCode);
					if (m7.matches()) {
						System.out.println("valid "+pinCode);
						repeat7++;}
					else
						System.out.println("invalid "+pinCode);
				}
					File f1=new File("C:/Users/Hritushree/eclipse-workspace/"+firstName+".txt");
					f1.createNewFile();
					FileWriter fw=new FileWriter("C:/Users/Hritushree/eclipse-workspace/"+firstName+".txt");
					BufferedWriter bw=new BufferedWriter(fw);
					bw.write("first name is "+firstName+"\nlastname is "+lastName+"\ndistrict is "+dist+"\nstate is "+state+"\npincode is "+pinCode+"\nmobilr no is "+mobileNo+"\nemail id is "+emailId);
					bw.close();
			
			
				}
			if (want==2) {
				System.out.println("enter the name you want to search. note:please provide the first the name");
				String search=sc.next();
				File f2=new File("C:/Users/Hritushree/eclipse-workspace/"+search+".txt");
				boolean bool=f2.exists();
				if (bool == true) {
					FileReader fr=new FileReader("C:/Users/Hritushree/eclipse-workspace/"+search+".txt");
					BufferedReader br =new BufferedReader(fr);
					String s1;
					while((s1=br.readLine())!=null) {
						System.out.println(s1);
					}
					br.close();
				}
				else System.out.println("name you want to search do not exists");
				}
			if (want==4) {
				System.out.println("enter the name you want to delet. note:it should be the first name");
				String del=sc.next();
				File f4=new File("C:/Users/Hritushree/eclipse-workspace/"+del+".txt");
				boolean delete=f4.exists();
				if(delete==true) {
					f4.delete();
					System.out.println("the file is deleted sucessfully");
				}
				else System.out.println("name of the file with "+del+"is not found please provide perfect name");
			}
			if (want == 3) {
				System.out.println("enter the name you want to edit");
				String edit=sc.next();
				File f3=new File("C:/Users/Hritushree/eclipse-workspace/"+edit+".txt");
				boolean e=f3.exists();
				if (e==true) {

					while (edit1==1) {
						System.out.println("enter the first name ");
						firstName=sc.next();
						Pattern e1=Pattern.compile(name);
						Matcher ma1=e1.matcher(firstName);
						if(ma1.matches()) {
							System.out.println("valis is "+firstName);
						     edit1++;}
						else
							System.out.println("invalid is "+firstName);
						}
					while (edit2==1) {
						System.out.println("enter the last name ");
						lastName=sc.next();
						Pattern e2=Pattern.compile(name);
						Matcher ma2=e2.matcher(firstName);
						if(ma2.matches()) {
							System.out.println("valis is "+firstName);
						     edit2++;}
						else
							System.out.println("invalid is "+firstName);
						}
					while (edit3==1) {
						System.out.println("enter the district name ");
						dist=sc.next();
						Pattern e3=Pattern.compile(name);
						Matcher ma3=e3.matcher(dist);
						if(ma3.matches()) {
							System.out.println("valis is "+dist);
						     edit3++;}
						else
							System.out.println("invalid is "+dist);
						}
					while (edit4==1) {
						System.out.println("enter the state name ");
						state=sc.next();
						Pattern e4=Pattern.compile(name);
						Matcher ma4=e4.matcher(state);
						if(ma4.matches()) {
							System.out.println("valis is "+state);
						     edit4++;}
						else
							System.out.println("invalid is "+state);
						}
					while (edit5==1) {
						System.out.println("enter the  mobile ");
						mobileNo=sc.next();
						Pattern e5=Pattern.compile(mobile);
						Matcher ma5=e5.matcher(mobileNo);
						if (ma5.matches()) {
							System.out.println("valid "+mobileNo);
							edit5++;}
						else
							System.out.println("invalid "+mobileNo);
					}
					while (edit6==1) {
						System.out.println("enter the  email ");
						emailId=sc.next();
						Pattern e6=Pattern.compile(email);
						Matcher ma6=e6.matcher(emailId);
						if (ma6.matches()) {
							System.out.println("valid "+emailId);
							edit6++;}
						else
							System.out.println("invalid "+emailId);
					}
					while (edit7==1) {
						System.out.println("enter the  pincode ");
						pinCode=sc.next();
						Pattern e7=Pattern.compile(pin);
						Matcher ma7=e7.matcher(pinCode);
						if (ma7.matches()) {
							System.out.println("valid "+pinCode);
							edit7++;}
						else
							System.out.println("invalid "+pinCode);
					}
					FileWriter fw1=new FileWriter("C:/Users/Hritushree/eclipse-workspace/"+firstName+".txt");
					BufferedWriter bw=new BufferedWriter(fw1);
					bw.write("first name is"+firstName+"\nlastname is "+lastName+"\ndistrict is"+dist+"\nstate is "+state+"\npincode is"+pinCode+"\nmobilr no is"+mobileNo+"\nemail id is"+emailId);
					bw.close();	
				}
				else System.out.println("name you want to edit is not available;please provide the first name of the user");
				
			}
			System.out.println("1)continue 2)end");
			int process=sc.nextInt();
			if (process==2) {end++;
			System.out.println("thank you have a nice Day");
			}
			else {System.out.println("you want to continue");
			 repeat1=1;
			 repeat2=1;
			 repeat3=1;
			 repeat4=1;
			 repeat5=1;
			 repeat6=1;
			 repeat7=1;
			 edit1=1;
			 edit2=1;edit3=1;
			 edit4=1;edit5=1;edit6=1;edit7=1;}
		
		}

	}

}
