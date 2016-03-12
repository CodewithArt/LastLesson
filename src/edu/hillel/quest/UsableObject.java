package edu.hillel.quest;
/**
 * Created by vesar on 09.03.2016.
 */
public class UsableObject {

    public enum UsableObjectType {
        Key,
        CodePaper,
        RemoteController
    }

    private UsableObjectType type;

    public UsableObject(UsableObjectType type) {
        this.type = type;
    }

    public UsableObjectType getType() {
        return type;
    }
}
