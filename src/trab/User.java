package trab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel.vieira
 */
public class User {
    private String email;
    private String password;
    
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword () {
        return password;
    }
}
