public class MaquinaTe implements EquipoCocina{
    private boolean encendido = false;
    private int intensidad = 0;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("La maquina de te esta encendida y se encuentra calentando el agua");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("La maquina de te se ha apagado");

    }

    @Override
    public void preparar() {
        if(encendido)
            intensidad ++;
        System.out.println("La maquina esta preparando el te a una intensidad de: "+intensidad);

    }

    @Override
    public void ajustarIntensidad() {
        if(encendido && intensidad>0)
            intensidad --;
        System.out.println("Intensidad de la maquina de te ajustada a: "+intensidad);


    }
}
