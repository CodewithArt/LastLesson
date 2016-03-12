package edu.hillel.quest;
import edu.hillel.quest.Inventory;
import edu.hillel.quest.RoomObject.RoomObjectType;

/**
 * Created by vesar on 09.03.2016.
 */
public class Person {

    private String name;
    private Inventory inventory;
    private RoomObject currentObject = new RoomObject(RoomObjectType.Door, null);

    public void goTo(RoomObject roomObj) {
        currentObject = roomObj;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getObject(UsableObject obj) {
        inventory.putObject(obj);
    }

    public void useObject(UsableObject obj, RoomObject targetRoomObj) {
        if (targetRoomObj.match(obj))
            targetRoomObj.doJob();
        else
            System.out.println("Object " + obj.getType() + " cant be used with" + targetRoomObj.getType());
    }

    public RoomObject getCurrentObject() {
        return currentObject;
    }
}
