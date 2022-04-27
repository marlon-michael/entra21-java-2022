import java.util.Scanner;

public class Main {
    /*
    int - numero inteiro
    double - numero decimal
    String - literal, texto ""
    char - caraactere único ''
    boolean - lógico, true / false
     */

    public static void main(String[] args) {
        exe07();
    }

    public static void exe01() {
        int A = 10;
        int B = 20;
        int C = A;
        A = B;
        B = C;

        System.out.println("O valor de A e B invertidos são: "+A+" e "+B);
    }

    public static void exe02() {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int valor = read.nextInt();

        System.out.println();
        System.out.println("O valor antecessor de " + valor + " é " + (--valor));
    }

    public static void exe03() {
        Scanner read = new Scanner(System.in);

        System.out.println("Use virgula para ponto flutuante");
        System.out.print("Digite a base do retangulo: ");
        double base = read.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = read.nextDouble();
        double area = base*altura;
        double perimetro = 2*(base+altura);

        System.out.println();
        System.out.printf("A area do retangulo informado é de: %.2f e seu perimetro: %.2f \n", area, perimetro);
    }

    public static void exe04() {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu tempo de vida em:");
        System.out.print("Anos: ");
        int anos = read.nextInt();
        System.out.print("Meses: ");
        int meses = read.nextInt();
        System.out.print("Dias: ");
        int dias = read.nextInt();

        int dias_vividos = 0;
        dias_vividos += anos * 365;
        dias_vividos += meses * 30;
        dias_vividos += dias;

        System.out.println();
        System.out.println("A sua idade em dias foram de: "+dias_vividos);

    }

    public static void exe05() {
        Scanner read = new Scanner(System.in);

        System.out.print("Escreva o número total de eleitores: ");
        int num_eleitor = read.nextInt();
        System.out.print("Escreva o numero de votos nulos: ");
        int num_nulo = read.nextInt();
        System.out.print("Escreva o numero de votos em branco: ");
        int num_branco = read.nextInt();

        System.out.println();
        System.out.println("Dos "+num_eleitor+" eleitores");
        double percem_nulo = num_nulo * 100 / num_eleitor;
        double percem_branco = num_branco * 100 / num_eleitor;

        System.out.println(percem_nulo+"% dos votos são nulos");
        System.out.println(percem_branco+"% dos votos são brancos");
        System.out.println("E um total de "+(100-percem_nulo)+"% dos votos são validos");
    }

    public static void exe06() {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = read.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        double percent = read.nextDouble();

        System.out.println();
        System.out.printf("O salário de R$%.2f com um reajuste de %.2f%% equivale a R$%.2f", salario, percent, (salario + salario * (percent/100)));
    }

    public static void exe07() {
        Scanner read = new Scanner(System.in);

        double distribuidor_percen = 28;
        double imposto_percem = 45;
        System.out.print("Escreva o custo de fabrica deste veículo: ");
        double custo = read.nextDouble();

        double custo_final = custo + (custo * distribuidor_percen / 100) + (custo * imposto_percem / 100);

        System.out.println();
        System.out.printf("O custo do veículo com imposto é de: R$%.2f", custo_final);
    }

    public static void exe08(){
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o salário fixo do vendedor: ");
        double salario = read.nextDouble();
        System.out.println("Digite o valor da comissão por venda: ");
        double comissao = read.nextDouble();
        System.out.println("Digite o número de carros vendidos: ");
        double num_vendido = read.nextDouble();
        System.out.println("Digite o valor total das vendas: ");
        double valor_vendas = read.nextDouble();

        double salario_final = salario + comissao + (valor_vendas * 0.05);

        System.out.println();
        System.out.printf("O salário final do vendedor é de R$%.2f", salario_final);
    }
}