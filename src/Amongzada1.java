import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import java.util.Scanner;

public class Amongzada1 {

	public static String jogador1 = "♠";
	public static String jogador2 = "♥";
	public static String jogador3 = "♦";
	public static String impostor = "♠";
	public static String[][] mapa = new String[20][20];

	public static String comando;
	public static int posicaoAtualI;
	public static int posicaoAtualI2;
	public static int posicaoAtualI3;
	public static int posicaoAtualJ;
	public static int posicaoAtualJ2;
	public static int posicaoAtualJ3;
	public static int contTask = 0;

	public static void MapaPrincipal() {
		int l, c;
		for (l = 0; l < 20; l++) {
			for (c = 0; c < 20; c++) {
				mapa[l][c] = "⚃";
			}
		}
		System.out.println("\t   MAPA");

		// paredes do mapa
		mapa[1][0] = "◼";
		mapa[2][0] = "◼";
		mapa[3][0] = "◼";
		mapa[4][0] = "◼";
		mapa[5][0] = "◼";
		mapa[6][0] = "◼";
		mapa[7][0] = "◼";
		mapa[8][0] = "◼";
		mapa[9][0] = "◼";
		mapa[10][0] = "◼";
		mapa[11][0] = "◼";
		mapa[12][0] = "◼";
		mapa[13][0] = "◼";
		mapa[14][0] = "◼";
		mapa[15][0] = "◼";
		mapa[16][0] = "◼";
		mapa[17][0] = "◼";
		mapa[18][0] = "◼";
		mapa[19][0] = "◼";
		mapa[0][0] = "◼";

		mapa[0][1] = "◼";
		mapa[0][2] = "◼";
		mapa[0][3] = "◼";
		mapa[0][4] = "◼";
		mapa[0][5] = "◼";
		mapa[0][6] = "◼";
		mapa[0][7] = "◼";
		mapa[0][8] = "◼";
		mapa[0][9] = "◼";
		mapa[0][10] = "◼";
		mapa[0][12] = "◼";
		mapa[0][13] = "◼";
		mapa[0][14] = "◼";
		mapa[0][15] = "◼";
		mapa[0][16] = "◼";
		mapa[0][17] = "◼";
		mapa[0][18] = "◼";
		mapa[0][19] = "◼";
		mapa[0][11] = "◼";

		mapa[1][19] = "◼";
		mapa[2][19] = "◼";
		mapa[3][19] = "◼";
		mapa[4][19] = "◼";
		mapa[5][19] = "◼";
		mapa[6][19] = "◼";
		mapa[7][19] = "◼";
		mapa[8][19] = "◼";
		mapa[9][19] = "◼";
		mapa[10][19] = "◼";
		mapa[11][19] = "◼";
		mapa[12][19] = "◼";
		mapa[13][19] = "◼";
		mapa[14][19] = "◼";
		mapa[15][19] = "◼";
		mapa[16][19] = "◼";
		mapa[17][19] = "◼";
		mapa[18][19] = "◼";
		mapa[19][19] = "◼";

		mapa[19][1] = "◼";
		mapa[19][2] = "◼";
		mapa[19][3] = "◼";
		mapa[19][4] = "◼";
		mapa[19][5] = "◼";
		mapa[19][6] = "◼";
		mapa[19][7] = "◼";
		mapa[19][8] = "◼";
		mapa[19][9] = "◼";
		mapa[19][10] = "◼";
		mapa[19][11] = "◼";
		mapa[19][12] = "◼";
		mapa[19][13] = "◼";
		mapa[19][14] = "◼";
		mapa[19][15] = "◼";
		mapa[19][16] = "◼";
		mapa[19][17] = "◼";
		mapa[19][18] = "◼";

		mapa[2][1] = "◼";
		mapa[2][2] = "◼";
		mapa[2][3] = "◼";
		mapa[2][4] = "◼";

		mapa[4][1] = "◼";
		mapa[4][2] = "◼";
		mapa[4][3] = "◼";
		mapa[4][4] = "◼";
		mapa[6][2] = "◼";

		mapa[8][1] = "◼";
		mapa[8][2] = "◼";
		mapa[8][3] = "◼";
		mapa[8][4] = "◼";

		mapa[9][4] = "◼";
		mapa[10][4] = "◼";
		mapa[11][4] = "◼";

		mapa[15][1] = "◼";
		mapa[16][1] = "◼";
		mapa[16][2] = "◼";
		mapa[17][1] = "◼";
		mapa[17][2] = "◼";
		mapa[17][3] = "◼";
		mapa[18][1] = "◼";
		mapa[18][2] = "◼";
		mapa[18][3] = "◼";
		mapa[18][4] = "◼";

		mapa[18][8] = "◼";
		mapa[17][8] = "◼";
		mapa[16][8] = "◼";
		mapa[15][8] = "◼";
		mapa[14][8] = "◼";
		mapa[13][8] = "◼";
		mapa[12][8] = "◼";
		mapa[4][8] = "◼";

		mapa[5][8] = "◼";
		mapa[7][8] = "◼";
		mapa[8][8] = "◼";

		mapa[18][18] = "◼";
		mapa[18][17] = "◼";
		mapa[17][18] = "◼";
		mapa[17][17] = "◼";
		mapa[17][16] = "◼";
		mapa[16][18] = "◼";
		mapa[16][17] = "◼";
		mapa[16][16] = "◼";
		mapa[16][15] = "◼";
		mapa[15][18] = "◼";
		mapa[15][17] = "◼";
		mapa[15][16] = "◼";
		mapa[15][15] = "◼";
		mapa[15][14] = "◼";
		mapa[15][11] = "◼";
		mapa[15][10] = "◼";
		mapa[15][9] = "◼";
		mapa[14][18] = "◼";
		mapa[14][17] = "◼";
		mapa[14][16] = "◼";
		mapa[14][15] = "◼";
		mapa[14][14] = "◼";
		mapa[14][13] = "◼";
		mapa[13][18] = "◼";
		mapa[13][17] = "◼";
		mapa[13][16] = "◼";
		mapa[13][15] = "◼";
		mapa[13][14] = "◼";
		mapa[13][13] = "◼";
		mapa[13][12] = "◼";
		mapa[12][18] = "◼";
		mapa[12][17] = "◼";
		mapa[12][16] = "◼";
		mapa[12][15] = "◼";
		mapa[12][14] = "◼";
		mapa[12][13] = "◼";
		mapa[12][12] = "◼";
		mapa[12][11] = "◼";

		mapa[11][18] = "◼";
		mapa[11][17] = "◼";
		mapa[10][18] = "◼";
		mapa[10][17] = "◼";
		mapa[9][18] = "◼";
		mapa[9][17] = "◼";

		mapa[5][15] = "◼";
		mapa[5][16] = "◼";
		mapa[6][15] = "◼";
		mapa[6][16] = "◼";

		mapa[1][12] = "◼";
		mapa[2][12] = "◼";
		mapa[3][12] = "◼";
		mapa[4][12] = "◼";
		mapa[5][12] = "◼";
		mapa[6][12] = "◼";
		mapa[7][12] = "◼";
		mapa[1][13] = "◼";
		mapa[1][14] = "◼";

		// setando tasks

		mapa[1][1] = "☉";
		mapa[2][13] = "☉";
		mapa[6][1] = "☉";
		mapa[6][18] = "☉";
		mapa[9][3] = "☉";
		mapa[11][16] = "☉";
		mapa[15][5] = "☉";
		mapa[17][9] = "☉";

	}

