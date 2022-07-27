
package uml.composicion_RomboNegrito;


public class Coche {
    public Motor motor;
    public Coche(){
        //al crear la instancia de tipo coche
        //TAMBIEN SE CREA LA CLASE DE TIPO MOTOR
        //OSEA AL ELIMINAR LA INSTACION DE TIPO COCHE
        //TAMBIEN SE LIMINA LA DE MOTOR.
        //EL CICLO DE VIDA DE LA INSTANCIA MOTOR
        //DEPENDE DEL CICLO DE VIDA DE COCHE
        motor= new Motor();
    }
}
