import java.util.Scanner;
class soul{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String adress=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println(name + " "+ adress + " "+ age);
    }
}