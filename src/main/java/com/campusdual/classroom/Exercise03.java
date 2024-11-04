package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    //Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.

    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }


    // Esto es una funcion, ya que devuelve un valor
    // Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
  public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

       //Esto es un procedimiento, ya que no devuelve un valor
    //  Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()



    public static void checkUser(String user, String pass) {
        //inicializacion de variables
    String validUser="Sebas";
    String validPass="sebas01";
        //el equals compara el valor fijo con el variable que se le vaya a poner
    if(validUser.equals(user) && validPass.equals(pass)){
     //se imprime por mensaje el nombre  de la funcion greetings
        System.out.println(greetings(user));
    }
    else{
        //si no por la otra funcion error
        System.out.println(error(validUser));//aqui seria correcto el user en vez de validUser
    }

    }
    public static void main (String[] args) {
        /*llamamos a checkuser porque es el procedimiento
        en el cual comparamos parametros*/

        //camino correcto
    checkUser("Sebas","sebas01");
    //camino incorrecto
    checkUser(" alejandro ","Torres");

    }
}