package Examples.CodeDay_Abstracao_e_Interfaces;

public class Server {
    public Server( Database db ) {
        db.saveData();
        System.out.println("Disponível: "+db.getSize()+" GB");
    }
}
