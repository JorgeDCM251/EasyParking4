/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author kadi
 */
public class cobro {
    //Atributos
    int idVehiculo;
    int tipoVehiculo;
    String Hentrada;
    String Hsalida;
    String tiempo;
    float tarifa;
    float totalPago;
    String idUsuario;
    
    //Constructor
    public cobro() {
    }
    
   
    
    //Encapsulamiento

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getHentrada() {
        return Hentrada;
    }

    public void setHentrada(String Hentrada) {
        this.Hentrada = Hentrada;
    }

    public String getHsalida() {
        return Hsalida;
    }

    public void setHsalida(String Hsalida) {
        this.Hsalida = Hsalida;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
     //Metodos
    
    public void crearCobro(){
    }
    public void consultarCobro(){
    }
    public void listarCobro(){
    }
    public void actualizarCobro(){
    }
    public void eliminarCobro(){
    }
    
}
