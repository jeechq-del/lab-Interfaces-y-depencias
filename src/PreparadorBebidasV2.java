import java.util.List;

public class PreparadorBebidasV2 {
    private List<EquipoCocina> listaDeEquipos;

    public PreparadorBebidasV2(List<EquipoCocina> listaDeEquipos) {
        this.listaDeEquipos = listaDeEquipos;
    }

    public void prepararDesayuno() {
        System.out.println("Iniciando preparacion del desayuno (V2)...");
        for (EquipoCocina equipo : listaDeEquipos) {
            equipo.encender();
            equipo.preparar();
        }
        System.out.println("Desayuno listo.");
    }

    public void apagarTodo() {
        System.out.println("Apagando todos los equipos...");
        for (EquipoCocina equipo : listaDeEquipos) {
            equipo.apagar();
        }
        System.out.println("Equipos apagados.");
    }
}