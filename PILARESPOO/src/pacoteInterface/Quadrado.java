package pacoteInterface;
public class Quadrado implements FiguraGeometrica {

    private String nome;
    private float lado;

    public Quadrado(String nome, float lado){ // Constructor
        this.nome = nome;
        this.lado = lado;
    }

    @Override // Utilizei a notação @Override por conta de ser um método sobrescrito, não foi criado agora, foi criado na interface
    public String getNome(){
        return nome;
    }

    @Override
    public float getLado(){
        return lado;
    }

    @Override 
    public float getArea(){
        return lado*lado;
    }

}
