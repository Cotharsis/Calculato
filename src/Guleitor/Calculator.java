package Guleitor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static Guleitor.AllRoadsLeadTo.*;

public class Calculator {

    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str = rd.readLine();
        int d = str.length();
        String df = (str.substring(0,1));

        while (df.equals("1")&& d>=3 && d<=5||df.equals("2")&& d>=3 && d<=4||df.equals("3")&& d>=3 && d<=4||df.equals("4")&& d>=3 && d<=4||df.equals("5")&& d>=3 && d<=4||df.equals("6")&& d>=3 && d<=4||df.equals("7")&& d>=3 && d<=4||df.equals("8")&& d>=3 && d<=4||df.equals("9")&& d>=3 && d<=4){
            int indexx;
            char xp;
            if (str.indexOf('-') != -1) { indexx = str.indexOf('-'); xp='-';}
            else if (str.indexOf('+') != -1) { indexx = str.indexOf('+'); xp='+';}
            else if (str.indexOf('*') != -1) { indexx = str.indexOf('*'); xp='*';}
            else if (str.indexOf('/') != -1) { indexx = str.indexOf('/'); xp='/';}
            else { indexx = 0;System.out.print("Недопустимая форма ввода."); System.exit(0); xp='!';}
            int xa =cho(str.substring(0, indexx));
            int xb =cho(str.substring(indexx + 1));
            tupzz(xp,xa,xb);
            return; }

       while (df.equals("I")&& d<=9&&d>=3||df.equals("V")&& d<=9&&d>=3||df.equals("X")&& d<=9&&d>=3){
            int ex;
            char p;
            if (str.indexOf('-') != -1) { ex = str.indexOf('-'); p='-';}
            else if (str.indexOf('+') != -1) { ex = str.indexOf('+'); p='+';}
            else if (str.indexOf('*') != -1) { ex = str.indexOf('*'); p='*';}
            else if (str.indexOf('/') != -1) { ex = str.indexOf('/'); p='/';}
            else { ex = 0;System.out.print("Недопустимая форма ввода."); System.exit(0); p='!';}
            int a = ch(str.substring(0, ex));
            int b =ch(str.substring(ex + 1));
            tupz(p,a,b);
            return; }

        System.out.println("Неправильное значение ввода");}


        public static int cho(String fo) {
            int st=0;
            switch (fo) {
                case "1": st += 1; break;
                case "2": st += 2; break;
                case "3": st += 3; break;
                case "4": st += 4; break;
                case "5": st += 5; break;
                case "6": st += 6; break;
                case "7": st += 7; break;
                case "8": st += 8; break;
                case "9": st += 9; break;
                case "10":st += 10;break;
                default: System.out.print("Данное значение не входит в допустимое.");}
                return st;}

    public static void tupzz(char p, int a, int b) {
        int c;
        if      (p == '+') {c = a + b; System.out.print((c));}
        else if (p == '-') {c = a - b; System.out.print((c));}
        else if (p == '*') {c = a * b; System.out.print((c));}
        else if (p == '/') {c = a / b; System.out.print((c));}
        else{System.out.print("Недопустимая форма ввода."); System.exit(0);;} }
}
