public class Main {
    public static void main(String[] args) {
        Bomba newBomb = new Bomba(123, 7.50f, 50);

        newBomb.abastecerPorLitro(25);
        newBomb.showBomb();
        newBomb.abastecerPorValor(100);
        newBomb.showBomb();
        newBomb.abastecerPorValor(200);
    }
}