public class Vaca {
    private String nome;
    private String registro;
    private Estado estado;

    public Vaca(String nome, String registro, Estado estado) {
        this.nome = nome;
        this.registro = registro;
        this.estado = estado;
    }

    public String obterVaca() {
        return "{ nome : "+ this.nome+", registro : "+this.registro+", estado : "+estado.getNome()+"}";
    }
}
