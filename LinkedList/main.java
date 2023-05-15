package LinkedList;

import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    public static void menu()
    {

        System.out.println("1- add first");
        System.out.println("2- add last");
        System.out.println("3- add at index");
        System.out.println("4- delete first");
        System.out.println("5- delete last");
        System.out.println("6- delete at index");
        System.out.println("7- display by ID");
        System.out.println("8- display");
        System.out.println("9- exit");

    }

    public static void main(String[] args)
    {
        System.out.println("welcome to linked list program");
        SingleLinkedList list = new SingleLinkedList();

        menu();

        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        while (choice != 10)
        {
            switch (choice)
            {
                case 1:
                    System.out.println("Enter name");
                    String name = input.next();
                    System.out.println("Enter ID");
                    int id = input.nextInt();
                    System.out.println("Enter Credit Hours");
                    int creditHours = input.nextInt();
                    System.out.println("Enter Instructor Name");
                    String instructorName = input.next();
                    list.addFirst(id, name, creditHours, instructorName);
                    break;
                case 2:
                    System.out.println("Enter name");
                    name = input.next();
                    System.out.println("Enter ID");
                    id = input.nextInt();
                    System.out.println("Enter Credit Hours");
                    creditHours = input.nextInt();
                    System.out.println("Enter Instructor Name");
                    instructorName = input.next();
                    list.addLast(id, name, creditHours, instructorName);
                    break;

                case 3:
                    System.out.println("Enter name");
                    name = input.next();
                    System.out.println("Enter ID");
                    id = input.nextInt();
                    System.out.println("Enter Credit Hours");
                    creditHours = input.nextInt();
                    System.out.println("Enter Instructor Name");
                    instructorName = input.next();
                    System.out.println("Enter index");
                    int index = input.nextInt();
                    list.addIndex(id, name, creditHours, instructorName, index);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;

                case 6:
                    System.out.println("Enter index: ");
                    int indexDel = input.nextInt();
                    list.delete(indexDel);

                case 7:
                    System.out.println("Enter course ID: ");
                    int courseID = input.nextInt();
                    list.displayByID(courseID);
                    break;

                case 8:
                    list.display();
                    break;
                case 9:
                    System.exit(0);

            }
            menu();
            System.out.println("Enter your choice");
            choice = input.nextInt();
        }

    }
}