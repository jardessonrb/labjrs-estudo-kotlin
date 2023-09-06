package models

import java.util.Scanner

open class Veiculo {
    private val modelo: String
    private val placa: String
    private val ano: Int
    private var velocidadeMaxima: Double
    private var velocidadeAtual: Double = 0.0

    constructor(modelo: String, placa: String, ano: Int, velocidade: Double) {
        this.modelo = modelo
        this.placa = placa
        this.ano = ano
        this.velocidadeMaxima = velocidade

    }

    constructor(){
        this.modelo = ""
        this.placa = ""
        this.ano = 2023
        this.velocidadeMaxima = 100.0
    }

    override fun toString(): String {
        return "Veiculo de placa ${this.placa} modelo ${this.modelo} ano ${this.ano}"
    }

    fun caracteristicas(): String {
        return "placa ${this.placa} modelo ${this.modelo} ano ${this.ano}"
    }

    fun acelerar() {
        while(velocidadeAtual < this.velocidadeMaxima){
            velocidadeAtual += 0.5
            println("Velocidade: ${velocidadeAtual} Km")
            Thread.sleep(2000)
        }
    }

    fun freiar() {
        while(this.velocidadeAtual > 0.0){
             this.velocidadeAtual -= 0.5
            println("Velocidade: ${velocidadeAtual} Km")
            Thread.sleep(2000)
        }
    }
}