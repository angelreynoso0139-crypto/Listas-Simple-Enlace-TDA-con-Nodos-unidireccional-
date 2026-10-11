/*
ARIEL VILLA OLIVAREZ
ANGEL EMILIANO REYNOSO LÓPEZ
JULIAN EMMANUEL MENDEZ RODRIGUEZ
 */
package back_end;

public class ListaSimple {
    private NodoU primero;
    private NodoU ultimo;
    
    public void agregarPrincipio(Persona per){
        NodoU nuevo = new NodoU(per);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.sig = primero;
            primero = nuevo;
        }
    }
    
    public void agregarFinal(Persona per){
        NodoU nuevo = new NodoU(per);
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }
        ultimo.sig = nuevo;
        ultimo = nuevo;
    }
    
    public void agregarPosicion(Persona per){
        
        
    }
    
    public Persona quitarPrincipio(){
        if(primero == null){
            return null; 
        }
     
        Persona extraida = primero.getData();
        
        if (primero == ultimo){
            primero = null;
            ultimo = null;
        } else {
            primero = primero.sig; 
        }
        return extraida;
    }  
    public Persona quitarFinal(){
        if (primero == null){
            return null;
        }
        Persona extraida = ultimo.getData();
        if (primero == ultimo){
            primero = null;
            ultimo = null;
        } else {
            NodoU actual = primero;
            while(actual.sig != ultimo){
                actual = actual.sig;
            }
            actual.sig = null;
            ultimo = actual; 
        }
        return extraida;
    }
    
    public Persona quitarPosicion(int pos){
        return null;
    }
    
    public String mostrarPrincipio(){
        if(primero == null){//Este vacia
            return null;
        }
        return primero.getData().toString();
    }
    
    public String mostrarUltimo(){
        if(ultimo == null){
            return null;
        }
        return ultimo.getData().toString();
    }
    
    public String mostrarPosicion(int pos){
        return null;
    }
    
    public String mostrarElementos(){
        String datos = "";
        NodoU actual = primero;
        
        while (actual != null) {
            datos += actual.getData().toString() + "\n----------------\n";
            actual = actual.sig; 
        }
        
        return datos;
    }
}