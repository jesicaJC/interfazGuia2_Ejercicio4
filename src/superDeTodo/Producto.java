/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superDeTodo;

/**
 *
 * @author rafa
 *//*PRIMERO: CREAMOS LA CLASE PRODUCTO Y LA CLASE "ENUM CATEGORIA"(representa un conjunto de valores fijos y predefinidos de valores posibles)*/
public class Producto implements Comparable<Producto>{
   private int codigo;
   private String descripcion;
   private double precio;
   private int stock;
   private String Rubro;

    public Producto(int codigo, String descripcion, double precio, int stock, String Rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.Rubro = Rubro;
    }

    public Producto(int codigo) { 
        this.codigo = codigo;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return Rubro;
    }

    public void setRubro(String Rubro) {
        this.Rubro = Rubro;
    }

   

    @Override
    public int compareTo(Producto t) {
       if(codigo==t.codigo){
       return 0;
       
       }else if (codigo>t.codigo){
        return 1;
       }else{
        return -1;
       }
    }
   
   
           
}
