public class Vaca {
    private String nome;
    private String registro;
    private Estado estado;

    public Vaca(String nome, String registro, Estado estado) {
        this.nome = nome;
        this.registro = registro;
        this.estado = estado;
    }

    public Vaca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String obterVaca() {
        return "{ nome : "+ this.nome+", registro : "+this.registro+", estado : "+estado.getNome()+"}";
    }
}
