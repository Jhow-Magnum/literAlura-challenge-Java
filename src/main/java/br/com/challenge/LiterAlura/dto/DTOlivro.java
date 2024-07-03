package br.com.challenge.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DTOlivro (

        @JsonAlias("title")
        String titulo,
        @JsonAlias("authors")
        List<DTOautor> autorDTOList,
        @JsonAlias("languages")
        List<String> idioma,
        @JsonAlias("download_count")
        String totalDownloads) {


        }