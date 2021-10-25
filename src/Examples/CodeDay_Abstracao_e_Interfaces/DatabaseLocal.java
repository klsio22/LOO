package Examples.CodeDay_Abstracao_e_Interfaces;

public class DatabaseLocal extends Database implements SSDAccess, PrintLog{
    public void saveData() {
        System.out.println("Save Local!");
        writeToSSD();
        print();
    }

    @Override
    public void writeToSSD() {
        System.out.println("Escreveu no SSD!");
    }

    @Override
    public void print() {
        System.out.println("Log diário: 1050 acessos!");
    }
}
