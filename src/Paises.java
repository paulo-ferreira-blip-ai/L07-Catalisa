import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paises {


    public static void main(String[] args) {

        List<String> fronteira = new ArrayList<>();
        List<String> fronteira2 = new ArrayList<>();


        System.out.println("Qual país quer conhecer? Digite: 1(Brasil Digite: 2(Argentina)");
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();

        if (resposta == 1) {
            ISO31661 pais1 = new ISO31661("BRA", "Brasil", 212.6, 8.516, fronteira);
            fronteira.add("Argentina");
            fronteira.add("Uruguai");
            fronteira.add("Paraguai");
            fronteira.add("Bolívia");
            fronteira.add("Peru");
            fronteira.add("Colômbia");
            fronteira.add("Venezuela");
            fronteira.add("Guiana");
            fronteira.add("Guiana Francesa");
            fronteira.add("Suriname");

            pais1.status();

            System.out.print("Digite o nome de um país: ");
            Scanner input2 = new Scanner(System.in);
            String resposta2 = input2.next();
            System.out.println("O Brasil tem fronteira com " + resposta2 + "? " + pais1.verificarFront(resposta2));

        } else if (resposta == 2) {
            ISO31661 pais2 = new ISO31661("AGR", "Argentina", 45.38, 2.780, fronteira2);
            fronteira2.add("Brasil");
            fronteira2.add("Uruguai");
            fronteira2.add("Paraguai");
            fronteira2.add("Bolívia");

            pais2.status();

            System.out.print("Digite o nome de um país: ");
            Scanner input3 = new Scanner(System.in);
            String resposta3 = input3.next();
            System.out.println("A Argentina tem fronteira com " + resposta3 + "? " + pais2.verificarFront(resposta3));


        }

    }

}


