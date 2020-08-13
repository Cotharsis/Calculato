package Guleitor;

public class AllRoadsLeadTo {
    public static void main(String[] args) throws Exception { }
    public static int ch(String f) {
        int s=0;
        switch (f) {
            case "I": s += 1;   break;
            case "II": s += 2;  break;
            case "III": s += 3; break;
            case "IV": s += 4;  break;
            case "V": s += 5;   break;
            case "VI": s += 6;  break;
            case "VII": s += 7 ;break;
            case "VIII": s += 8;break;
            case "IX": s += 9;  break;
            case "X": s += 10;  break;
            default: System.out.print("Данное значение не входит в допустимое.");}
        return s;}

    public static void tupz(char p, int a, int b) {
        int c;
        if      (p == '+') {c = a + b; System.out.print(fatre(c));}
        else if (p == '-') {c = a - b; System.out.print(fatre(c));}
        else if (p == '*') {c = a * b; System.out.print(fatre(c));}
        else if (p == '/') {c = a / b; System.out.print(fatre(c));}
        else{System.out.print("Недопустимая форма ввода."); System.exit(0);} }

    public static String fatre(int N){
        String roman ="";
        while (N>=100){
            roman+="C";
            N-=100;}
        while (N>=90){
            roman+="XC";
            N-=90;}
        while (N>=50){
            roman+="L";
            N-=50;}
        while (N>=40){
            roman+="XL";
            N-=40;}
        while (N>=10){
            roman+="X";
            N-=10;}
        while (N>=9){
            roman+="IX";
            N-=9;}
        while (N>=5){
            roman+="V";
            N-=5;}
        while (N>=4){
            roman+="IV";
            N-=4;}
        while (N>=1){
            roman+="I";
            N-=1;}
        return roman;}
}
