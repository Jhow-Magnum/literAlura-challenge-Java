package br.com.challenge.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DTOautor (
        @JsonAlias("name")
        String nome,
        @JsonAlias("birth_year")
        String dataNascimento,
        @JsonAlias("death_year")
        String dataFalecimento
){


}