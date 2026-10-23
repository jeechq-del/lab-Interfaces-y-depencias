public class TestAnalisis {
    public static void main(String[] args) {
        PreparadorBebidas preparador = new PreparadorBebidas();
        preparador.prepararDesayuno();
        preparador.apagarTodo();
        System.out.println("El preparador esta amarrado a Cafetera y Licuadora porque las crea con new dentro de su constructor");

    }
}
