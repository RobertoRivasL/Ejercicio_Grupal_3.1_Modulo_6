package cl.g5.ej3Mod6.model.dto;

public class CapacitacionDTO {
    private String nombre;
    private String detalle;
    private String fecha;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidad;

    public CapacitacionDTO() {
    }

    public CapacitacionDTO(String nombre, String detalle) {
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public CapacitacionDTO(String nombre, String detalle, String fecha, String hora, String lugar, int duracion, int cantidad) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}