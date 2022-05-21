import java.util.HashMap;
import java.util.Map;

public class EstadoFactory {
    private static EstadoFactory instancia = new EstadoFactory();
    public static EstadoFactory obterInstancia(){
        return instancia;
    }
    private Map<String,Estado> estados = new HashMap<>();

    public Estado getEstado(String estadoNome) {
        Estado estado = estados.get(estadoNome);
        if (estado == null){
            estado = new Estado(estadoNome);
            estados.put(estadoNome,estado);
        }
        return estado;
    }
    public int obterTotalEstado(){
        return estados.size();
    }
    public void limpar(){
        estados.clear();
    }
}
