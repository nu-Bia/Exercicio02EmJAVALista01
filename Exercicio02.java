//2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.

import java.util.Scanner;

public class Exercicio02 {

public static void main (String[]args) {

System.out.println("Digite um número para que seja exibido o seu antecessor");

Scanner sc = new Scanner(System.in);

int valor=sc.nextInt();

System.out.println(valor-1);

}}

