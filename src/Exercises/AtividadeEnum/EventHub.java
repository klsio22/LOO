package Exercises.AtividadeEnum;

public class EventHub {
    public void onReceive(EventType type, int id){
        switch (type){
            case UI:
                System.out.println("Received UI Event. ID="+id);
                break;
            case DATABASE:
                System.out.println("Received Database LOG. Event ID="+id);
                break;
            case API:
                System.out.println("Event: Connection to API. ID="+id);
        }
    }
}