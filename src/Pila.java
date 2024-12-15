
import java.util.ArrayList;
import java.lang.Exception;
import java.util.List;

public class Pila<T> {
    private List<T> lista =new ArrayList<>();

    public void push(T elemento){
        lista.add(elemento);
    }
    public T pop () throws Exception {
        if (lista.isEmpty()){
            throw new Exception("ERRORE");
        }
        return lista.remove(lista.size()-1);
    }

    public boolean isEmpty(){
        if (lista.size()==0) return true;
        return false;
    }

    @Override
    public String toString() {
        String contenuto= (String) lista.get(0);
        return contenuto;
    }
}
