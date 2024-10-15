package com.module05.ejercicio03

fun main(){

    var usuario1: Usuario = Usuario("Matias Moncada", 29, null, null)
    var usuario2: Usuario = Usuario("Gaspar Santander", 26, "Programador", usuario1)

    println(usuario2.mostrarDatos())
}

class Usuario(
    private var nombre: String,
    private var edad: Int,
    private var trabajo: String?,
    private var referencia: Usuario?
){
    fun mostrarDatos():Unit{
        println("Nombre: $nombre \nEdad: $edad años \nTrabajo: $trabajo \nFue citado por ${referencia?.nombre} de ${referencia?.edad} años")
    }
}