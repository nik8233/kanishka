import java.util.Scanner;
class soul{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int m6=m1+m2+m3+m4+m5;
        if(m6/5>=35){
            System.out.println("need an extra class");
        }
        else{
            System.out.println("you are good to go");
        }
    }
}