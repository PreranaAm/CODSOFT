package Projects;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks,total=0;
        System.out.println("Enter the number of subjects");
        int subjects=sc.nextInt();
        for(int i=1;i<=subjects;i++)
        {
            System.out.println("Enter the mark of subject "+i);
            marks=sc.nextInt();
            while(marks<0 || marks>100)
            {
                System.out.println("Ivalid marks enter ,Please do Enter valid marks");
                marks=sc.nextInt();
            }
            total+=marks;
        }
        int average=total/subjects;
        System.out.println("The total marks of the subjects="+total);
        System.out.println("The average marks of the subjects="+average);
        if(average<=100 && average >=90)
        {
            System.out.println("Your Grade is A ");
        }
        else if(average<90 && average>=80)
        {
            System.out.println("Your Grade is B ");
        }
        else if(average<80 && average>=70)
        {
            System.out.println("Your Grade is C");
        }
        else if(average <70 && average >=60)
        {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
