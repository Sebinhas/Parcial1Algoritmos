package Datos;

public class cls_implementos {
    private String identificacion;
    private String nombre;
    private String tipo;
    private String descripcion;

    public cls_implementos(String codigo, String nombre,String tipo, String descripcion) {
        this.identificacion = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    
}
