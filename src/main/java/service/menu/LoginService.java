/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import java.util.Scanner;
import service.menu.interfaces.ILoginService;

/**
 *
 * @author hamidhamidbayli
 */
public class LoginService implements ILoginService {

    @Override
    public void process() {
        System.out.println("Please enter username");
        Scanner nameScanner = new Scanner(System.in);
        String username = nameScanner.nextLine();

        System.out.println("Please enter password");
        Scanner pwdScanner = new Scanner(System.in);
        String password = pwdScanner.nextLine();

        if (!(username.equals("admin") && password.equals("admin"))) {
            throw new IllegalArgumentException("User or password is invalid");
        }

        System.out.println("Login successfully");
        Config.setLoggedIn(true);
    }
}
