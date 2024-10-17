
package com.mycompany.figurasgeometricas;

 class FiguraGeometrica {
 private String nombre;
 private String color;
 public FiguraGeometrica(String nombre, String color){
     this.nombre = nombre;
     this.color = color;
 }
 public String getNombre(){
     return nombre;
 }
 public String getcolor(){
     return color;
 }
 public double obtenerArea(){
     return 0.0;
 }
 public double obtenerPerimetro(){
     return 0.0;
 }
}
class Circulo extends FiguraGeometrica{
     private double radio;
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    public double obtenerArea(){
        return Math.PI * radio;
    }
}
class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color , double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double obtenerArea() {
        return lado1 * lado2; // Área del rectángulo
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2); // Perímetro del rectángulo
    }
}
class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;            
    }
    @Override
    public double obtenerArea() {
    return base * altura;
    }
    @Override
    public double obtenerPerimetro() {
        return 0.0;
    }
}    
