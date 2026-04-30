import java.util.Scanner;

public class Sprint2 {
    public static void main(String[] args) {
        int dis;
        int posicao = 1, contador = 0, avanço = 0;
        double valor = 0;
        String comando;
        Scanner sc = new Scanner(System.in);

        //------------------------------------------------------------------------------------------------------------------

        //Apresentação das regras

        System.out.println("Regras:");
        System.out.println("\uF0E8 Os comandos permitidos para movimentos são ‘Frente’, ‘Trás’, ‘Esquerda’ ou ‘Direita’");
        System.out.println("\uF0E8 Caso deseje sair, escreva 'Sair' durante a solicitação de comandos");
        System.out.println("\uF0E8 Comandos que não atendem os mencionados anteriormente serão considerados como inválidos");
        System.out.println("\uF0E8 O valor 0 é considerado como invalido para distancias ");
        System.out.println("\uF0E8 Valores negativos são considerados como inválidos para distancia");
        System.out.println("\uF0E8 Se o movimento e/ou distancia leva o robô para fora dos limites do armazém será invalidado");
        System.out.println("\uF0E8 Se o movimento e/ou distancia causar a colisão com prateleiras ou paredes será invalidado ");
        System.out.println("\uF0E8 Comandos, movimento e distancias invalidadas são ignorados");
        System.out.println(" ");

        //---------------------------------------------------------------------------------

        //inicio do programa

        //---------------------------------------------------------------------------------

        //Loop
        do {
            //Contador de comandos feitos
            System.out.println("Numerro de comandos realizados: " + contador);
            contador++;

            System.out.print("Digite o comando desejado: ");
            comando = sc.next();

            if (!comando.equalsIgnoreCase("Direita")
                    && !comando.equalsIgnoreCase("Esquerda")
                    && !comando.equalsIgnoreCase("Frente")
                    && !comando.equalsIgnoreCase("Trás")
                    && !comando.equalsIgnoreCase("Sair")) {
                System.out.println("Comando Inválido!");
            }
            else if (comando.equalsIgnoreCase("Sair")) {
                System.out.println("Encerrando programa");
            }
            else {
                System.out.print("Digite a distância a ser percorrida: ");
                dis = sc.nextInt();
                if (dis <= 0) {
                    System.out.println("Distância inválida!");
                }
                else {

                    //Posição 1
                    if (dis == 7 && comando.equalsIgnoreCase("Frente") && posicao == 1) {
                        posicao++;
                        avanço = posicao;
                        valor = dis + valor;
                    }

                    //Posição 2
                    else if (dis == 3 && comando.equalsIgnoreCase("Direita") && posicao == 2) {
                        posicao++;
                        avanço = posicao;
                        valor = dis + valor;
                    }

                    //Posição 3
                    else if (dis == 3 && comando.equalsIgnoreCase("Trás") && posicao == 3) {
                        posicao++;
                        avanço = posicao;
                        valor = dis + valor;
                    }

                    //Posição 4
                    else if (dis == 1 && comando.equalsIgnoreCase("Esquerda") && posicao == 4) {
                        posicao++;
                        avanço = posicao;
                        valor = dis + valor;
                    }

                    //Posição 5
                    else if (dis == 3 && comando.equalsIgnoreCase("Trás") && posicao == 5) {
                        posicao++;
                        avanço = posicao;
                        valor = dis + valor;
                    }

                    //Posição 6
                    else if (dis == 2 && comando.equalsIgnoreCase("Direita") && posicao == 6) {
                        avanço = posicao;
                        valor = dis + valor;
                        comando = "Sair";
                    }

                    else {
                        System.out.println("Comando inválido!");
                        avanço = 0;
                        System.out.println(" ");
                    }
                }
            }
            if (avanço == posicao){
                System.out.println("Comando válido (°w°)");
                System.out.println(" ");
            }
        }while (!(comando.equalsIgnoreCase("Sair"))) ;

        if (posicao != 6) {
            System.out.println("Falha em atingir a Saída");
            System.out.println("Fileira máxima atingida no mapa: " + posicao);
        }
        //Rota completada

        else {
            System.out.println("Saída atingida");
            System.out.println("Total de comandos usados: " + comando);
            System.out.println("Distancia total percorrida foi de " + String.format("%.0f", valor));
            valor = valor * 0.5;
            System.out.println("O valor do percurso foi de: R$ " + String.format("%.2f", valor));
            System.out.println(" ");

            //------------------------------------------------------------------------------------------------------------------

            System.out.println("Classificação da rota");

            if (valor < 5.01 ) {
                System.out.println("Rota econômica");
            } else if (valor <= 10) {
                System.out.println("Rota moderada");
            } else {
                System.out.println("Rota ineficiente");
            }
        }
    }
}


