package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    //Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
  /*  public static String greetings(String nombre) {

        return "Hola " + nombre;
    }*/
    public static String greetings() {
        System.out.println("¡Bienvenido, Sebas!");
        return null;
    }


    // Esto es una funcion, ya que devuelve un valor
    // Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
 /*   public static String error(String contraseña) {

        return contraseña + " Credenciales incorrectas.";
    }*/

    public static String error() {
        System.out.println("Usuario o contraseña incorrectos.");
        return null;
    }


    //Esto es un procedimiento, ya que no devuelve un valor
    //  Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()

    public static void main (String[] args) {
        checkUser("Sebas", "sebas01");

    }

    public static void checkUser(String nombre, String contraseña) {


        // Comparamos el usuario y la contraseña con los valores esperados
        if (nombre.equals("Sebas") && contraseña.equals("sebas01")) {
            // Si ambos coinciden, llamamos a la función greetings()
            greetings();
        } else {
            // Si alguno no coincide, llamamos a la función error()
            error();
        }
    }
}