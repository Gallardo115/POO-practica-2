import java.util.List;
import java.util.ArrayList;

public class coleccion {
    List<datosPersonales> listaDatos= new ArrayList<>();

    public void add(datosPersonales datos){
        listaDatos.add(datos);
    }

    public void show(){
        for(datosPersonales datos : listaDatos){
            System.out.println(datos);
        }
    }
    public void show2(){
        listaDatos.forEach(datos -> System.out.println(datos));
    }
    public void buscar(String nombre){
        listaDatos.forEach(datos->{
            if (datos.getNombre().equals(nombre)){
                System.out.println(datos);
            }
        });
    }
}

