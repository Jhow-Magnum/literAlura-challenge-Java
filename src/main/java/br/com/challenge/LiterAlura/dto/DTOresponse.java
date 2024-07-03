package br.com.challenge.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DTOresponse (
        List<DTOlivro>results
){

}
