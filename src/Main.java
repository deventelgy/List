import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Persona> list_persona = new ArrayList<>();
        //asignación todo el listado de la clase persona.

        for(int i=1;i<=10;i++){
            Persona persona = new Persona();
            persona.setCodigo(i);
            persona.setNombre("Juan Carlos "+i);
            persona.setApellido("Javier Maguiña "+i);
            persona.setEdad(25+i);
            list_persona.add(persona);
        }
        System.out.println("Tamaño de lista: " + list_persona.size());

        for(Persona p:list_persona){
            System.out.println("Datos lista: \n" +
                    "\nCódigo: "+p.getCodigo()+
                    "\nNombre: "+p.getNombre()+
                    "\nApellido: "+p.getApellido()+
                    "\nEdad: "+p.getEdad());
        }
    }
}