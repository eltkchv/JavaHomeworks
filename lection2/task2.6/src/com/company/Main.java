package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите SSID: ");
        String s = input.nextLine();
        System.out.println("Введите пароль: ");
        String p = input.nextLine();
        System.out.println("Введите тип защиты: ");
        String st = input.nextLine();


        NetworkInfo networkInfo = create(s, p, st);
        networkInfo.showParameters();
    }

    public static NetworkInfo create(String s, String p, String st){
        NetworkInfo networkInfo = new NetworkInfo();
        networkInfo.ssid = s;
        networkInfo.password = p;
        networkInfo.securityType = st;

        return networkInfo;
    }

    static class NetworkInfo {
        private String ssid;
        private String password;
        private String securityType;

        public void showParameters(){
            System.out.println("SSID: "+this.ssid+"\nPASSWORD: "+ this.password+"\nSECURITY_TYPE: "+this.securityType);
        }
    }
}