/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author hamidhamidbayli
 */
public class MenuUtil {

    public static void showMenu() {
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu: ");
        int selectedMenuNum = sc.nextInt();

        Menu selectedMenu = Menu.find(selectedMenuNum);
        selectedMenu.process();
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}
