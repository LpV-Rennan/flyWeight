import java.util.ArrayList;
import java.util.List;

public class Curral {
    private List<Vaca> vacas = new ArrayList<>();

    public void adicionar(String estadoNome, String nome ,String registro) {
        Vaca vaca = new VacaBuilder().setNome(nome).setEstado(estadoNome).setRegistro(registro).build();//Dá para fazer um builder
        vacas.add(vaca);
    }

    public List<String> obterVacas() {
        List<String> saida = new ArrayList<String>();
        for (Vaca vaca : this.vacas) {
            saida.add(vaca.obterVaca());
        }
        return saida;
    }
}
