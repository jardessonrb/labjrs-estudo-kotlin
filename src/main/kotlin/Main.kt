import models.Moto
import models.Veiculo
import service.Piloto
import java.util.Scanner

fun main(args: Array<String>) {
    var moto: Veiculo = Moto("125", "jd9d8d", "Honda", 2023, velocidadeMaxima = 125.0)

    val piloto: Piloto = Piloto(moto)

    while(true){
        val scanner = Scanner(System.`in`)

        println("Opcao")
        var opca = scanner.nextLine()
        if(opca.equals("parar")){
            piloto.parar()
        }

        if(opca.equals("andar")){
            piloto.andar()
        }

        if(opca.equals("ligar")){
            piloto.lisgar()
        }

        if(opca.equals("exit")) break
    }
}