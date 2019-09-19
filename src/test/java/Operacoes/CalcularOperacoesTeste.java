package Operacoes;

import org.junit.Assert;
import org.junit.Test;

public class CalcularOperacoesTeste {

    @Test
    public void somarSucessoTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer soma = calcularOperacoes.somar(10, 2);

        Assert.assertTrue(soma == 12);
    }

    @Test
    public void subtrairSucessoTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer subtracao = calcularOperacoes.subtrair(10, 2);

        Assert.assertTrue(subtracao == 8);
    }

    @Test
    public void multiplicarSucessoTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer multiplicar = calcularOperacoes.multiplicar(10, 2);

        Assert.assertTrue(multiplicar == 20);
    }

    @Test
    public void dividirSucessoTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer divisao = calcularOperacoes.dividir(10, 2);

        Assert.assertTrue(divisao == 5);
    }

    @Test
    public void somarFalhaTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer soma = calcularOperacoes.somar(10, 2);

        Assert.assertFalse(soma != 12);
    }

    @Test
    public void subtrairFalhaTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer subtracao = calcularOperacoes.subtrair(10, 2);

        Assert.assertFalse(subtracao != 8);
    }

    @Test
    public void multiplicarFalhaTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer multiplicar = calcularOperacoes.multiplicar(10, 2);

        Assert.assertFalse(multiplicar != 20);
    }

    @Test
    public void dividirFalhaTest() {
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer divisao = calcularOperacoes.dividir(10, 2);

        Assert.assertFalse(divisao != 5);
    }

    @Test
    public void mediaSucessoTest(){
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer media = calcularOperacoes.media(10,2);

        Assert.assertTrue(media == 6);
    }

    @Test
    public void mediaFalhaTest(){
        CalcularOperacoes calcularOperacoes = new CalcularOperacoes();
        Integer media = calcularOperacoes.media(10,2);

        Assert.assertFalse(media != 6);
    }

}