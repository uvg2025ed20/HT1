package uvg.edu;

public class Licuadora implements ILicuadora {

    private boolean encendida = false;
    private boolean llena = false;
    private int velocidad = 0;

    public Licuadora()  {
        this.encendida = false;
        this.llena = false;
        this.velocidad = 0;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        if (this.encendida) {
            System.out.println("La licuadora ya está encendida\n");
        } else {
                System.out.println("La licuadora se ha encendido\n");
                this.encendida = true;

        }
    }

    public void llenar(String ingrediente) {
        if (this.llena) {
            System.out.println("La licuadora ya está llena\n");
        } else {
            System.out.println("La licuadora se ha llenado con " + ingrediente + "\n");
            this.llena = true;
        }
    }

    public void aumentarVelocidad() {
        if (this.encendida) {
            if (this.velocidad < 10) {
                if (this.llena){
                    this.velocidad++;
                    System.out.println("La velocidad de la licuadora ha aumentado a " + this.velocidad + "\n");
                }else {
                    System.out.println("La licuadora no puede aumentar la velocidad porque no está llena \n");
                }

            } else {
                System.out.println("La licuadora ya está a máxima velocidad \n");
            }
        } else {
            System.out.println("La licuadora no puede aumentar la velocidad porque está apagada \n");
        }
    }

    public void disminuirVelocidad() {
        if (this.encendida) {
            if (this.velocidad > 0) {
                this.velocidad--;
                System.out.println("La velocidad de la licuadora ha disminuido a " + this.velocidad + "\n");
            } else {
                System.out.println("La licuadora ya está a velocidad mínima \n");
            }
        } else {
            System.out.println("La licuadora no puede disminuir la velocidad porque está apagada \n");
        }
    }

    public int obtenerVelocidad() {
        return this.velocidad;
    }

    public boolean estaLlena() {
        return this.llena;
    }

    public void vaciar() {
        if (this.llena) {
            if (this.velocidad == 0) {
                System.out.println("La licuadora se ha vaciado \n");
                this.llena = false;
            } else {
                System.out.println("La licuadora no puede vaciarse porque está en uso \n");
            }
        } else {
            System.out.println("La licuadora ya está vacía \n");
        }
    }

}
