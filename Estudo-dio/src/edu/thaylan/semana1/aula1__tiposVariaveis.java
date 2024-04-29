package edu.thaylan.semana1;

public class aula1__tiposVariaveis {
  public static void main(String[] args) {
    
    // números naturais
    byte idade = 20; // ele tem 1 byte na memória usado em números curtos 
    short ano = 2024; // ele tem 2 byte na memória usado em números um pouco maiores
    int cep = 69918630; // ele tem 4 bytes na memória usado com mais frequência
    long cpf = 36991985538L; // ele tem 8 bytes na memória usado quando a números grandes

    // números inteiros
    float pi = 3.14F; // ele tem 4 bytes na memória usado em números inteiros
    double salario = 1412.33; // ele tem 8 bytes na memória usado para números inteiros longos

    // variable VS const
    int idadeMae = 42;
    idadeMae += 1;

    final double VALOR_DE_PI = 3.14;
    // VALOR_DE_PI = 1; ERROR

  }
}