import java.util.Scanner;
import pacoteHeranca.*;
import pacoteInterface.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do seu quadrado: ");
        String nomeQuadrado = sc.nextLine();
        System.out.println("Informe o lado do seu quadrado: ");
        float ladoQuadrado = sc.nextFloat();
        Quadrado meuQuadrado = new Quadrado(nomeQuadrado, ladoQuadrado);
        System.out.println("O nome do quadrado é " + meuQuadrado.getNome() + ", seu lado mede " + meuQuadrado.getLado() + " cm, logo, sua área é de " + meuQuadrado.getArea() + " cm");

        System.out.println("Informe o nome do deu bicho: ");
        String nomeBicho = sc.nextLine();
        System.out.println("Informe a idade do seu bicho: ");
        int idadeBicho = sc.nextInt();
        Animal meuAnimal = new Animal(nomeBicho, idadeBicho);
        meuAnimal.comer();
        meuAnimal.dormir();

        System.out.println("Informe o nome do seu cachorro: ");
        String nomeCachorro = sc.nextLine();
        System.out.println("Informe a idade do seu cachorro: ");
        int idadeCachorro = sc.nextInt();
        sc.nextLine(); // Consumir
        System.out.println("Informe a raça do seu cachorro: ");
        String raca = sc.nextLine();
        Cachorro meuCachorro = new Cachorro(nomeCachorro,idadeCachorro,raca);
        meuCachorro.comer();
        meuCachorro.dormir();
        meuCachorro.latir();

        sc.close();
    }
}
