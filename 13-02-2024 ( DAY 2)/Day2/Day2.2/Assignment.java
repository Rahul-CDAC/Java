import java.util.Scanner;

class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numeric marks");
        int marks = sc.nextInt();
        if (marks>=80 && marks<=100)
        {
            System.out.println("A grade");
        }
        else if (marks>=60 && marks<=80) {
            System.out.println("B grade");
            
        }
        else if (marks>=40 && marks<=60) {
            System.out.println("C grade");
            
        }
        else if (marks>=0 && marks<=40)
        {
            System.out.println("F grade and you are failed");
        }
        else
        {
            System.out.println("Invalid marks");
        }
    
    System.out.println("Your report card");
}
}

