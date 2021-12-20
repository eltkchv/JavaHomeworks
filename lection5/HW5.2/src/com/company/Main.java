package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Елизавета\\Documents\\GitHub\\JavaHomeworks\\lection5\\HW5.2\\Матвей.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                String str = null;
                while ((str = br.readLine()) != null)
                    System.out.println(str);
            } finally {
                br.close();
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }

        String determination = "д";
        StringBuilder sb = new StringBuilder();

        while (!determination.equals("н")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String s = sc.nextLine();
            sb.append(s);

            System.out.println("Вы хотите продолжить? [д/н]");
            do {
                determination = sc.nextLine();
                if (determination.equals("д") == false && determination.equals("н") == false) {
                    System.out.println(determination + " Не является внутренней или внешней командой" + "\n[д/н]");
                }
            } while (determination.equals("д") == false && determination.equals("н") == false);
        }

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(String.valueOf(sb));
        fileWriter.close();
        System.out.println("Изменения в файле сохранены");
    }
}