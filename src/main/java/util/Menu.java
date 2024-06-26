/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Config;
import service.menu.AddStudentService;
import service.menu.AddTeacherService;
import service.menu.LoginService;
import service.menu.interfaces.MenuService;
import service.menu.RegisterService;
import service.menu.ShowAllStudent;
import service.menu.ShowAllTeachers;

/**
 *
 * @author hamidhamidbayli
 */
public enum Menu {
    LOGIN(1, "Login", new LoginService()),
    REGISTER(2, "Register", new RegisterService()),
    ADD_STUDENT(3, "Add student", new AddStudentService()),
    ADD_TEACHER(4, "Add teacher", new AddTeacherService()),
    SHOW_ALL_STUDENT(5, "Show all student", new ShowAllStudent()),
    SHOW_ALL_TEACHER(6, "Show all teacher", new ShowAllTeachers()),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;

    Menu() {
    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return number;
    }

    public static Menu find(int num) {
        Menu[] menuList = Menu.values();
        for (int i = 0; i < menuList.length; i++) {
            if (menuList[i].getNumber() == num) {
                return menuList[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu() {
        Menu[] menuList = Menu.values();
        for (int i = 0; i < menuList.length; i++) {
            if (menuList[i] == UNKNOWN) {
                continue;
            }

            boolean isLoggedIn = Config.isLoggedIn();
            boolean isLoginOrRegister = menuList[i] == LOGIN || menuList[i] == REGISTER;
            boolean isLoggedInAndNotLoginOrRegister = isLoggedIn && menuList[i] != LOGIN && menuList[i] != REGISTER;

            if ((!isLoggedIn && isLoginOrRegister) || isLoggedInAndNotLoginOrRegister) {
                System.out.println(menuList[i]);
            }
        }

    }
}
