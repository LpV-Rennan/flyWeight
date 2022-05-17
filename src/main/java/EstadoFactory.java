import java.util.HashMap;
import java.util.Map;

public class EstadoFactory {
    private static Map<String,Estado> estados = new HashMap<>();

    public static Estado getEstado(String estadoNome) {
        Estado estado = estados.get(estadoNome);
        if (estado == null){
            estado = new Estado(estadoNome);
            estados.put(estadoNome,estado);
        }
        return estado;
    }
    public static int obterTotalEstado(){
        return estados.size();
    }
    public static void limpar(){
        estados.clear();
    }
}
