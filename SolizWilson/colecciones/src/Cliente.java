public class Cliente {

    private Integer codigo;
    private String nombres;
    private Integer telefono;
    private String direccion;
    private String descripcion;


    public  Cliente (int c, String n, int t, String d, String ds) {
        codigo = c;
        nombres = n;
        telefono = t;
        direccion = d;
        descripcion = ds;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
