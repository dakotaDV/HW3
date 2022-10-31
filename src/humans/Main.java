package humans;

import humans.Human;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим",1987, "Минск", " Бренд-менеджер");

        Human anya = new Human("Аня", 1993, "Москва", " Методист образовательных программ");

        Human katya = new Human("Катя",1994, "Калининград", " Продакт менеджер");

        Human artem = new Human("Артем",1995, "Москва", " Директор по развитию бизнеса");

         Human vladimir = new Human ("Владимир", 2001, "Казань", " null");

        printInfo(maksim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);
    }
private static void printInfo(Human human){
    System.out.println("Привет! Меня зовут " + human.name + ". Я из города " + human.getTown() + ". Я родися в " + human.getYearOfBirth() +" году. Я работаю на должности" + human.job);
}
}




