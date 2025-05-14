package org.aplicacao;

import org.aplicacao.servico.ApiServico;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();

        try {

            System.out.println(apiServico.getEndereco("03107040"));


        }catch(IOException | InterruptedException e){
            throw new RuntimeException(e);

        }

    }
}