package pacoteHeranca;

public class Animal { // Classe pai
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void comer(){
        System.out.println(nome + " está comendo...");
    }

    public void dormir(){
        System.out.println(nome + " está dormindo...");
    }
}
