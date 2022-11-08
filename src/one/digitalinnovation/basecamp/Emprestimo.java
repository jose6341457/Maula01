package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercicio da Aula 1 de Metodos.
 */

public class Emprestimo {

        public static int getDuasParcelas() {
            return 2;
        }

        public static int getTresParcelas() {

            return 3;
        }

        public static double getTaxaDuasParcelas() {

            return 0.3;
        }

        public static double getTaxatresParcelas() {

            return 0.45;
        }

        public static void calcular(double valor, int parcelas) {

            if (parcelas == 2){

                double valorFinal = valor + (valor * getTaxaDuasParcelas());

                System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
            } else if (parcelas == 3) {

                double valorFinal = valor + (valor * getTaxatresParcelas());

                System.out.println("Valor final do empréstimo para tres parcelas: R$" + valorFinal);
            }else {

                System.out.println("Quantidades de parcelas não aceita. ");
            }

        }
    }
