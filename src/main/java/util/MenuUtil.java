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

    public static Menu showMenu() {
        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu: ");
        int selectedMenu = sc.nextInt();

        return Menu.find(selectedMenu);
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }

}
