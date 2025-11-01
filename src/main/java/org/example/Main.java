package org.example;

public class Main {
    public static void main(String[] args) {
        PessoaFactory pessoaFactory = new PessoaFactory();

        Pessoa pessoa = pessoaFactory.criarPessoa("Pedro", 12);
        Pessoa pessoa1 = pessoaFactory.criarPessoa("Thiago", 13);
        Pessoa pessoa2 = pessoaFactory.criarPessoa("João", 14);
        Pessoa pessoa3 = pessoaFactory.criarPessoa("Matheus", 15);
        Pessoa pessoa4 = pessoaFactory.criarPessoa("Henrique", 16);
        Pessoa pessoa5 = pessoaFactory.criarPessoa("Felipe", 17);

    }
}
