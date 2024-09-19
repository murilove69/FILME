class Filme1 {

    // Atributos privados.
    private String titulo;
    private int tempo;
    private String genero;

    // Construtor da classe.
    public Filme1(String titulo, int Tempo, String genero)throws Exception {
        setTitulo(titulo);
        setDuracaoMinutos(Tempo);
        setGenero(genero);
    }

    // Método para validar e definir o título
    public void setTitulo(String titulo) throws Exception {
        if (titulo == "") {  // Se o título estiver vazio, ele anula.
            throw new Exception("O título não pode estar vazio.");
        }
        this.titulo = titulo;
    }

    // Método da duração:
    public void setDuracaoMinutos(int Tempo) throws Exception {
        if (Tempo <= 0) {
            throw new Exception("A duração deve ser maior que zero.");
        }
        this.tempo = Tempo;
    }

    // Método para validar o gênero:
    public void setGenero(String genero) throws Exception {
        if (!(genero.equalsIgnoreCase("Romance") || 
              genero.equalsIgnoreCase("Terror") || 
              genero.equalsIgnoreCase("Comédia"))) {
            throw new Exception("O gênero deve ser Romance, Terror ou Comédia.");
        }
        this.genero = genero;
    }

    // Método para acessar os atributos:
    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return tempo;
    }

    public String getGenero() {
        return genero;
    }

    // Método para exibir as informações do filme
    public String tudo() {
        return "Título: " + titulo + "\n Duração: " + tempo + " minutos\n Gênero: " + genero;
    }
}

// Classe Filme para teste
public class Filme {

    public static void main(String[] args) {
        try {
            // Exibindo o filme
            Filme1 filme = new Filme1("", 102, "Comédia");
            System.out.println(filme.tudo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
