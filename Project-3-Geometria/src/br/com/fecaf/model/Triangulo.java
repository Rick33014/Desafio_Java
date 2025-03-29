package br.com.fecaf.model;

import java.util.Arrays;
import java.util.Scanner;

public class Triangulo {


    public double base, altura, lado2, lado3, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo(){
        System.out.println("/***************************/");
        System.out.println("/**   Cadastrar Triangulo    ");
        System.out.println("/****************************");
        System.out.println("/* Informe a base:         */");
        base = scanner.nextDouble();
        System.out.println("/* Informe o lado 2:       /*");
        lado2 = scanner.nextDouble();
        System.out.println("/ Informe o lado 3:        /*");
        lado3 = scanner.nextDouble();
        System.out.println("/* Informe a altura:       /*");
        altura = scanner.nextDouble();
        System.out.println("/************************/");

        return true;

    }

    //Aqui será a opçao de calcular a area

    public void calcularArea() {
        System.out.println("/**************************/");
        System.out.println("/**     Calculando  Area **/");
        System.out.println("/**************************/");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/**************************/");
    }

    //Aqui vai ser a opçao calcular o perimetro do triangulo

    public void calcularPerimetro() {
        System.out.println("/**************************/");
        System.out.println("/*  Calculando Perímetro  */");
        System.out.println("/**************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perímetro é: " + perimetro);
        System.out.println("/**************************/");
    }

    //Aqui vai definir o tipo do triangulo, se ele é um equilátero, escaleno ou isóceles

    public void definirT() {
        System.out.println("/**************************/");
        System.out.println("/*Definindo Tipo Triângulo*/");
        System.out.println("/**************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("O Triangulo é um Equilátero");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("O Triangulo é um Escaleno");
        } else {
            System.out.println("O Triangulo é um Isósceles");
        }

    }

    //aqui vai verificar se é um triangulo retangulo
    // e dar return true se for retangulo

    public boolean Trianguloretangulo() {
        double[] lados = {base, lado2, lado3};
        Arrays.sort(lados);
        double cateto1 = lados[0], cateto2 = lados[1], hipotenusa = lados[2];

        //vai comparar números decimais com precisão
        return Math.abs(cateto1 * cateto1 + cateto2 * cateto2 - hipotenusa * hipotenusa) < 0.0001;

        //o math.abs acima vai tirar os resultados negativos por causa de arredondamentos
        //o 0.0001 vai controlar os resultados colocando uma tolerancia nos calculos
    }


    //vai verificar se os tres lados formam um triangulo com todos os lados iguais ou um com dois lados iguais
    public boolean ehTriangulo345() {
        double[] lados = {base, lado2, lado3};
        java.util.Arrays.sort(lados);
        double diferenca1 = lados[1] - lados[0];
        double diferenca2 = lados[2] - lados[1];
        return Math.abs(diferenca1 - diferenca2) < 0.0001;
    }
}

