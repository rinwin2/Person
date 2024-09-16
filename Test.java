package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       
        Person[] perArr = new Person[4];
        perArr[0] = new Person(1, "Mai", false);
        perArr[1] = new Person(2, "Van", false);

    
        ArrayList<Person> getPerson = new ArrayList<>();

        
        Scanner input = new Scanner(System.in);

     
        int i = 2;
        while (i < perArr.length) {
            System.out.println("Enter details for Person number " + (i + 1) + ":");
            perArr[i] = new Person(0, "", false);
            scanInfo(perArr[i], input);
            i++;
        }

      
        int j = 0;
        while (j < 2) {
            System.out.println("Add Person " + (getPerson.size() + 1) + ":");
            Person newPerson = new Person(0, "", false); 
            scanInfo(newPerson, input);
            getPerson.add(newPerson); 
            j++;
        }

        
        System.out.println("\n--------------------------------");
        System.out.println("| ID | Name | Male |");

        int l = 0;
        while (l < perArr.length) {
            printInfo(perArr[l]);
            l++;
        }  
        System.out.println("--------------------------------");
        int k = 0;
        while (k < getPerson.size()) {  
            printInfo(getPerson.get(k)); 
            k++;
        }
        input.close();
        
    }

    public static void scanInfo(Person p, Scanner input) {
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Gender: ");
        boolean gender = input.nextBoolean();

       
        p.setId(id);
        p.setName(name);
        p.setMale(gender);
    }

    public static void printInfo(Person p) {
        System.out.printf("| %d | %s | %b |\n", p.getId(), p.getName(), p.isMale());
    }
}