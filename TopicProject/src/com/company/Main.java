package com.company;

import java.util.Scanner;

interface iGetname
{
    public String get_name();
    public String get_role();
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Management sys = new Management();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("[1] Add student");
                System.out.println("[2] Add council student");
                System.out.println("[3] Add professor");
                System.out.println("[4] Add invented professor");
                System.out.println("[5] Add course");
                System.out.println("[6] Assign lecturer");
                System.out.println("[7] Enroll student");
                System.out.println("[8] Show course detail");
                System.out.println("[9] Show courses");
                System.out.println("[10] Show students");
                System.out.println("[11] Show Professor");
                System.out.println("[12] Show names");
                System.out.println("[13] Show marks");
                System.out.println("[14] add marks");
                System.out.println("[15] exit");
                int menu = sc.nextInt();
                sc.nextLine();
                String name, position;
                int id_prof,id_student, id_course,mark;
                switch (menu) {
                    case 1:
                        System.out.println("Enter student name: ");
                        sys.add_students(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter student name : ");

                        name = sc.nextLine();
                        System.out.println("Enter student position : ");
                        position = sc.nextLine();
                        sys.add_students_(name,position);
                        break;
                    case 3:
                        System.out.println("Enter professor name: ");
                        sys.add_professor(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter professor name : ");
                        name = sc.nextLine();
                        System.out.println("Enter professor position : ");
                        position = sc.nextLine();
                        sys.add_professor(name, position);
                        break;
                    case 5:
                        System.out.println("Enter course name : ");
                        sys.add_courses(sc.nextLine());
                        break;
                    case 6:
                        System.out.println("Enter professor id : ");
                        id_prof = sc.nextInt();
                        System.out.println("Enter course id : ");
                        id_course = sc.nextInt();
                        sys.assign_lecture(id_prof, id_course);
                        break;
                    case 7:
                        System.out.println("Enter student id : ");
                        id_student = sc.nextInt();
                        System.out.println("Enter course id : ");
                        id_course = sc.nextInt();
                        sys.enroll_student(id_student, id_course);
                        break;
                    case 8:
                        System.out.println("Enter course id : ");
                        sys.show_detail_course(sc.nextInt());
                        break;
                    case 9:
                        sys.show_courses();
                        break;
                    case 10:
                        sys.show_students();
                        break;
                    case 11:
                        sys.show_professors();
                        break;
                    case 12:
                        sys.show_names();
                        break;
                    case 15:
                        return;
                    case 14:
                        System.out.println("Enter course id : ");
                        id_course = sc.nextInt();
                        System.out.println("Enter student id : ");
                        id_student = sc.nextInt();
                        System.out.println("Enter mark : ");
                        mark = sc.nextInt();
                        sys.mark_student(id_course,id_student,mark);
                        break;
                    case 13:
                        System.out.println("Enter student id : ");
                        id_student = sc.nextInt();
                        System.out.println("Enter course id : ");
                        id_course = sc.nextInt();
                        sys.show_marks(id_student, id_course);
                        break;
                    default:
                        sc.nextLine();
                }
                sc.nextLine();
            } catch (Exception ex) {
                sc.nextLine();
            }

        }
    }
}
