package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> voper = new ArrayList<String>();
        voper.add("Привет");
        voper.add("Пока");
        voper.add("Как дела?");
        voper.add("Как тебя зовут?");
        voper.add("Что ты делаешь?");
        voper.add("");
        voper.add("До свидания");
        voper.add("Выйти");
        voper.add("Где ты живёшь?");
        ArrayList<String> otver = new ArrayList<String>();
        otver.add("Здравствуйте");
        otver.add("До свидания");
        otver.add("Всй хорошо, а у Вас?");
        otver.add("Можете называть меня MMD");
        otver.add("Работаю");
        otver.add("");
        otver.add("На твоём жёстком диске");
        while (true) {

            String Vopros = scanner.nextLine();
            if(voper.contains(Vopros)==true) {
                if (Vopros.equals(voper.get(0))) {
                    System.out.println(otver.get(0));
                }
                if (Vopros.equals(voper.get(1))) {
                    System.out.println(otver.get(1));
                }
                if (Vopros.equals(voper.get(2))) {
                    System.out.println(otver.get(2));
                }
                if (Vopros.equals(voper.get(3))) {
                    System.out.println(otver.get(3));
                }
                if (Vopros.equals(voper.get(4))) {
                    System.out.println(otver.get(4));
                }
                if (Vopros.equals(voper.get(5))) {
                    System.out.println(otver.get(5));
                }
                if (Vopros.equals(voper.get(6))) {
                    System.out.println(otver.get(1));
                }
                if (Vopros.equals(voper.get(8))) {
                    System.out.println(otver.get(6));
                }
                if (Vopros.equals(voper.get(7))) {
                    break;
                }
            }
            else System.out.println("Я не знаю, что это значит");
        }
    }
}
