package models;

class Moto : Veiculo {
    private val cilidrada: String

    constructor(cilidrada: String, placa: String, modelo: String, ano: Int, velocidadeMaxima: Double) : super(modelo, placa, ano, velocidadeMaxima){
            this.cilidrada = cilidrada
    }

    override fun toString(): String {
        return "Moto cilidrada='$cilidrada' ${caracteristicas()}"
    }




}
