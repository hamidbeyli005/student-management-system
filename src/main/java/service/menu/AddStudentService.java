/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.menu.interfaces.IAddStudentService;

/**
 *
 * @author hamidhamidbayli
 */
public class AddStudentService implements IAddStudentService{

    @Override
    public void process() {
     
        System.out.println("Please enter name: ");
        Scanner name_scanner = new Scanner(System.in);
        String name = name_scanner.nextLine();
        
        System.out.println("Please enter surname: ");
        Scanner sname_scanner = new Scanner(System.in);
        String surname = sname_scanner.nextLine();
        
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        Config.instance().createStudent(student);
        System.out.println("New student successfully created");
    }
    
}
