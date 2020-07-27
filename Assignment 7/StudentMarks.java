package Assignment7;

import java.io.*;
import java.util.*;
public class StudentMarks {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents=scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(numberOfStudents);
		System.out.println("Enter Students Marks Into An ArrayList:");
		for(int i=0;i<numberOfStudents;i++) {
			arrayList.add(scanner.nextInt());
		}
		int highestMarks=Collections.max(arrayList);
		System.out.println("Highest Marks : "+highestMarks);
		double sum=0;
		for(int i=0;i<arrayList.size();i++) {
			sum=sum+arrayList.get(i);
		}
		System.out.println("Sum Of Marks : "+sum);
		double average = sum/numberOfStudents;
		System.out.println("Average Marks : "+average);
		System.out.println("Marks : ");
		for(int i=0;i<arrayList.size();i++){
			System.out.print((i+1)+"-"+arrayList.get(i)+"\t");
		}
		System.out.println();
		System.out.println("3rd Student Marks: "+arrayList.get(2));
		Collections.sort(arrayList);
		System.out.println("sorted Marks are : ");
		for(int i=0;i<arrayList.size();i++){
			System.out.print((i+1)+"-"+arrayList.get(i)+"\t");
		}
	}
}
