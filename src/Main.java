import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<String> toDo= new ArrayList<String>();

    public static void add(String task){
        toDo.add(task);
    }
    public static void remove(int num){
        toDo.remove(num);
    }
    public static void display(){
        System.out.println(toDo.toString());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("*******************TO DO LIST**********************");
            System.out.println("Select an operation you would like to perform");
            System.out.println("a.Add\nb.remove\nc.display\nd.exit");
            int num;
            String task;
            String choice = sc.nextLine();

            switch (choice) {
                case "a":
                    System.out.println("write the task you would like to add:");
                    task = sc.nextLine();
                    add(task);
                    break;
                case "b":
                    System.out.println("what numbered task would you like to remove");
                    num = sc.nextInt();
                    remove(num);
                    break;
                case "c":
                    display();
                    break;
                case "d":return;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }

        }
    }
