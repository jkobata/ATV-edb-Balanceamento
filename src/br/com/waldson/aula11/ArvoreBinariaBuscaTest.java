package br.com.waldson.aula11;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArvoreBinariaBuscaTest {
    @Test
    public void test_balanceada(){
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insert(2);


        boolean var = arvore.getBalanceada();

        assertTrue(var);
    }
    @Test
    public void test_balanceada2(){
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insert(2);
        arvore.insert(1);
        arvore.insert(0);


        boolean var = arvore.getBalanceada();

        assertFalse(var);
    }
    @Test
    public void test_balanceada3(){
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insert(2);
        arvore.insert(1);



        boolean var = arvore.getBalanceada();

        assertTrue(var);
    }
    @Test
    public void test_balanceada4(){
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insert(2);
        arvore.insert(100);
        arvore.insert(20);


        boolean var = arvore.getBalanceada();

        assertFalse(var);
    }

}