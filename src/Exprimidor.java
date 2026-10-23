public class Exprimidor implements EquipoCocina {
    private boolean encendido = false;
    private int velocidad= 0;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("El exprimidor se ha encendido correctamente");

    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("El exprimidor se apago correctamente");

    }

    @Override
    public void preparar() {
        if(encendido){
            velocidad ++;
            System.out.println("Exprimiendo a velocidad: "+velocidad);
        }

    }

    @Override
    public void ajustarIntensidad() {
        if (encendido && velocidad > 0){
            velocidad --;
            System.out.println("Velocidad del exprimidor "+velocidad);

        }

    }
}
