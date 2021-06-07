package IO;

import java.util.ArrayList;

import datos.Villano;

public class RespuestaServidor {
    private ArrayList<Villano> mensaje;
    private  int estado;

    public RespuestaServidor(ArrayList<Villano> mensaje, int estado) {
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public ArrayList<Villano> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Villano> mensaje) {
        this.mensaje = mensaje;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
