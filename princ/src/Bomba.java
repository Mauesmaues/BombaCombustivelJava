//Crie uma classe que modele uma bomba de combustível.
//A classe deve possuir os seguintes atributos:
//número da bomba, tipo de combustível, valor do litro de combustível e quantidade de combustível.
//Os métodos são os seguintes:
//- abastecerPorValor( ):
//método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo.
//- abastecerPorLitro( ):
//método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
//- alterarValor( ): altera o valor do litro do combustível.
//- alterarQuantidadeCombustivel( ): altera a quantidade de combustível restante na bomba.
//- status(): mostra o dados da bomba de combustível.
//Observação: sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba.

public class Bomba {
    int numBomba;
    float valueC;
    float quantityC;

    Bomba(int numBomba, float valueC, float quantityC) {
        this.numBomba = numBomba;
        this.valueC = valueC;
        this.quantityC = quantityC;
    }

    public void abastecerPorValor(float value){
        float abastecido = value / valueC;
        if(this.quantityC >= abastecido){
            System.out.println("Abastecido: " + abastecido);
        }else{
            System.out.println("Bomba com quantidade de combustivel insuficiente. Quantidade de combustivel em bomba: " + this.quantityC);
        }
    }

    public void abastecerPorLitro(float litros){
        if(this.quantityC >= litros){
            float valuePagar = litros * valueC;
            System.out.println("Valor a ser pago: " + valuePagar);
            this.quantityC -= litros;
        }else{
            System.out.println("Bomba com quantidade de combustivel insuficiente. Quantidade de combustivel em bomba: " + this.quantityC);
        }
    }

    public void showBomb(){
        System.out.println("------------------------");
        System.out.println("Bomba: " + this.numBomba);
        System.out.println("Valor do combustivel por litros: " + this.valueC);
        System.out.println("Quantidade de combustivel: " + this.quantityC);
        System.out.println("------------------------");
    }

}
