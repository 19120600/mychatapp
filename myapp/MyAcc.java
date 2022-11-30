/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mychatapp;

/**
 *
 * @author NguyenNghiaBui
 */
public class MyAcc {
    private String user;
    private String pass;
    private String port;

    public MyAcc(String username, String pass, String port) {
        this.user = username;
        this.pass = pass;
        this.port = port;
    }
    public String getUser(){
        return this.user;
    }
    public String getPass(){
        return this.pass;
    }
    public String getPort(){
        return this.port;
    }
    
}
