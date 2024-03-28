/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import service.menu.interfaces.IShowAllStudent;

/**
 *
 * @author hamidhamidbayli
 */
public class ShowAllStudent implements IShowAllStudent{

    @Override
    public void process() {
        Student[] students = Config.instance().getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    
}
