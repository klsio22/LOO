package Examples.CodeDay_Abstracao_e_Interfaces;

public class Main {

    public static void main(String[] args) {
	    DatabaseLocal db = new DatabaseLocal();
//	    db.saveData();

	    DatabaseCloud db2 = new DatabaseCloud();
//	    db2.saveData();

        Server s = new Server(db);

        System.out.println();

        Server s2 = new Server(db2);
    }
}
