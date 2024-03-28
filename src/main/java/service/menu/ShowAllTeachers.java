/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.interfaces.IShowAllStudent;

/**
 *
 * @author hamidhamidbayli
 */
public class ShowAllTeachers implements IShowAllStudent{

    @Override
    public void process() {
        Teacher[] teachers = Config.instance().getTeachers();
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
    }
    
}
