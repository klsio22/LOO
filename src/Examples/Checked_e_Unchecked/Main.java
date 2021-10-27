package Examples.Checked_e_Unchecked;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    //https://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
    public static void main(String[] args) {

        Main teste = new Main();

        teste.criaArquivo("Vamos lá");

    }


    private void criaArquivo(String pathAlternativo) {
        File arquivo = null;
        try {

            SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

            if (pathAlternativo.equals(""))
                arquivo = new File("/home/groot/Documentos/teste" + fmt.format(new Date()));
            else
                arquivo = new File(pathAlternativo + "arquivo_" + fmt.format(new Date()));

            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
            writer.write("Linha 001");
            writer.close();
        } catch (IOException e) {
            if (arquivo != null) {
                if (arquivo.exists()) {
                    arquivo.delete();
                    criaArquivo("/home/admin/PathAlternativo/");
                }
            }
        }
    }

}
