public class VacaBuilder {
    private Vaca vaca;

    public VacaBuilder() {
        this.vaca = new Vaca();
    }

    public Vaca build(){
        if (vaca.getRegistro().isEmpty())  {
            throw new IllegalArgumentException("Registro não informado");
        }
        if (vaca.getNome().isEmpty())  {
            throw new IllegalArgumentException("Nome não informado");
        }
        if(vaca.getEstado()==null){
            throw new IllegalArgumentException("Estagio nao informado");
        }

        return this.vaca;
    }

    public VacaBuilder setRegistro(String registro) {
        this.vaca.setRegistro(registro);
        return this;
    }

    public VacaBuilder setNome(String nome) {
        this.vaca.setNome(nome);
        return this;
    }

    public VacaBuilder setEstado(String estado) {
        this.vaca.setEstado(EstadoFactory.getEstado(estado));
        return this;
    }
}
