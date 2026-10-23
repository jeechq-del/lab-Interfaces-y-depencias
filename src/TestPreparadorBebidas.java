public class TestPreparadorBebidas {
    public static void main(String[] args) {
        System.out.println(" Configuración 1: Cafetera + Licuadora ");
        EquipoCocina cafetera1 = new Cafetera();
        EquipoCocina licuadora1 = new Licuadora();
        PreparadorBebidas preparador1 = new PreparadorBebidas(cafetera1, licuadora1);
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();
        System.out.println("\n Configuración 2: Máquina de Té + Exprimidor ");
        EquipoCocina maquinaTe1 = new MaquinaTe(); // Corregido a MaquinaTe
        EquipoCocina exprimidor1 = new Exprimidor();
        PreparadorBebidas preparador2 = new PreparadorBebidas(maquinaTe1, exprimidor1); // ¡Faltaba esta línea!
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();
        System.out.println("\n Configuración 3: Cafetera + Máquina de Té ");
        EquipoCocina cafetera2 = new Cafetera();
        EquipoCocina maquinaTe2 = new MaquinaTe();
        PreparadorBebidas preparador3 = new PreparadorBebidas(cafetera2, maquinaTe2);
        preparador3.prepararDesayuno();
        preparador3.apagarTodo();
    }
}