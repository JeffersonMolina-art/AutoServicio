package gt.edu.umg.progra3.colas;

import java.util.NoSuchElementException;

public class AutoServicio {

    private Cola cola;
    private Nodo cabeza = null;
    private Nodo fin = null;

    public AutoServicio(Cola cola) {
        this.cola = cola;
    }

    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */
    public String ingresarAuto(String placa){
        Nodo newNodo = new Nodo(placa, null);
        if (cabeza == null){
            cabeza = newNodo;
        }else{
            fin.next = newNodo;
        }
        fin = newNodo;
        return null;
    }

    public String proximoAuto(){
        Object cima = cabeza.item;
        return cima.toString();
    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @return
     */
    public String entregarAuto(){
        if (cabeza == null){
            throw new NoSuchElementException("No se encuentra elementos en cola");
        }
        Object item = cabeza.item;
        if (fin == cabeza){
            fin = null;
        }
        cabeza = cabeza.next;
        return item.toString();
    }

    public int obtenerAutosEnCola(){
        //ingresar codigo aqui
        int conteo = 0;
        Nodo temp = this.cabeza;
        while(temp != null){
            conteo++;
            temp = temp.next;
        }

        return conteo;
    }
}
