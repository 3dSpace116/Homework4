public class Main {
    public static void main(String[] args) {

        //Задача 1

        byte age = 15;

        if (age >=18) {System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");}
        else {System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");}

        //Задача 2

        byte temp=5;
        boolean weatherCondition= temp>=5;

        if (weatherCondition) {System.out.println("Сегодня тепло, можно идти без шапки");}
        else {System.out.println("На улице холодно, нужно надеть шапку");}

        //Задача 3

        short speed=59;

        if (speed>=60) {System.out.println("Если скорость "+speed+" то придется заплатить штраф");}
        else {System.out.println("Если скорость "+speed+" то можно ездить спокойно");}

        //Задача 4

        byte age4=60;

        if ( age4<2) {System.out.println("Если возраст человека равен " +age4+", то ему пора спать");}
        else if (age4>=2 && age4<7) {System.out.println("Если возраст человека равен " +age4+", то ему нужно ходить в детский сад");}
        else if (age4>=7 && age4<18) {System.out.println("Если возраст человека равен " +age4+",  то ему нужно ходить в школу.");}
        else if (age4>=18 && age4<24) {System.out.println("Если возраст человека равен " +age4+",  то его место в университете");}
        else if (age4>=24 && age4<60) {System.out.println("Если возраст человека равен " +age4+", то ему пора ходить на работу");}
        else {System.out.println("Если возраст человека равен " +age4+", то он может отдохнуть");}

        //Задача 5

        byte age5=14;
        boolean accompaniment =false;

        if (age5<5) {System.out.println("Если возраст ребенка равен"+age5+" то ему нельзя кататься на аттракционе");}
        else if (age5>=5 && age5<14) {
            if (accompaniment) {System.out.println("Если возраст ребенка равен "+age5+" то ему можно кататься на аттракционе в сопровождении взрослого");}
            else {System.out.println("Если возраст ребенка равен "+age5+" то ему нельзя кататься на аттракционе без сопровождения взрослого");}}
        else {System.out.println("Если возраст ребенка равен "+age5+" то ему можно кататься на аттракционе без сопровождения взрослого");}

        //Задача 6

        byte seat=61;
        byte stand=44;
        boolean freeSeat=seat<60;
        boolean freeStand=stand<42;

        if (freeStand) {if (freeSeat) {System.out.println("В вагоне есть свободные сидячие и стоячие места");}
        else {System.out.println("В вагоне нет свободных сидячих мест, но есть стоячие места");}}
        else {if (freeSeat) {System.out.println("В вагоне есть свободные сидячие места, свободных стоячих мест нет");}
        else {System.out.println("В вагоне нет свободных мест");}}

        //Задача 7

        int one=1045;
        int two=900;
        int three=2365;

        if (one>two&&one>three){System.out.println("Число "+one+" cамое большое из всех");
            if (two>one&&two>three){System.out.println("Число "+two+" cамое большое из всех");}}
        else {System.out.println("Число "+three+" cамое большое из всех");}


    }
}
//pull request 1