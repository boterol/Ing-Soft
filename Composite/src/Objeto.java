import java.util.ArrayList;

public class Objeto {

    String nombre;

     String caracteristicas;
     ArrayList<Objeto> contenido = new ArrayList<>();

    public Objeto(String nombre, String caracteristicas)
    {
        this.nombre=nombre;
        this.caracteristicas=caracteristicas;
    }

    public String toString()
    {
        String out="objeto: "+ nombre + "\n";
        out+="características: " + caracteristicas;
        return out;
    }

    public String toString2()
    {
        String out="\tobjeto: "+ nombre + "\n";
        out+="\tcaracterísticas: " + caracteristicas;
        return out;
    }

}
