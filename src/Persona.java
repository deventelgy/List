public class Persona {
    private Integer codigo;
    private String nombre;
    private String apellido;
    private Integer edad;

    public Integer getCodigo(){
        return codigo;
    }
    public void setCodigo(Integer _codigo){
        this.codigo = _codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String _apellido){
        this.apellido = _apellido;
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer _edad){
        this.edad = _edad;
    }
}
