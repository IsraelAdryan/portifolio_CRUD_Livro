package com.crud.portifolio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity                // Informa que essa Classe está associada a uma tabela do nosso Banco de Dados para realizar o mapeamento de forma automática
@Data                  // Gera automáticamente os gets e sets
@AllArgsConstructor    // Faz construtores com parâmetros automáticamente
@NoArgsConstructor     // Faz construtores sem parâmetros automáticamente
public class Livro {

    @Id                                                    //Identificar como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //Gera a chave primária automáticamente
    private Long id;


    private String nome;


    private int classificacao;


    private String genero;


}



