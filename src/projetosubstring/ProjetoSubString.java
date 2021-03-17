/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosubstring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.SimpleDoc;

/**
 *
 * @author roger
 */
public class ProjetoSubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "C:-Users-roger-Bloodshot.mp4";
        System.out.println(path);
        String[] nomeDoArquivo = path.split("-");

        String ultimo = "";
        for (int pos = 0; pos < nomeDoArquivo.length; pos++) {
            ultimo = nomeDoArquivo[nomeDoArquivo.length - 1];
            System.out.println(nomeDoArquivo[pos]);
        }
        System.out.println(ultimo);

        String frase = "Estou aprendendo tecnologia";
        System.out.printf("Caracteres a partir do índice 6: "
                + "\"%s\"%n", frase.substring(6));
        System.out.println("---------------------------------------");

        System.out.printf("%s \"%s\"%n", "Substring do indice 6 até o 17: ", frase.substring(6, 17));
        System.out.println("---------------------------------------");
        System.out.printf("Usando o indexOf(); %s ", frase.indexOf(" "));
        System.out.println();

    }

    public static String dataFormatada(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

    public static Date dataFormatada(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.parse(data);
        } catch (ParseException erro) {
            erro.getStackTrace();
        }
        return null;
    }

}
