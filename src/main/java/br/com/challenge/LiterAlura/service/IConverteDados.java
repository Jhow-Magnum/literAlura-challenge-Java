package br.com.challenge.LiterAlura.service;

public interface IConverteDados {
    <T> T converterDados (String json, Class<T> classe);
}
