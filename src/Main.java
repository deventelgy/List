import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Persona> list_persona = new ArrayList<>();
        //asignación todo el listado de la clase persona.

        Persona persona = new Persona();
        persona.setCodigo(1);
        persona.setNombre("Juan Carlos");
        persona.setApellido("Javier Maguiña");
        persona.setEdad(25);

        list_persona.add(persona);
        System.out.println("Datos lista: \n" +
                "\nCódigo: "+list_persona.get(0).getCodigo()+
                "\nNombre: "+list_persona.get(0).getNombre()+
                "\nApellido: "+list_persona.get(0).getApellido()+
                "\nEdad: "+list_persona.get(0).getEdad());
    }
}