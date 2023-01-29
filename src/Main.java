public class Main {
    public static void main(String[] args) {
        //Задача 1.
        System.out.println("Задача 1.");
        for (int i =1; i <=10; i ++ ) {
            System.out.println( i +" ");}
        System.out.println();
        //Задача 2.
        System.out.println("Задача 2.");
        for (int i=10;i>=1;i--){
            System.out.println( i +" ");}
        System.out.println();
        //Задача 3.
        System.out.println("Задача 3.");
        for (int i =0 ; i<=17;i+=2) {
            System.out.println( i +" ");}
        System.out.println();
        //Задача 4.
        System.out.println("Задача 4.");
        for (int i =10 ; i>=-10;i--) {
            System.out.println( i +" ");}
        System.out.println();
        //Задача 5.
        System.out.println("Задача 5.");
        int startYear=1904;
        int endYear=2096;
        for (int year =startYear ; year<=endYear;year+=4) {
            System.out.println( year +" ");}
        System.out.println();
        //Задача 6.
        System.out.println("Задача 6.");
        int startI=7;
        int endI=98;
        for (int i=startI; i <= endI;i+=7) {
                    System.out.println(i+"");}
        System.out.println();
        //Задача 7.
        System.out.println("Задача 7.");
        int startA=1;
        int endA=512;
        int step1=2;
        for (int A=startA; A <= endA;A*=step1) {
            System.out.println(A+"");}
        System.out.println();
        //Задача 8.
        System.out.println("Задача 8.");
        int monthlyFee=29_000;
        int total=0;
        int months=12;
        for (int month=1; month <= months;month++) {
            total+=monthlyFee;
            System.out.println("Месяц "+ month+ ", сумма накоплений равна "+total+" рублей."); }
        System.out.println();
        //Задача 9.
        System.out.println("Задача 9.");
        double totalWithPercents=0;
        double percent=0.01;
        for (int month=1; month <= months;month++) {
            totalWithPercents+=totalWithPercents+monthlyFee+(totalWithPercents)*percent;
            System.out.printf("Месяц %d,  сумма накоплений равна %.2f рублей.%n ",month,totalWithPercents);
        }
        //Задача 10.
        System.out.println("Задача 10.");
        int multiplier=2;
        for (int number=1; number<=10;number++) {
            System.out.printf(" %d*%d=%d%n",  multiplier, number,multiplier*number); }
                                }
        }
