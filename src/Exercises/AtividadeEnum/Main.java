package Exercises.AtividadeEnum;

public class Main {

    public static void main(String[] args) {

        EventHub eventHub = new EventHub();

        eventHub.onReceive(EventType.UI, 1002);
        eventHub.onReceive(EventType.UI, 1003);
        eventHub.onReceive(EventType.UI, 1004);
        eventHub.onReceive(EventType.DATABASE, 400);
        eventHub.onReceive(EventType.DATABASE, 401);
        eventHub.onReceive(EventType.DATABASE, 400);
        eventHub.onReceive(EventType.API, 991);
        eventHub.onReceive(EventType.API, 992);
        eventHub.onReceive(EventType.API, 993);

    }
}
