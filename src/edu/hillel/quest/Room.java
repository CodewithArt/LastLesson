package edu.hillel.quest;
import edu.hillel.quest.RoomObject.RoomObjectType;
import edu.hillel.quest.UsableObject.UsableObjectType;
/**
 * Created by vesar on 09.03.2016.
 */
public class Room {

    private UsableObject[] usableObjects = new UsableObject[3];
    private RoomObject[] roomObjects = new RoomObject[5];

    public RoomObject[] getRoomObjects() {
        return roomObjects;
    }

    public Room() {
        initObject();
    }

    private void initObject() {
        usableObjects[0] = new UsableObject(UsableObject.UsableObjectType.Key);
        usableObjects[1] = new UsableObject(UsableObject.UsableObjectType.CodePaper);
        usableObjects[2] = new UsableObject(UsableObject.UsableObjectType.RemoteController);

        roomObjects[0] = new RoomObject(RoomObjectType.Clock,UsableObjectType.Key);
        roomObjects[1] = new RoomObject(RoomObjectType.SafeBox, UsableObjectType.CodePaper);
        roomObjects[2] = new RoomObject(RoomObjectType.TV, UsableObjectType.RemoteController);
        roomObjects[3] = new RoomObject(RoomObjectType.Door, null);
        roomObjects[4] = new RoomObject(RoomObjectType.Table, null);
    }

    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    public void openRoom() {
        open = true;
    }
}
