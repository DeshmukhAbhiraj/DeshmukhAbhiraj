 import java.lang.*;
 import java.util.*;
 
 
 class Sorting{
	 public static void InsertionSort(int n , int a1[]){
		 int length = a1.length;
		 int elementtobeinserted=a1[length-1];
		 
		 for(i=lenght-2;i>=0;i--){
			 if(a1[i]>elementtobeinserted){
				 a1[i+1]=a1[i];
				 printArray(a1);
				 
			 }
			 else{
				 a1[i+1]=elementtobeinserted;
				 printArray(a1);
				 break;
			 }
			 if((i==0)&&(a1[i]>elementtobeinserted)){
				 a1[i]=elementtobeinserted;
			      printArray(a1);
			 }
		 }
		 
		 
		 
		 
	 }
	 
	 public static void printArray(int a1[]){
		 for(int n : a1)
			 System.out.println(n+" ")
	 }
	 System.out.println();
	 
	 
	 public static void main(Strings[] args){
		 Scanner sc= new Scanner (System.in);
		 int s = sc.nextInt();
		 int a1[] =new int[s];
		 int n = a1.length;
		 for(i=o;i<=s;i++)
			 a1[i]=sc.nextInt();
		 
		 InsertionSort(n , a1)
		 
	 }
 }