	public static void imprimeMapa() {
		int i;
		int j;
		for (i = 0; i < 20; i++) {
			System.out.print("");
		}

		System.out.println();

		for (i = 0; i < 20; i++) {
			System.out.println();
			for (j = 0; j < 20; j++) {
				System.out.print(mapa[i][j]);
			}

		}
		System.out.println();
		System.out.println();
	}

	public static String andarAleatorio() {

		Random gerador = new Random();
		int direcao1;
		String lugar = "";
		direcao1 = gerador.nextInt(4);
		if (direcao1 == 0) {
			lugar = "norte".toUpperCase();
		} else if (direcao1 == 1) {
			lugar = "sul".toUpperCase();
		} else if (direcao1 == 2) {
			lugar = "leste".toUpperCase();
		} else if (direcao1 == 3) {
			lugar = "oeste".toUpperCase();
		}
		return lugar;
	}

	public static void setarJogadorNoMapa() {
		int countSetados = 0;
		ArrayList<Integer> jogadoresSetados = new ArrayList<Integer>();
		while (countSetados < 3) {
			Random r = new Random();
			int i = r.nextInt(20);
			int j = r.nextInt(20);
			int jogadorSorteado = r.nextInt(3);

			if (jogadoresSetados.contains(jogadorSorteado)) {
				continue;
			}

			System.out.println(i + "-" + j);
			System.out.println("qual jogador foi escolhido: " + (jogadorSorteado + 1));
			String player = "⚃";

			if (jogadorSorteado == 0) {
				player = jogador1;
			} else if (jogadorSorteado == 1) {
				player = jogador2;
			} else if (jogadorSorteado == 2) {
				player = jogador3;
			}
			if (mapa[i][j].equalsIgnoreCase("⚃")) {
				if (player == jogador1) {
					posicaoAtualI = i;
					posicaoAtualJ = j;
					mapa[posicaoAtualI][posicaoAtualJ] = jogador1;
				} else if (player == jogador2) {
					posicaoAtualI2 = i;
					posicaoAtualJ2 = j;
					mapa[posicaoAtualI2][posicaoAtualJ2] = jogador2;
				} else if (player == jogador3) {
					posicaoAtualI3 = i;
					posicaoAtualJ3 = j;
					mapa[posicaoAtualI3][posicaoAtualJ3] = jogador3;
				}
				jogadoresSetados.add(jogadorSorteado);
				System.out.println();
				countSetados++;
			} else if (mapa[i][j].equalsIgnoreCase("◼")) {
				System.out.println();
				continue;
			}

		}
	}

