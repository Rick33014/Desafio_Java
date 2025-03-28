package br.com.fecaf.controller;
import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean exit = false;
        Circulo circulo = new Circulo();
        while (!exit) {

            System.out.println("/************************/");
            System.out.println("/*      Geometria       */");
            System.out.println("/************************/");
            System.out.println("/* 1 - Circulo          */");
            System.out.println("/* 2 - Retângulo        */ ");
            System.out.println("/* 3 - Triângulo        */");
            System.out.println("/* 4 - Sair             */");
            System.out.println("/************************/");
            System.out.print("Informe a opção desejada:");

            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    boolean validaCadastro = false;

                    while (!exitCirculo) {

                        System.out.println("/*************************/");
                        System.out.println("/*        Circulo        */");
                        System.out.println("/*************************/");
                        System.out.println("/* 1 - Cadastrar Circulo */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 -Calcular Perimetro */");
                        System.out.println("*/ 4 - Sair              */");
                        System.out.println("/*************************/");

                        System.out.print("Escolha uma opção: ");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                System.out.println("Cadastrando Circulo...");
                                validaCadastro = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastro) {
                                    System.out.println("Calculando Área");
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    System.out.println("Calculando Perimetro...");
                                    circulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um Circulo..");
                                }
                                break;
                            case 4:
                                System.out.println("Voltando para o Menu...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Opção Inválida...");
                        }

                    }
                    break;
                case 2:
                    boolean exitRetangulo = false;
                    Retangulo retangulo = new Retangulo();
                    boolean validarRetangulo = false;

                    while (!exitRetangulo){
                        System.out.println("/*************************/");
                        System.out.println("/*      Retângulo        */");
                        System.out.println("/*************************/");
                        System.out.println("/*1 - Cadastrar Retângulo*/");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 -Calcular Perimetro */");
                        System.out.println("/* 4 - Definir Quadrado  */");
                        System.out.println("*/ 5 - Sair              */");
                        System.out.println("/*************************/");
                        System.out.print(" Escolha uma das opções: ");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                System.out.println("/***************************/");
                                System.out.println("/* Cadastrando Retângulo */");
                                System.out.println("/*************************/");
                                retangulo.cadastrarRetangulo();
                                System.out.println("/***************************/");
                                break;
                            case 2:
                                if (validarRetangulo) {
                                    System.out.println("Calculando Área");
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Retângulo...");
                                }
                                break;
                            case 3:
                                if (validarRetangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    retangulo.calcularPerimetro();
                                }else {
                                    System.out.println("Cadastre um Retângulo...");
                                }
                                break;
                            case 4:
                                System.out.println("/**  Definindo quadrado  **/");
                                if(validarRetangulo) {
                                    retangulo.validarQuadrado();
                                }
                                break;
                            case 5:
                                System.out.println("Saindo......");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Opção válida...");
                        }

                    }
                    break;

                    // eu praticamente utilizei a mesma estrutura pra fazer todas as etapas dos menus

                case 3:
                    boolean exitTriangulo = false;
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;

                    while (!exitTriangulo){
                        System.out.println("/****************************/");
                        System.out.println("/*       Triângulo       */");
                        System.out.println("/****************************/");
                        System.out.println("/* 1 - Cadastrar Triângulo */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Definir Triângulo */");
                        System.out.println("/* 5 - Definir Triângulo Retângulo */");
                        System.out.println("/* 6 - Definir Triângulo 3-4-5  */");
                        System.out.println("*/ 7 - Sair              */");
                        System.out.println("/***************************/");
                        System.out.print(" Escolha uma das opções: ");

                        int optionTriangulo = scanner.nextInt();

                        switch (optionTriangulo) {
                            case 1:
                                System.out.println("/***************************/");
                                System.out.println("/* Cadastrando Triângulo */");
                                System.out.println("/***************************/");
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                System.out.println("/***************************/");
                                break;
                            case 2:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Área");
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Triângulo...");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    System.out.println("Calculando Perimetro...");
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Triângulo...");
                                }
                                break;
                            case 4:
                                System.out.println("/**  Definindo Tipo  **/");
                                if (validaTriangulo) {
                                    triangulo.definirT();
                                }
                                break;
                            case 5:
                                if (validaTriangulo) {
                                    if (triangulo.TrianguloRetangulo()) {
                                        System.out.println("O triângulo é um retângulo");
                                    } else {
                                        System.out.println("O triângulo não é um retângulo");
                                    }
                                } else {
                                    System.out.println("Cadastre um Triângulo");
                                }
                                break;
                            case 6:
                                System.out.println("/* Verificando se é 3-4-5 */");
                                if (validaTriangulo) {
                                    if (triangulo.ehTriangulo345()) {
                                        System.out.println("O triângulo está em 3-4-5");
                                    } else {
                                        System.out.println("O triângulo nao está em 3-4-5.");
                                    }
                                } else {
                                    System.out.println("Cadastre um Triângulo primeiro...");
                                }
                                break;
                            case 7:
                                System.out.println("Voltando para o Menu...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Opção inválida... ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo ......");
                    exit = true;
                    break;
                default:
                    System.out.println("Opção Inválida...");
            }
        }
    }
}