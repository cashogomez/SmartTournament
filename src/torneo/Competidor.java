/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

/**
 *
 * @author casho
 */
class Competidor {
    String Nombre;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String Dojo;
    String Division; // Grado 9 Kyu etc
    String Categoria; // Infantil, Juvenil, Master, Libre
    String Rama; // Varonil, Femenil, Mixto
    String Prueba; // Kata o Kumite
    String Modalidad; // Individual, Pareja, Equipo
    int Edad;
    Competidor(String Nombre, 
            String ApellidoPaterno, 
            String ApellidoMaterno, 
            String Dojo, 
            String Division, 
            String Categoria, 
            String Rama, 
            String Prueba,
            String Modalidad,
            int Edad ) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Dojo = Dojo;
        this.Division = Division;
        this.Categoria = Categoria;
        this.Rama = Rama;
        this.Prueba = Prueba;
        this.Modalidad = Modalidad;
        this.Edad = Edad;
    };
    public String conseguirNombre () {
        return this.Nombre;
    }
    public void cambiarNombre (String Nombre) {
        this.Nombre= Nombre;
    }
   public String conseguirApellidoPaterno () {
        return this.ApellidoPaterno;
    }
    public void cambiarApellidoPaterno (String ApellidoPaterno) {
        this.ApellidoPaterno= ApellidoPaterno;
    }
   public String conseguirApellidoMaterno () {
        return this.ApellidoMaterno;
    }
    public void cambiarApellidoMaterno (String ApellidoMaterno) {
        this.ApellidoMaterno= ApellidoMaterno;
    }
   public String conseguirDojo () {
        return this.Dojo;
    }
    public void cambiarDojo (String Dojo) {
        this.Dojo = Dojo;
    }
    public String conseguirDivision () {
        return this.Division;
    }
    public void cambiarDivision (String Division) {
        this.Division = Division;
    }
    public String conseguirCategoria () {
        return this.Categoria;
    }
    public void cambiarCategoria (String Categoria) {
        this.Categoria= Categoria;
    }
    public String conseguirRama () {
        return this.Rama;
    }
    public void cambiarRama (String Rama) {
        this.Rama = Rama;
    }
    public String conseguirPrueba () {
        return this.Prueba;
    }
    public void cambiarPrueba (String Prueba) {
        this.Prueba = Prueba;
    }
    public String conseguirModalidad () {
        return this.Modalidad;
    }
    public void cambiarModalidad (String Modalidad) {
        this.Modalidad = Modalidad;
    }
    public int conseguirEdad () {
        return this.Edad;
    }
    public void cambiarEdad (int Edad) {
        this.Edad = Edad;
    }
}
