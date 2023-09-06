package service

import models.Veiculo

class Piloto {
    private var veiculo: Veiculo

    constructor(veiculo: Veiculo){
        this.veiculo = veiculo
    }

    fun lisgar() {
        println("Ligando o veiculo: "+veiculo.toString())
    }

    fun andar() {
        veiculo.acelerar()
    }

    fun parar(){
        veiculo.freiar()
    }
}