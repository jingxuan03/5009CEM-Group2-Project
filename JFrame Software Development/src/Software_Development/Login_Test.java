/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Software_Development;

/**
 *
 * @author lawka
 */
public class Login_Test {
    public boolean validateUser(String username, String password){
        boolean valid;
        if (username.equals("Bill") && password.equals("1234"))
            valid = true;
        else
            valid = false;
        
        return valid;
    }
}
