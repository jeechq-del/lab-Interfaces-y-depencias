import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {
        // Crear una lista con varios equipos distintos
        List<EquipoCocina> misEquipos = new ArrayList<>();
        misEquipos.add(new Cafetera());
        misEquipos.add(new MaquinaTe());
        misEquipos.add(new Exprimidor());

        PreparadorBebidasV2 preparadorV2 = new PreparadorBebidasV2(misEquipos);
        preparadorV2.prepararDesayuno();
        preparadorV2.apagarTodo();
    }
}
