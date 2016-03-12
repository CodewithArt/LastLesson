package edu.hillel.quest;
import edu.hillel.quest.UsableObject.UsableObjectType;

public class RoomObject {

    public enum RoomObjectType {
        Door,
        Table,
        TV,
        Clock,
        SafeBox
    }

    private RoomObjectType type;
    private UsableObject.UsableObjectType correctUsableObject;

    public RoomObject(RoomObjectType roomType, UsableObjectType objName) {
        type = roomType;
        correctUsableObject = objName;
    }

    public RoomObjectType getType() {
        return type;
    }

    public boolean match(UsableObject obj) {
        return correctUsableObject == obj.getType();
    }

    public void lookAt() {
        switch (type) {
            case Table:
                System.out.println("На столе лежит пульт от ТВ.");
                break;
            case TV:
                System.out.println("Надо вкл. ТВ, вдруг что то интерестное показывают.");
                break;
            case SafeBox:
                System.out.println("Сейф закрыт, Вам нужен код.");
                break;
            case Clock:
                System.out.println("Показывают 12:00, но их надо завести.");
                break;
            case Door:
                System.out.println("Дверь все еще закрыта.");
                break;
        }
    }

    public void doJob() {

    }
}
