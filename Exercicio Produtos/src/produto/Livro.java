package produto;

public class Livro extends Produto{

    private String autor;
    private String genero;

    
    public Livro(String nome, float preco, String autor, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.genero = genero;
    }

    public String descrever(){
        return "Livro: " + nome + " / Autor: " + autor + " / Genero: " + genero;
    }

    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Livro [nome=" + nome + "autor=" + autor + ", genero=" + genero + "preço=" + preco + "]";
    }

    
    
}
