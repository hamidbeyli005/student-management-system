/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.menu.interfaces.IAddTeacherService;

/**
 *
 * @author hamidhamidbayli
 */
public class AddTeacherService implements IAddTeacherService {

    @Override
    public void process() {
        System.out.println("Please enter name: ");
        Scanner name_scanner = new Scanner(System.in);
        String name = name_scanner.nextLine();

        System.out.println("Please enter surname: ");
        Scanner sname_scanner = new Scanner(System.in);
        String surname = sname_scanner.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);

        Config.instance().createTeacher(teacher);
        System.out.println("New teacher successfully created");
    }

}
