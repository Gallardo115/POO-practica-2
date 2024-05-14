//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  datosPersonales obj= new datosPersonales(nombre:"Gabriela",apellidos:"Palacios Torres")

        coleccion objc = new coleccion();
        datosPersonales dp1= new datosPersonales("Francisco","Flores Dias");

        objc.add(dp1);
        objc.add(new datosPersonales("Francisco","Flores Dias"));
        objc.add(new datosPersonales("Francisco","Flores Dias"));
        objc.add(new datosPersonales("Francisco","Flores Dias"));
        objc.add(new datosPersonales("Fernando","Dias Santiago"));

 //       objc.show();
 //       objc.show2();
        objc.buscar("Fernando");
        }
    }

