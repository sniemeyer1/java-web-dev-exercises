package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args){
        HashMap<Integer, String> students= new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer studentId;

        System.out.print("Input Student or press ENTER to finish.");

        do {
            System.out.print("\nStudent Name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.print("Student ID number: ");
                studentId = input.nextInt();
                students.put(studentId, newStudent);

                input.nextLine();

            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " - " + student.getValue());
        }

    }
}
