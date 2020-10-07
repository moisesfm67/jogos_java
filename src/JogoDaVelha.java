import java.util.ArrayList;

import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {
		Jogador1 j1 = new Jogador1();
		Jogador2 j2 = new Jogador2();

		//criar um array inteiro de posiçoes, de 1 a 9, quando o cara jogar é pra marcar no array a posição que ele jogou
		// se a posicao ja estiver ocupado, é pedido para repetir a jogada
		
		
		ArrayList<String> posicoesMarcadas = new ArrayList<String>(); 
		
		String p1 = "_";
		String p2 = "_";
		String p3 = "_";
		String p4 = "_";
		String p5 = "_";
		String p6 = "_";
		String p7 = "_";
		String p8 = "_";
		String p9 = "_";

		String nome = JOptionPane.showInputDialog("Digite P para começar");

		while (nome.equalsIgnoreCase("P")) {
            
			
			String escolha = JOptionPane.showInputDialog("Digite a posição de 1 a 9 ");
			String jog = JOptionPane.showInputDialog("Qual jogador da rodada, 1 ou 2");

			if (jog.equalsIgnoreCase("1"))
				jog = j1.forma;
			else
				jog = j2.forma;

		
			if(posicoesMarcadas.contains(escolha)) {
				System.out.println("Refazer jogada, posição já ocupada");
				 continue;
			}
			
			posicoesMarcadas.add(escolha);
			
			if (escolha.equalsIgnoreCase("1")) {
				p1=jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
				
			}
			else if (escolha.equalsIgnoreCase("2")) {
				p2 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("3")) {
				p3 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("4")) {
				p4 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("5")) {
				p5 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("6")) {
				p6 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("7")) {
				p7 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("8")) {
				p8 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			else if (escolha.equalsIgnoreCase("9")) {
				p9 = jog;
				System.out.println("_" + p1 + "_|_" + p2 + "_|_" + p3 + "_");
				System.out.println("_" + p4 + "_|_" + p5 + "_|_" + p6 + "_");
				System.out.println(" " + p7 + " | " + p8 + " | " + p9 + " ");
				System.out.println();
			}

			if (p1 != "_" && p2 != "_" && p1 == p2 && p2 == p3) {
				System.out.println("Você ganhou");
				break;
			} else if (p1 != "_" && p5 != "_" && p1 == p5 && p5 == p9) {
				System.out.println("Você ganhou");
				break;
			} else if (p1 != "_" && p4 != "_" && p1 == p4 && p4 == p7) {
				System.out.println("Você ganhou");
				break;
			} else if (p2 != "_" && p5 != "_" && p2 == p5 && p5 == p8) {
				System.out.println("Você ganhou");
				break;
			} else if (p3 != "_" && p5 != "_" &&p3 == p5 && p5 == p7) {
				System.out.println("Você ganhou");
				break;
			} else if (p3 != "_" && p6 != "_" && p3 == p6 && p6 == p9) {
				System.out.println("Você ganhou");
				break;
			}
		      else if (p4 != "_" && p5 != "_" && p4 == p5 && p5 == p6) {
				System.out.println("Você ganhou");
				break;
			}
			  else if (p7 != "_" && p8 != "_" && p7 == p8 && p8 == p9) {
				System.out.println("Você ganhou");
				break;
			}
			nome = JOptionPane.showInputDialog("Digite Play para jogar de novo ou Stop para parar");
		}
	}

}