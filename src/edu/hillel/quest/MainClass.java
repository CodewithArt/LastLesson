package edu.hillel.quest;
import java.util.Scanner;
import edu.hillel.quest.RoomObject.RoomObjectType;


/**
 * Created by vesar on 09.03.2016.
 */

public class MainClass {
    static Room questRoom;
    static Person person;

    public static void main(String[] args) {
        questRoom = new Room();
        System.out.println("===================================");
        System.out.println("Вы оказались в запертой комнате" +
                " \nВам надо найти выход," +
                " \nно для начала назовите свое имя: ");
        System.out.println("-----------------------------------");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("===================================");
        person = new Person(name);


        System.out.println(person.getName() + " включай мозги и ищи выход!");

        int ChosenObj = chooseAction();
        if (ChosenObj == 0) {
            person.getCurrentObject().lookAt();
        } else {
            person.goTo(questRoom.getRoomObjects()[ChosenObj - 1]);
        }
        ChosenObj = chooseAction();
    }


    public static int chooseAction() {
        RoomObject.RoomObjectType currRoomObj = person.getCurrentObject().getType();

        System.out.println(person.getName() + " ты стоишь возле " + currRoomObj);
        System.out.println("===================================");
        System.out.println("Выбери действие: ");
        System.out.println("\t0 - осмотреть " + currRoomObj);

        for (int i = 0; i < questRoom.getRoomObjects().length; i++) {
            RoomObject.RoomObjectType roomObj = questRoom.getRoomObjects()[i].getType();
            if (currRoomObj != roomObj)
                System.out.println("\t" + (i + 1) + " - подойти к " + roomObj);
        }

        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        return action;
    }


    public static void action() {
    }
}

