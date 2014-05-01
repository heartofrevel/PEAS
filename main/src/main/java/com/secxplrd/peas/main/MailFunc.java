package com.secxplrd.peas.main;
import java.util.Scanner;
/**
 * Created by k3rn3l on 5/1/2014.
 */
public class MailFunc {
    static private String userName, passWord;
    static public String mailServer;
    static private int port;

    static public void setCred(String username, String password){
        Scanner scInput = new Scanner(System.in);
        userName = username;
        passWord = password;


    }

}