	public static void setarImpostor() {
		Random r = new Random();
		int jogadorSorteado = r.nextInt(3);
		if (jogadorSorteado == 0) {
			impostor = jogador1;
		} else if (jogadorSorteado == 1) {
			impostor = jogador2;
		} else if (jogadorSorteado == 2) {
			impostor = jogador3;
		}
		System.out.println("impostor: " + impostor);
	}

	public static void mostrarJogadorAleatorio(String comando) {
		if (comando.equalsIgnoreCase("OESTE") || comando.equalsIgnoreCase("LESTE") || comando.equalsIgnoreCase("SUL")
				|| comando.equalsIgnoreCase("NORTE")) {
			if (!mapa[posicaoAtualI - 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI - 1][posicaoAtualJ + 1]
							.equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI - 1][posicaoAtualJ - 1]
							.equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI + 1][posicaoAtualJ - 1]
							.equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI + 1][posicaoAtualJ + 1]
							.equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					&& !mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])) {

				mapa[posicaoAtualI2][posicaoAtualJ2] = "⚅";

			} else if (mapa[posicaoAtualI - 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])) {

				mapa[posicaoAtualI2][posicaoAtualJ2] = jogador2;
			}
		}
		if (comando.equalsIgnoreCase("OESTE") || comando.equalsIgnoreCase("LESTE") || comando.equalsIgnoreCase("SUL")
				|| comando.equalsIgnoreCase("NORTE")) {
			if (!mapa[posicaoAtualI - 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI - 1][posicaoAtualJ + 1]
							.equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI - 1][posicaoAtualJ - 1]
							.equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI + 1][posicaoAtualJ - 1]
							.equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI + 1][posicaoAtualJ + 1]
							.equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					&& !mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])) {

				mapa[posicaoAtualI3][posicaoAtualJ3] = "⚅";

			} else if (mapa[posicaoAtualI - 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])) {

				mapa[posicaoAtualI3][posicaoAtualJ3] = jogador3;
			}

		}
	}

	public static void andarJogador() throws InterruptedException {
		String decisao;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Sim para andar com o Jogador");
		decisao = sc.nextLine().toLowerCase();

		while (decisao.equalsIgnoreCase("sim")) {
			String comando = "";
			if (contTask == 3) {
				System.out.println("Você ganhou por completar 3 tasks");
				break;
			}
			if (jogador2 == "☠" && jogador3 == "☠") {
				System.out.println("Você ganhou por matar todos os jogadores");
				break;
			}
			if (jogador1 == "☠") {
				System.out.println("Você foi morto por: " + impostor);
				System.out.println("Vitória do impostor!!!");
				break;
			}
			System.out.println("Digite a direção para qual o Jogador vai andar ou não para parar o programa");
			comando = sc.next().toUpperCase();
			if (comando.equalsIgnoreCase("nao")) {
				break;
			}
			if (!comando.equalsIgnoreCase("NORTE") && !comando.equalsIgnoreCase("SUL")
					&& !comando.equalsIgnoreCase("LESTE") && !comando.equalsIgnoreCase("OESTE")) {
				System.out.println("Digite uma posição valida");
				continue;
			}
			if (impostor == jogador1) {
				if (mapa[posicaoAtualI - 1][posicaoAtualJ] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI + 1][posicaoAtualJ] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI][posicaoAtualJ - 1] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI][posicaoAtualJ + 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {
					jogador3 = "☠";
					mapa[posicaoAtualI3][posicaoAtualJ3] = jogador3;
					System.out.println("Voce matou o jogador: Jogador3");
					System.out.println();
				}

				if (mapa[posicaoAtualI - 1][posicaoAtualJ] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI + 1][posicaoAtualJ] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI][posicaoAtualJ - 1] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI][posicaoAtualJ + 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {
					jogador2 = "☠";
					mapa[posicaoAtualI2][posicaoAtualJ2] = jogador2;
					System.out.println("Voce matou o jogador: jogador2");
					System.out.println();
				}
			}

			if (comando.equalsIgnoreCase("NORTE")) {

				if (mapa[posicaoAtualI - 1][posicaoAtualJ] != "◼"
						&& mapa[posicaoAtualI - 1][posicaoAtualJ] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI - 1][posicaoAtualJ] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI - 1][posicaoAtualJ] != "☉") {

					mapa[posicaoAtualI - 1][posicaoAtualJ] = jogador1;
					if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
						mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
					}
					posicaoAtualI -= 1;
					andarJogadorAleatorio2();
					andarJogadorAleatorio3();
					System.out.println();
					System.out.println("Mapa jogador 1");
					imprimeMapa();
					continue;

				}
				if (mapa[posicaoAtualI - 1][posicaoAtualJ] == "◼") {
					System.out.println("Existe uma parede nesse direção");
					continue;
				}
				if (mapa[posicaoAtualI - 1][posicaoAtualJ] == "☉") {
					FazerTask();
					continue;
				}

			}

			if (comando.equalsIgnoreCase("SUL")) {

				if (mapa[posicaoAtualI + 1][posicaoAtualJ] != "◼"
						&& mapa[posicaoAtualI + 1][posicaoAtualJ] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI + 1][posicaoAtualJ] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI + 1][posicaoAtualJ] != "☉") {

					mapa[posicaoAtualI + 1][posicaoAtualJ] = jogador1;
					if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
						mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
					}
					posicaoAtualI += 1;
					andarJogadorAleatorio2();
					andarJogadorAleatorio3();
					System.out.println();
					System.out.println("Mapa jogador 1");
					imprimeMapa();
					continue;
				}
				if (mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase("◼")) {
					System.out.println("Existe uma parede nesse direção");
					continue;
				}
				if (mapa[posicaoAtualI + 1][posicaoAtualJ] == "☉") {
					FazerTask();
					continue;
				}

			}
			if (comando.equalsIgnoreCase("LESTE")) {
				if (mapa[posicaoAtualI][posicaoAtualJ + 1] != "◼"
						&& mapa[posicaoAtualI][posicaoAtualJ + 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI][posicaoAtualJ + 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI][posicaoAtualJ + 1] != "☉") {
					mapa[posicaoAtualI][posicaoAtualJ + 1] = jogador1;
					if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
						mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
					}
					posicaoAtualJ += 1;
					andarJogadorAleatorio2();
					andarJogadorAleatorio3();
					System.out.println();
					System.out.println("Mapa jogador 1");
					imprimeMapa();
					continue;

				}

				if (mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase("◼")) {
					System.out.println("Existe uma parede nesse direção");
					continue;
				}
				if (mapa[posicaoAtualI][posicaoAtualJ + 1] == "☉") {
					FazerTask();
					continue;
				}

			}

			if (comando.equalsIgnoreCase("OESTE")) {
				if (mapa[posicaoAtualI][posicaoAtualJ - 1] != "◼"
						&& mapa[posicaoAtualI][posicaoAtualJ - 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI][posicaoAtualJ - 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI][posicaoAtualJ - 1] != "☉") {

					mapa[posicaoAtualI][posicaoAtualJ - 1] = jogador1;
					if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
						mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
					}
					posicaoAtualJ -= 1;
					andarJogadorAleatorio2();
					andarJogadorAleatorio3();
					System.out.println();
					System.out.println("Mapa jogador 1");
					imprimeMapa();
					continue;

				}
				if (mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase("◼")) {
					System.out.println("Existe uma parede nesse direção");
					continue;

				}
				if (mapa[posicaoAtualI][posicaoAtualJ - 1] == "☉") {
					FazerTask();
					continue;
				}

			}

			mostrarJogadorAleatorio(comando);
		}
	}

	public static void andarJogadorAleatorio2() throws InterruptedException {
		int count = 0;
		if (jogador2 == "☠") {
			return;
		}

		while (count < 1) {
			if (impostor == jogador2) {
				if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {
					jogador3 = "☠";
					mapa[posicaoAtualI3][posicaoAtualJ3] = jogador3;
					System.out.println("Jogador 2 matou o jogador" + jogador3);
					System.out.println();
				}

				if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI][posicaoAtualJ]) {
					jogador1 = "☠";
					mapa[posicaoAtualI][posicaoAtualJ] = jogador1;
					System.out.println("Jogador 2 matou o jogador" + jogador1);
					System.out.println();
				}
				if (posicaoAtualI2 - 2 >= 0 && posicaoAtualI2 + 2 <= 19 && posicaoAtualJ2 - 2 >= 0
						&& posicaoAtualJ2 + 2 <= 19) {
					if (mapa[posicaoAtualI2 - 2][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI2 + 2][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 - 2] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 + 2] == mapa[posicaoAtualI3][posicaoAtualJ3]) {
						jogador3 = "☠";
						mapa[posicaoAtualI3][posicaoAtualJ3] = jogador3;
						System.out.println("Jogador 2 matou o jogador" + jogador3);
						System.out.println();
					}

					if (mapa[posicaoAtualI2 - 2][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI2 + 2][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 - 2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 + 2] == mapa[posicaoAtualI][posicaoAtualJ]) {
						jogador1 = "☠";
						mapa[posicaoAtualI][posicaoAtualJ] = jogador1;
						System.out.println("Jogador 2 matou o jogador" + jogador1);
						System.out.println();
					}
				}
			}
			String comando;
			comando = andarAleatorio().toUpperCase();

			if (comando.equalsIgnoreCase("NORTE")) {

				if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] != "◼"
						&& mapa[posicaoAtualI2 - 1][posicaoAtualJ2] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2 - 1][posicaoAtualJ2] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2 - 1][posicaoAtualJ2] != "☉") {

					mapa[posicaoAtualI2 - 1][posicaoAtualJ2] = jogador2;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualI2 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == "◼") {

					continue;

				} else if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				} else if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == "☉") {
					continue;
				} else {
					return;
				}
			}
			if (comando.equalsIgnoreCase("SUL")) {

				if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != "◼"
						&& mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != "☉") {

					mapa[posicaoAtualI2 + 1][posicaoAtualJ2] = jogador2;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualI2 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				} else if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == "☉") {
					continue;
				} else {
					return;
				}
			}
			if (comando.equalsIgnoreCase("LESTE")) {

				if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != "◼"
						&& mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != "☉") {

					mapa[posicaoAtualI2][posicaoAtualJ2 + 1] = jogador2;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualJ2 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == "☉") {
					continue;
				} else {
					return;
				}
			}

			if (comando.equalsIgnoreCase("OESTE")) {

				if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != "◼"
						&& mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != "☉") {

					mapa[posicaoAtualI2][posicaoAtualJ2 - 1] = jogador2;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualJ2 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == "◼") {

					continue;

				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == "☉") {
					continue;
				} else {
					return;
				}
			}

			mostrarJogadorAleatorio(comando);
		}
	}

	public static void andarJogadorAleatorio3() throws InterruptedException {
		int count = 0;
		if (jogador3 == "☠") {
			return;
		}

		while (count < 1) {
			if (impostor == jogador3) {
				if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {
					jogador2 = "☠";
					mapa[posicaoAtualI2][posicaoAtualJ2] = jogador2;
					System.out.println("Jogador 3 matou o jogador" + jogador2);
					System.out.println();
				}

				if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI][posicaoAtualJ]) {
					jogador1 = "☠";
					mapa[posicaoAtualI][posicaoAtualJ] = jogador1;
					System.out.println("Jogador 3 matou o jogador" + jogador1);
					System.out.println();
				}
				if (posicaoAtualI3 - 2 >= 0 && posicaoAtualI3 + 2 <= 19 && posicaoAtualJ3 - 2 >= 0
						&& posicaoAtualJ3 + 2 <= 19) {
					if (mapa[posicaoAtualI3 - 2][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI3 + 2][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 - 2] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 + 2] == mapa[posicaoAtualI2][posicaoAtualJ2]) {
						jogador2 = "☠";
						mapa[posicaoAtualI2][posicaoAtualJ2] = jogador2;
						System.out.println("Jogador 3 matou o jogador" + jogador2);
						System.out.println();
					}

					if (mapa[posicaoAtualI3 - 2][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI3 + 2][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 - 2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 + 2] == mapa[posicaoAtualI][posicaoAtualJ]) {
						jogador1 = "☠";
						mapa[posicaoAtualI][posicaoAtualJ] = jogador1;
						System.out.println("Jogador 3 matou o jogador" + jogador1);
						System.out.println();
					}
				}
			}
			String comando;
			comando = andarAleatorio().toUpperCase();

			if (comando.equalsIgnoreCase("NORTE")) {

				if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] != "◼"
						&& mapa[posicaoAtualI3 - 1][posicaoAtualJ3] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3 - 1][posicaoAtualJ3] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3 - 1][posicaoAtualJ3] != "☉") {

					mapa[posicaoAtualI3 - 1][posicaoAtualJ3] = jogador3;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualI3 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == "◼") {
					continue;

				} else if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;
				} else if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == "☉") {
					continue;
				} else {
					return;
				}
			}

			if (comando.equalsIgnoreCase("SUL")) {

				if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != "◼"
						&& mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != "☉") {

					mapa[posicaoAtualI3 + 1][posicaoAtualJ3] = jogador3;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualI3 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;
				} else if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == "☉") {
					continue;
				} else {
					return;
				}
			}

			if (comando.equalsIgnoreCase("LESTE")) {

				if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != "◼"
						&& mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != "☉") {

					mapa[posicaoAtualI3][posicaoAtualJ3 + 1] = jogador3;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualJ3 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;
				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == "☉") {
					continue;
				} else {
					return;
				}

			}
			if (comando.equalsIgnoreCase("OESTE")) {

				if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != "◼"
						&& mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != "☉") {

					mapa[posicaoAtualI3][posicaoAtualJ3 - 1] = jogador3;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualJ3 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == "◼") {

					continue;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == "☉") {

					continue;
				} else {
					return;
				}
			}
			mostrarJogadorAleatorio(comando);

		}
	}

	public static void FazerTask() throws InterruptedException {
		int i = 0;
		int tempo = 3000;
		while (i < 3) {
			Thread.sleep(tempo);
			if (jogador2 != "☠") {
				andarJogadorAleatorio2();
			}
			if (jogador3 != "☠") {
				andarJogadorAleatorio3();
			}
			System.out.println("Fazendo task " + (tempo / 1000) + " segundos restantes");
			imprimeMapa();
			tempo -= 1000;
			i++;
		}
		contTask++;
		System.out.println();
		System.out.println("Task completa");
		System.out.println();
	}

	public static void Impostor() {
		if (jogador2 == "☠") {
			System.out.println("Você matou o jogador 2");
			System.out.println();
		}
		if (jogador3 == "☠") {
			System.out.println("Você matou o jogador 3");
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MapaPrincipal();
		imprimeMapa();
		setarJogadorNoMapa();
		setarImpostor();
		imprimeMapa();
		andarJogador();

	}

}
