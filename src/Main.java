//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +  " лет, то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он не достиг совершеннолетия и ему нужно немного подождать");
        }
        System.out.println("_____");
        System.out.println("");


        System.out.println("Задача 2");
        int streetTemperature = 5;
        if (streetTemperature <= 5) {
            System.out.println("На улице сегодня " + streetTemperature + " градуса/ов, нужно надеть шапку");
        }
        if (streetTemperature > 5) {
            System.out.println("На улице сегодня " + streetTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("_____");
        System.out.println("");


        System.out.println("Задача 3");
        int rightSpeed = 58;
        if (rightSpeed <= 60) {
            System.out.println("Если скорость " + rightSpeed + " км/ч, то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + rightSpeed + " км/ч,то придется заплатить штраф");
        }
        System.out.println("_____");
        System.out.println("");


        System.out.println("Задача 4");
        int manAge = 6;
        if (manAge >= 2 && manAge <= 6) {
            System.out.println("Если возраст человека " + manAge + " года (лет) , то ему надо ходить в детский сад");
        }
        if (manAge >= 7 && manAge <= 17) {
            System.out.println("Если возраст человека " + manAge + " года (лет) , то ему надо ходить в школу");
        }
        if (manAge >= 18 && manAge <= 24) {
            System.out.println("Если возраст человека " + manAge + " года (лет) , то ему надо ходить в университет");
        }
        if (manAge > 24) {
            System.out.println("Если возраст человека " + manAge + " года (лет) , то ему пора ходить на работу");
        }
        System.out.println("_____");
        System.out.println("");


        System.out.println("Задача 5");
        int childAge = 4;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("_____");
        System.out.println("");


        System.out.println("Задача 6");
        // Условие задачи:
        //  Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест,
        //  все остальные — стоячие.
        //  С помощью условного оператора и конструкции else напишите программу,
        //  которая выводит в консоль сообщение о том, есть ли место в вагоне,
        //  сидячее или стоячее, или вагон уже полностью забит.

        // Условие задачи неполное. Не дано:
        //  а) есть ли разница в стоимости сидячего и стоячего места
        //  б) продаются ли билеты сначала на сидячие места и только потом на стоячие
        //  Поэтому задача решалась исходя из условия, что билеты продавались сначала на сидячие места
        //  и только потом - на стоячие.
        int carriageCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = carriageCapacity - seatingPlaces;
        int remaininSeatingplases;
        int remainingStandingplases;
        int passengerNumber = 54; // В зависимости от вводимого числа результат будет разный

        if (passengerNumber < carriageCapacity && passengerNumber < seatingPlaces) {
            remaininSeatingplases = seatingPlaces - passengerNumber;
            System.out.println("Если число пассажиров равно " + passengerNumber + " то, осталось " + remaininSeatingplases + " сидячих мест и " + standingPlaces + " стоячих");
        } else {
            if (passengerNumber < carriageCapacity && passengerNumber > seatingPlaces) {
                remainingStandingplases = carriageCapacity - passengerNumber;
                System.out.println("Если число пассажиров равно " + passengerNumber + " то, осталось " + remainingStandingplases + " стоячих");
            }
        }
        if (passengerNumber > carriageCapacity) {
            System.out.println("Свободных мест в вагоне нет");
        }
        System.out.println("_____");
        System.out.println("");


        System.out.println("Задача 7");
        int numberOne = 67;
        int numberTwo = 15;
        int numberThree = 41;
        int maxNumber;
        {
            if (numberOne > numberTwo) {
                maxNumber = numberOne;
            } else {
                maxNumber = numberTwo;
            }
        }
        {
            if (maxNumber > numberThree) {
                System.out.println("Наибольшее число равно " + maxNumber);
            } else {
                System.out.println("Наибольшее число равно " + numberThree);
            }
        }
    }
}