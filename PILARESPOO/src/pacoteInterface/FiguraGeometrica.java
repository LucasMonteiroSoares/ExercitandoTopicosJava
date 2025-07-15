package pacoteInterface;
public interface FiguraGeometrica { // Interface serve como um contrato a ser seguido
    public String getNome();
    public float getArea();  // Métodos que deverão ser implementados em todas as classes de Figuras Geométricas 
    public float getLado();
}
