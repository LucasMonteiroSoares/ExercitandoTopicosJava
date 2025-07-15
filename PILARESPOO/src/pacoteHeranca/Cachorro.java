package pacoteHeranca;

public class Cachorro extends Animal { // Classe filho que já recebe todos atributos e métodos da classe pai
   private String raca;

   public Cachorro(String nome, int idade, String raca){
    super(nome,idade);
    this.raca = raca;
   }

    public void latir(){
        System.out.println(getNome() + " " + raca + " "+ getIdade() + " anos, está latindo...");
    }
}
