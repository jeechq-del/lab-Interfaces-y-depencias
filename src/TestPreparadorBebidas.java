public class TestPreparadorBebidas {
    public static void main(String[] args) {
        System.out.println("Configuracion 1: Cafeteria + licuadora");
        EquipoCocina cafeteria1 = new Cafetera();
        EquipoCocina licuadora1 = new Licuadora();
        PreparadorBebidas preparador1 = new PreparadorBebidas(cafeteria1,licuadora1);
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();
        System.out.println("Configuracion 2: Cafeteria + licuadora");
        EquipoCocina maquinaTe1 = new Cafetera();
        EquipoCocina exprimidor1 = new Exprimidor();
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();
        System.out.println("Configuracion 3: maquina Te + Exprimidor");
        EquipoCocina cafetera2 = new Cafetera();
        EquipoCocina maquinaTe2 = new MaquinaTe();
        PreparadorBebidas preparador3 = new PreparadorBebidas(cafetera2, maquinaTe2);
        preparador3.prepararDesayuno();
        preparador3.apagarTodo();

    }
}
