
import java.util.List;

public class TestPreparadorBebidasV2 {

    private List<EquipoCocina> listaDeEquipos;

    public TestPreparadorBebidasV2(List<EquipoCocina> listaDeEquipos) {
        this.listaDeEquipos = listaDeEquipos;
    }

    public void prepararDesayuno() {
        for (EquipoCocina equipo : listaDeEquipos) {
            equipo.preparar();
        }
    }

    public void apagarTodo() {
        for (EquipoCocina equipo : listaDeEquipos) {
            equipo.apagar();
        }
    }
}

