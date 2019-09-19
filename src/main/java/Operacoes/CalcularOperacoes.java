package Operacoes;

public class CalcularOperacoes implements Operacoes{

    @Override
    public Integer somar(int x, int  y) {
        return x+y;
    }

    @Override
    public Integer subtrair(int x, int y) {
        return x-y;
    }

    @Override
    public Integer multiplicar (int x, int y) {
        return x * y;
    }

    @Override
    public Integer dividir(int x, int y) {
        return x/y;
    }

    @Override
    public Integer media(int x, int y) {
        return (x + y)/2;
    }
}


