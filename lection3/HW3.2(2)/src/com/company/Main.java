package com.company;

public class Main {

    public static void main(String[] args) {
        String string_base = "squard";
        StringBuilder base_append = new StringBuilder(string_base);
        String stringAdd = "toxic";

        //просто складываем строки
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            string_base += stringAdd;
        }
        long end = System.currentTimeMillis();

        long concat_time = end - start;


        //скаладываем строки методом append
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            base_append.append(stringAdd);
        }
        end = System.currentTimeMillis();

        long add_time = end - start;

        System.out.println("Время конкатенации : " + concat_time+ "\nВремя по append-методу: " + add_time + "\nAppend-метод быстрее обычной конкатенации на " + (concat_time-add_time) + " ms");
    }
}