/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mychatapp;
import java.io.*;
import java.net.*;
import javax.swing.*;
/**
 *
 * @author NguyenNghiaBui
 */



public class ChatSocket {
   private Socket socket;

   private JTextPane txtMessageBorad;

   private PrintWriter out1;
   private BufferedReader reader1;

   private MyAcc souAcc;
   private MyAcc desAcc;

   public ChatSocket(Socket socket, JTextPane txtMessageBorad) throws IOException {
        this.socket = socket;
        this.txtMessageBorad = txtMessageBorad;
        
        out1 = new PrintWriter(socket.getOutputStream());
        reader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        receive();
    }
    public ChatSocket(Socket socket,MyAcc acc, MyAcc desAcc, JTextPane txtMessageBorad) throws IOException {
        this.socket = socket;
        this.desAcc = desAcc;
        this.souAcc = acc;
        this.txtMessageBorad = txtMessageBorad;
        
        out1 = new PrintWriter(socket.getOutputStream());
        reader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        receive();
    }
    private void receive() throws IOException{
        Thread th = new Thread(){
            public void run(){
                while(true){
                    try{
                        String line = reader1.readLine();
                        if(line != null){
                            txtMessageBorad.setText(txtMessageBorad.getText() + "\n" + line);
                        }
                }catch(Exception e){
                    }
                }
            }
            
        };
        th.start(); 
    }
    public void send(String msg){        
        String current = txtMessageBorad.getText();
        txtMessageBorad.setText(current + msg);
        out1.println(msg);
        out1.flush();
    }
    public void close() {
        try{
            out1.close();
            reader1.close();
            socket.close();
        }catch (Exception e) {
            
        }
    }
}
