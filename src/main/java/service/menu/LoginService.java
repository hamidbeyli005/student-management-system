/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.menu.interfaces.ILoginService;
import service.menu.interfaces.MenuService;

/**
 *
 * @author hamidhamidbayli
 */
public class LoginService implements ILoginService {

    @Override 
    public void process() {
        System.out.println("Login service");
    }
    
}
