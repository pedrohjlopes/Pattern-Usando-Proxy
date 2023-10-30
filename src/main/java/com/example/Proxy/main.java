package com.example.Proxy;

import model.Orcamento;
import model.OrcamentoProxy;

import java.math.BigDecimal;

public class main {
     public static void main(String[] args){
         Orcamento orcamento = new Orcamento(new BigDecimal("100"),new BigDecimal(10));
         System.out.println("valor do orcamento = " + orcamento.getValorOrcamento());
         System.out.println("tempo para ver o desconto = "+ orcamento.getDescontoOrcamento());

         OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
         System.out.println("valor sem proxy= " +proxy.getDescontoOrcamento());
         System.out.println("valor com proxy= " +proxy.getDescontoOrcamento());
     }
}
