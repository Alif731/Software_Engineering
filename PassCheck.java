import java.util.Scanner;

class PassCheck {
    private String name;
    private int mark;

    public PassCheck(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    public void checkPass() {
        if (mark >= 40){
            System.out.println("Congratulations " + name + ", you have passed the exam.");
        } else {
            System.out.println("Sorry " + name + ", you have failed the exam.");
        }
        
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Mark: " + this.mark);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter student mark: ");
        int mark = sc.nextInt();

        PassCheck student1 = new PassCheck(name, mark);
        student1.display();

        student1.checkPass();
       

    }

}