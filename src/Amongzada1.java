import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//import java.util.Scanner;

public class Amongzada1 {

	public static String jogadorPrincipal = "♠";
	public static String jogadorSecundario = "♥";
	public static String jogadorTerciario = "♦";
	public static String impostor = "2";
	public static String[][] mapa = new String[20][20];

	public static String comando;
	public static int confirmarTaskPrincipal1 = 0, confirmarTaskPrincipal2 = 0, confirmarTaskPrincipal3 = 0,
			confirmarTaskPrincipal4 = 0, confirmarTaskPrincipal5 = 0, confirmarTaskPrincipal6 = 0,
			confirmarTaskPrincipal7 = 0, confirmarTaskPrincipal8 = 0;
	public static int confirmarTaskTerciario1 = 0, confirmarTaskTerciario2 = 0, confirmarTaskTerciario3 = 0,
			confirmarTaskTerciario4 = 0, confirmarTaskTerciario5 = 0, confirmarTaskTerciario6 = 0,
			confirmarTaskTerciario7 = 0, confirmarTaskTerciario8 = 0;
	public static int confirmarTaskSecundario1 = 0, confirmarTaskSecundario2 = 0, confirmarTaskSecundario3 = 0,
			confirmarTaskSecundario4 = 0, confirmarTaskSecundario5 = 0, confirmarTaskSecundario6 = 0,
			confirmarTaskSecundario7 = 0, confirmarTaskSecundario8 = 0;
	public static int contImpostorPrincipal2 = 0;
	public static int contImpostorPrincipal3 = 0;
	public static int contImpostorSecundario1 = 0;
	public static int contImpostorSecundario3 = 0;
	public static int contImpostorTerciario1 = 0;
	public static int contImpostorTerciario2 = 0;

	public static int posicaoAtualI;
	public static int posicaoAtualI2;
	public static int posicaoAtualI3;
	public static int posicaoAtualJ;
	public static int posicaoAtualJ2;
	public static int posicaoAtualJ3;
	public static boolean ejetado = false;
	public static int contTaskJogador1 = 0;
	public static int contTaskJogador2 = 0;
	public static int contTaskJogador3 = 0;

	public static void MapaPrincipal() {
		int l, c;
		for (l = 0; l < 20; l++) {
			for (c = 0; c < 20; c++) {
				mapa[l][c] = "⚃";
			}
		}

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
		System.out.println(">-MAPA-<");
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

			String player = "⚃";

			if (jogadorSorteado == 0) {
				player = jogadorPrincipal;
			} else if (jogadorSorteado == 1) {
				player = jogadorSecundario;
			} else if (jogadorSorteado == 2) {
				player = jogadorTerciario;
			}
			if (mapa[i][j].equalsIgnoreCase("⚃")) {
				if (player == jogadorPrincipal) {
					posicaoAtualI = i;
					posicaoAtualJ = j;
					mapa[posicaoAtualI][posicaoAtualJ] = jogadorPrincipal;
				} else if (player == jogadorSecundario) {
					posicaoAtualI2 = i;
					posicaoAtualJ2 = j;
					mapa[posicaoAtualI2][posicaoAtualJ2] = jogadorSecundario;
				} else if (player == jogadorTerciario) {
					posicaoAtualI3 = i;
					posicaoAtualJ3 = j;
					mapa[posicaoAtualI3][posicaoAtualJ3] = jogadorTerciario;
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

	
	  public static void setarImpostor() { Random r = new Random(); int
	  jogadorSorteado = r.nextInt(3); if (jogadorSorteado == 0) { impostor =
	  jogadorPrincipal; } else if (jogadorSorteado == 1) { impostor =
	  jogadorSecundario; } else if (jogadorSorteado == 2) { impostor =
	  jogadorTerciario; } if (jogadorPrincipal == impostor) {
	  System.out.println("impostor: " + impostor); } }
	 

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
				if (jogadorPrincipal == impostor) {
					if (jogadorSecundario == "☠") {
						mapa[posicaoAtualI2][posicaoAtualJ2] = "☠";
					} else if (jogadorSecundario != "☠") {
						mapa[posicaoAtualI2][posicaoAtualJ2] = "⚅";
					}
				} else {
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚅";
				}
			} else if (mapa[posicaoAtualI - 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])
					|| mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI2][posicaoAtualJ2])) {

				mapa[posicaoAtualI2][posicaoAtualJ2] = jogadorSecundario;
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
				if (jogadorPrincipal == impostor) {
					if (jogadorTerciario == "☠") {
						mapa[posicaoAtualI3][posicaoAtualJ3] = "☠";
					} else if (jogadorTerciario != "☠") {
						mapa[posicaoAtualI3][posicaoAtualJ3] = "⚅";
					}
				} else {
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚅";
				}
			} else if (mapa[posicaoAtualI - 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI - 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI + 1][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])
					|| mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase(mapa[posicaoAtualI3][posicaoAtualJ3])) {

				mapa[posicaoAtualI3][posicaoAtualJ3] = jogadorTerciario;
			}

		}
	}

	public static void andarJogador() throws InterruptedException {
		String decisao;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite Sim para andar com o Jogador Principal ou não para encerrar o jogo");
		decisao = sc.nextLine().toLowerCase();
		if (decisao.equalsIgnoreCase("não") || decisao.equalsIgnoreCase("nao")) {
			System.out.println("Você encerrou o jogo antes dele começar!!!");

		} else if (!decisao.equalsIgnoreCase("sim")
				&& (!decisao.equalsIgnoreCase("nao") || !decisao.equalsIgnoreCase("não"))) {
			System.out.println("Você digitou uma palavra inválida, digite uma palavra valida");
			andarJogador();
		} else if (decisao.equalsIgnoreCase("sim")) {

			while (decisao.equalsIgnoreCase("sim")) {
				String comando = "";
				if (ejetado == true) {
					break;
				}
				if (contTaskJogador1 == 3) {
					System.out.println("Você ganhou por completar 3 tasks");
					break;
				}
				if (contTaskJogador2 == 3) {
					System.out.println("Jogador2 ganhou por completar 3 tasks");
					break;
				}
				if (contTaskJogador3 == 3) {
					System.out.println("Jogador3 ganhou por completar 3 tasks");
					break;
				}
				if (jogadorSecundario == "☠" && jogadorTerciario == "☠") {
					System.out.println("Você ganhou por matar todos os jogadores");
					break;
				}
				if (jogadorPrincipal == "☠") {
					System.out.println("Você foi morto por: " + impostor);
					System.out.println();
					System.out.println("⣿⣿⣿⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣿⣿ \r\n" + "⣿⣿⡿⠋⣁⣤⣴⣶⣦⣤⠈⢻⣿⣿⣿ \r\n" + "⣿⣿⠄⡾⠿⠛⠛⠛⠻⠟⠄⣀⠈⠻⣿ \r\n"
							+ "⣿⠟⠄⢀⠄⠒⠒⠒⠒⢦⡀⢹⡇⠄⣿ \r\n" + "⣿⠄⠐⠄⠄⣀⣄⠄⠄⠄⡇⠄⠁⣴⣿ \r\n" + "⣿⣀⠄⠟⠉⣿⡆⠄⠄⠠⠃⢀⣼⣿⣿ \r\n"
							+ "⣿⣿⣦⣄⣀⡉⠁⠄⠉⣀⣴⣾⣿⣿⣿ \r\n" + "⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿");
					System.out.println();
					System.out.println("Vitória do impostor!!!");
					break;
				}
				System.out.println("Digite a direção para qual o Jogador vai andar ou não para parar o programa");
				comando = sc.next().toUpperCase();
				if (comando.equalsIgnoreCase("nao") || decisao.equalsIgnoreCase("não")) {
					break;
				}
				if (!comando.equalsIgnoreCase("NORTE") && !comando.equalsIgnoreCase("SUL")
						&& !comando.equalsIgnoreCase("LESTE") && !comando.equalsIgnoreCase("OESTE")) {
					System.out.println("Digite uma posição valida");
					continue;
				}
				if (impostor == jogadorPrincipal) {
					if (mapa[posicaoAtualI - 1][posicaoAtualJ] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI + 1][posicaoAtualJ] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI][posicaoAtualJ - 1] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI][posicaoAtualJ + 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {
						jogadorSecundario = "☠";
						mapa[posicaoAtualI2][posicaoAtualJ2] = jogadorSecundario;
						if (contImpostorPrincipal2 < 1) {
							System.out.println("Voce matou o jogador secundario ♥ ");
							System.out.println();
							contImpostorPrincipal2++;
						}
					}

					if (mapa[posicaoAtualI - 1][posicaoAtualJ] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI + 1][posicaoAtualJ] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI][posicaoAtualJ - 1] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI][posicaoAtualJ + 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {
						jogadorTerciario = "☠";
						mapa[posicaoAtualI3][posicaoAtualJ3] = jogadorTerciario;
						if (contImpostorPrincipal3 < 1) {
							System.out.println("Voce matou o jogador terciario ♦ ");
							System.out.println();
							contImpostorPrincipal3++;
						}
					}
				}

				if (comando.equalsIgnoreCase("NORTE")) {

					if (mapa[posicaoAtualI - 1][posicaoAtualJ] != "◼"
							&& mapa[posicaoAtualI - 1][posicaoAtualJ] != mapa[posicaoAtualI2][posicaoAtualJ2]
							&& mapa[posicaoAtualI - 1][posicaoAtualJ] != mapa[posicaoAtualI3][posicaoAtualJ3]
							&& mapa[posicaoAtualI - 1][posicaoAtualJ] != "☉") {

						mapa[posicaoAtualI - 1][posicaoAtualJ] = jogadorPrincipal;
						if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
							mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
						}
						posicaoAtualI -= 1;
						andarJogadorAleatorio2();
						andarJogadorAleatorio3();
						System.out.println();
						imprimeMapa();
						continue;

					}
					if (mapa[posicaoAtualI - 1][posicaoAtualJ] == "◼") {
						System.out.println("Existe uma parede nesse direção");
						continue;
					}
					if (jogadorPrincipal != impostor) {
						ReportarCorpo();
						if (mapa[posicaoAtualI - 1][posicaoAtualJ] == "☉") {
							confirmarTaskJogadorPrincipal();
							continue;
						}

					} else if (jogadorPrincipal == impostor) {
						if (mapa[posicaoAtualI - 1][posicaoAtualJ] == "☉") {
							continue;
						}
					}

				}

				if (comando.equalsIgnoreCase("SUL")) {

					if (mapa[posicaoAtualI + 1][posicaoAtualJ] != "◼"
							&& mapa[posicaoAtualI + 1][posicaoAtualJ] != mapa[posicaoAtualI2][posicaoAtualJ2]
							&& mapa[posicaoAtualI + 1][posicaoAtualJ] != mapa[posicaoAtualI3][posicaoAtualJ3]
							&& mapa[posicaoAtualI + 1][posicaoAtualJ] != "☉") {

						mapa[posicaoAtualI + 1][posicaoAtualJ] = jogadorPrincipal;
						if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
							mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
						}
						posicaoAtualI += 1;
						andarJogadorAleatorio2();
						andarJogadorAleatorio3();
						System.out.println();
						imprimeMapa();
						continue;
					}
					if (mapa[posicaoAtualI + 1][posicaoAtualJ].equalsIgnoreCase("◼")) {
						System.out.println("Existe uma parede nesse direção");
						continue;
					}
					if (jogadorPrincipal != impostor) {
						ReportarCorpo();
						if (mapa[posicaoAtualI + 1][posicaoAtualJ] == "☉") {
							confirmarTaskJogadorPrincipal();
							continue;
						}

					} else if (jogadorPrincipal == impostor) {
						if (mapa[posicaoAtualI + 1][posicaoAtualJ] == "☉") {
							continue;
						}
					}

				}
				if (comando.equalsIgnoreCase("LESTE")) {
					if (mapa[posicaoAtualI][posicaoAtualJ + 1] != "◼"
							&& mapa[posicaoAtualI][posicaoAtualJ + 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
							&& mapa[posicaoAtualI][posicaoAtualJ + 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
							&& mapa[posicaoAtualI][posicaoAtualJ + 1] != "☉") {
						mapa[posicaoAtualI][posicaoAtualJ + 1] = jogadorPrincipal;
						if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
							mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
						}
						posicaoAtualJ += 1;
						andarJogadorAleatorio2();
						andarJogadorAleatorio3();
						System.out.println();
						imprimeMapa();
						continue;

					}

					if (mapa[posicaoAtualI][posicaoAtualJ + 1].equalsIgnoreCase("◼")) {
						System.out.println("Existe uma parede nesse direção");
						continue;
					}
					if (jogadorPrincipal != impostor) {
						ReportarCorpo();
						if (mapa[posicaoAtualI][posicaoAtualJ + 1] == "☉") {
							confirmarTaskJogadorPrincipal();
							continue;
						}

					} else if (jogadorPrincipal == impostor) {
						if (mapa[posicaoAtualI][posicaoAtualJ + 1] == "☉") {
							continue;
						}
					}

				}

				if (comando.equalsIgnoreCase("OESTE")) {
					if (mapa[posicaoAtualI][posicaoAtualJ - 1] != "◼"
							&& mapa[posicaoAtualI][posicaoAtualJ - 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
							&& mapa[posicaoAtualI][posicaoAtualJ - 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
							&& mapa[posicaoAtualI][posicaoAtualJ - 1] != "☉") {

						mapa[posicaoAtualI][posicaoAtualJ - 1] = jogadorPrincipal;
						if (mapa[posicaoAtualI][posicaoAtualJ] != "☠") {
							mapa[posicaoAtualI][posicaoAtualJ] = "⚃";
						}
						posicaoAtualJ -= 1;
						andarJogadorAleatorio2();
						andarJogadorAleatorio3();
						System.out.println();
						imprimeMapa();
						continue;

					}
					if (mapa[posicaoAtualI][posicaoAtualJ - 1].equalsIgnoreCase("◼")) {
						System.out.println("Existe uma parede nesse direção");
						continue;

					}
					if (jogadorPrincipal != impostor) {
						ReportarCorpo();
						if (mapa[posicaoAtualI][posicaoAtualJ - 1] == "☉") {
							confirmarTaskJogadorPrincipal();
							continue;
						}

					} else if (jogadorPrincipal == impostor) {
						if (mapa[posicaoAtualI][posicaoAtualJ - 1] == "☉") {
							continue;
						}
					}

				}

				mostrarJogadorAleatorio(comando);
			}
		}
	}

	public static void andarJogadorAleatorio2() throws InterruptedException {
		int count = 0;
		if (jogadorSecundario == "☠") {
			return;
		}

		while (count < 1) {

			if (impostor == jogadorSecundario) {
				if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI3][posicaoAtualJ3]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {
					jogadorTerciario = "☠";
					mapa[posicaoAtualI3][posicaoAtualJ3] = jogadorTerciario;
					if (contImpostorSecundario3 < 1) {
						System.out.println("Jogador 2 matou o jogador terciario ♦ ");
						System.out.println();
						contImpostorSecundario3++;
					}
				}

				if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI][posicaoAtualJ]) {
					jogadorPrincipal = "☠";
					mapa[posicaoAtualI][posicaoAtualJ] = jogadorPrincipal;
					if (contImpostorSecundario1 < 1) {
						System.out.println("Jogador 2 matou o jogador principal ♠ ");
						System.out.println();
						contImpostorSecundario1++;
					}
				}
				if (posicaoAtualI2 - 2 >= 0 && posicaoAtualI2 + 2 <= 19 && posicaoAtualJ2 - 2 >= 0
						&& posicaoAtualJ2 + 2 <= 19) {
					if (mapa[posicaoAtualI2 - 2][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI2 + 2][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 - 2] == mapa[posicaoAtualI3][posicaoAtualJ3]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 + 2] == mapa[posicaoAtualI3][posicaoAtualJ3]) {
						jogadorTerciario = "☠";
						mapa[posicaoAtualI3][posicaoAtualJ3] = jogadorTerciario;
						if (contImpostorSecundario3 < 1) {
							System.out.println("Jogador 2 matou o jogador terciario ♦ ");
							System.out.println();
							contImpostorSecundario3++;
						}
					}
					if (mapa[posicaoAtualI2 - 2][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI2 + 2][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 - 2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI2][posicaoAtualJ2 + 2] == mapa[posicaoAtualI][posicaoAtualJ]) {
						jogadorPrincipal = "☠";
						mapa[posicaoAtualI][posicaoAtualJ] = jogadorPrincipal;
						if (contImpostorSecundario1 < 1) {
							System.out.println("Jogador 2 matou o jogador principal ♠ ");
							System.out.println();
							contImpostorSecundario1++;
						}
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

					mapa[posicaoAtualI2 - 1][posicaoAtualJ2] = jogadorSecundario;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualI2 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == "◼") {

					continue;

				} else if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				}
				if (jogadorSecundario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == "☉") {
						confirmarTaskJogadorSecundario();
						count += 1;
					}
					if (posicaoAtualI2 - 2 >= 0 && posicaoAtualI2 - 2 <= 19) {
						if (mapa[posicaoAtualI2 - 2][posicaoAtualJ2] == "☉") {
							confirmarTaskJogadorSecundario();
							count += 1;
						}
					}
				} else if (jogadorSecundario == impostor) {
					if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}
			if (comando.equalsIgnoreCase("SUL")) {

				if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != "◼"
						&& mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2 + 1][posicaoAtualJ2] != "☉") {

					mapa[posicaoAtualI2 + 1][posicaoAtualJ2] = jogadorSecundario;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualI2 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				}
				if (jogadorSecundario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == "☉") {
						confirmarTaskJogadorSecundario();
						count += 1;
					}
					if (posicaoAtualI2 + 2 >= 0 && posicaoAtualI2 + 2 <= 19) {
						if (mapa[posicaoAtualI2 + 2][posicaoAtualJ2] == "☉") {
							confirmarTaskJogadorSecundario();
							count += 1;
						}
					}
				} else if (jogadorSecundario == impostor) {
					if (mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}
			if (comando.equalsIgnoreCase("LESTE")) {

				if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != "◼"
						&& mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 + 1] != "☉") {

					mapa[posicaoAtualI2][posicaoAtualJ2 + 1] = jogadorSecundario;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualJ2 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				}
				if (jogadorSecundario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == "☉") {
						confirmarTaskJogadorSecundario();
						count += 1;
					}
					if (posicaoAtualJ2 + 2 >= 0 && posicaoAtualJ2 + 2 <= 19) {
						if (mapa[posicaoAtualI2][posicaoAtualJ2 + 2] == "☉") {
							confirmarTaskJogadorSecundario();
							count += 1;
						}
					}
				} else if (jogadorSecundario == impostor) {
					if (mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}

			if (comando.equalsIgnoreCase("OESTE")) {

				if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != "◼"
						&& mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != mapa[posicaoAtualI3][posicaoAtualJ3]
						&& mapa[posicaoAtualI2][posicaoAtualJ2 - 1] != "☉") {

					mapa[posicaoAtualI2][posicaoAtualJ2 - 1] = jogadorSecundario;
					mapa[posicaoAtualI2][posicaoAtualJ2] = "⚃";
					posicaoAtualJ2 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == "◼") {

					continue;

				} else if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == mapa[posicaoAtualI3][posicaoAtualJ3]) {

					continue;
				}
				if (jogadorSecundario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == "☉") {
						confirmarTaskJogadorSecundario();
						count += 1;
					}
					if (posicaoAtualJ2 - 2 >= 0 && posicaoAtualJ2 - 2 <= 19) {
						if (mapa[posicaoAtualI2][posicaoAtualJ2 - 2] == "☉") {
							confirmarTaskJogadorSecundario();
							count += 1;
						}
					}
				} else if (jogadorSecundario == impostor) {
					if (mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}

		}
	}

	public static void andarJogadorAleatorio3() throws InterruptedException {
		int count = 0;
		if (jogadorTerciario == "☠") {
			return;
		}

		while (count < 1) {

			if (impostor == jogadorTerciario) {
				if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI2][posicaoAtualJ2]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {
					jogadorSecundario = "☠";
					mapa[posicaoAtualI2][posicaoAtualJ2] = jogadorSecundario;
					if (contImpostorTerciario2 < 0) {
						System.out.println("Jogador 3 matou o jogador secundario ♥ ");
						System.out.println();
						contImpostorTerciario2++;
					}
				}

				if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI][posicaoAtualJ]) {
					jogadorPrincipal = "☠";
					mapa[posicaoAtualI][posicaoAtualJ] = jogadorPrincipal;
					if (contImpostorTerciario1 < 0) {
						System.out.println("Jogador 3 matou o jogador principal ♠ ");
						System.out.println();
						contImpostorTerciario1++;
					}
				}
				if (posicaoAtualI3 - 2 >= 0 && posicaoAtualI3 + 2 <= 19 && posicaoAtualJ3 - 2 >= 0
						&& posicaoAtualJ3 + 2 <= 19) {
					if (mapa[posicaoAtualI3 - 2][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI3 + 2][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 - 2] == mapa[posicaoAtualI2][posicaoAtualJ2]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 + 2] == mapa[posicaoAtualI2][posicaoAtualJ2]) {
						jogadorSecundario = "☠";
						mapa[posicaoAtualI2][posicaoAtualJ2] = jogadorSecundario;
						if (contImpostorTerciario2 < 0) {
							System.out.println("Jogador 3 matou o jogador secundario ♥ ");
							System.out.println();
							contImpostorTerciario2++;
						}
					}
					if (mapa[posicaoAtualI3 - 2][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI3 + 2][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 - 2] == mapa[posicaoAtualI][posicaoAtualJ]
							|| mapa[posicaoAtualI3][posicaoAtualJ3 + 2] == mapa[posicaoAtualI][posicaoAtualJ]) {
						jogadorPrincipal = "☠";
						mapa[posicaoAtualI][posicaoAtualJ] = jogadorPrincipal;
						if (contImpostorTerciario1 < 0) {
							System.out.println("Jogador 3 matou o jogador principal ♠ ");
							System.out.println();
							contImpostorTerciario1++;
						}
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

					mapa[posicaoAtualI3 - 1][posicaoAtualJ3] = jogadorTerciario;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualI3 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == "◼") {
					continue;

				} else if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;
				}
				if (jogadorTerciario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == "☉") {
						confirmarTaskJogadorTerciario();
						count += 1;
					}
					if (posicaoAtualI3 - 2 >= 0 && posicaoAtualI3 - 2 <= 19) {
						if (mapa[posicaoAtualI3 - 2][posicaoAtualJ3] == "☉") {
							confirmarTaskJogadorTerciario();
							count += 1;
						}
					}
				} else if (jogadorTerciario == impostor) {
					if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}

			if (comando.equalsIgnoreCase("SUL")) {

				if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != "◼"
						&& mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3 + 1][posicaoAtualJ3] != "☉") {

					mapa[posicaoAtualI3 + 1][posicaoAtualJ3] = jogadorTerciario;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualI3 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;
				}
				if (jogadorTerciario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == "☉") {
						confirmarTaskJogadorTerciario();
						count += 1;
					}
					if (posicaoAtualI3 + 2 >= 0 && posicaoAtualI3 + 2 <= 19) {
						if (mapa[posicaoAtualI3 + 2][posicaoAtualJ3] == "☉") {
							confirmarTaskJogadorTerciario();
							count += 1;
						}
					}
				} else if (jogadorTerciario == impostor) {
					if (mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}

			if (comando.equalsIgnoreCase("LESTE")) {

				if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != "◼"
						&& mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 + 1] != "☉") {

					mapa[posicaoAtualI3][posicaoAtualJ3 + 1] = jogadorTerciario;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualJ3 += 1;
					count += 1;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == "◼") {

					continue;
				}

				else if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;
				}
				if (jogadorTerciario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == "☉") {
						confirmarTaskJogadorTerciario();
						count += 1;
					}
					if (posicaoAtualJ3 + 2 >= 0 && posicaoAtualJ3 + 2 <= 19) {
						if (mapa[posicaoAtualI3][posicaoAtualJ3 + 2] == "☉") {
							confirmarTaskJogadorTerciario();
							count += 1;
						}
					}
				} else if (jogadorTerciario == impostor) {
					if (mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}
			if (comando.equalsIgnoreCase("OESTE")) {

				if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != "◼"
						&& mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != mapa[posicaoAtualI][posicaoAtualJ]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != mapa[posicaoAtualI2][posicaoAtualJ2]
						&& mapa[posicaoAtualI3][posicaoAtualJ3 - 1] != "☉") {

					mapa[posicaoAtualI3][posicaoAtualJ3 - 1] = jogadorTerciario;
					mapa[posicaoAtualI3][posicaoAtualJ3] = "⚃";
					posicaoAtualJ3 -= 1;
					count += 1;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == "◼") {

					continue;

				} else if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI][posicaoAtualJ]
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == mapa[posicaoAtualI2][posicaoAtualJ2]) {

					continue;

				}
				if (jogadorTerciario != impostor) {
					ReportarCorpo();
					if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == "☉") {
						confirmarTaskJogadorTerciario();
						count += 1;
					}
					if (posicaoAtualJ3 - 2 >= 0 && posicaoAtualJ3 - 2 <= 19) {
						if (mapa[posicaoAtualI3][posicaoAtualJ3 - 2] == "☉") {
							confirmarTaskJogadorTerciario();
							count += 1;
						}
					}
				} else if (jogadorTerciario == impostor) {
					if (mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == "☉") {
						count += 1;
					}
				}
				mostrarJogadorAleatorio(comando);
				return;

			}
		}
	}

	public static void JogadorPrincipalFazerTask() throws InterruptedException {
		int i = 0;
		int tempo = 3000;
		while (i < 3) {
			Thread.sleep(tempo);
			if (jogadorSecundario != "☠") {
				andarJogadorAleatorio2();
			}
			if (jogadorTerciario != "☠") {
				andarJogadorAleatorio3();
			}
			System.out.println("Fazendo task " + (tempo / 1000) + " segundos restantes");
			imprimeMapa();
			tempo -= 1000;
			i++;
		}
		contTaskJogador1++;
		System.out.println();
		System.out.println("Task completa jogador principal");
		System.out.println();
	}

	public static void JogadorSecundarioFazerTask() throws InterruptedException {

		contTaskJogador2++;
		System.out.println();
		System.out.println("Task completa jogador Aleatório 2");
		System.out.println();
	}

	public static void JogadorTerciarioFazerTask() throws InterruptedException {

		contTaskJogador3++;
		System.out.println();
		System.out.println("Task completa jogador Aleatório 3");
		System.out.println();
	}

	public static void imprimirEjetado(String jogador) {
		System.out.println(jogador + " encontrou um corpo, " + impostor + " é o unico suspeito");
		System.out.println(impostor + " foi ejetado");
		System.out.println("....... " + impostor + "..........");
		System.out.println("⠀⠀⠀⠀         ⠀⡠⢤⣀⠀⠀⠀⠀⠀⠀ \r\n" + "           ⡠⠤⢎⡴⠶⠦⠙⣄⠀⠀⠀⠀ \r\n" + "⠀⠀⠀⠀⡰⢠⠃⣾⡇⠘⠿⢶⢸⠀⠀⠀⠀ \r\n"
				+ "⠀⠀⠀⠀⡇⡞⢰⣿⣿⣶⣶⠀⠚⠀⠀⠀⠀ \r\n" + "⠀⠀⠀⠀⡗⢰⡿⠋⠛⢿⠏⡼⠀⠀⠀⠀⠀ \r\n" + "⠀⠀⠀⠀⠈⠐⠒⢇⣛⠡⠊⠀⠀⠀⠀⠀⠀ ");
		System.out.println("...................");
		System.out.println();
	}

	public static boolean ReportarCorpo() {
		if (jogadorPrincipal != impostor) {
			if (mapa[posicaoAtualI - 1][posicaoAtualJ] == "☠" || mapa[posicaoAtualI + 1][posicaoAtualJ] == "☠"
					|| mapa[posicaoAtualI][posicaoAtualJ + 1] == "☠" || mapa[posicaoAtualI][posicaoAtualJ - 1] == "☠") {
				imprimirEjetado(jogadorPrincipal);
				ejetado = true;
			}
		}
		if (jogadorSecundario != impostor) {
			if (mapa[posicaoAtualI2 - 1][posicaoAtualJ2] == "☠" || mapa[posicaoAtualI2 + 1][posicaoAtualJ2] == "☠"
					|| mapa[posicaoAtualI2][posicaoAtualJ2 + 1] == "☠"
					|| mapa[posicaoAtualI2][posicaoAtualJ2 - 1] == "☠") {
				imprimirEjetado(jogadorSecundario);
				ejetado = true;
			}
			if (posicaoAtualI2 - 2 >= 0 && posicaoAtualI2 + 2 <= 19 && posicaoAtualJ2 - 2 >= 0
					&& posicaoAtualJ2 + 2 <= 19) {
				if (mapa[posicaoAtualI2 - 2][posicaoAtualJ2] == "☠" || mapa[posicaoAtualI2 + 2][posicaoAtualJ2] == "☠"
						|| mapa[posicaoAtualI2][posicaoAtualJ2 - 2] == "☠"
						|| mapa[posicaoAtualI2][posicaoAtualJ2 + 2] == "☠") {
					imprimirEjetado(jogadorSecundario);
					ejetado = true;
				}
			}
		}
		if (jogadorTerciario != impostor) {
			if (mapa[posicaoAtualI3 - 1][posicaoAtualJ3] == "☠" || mapa[posicaoAtualI3 + 1][posicaoAtualJ3] == "☠"
					|| mapa[posicaoAtualI3][posicaoAtualJ3 + 1] == "☠"
					|| mapa[posicaoAtualI3][posicaoAtualJ3 - 1] == "☠") {
				imprimirEjetado(jogadorTerciario);
				ejetado = true;
			}
			if (posicaoAtualI3 - 2 >= 0 && posicaoAtualI3 + 2 <= 19 && posicaoAtualJ3 - 2 >= 0
					&& posicaoAtualJ3 + 2 <= 19) {
				if (mapa[posicaoAtualI3 - 2][posicaoAtualJ3] == "☠" || mapa[posicaoAtualI3 + 2][posicaoAtualJ3] == "☠"
						|| mapa[posicaoAtualI3][posicaoAtualJ3 - 2] == "☠"
						|| mapa[posicaoAtualI3][posicaoAtualJ3 + 2] == "☠") {
					imprimirEjetado(jogadorTerciario);
					ejetado = true;
				}
			}
		}
		return ejetado;
	}

	public static void testeTaskFeitaJogadorPrincipal() {
		int cont = 0;
		while (cont < 1) {
			if (posicaoAtualI - 1 == 1 && posicaoAtualJ == 1 || posicaoAtualI + 1 == 1 && posicaoAtualJ == 1
					|| posicaoAtualI == 1 && posicaoAtualJ + 1 == 1 || posicaoAtualI == 1 && posicaoAtualJ - 1 == 1) {
				confirmarTaskPrincipal1 += 1;
				cont++;
			} else if (posicaoAtualI - 1 == 2 && posicaoAtualJ == 13 || posicaoAtualI + 1 == 2 && posicaoAtualJ == 13
					|| posicaoAtualI == 2 && posicaoAtualJ + 1 == 13 || posicaoAtualI == 2 && posicaoAtualJ - 1 == 13) {
				confirmarTaskPrincipal2 += 1;
				cont++;
			} else if (posicaoAtualI - 1 == 6 && posicaoAtualJ == 1 || posicaoAtualI + 1 == 6 && posicaoAtualJ == 1
					|| posicaoAtualI == 6 && posicaoAtualJ + 1 == 1 || posicaoAtualI == 6 && posicaoAtualJ - 1 == 1) {
				confirmarTaskPrincipal3 += 1;
				cont++;
			}

			else if (posicaoAtualI - 1 == 6 && posicaoAtualJ == 18 || posicaoAtualI + 1 == 6 && posicaoAtualJ == 18
					|| posicaoAtualI == 6 && posicaoAtualJ + 1 == 18 || posicaoAtualI == 6 && posicaoAtualJ - 1 == 18) {
				confirmarTaskPrincipal4 += 1;
				cont++;
			} else if (posicaoAtualI - 1 == 9 && posicaoAtualJ == 3 || posicaoAtualI + 1 == 9 && posicaoAtualJ == 3
					|| posicaoAtualI == 9 && posicaoAtualJ + 1 == 3 || posicaoAtualI == 9 && posicaoAtualJ - 1 == 3) {
				confirmarTaskPrincipal5 += 1;
				cont++;
			} else if (posicaoAtualI - 1 == 11 && posicaoAtualJ == 16 || posicaoAtualI + 1 == 11 && posicaoAtualJ == 16
					|| posicaoAtualI == 11 && posicaoAtualJ + 1 == 16
					|| posicaoAtualI == 11 && posicaoAtualJ - 1 == 16) {
				confirmarTaskPrincipal6 += 1;
				cont++;
			} else if (posicaoAtualI - 1 == 15 && posicaoAtualJ == 5 || posicaoAtualI + 1 == 15 && posicaoAtualJ == 5
					|| posicaoAtualI == 15 && posicaoAtualJ + 1 == 5 || posicaoAtualI == 15 && posicaoAtualJ - 1 == 5) {
				confirmarTaskPrincipal7 += 1;
				cont++;
			} else if (posicaoAtualI - 1 == 17 && posicaoAtualJ == 9 || posicaoAtualI + 1 == 17 && posicaoAtualJ == 9
					|| posicaoAtualI == 17 && posicaoAtualJ + 1 == 9 || posicaoAtualI == 17 && posicaoAtualJ - 1 == 9) {
				confirmarTaskPrincipal8 += 1;
				cont++;
			}
			cont++;

		}
	}

	public static void testeTaskFeitaJogadorSecundario() {
		int cont = 0;
		while (cont < 1) {
			if (posicaoAtualI2 - 1 == 1 && posicaoAtualJ2 == 1 || posicaoAtualI2 + 1 == 1 && posicaoAtualJ2 == 1
					|| posicaoAtualI2 == 1 && posicaoAtualJ2 + 1 == 1
					|| posicaoAtualI2 == 1 && posicaoAtualJ2 - 1 == 1) {
				confirmarTaskSecundario1 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 2 && posicaoAtualJ2 == 13
					|| posicaoAtualI2 + 1 == 2 && posicaoAtualJ2 == 13
					|| posicaoAtualI2 == 2 && posicaoAtualJ2 + 1 == 13
					|| posicaoAtualI2 == 2 && posicaoAtualJ2 - 1 == 13) {
				confirmarTaskSecundario2 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 6 && posicaoAtualJ2 == 1 || posicaoAtualI2 + 1 == 6 && posicaoAtualJ2 == 1
					|| posicaoAtualI2 == 6 && posicaoAtualJ2 + 1 == 1
					|| posicaoAtualI2 == 6 && posicaoAtualJ2 - 1 == 1) {
				confirmarTaskSecundario3 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 6 && posicaoAtualJ2 == 18
					|| posicaoAtualI2 + 1 == 6 && posicaoAtualJ2 == 18
					|| posicaoAtualI2 == 6 && posicaoAtualJ2 + 1 == 18
					|| posicaoAtualI2 == 6 && posicaoAtualJ2 - 1 == 18) {
				confirmarTaskSecundario4 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 9 && posicaoAtualJ2 == 3 || posicaoAtualI2 + 1 == 9 && posicaoAtualJ2 == 3
					|| posicaoAtualI2 == 9 && posicaoAtualJ2 + 1 == 3
					|| posicaoAtualI2 == 9 && posicaoAtualJ2 - 1 == 3) {
				confirmarTaskSecundario5 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 11 && posicaoAtualJ2 == 16
					|| posicaoAtualI2 + 1 == 11 && posicaoAtualJ2 == 16
					|| posicaoAtualI2 == 11 && posicaoAtualJ2 + 1 == 16
					|| posicaoAtualI2 == 11 && posicaoAtualJ2 - 1 == 16) {
				confirmarTaskSecundario6 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 15 && posicaoAtualJ2 == 5
					|| posicaoAtualI2 + 1 == 15 && posicaoAtualJ2 == 5
					|| posicaoAtualI2 == 15 && posicaoAtualJ2 + 1 == 5
					|| posicaoAtualI2 == 15 && posicaoAtualJ2 - 1 == 5) {
				confirmarTaskSecundario7 += 1;
				cont++;
			} else if (posicaoAtualI2 - 1 == 17 && posicaoAtualJ2 == 9
					|| posicaoAtualI2 + 1 == 17 && posicaoAtualJ2 == 9
					|| posicaoAtualI2 == 17 && posicaoAtualJ2 + 1 == 9
					|| posicaoAtualI2 == 17 && posicaoAtualJ2 - 1 == 9) {
				confirmarTaskSecundario8 += 1;
				cont++;
			}
			// posicao +2
			if (posicaoAtualI2 - 2 >= 0 && posicaoAtualI2 + 2 <= 19 && posicaoAtualJ2 - 2 >= 0
					&& posicaoAtualJ2 + 2 <= 19) {
				if (posicaoAtualI2 - 2 == 1 && posicaoAtualJ2 == 1 || posicaoAtualI2 + 2 == 1 && posicaoAtualJ2 == 1
						|| posicaoAtualI2 == 1 && posicaoAtualJ2 + 2 == 1
						|| posicaoAtualI2 == 1 && posicaoAtualJ2 - 2 == 1) {
					confirmarTaskSecundario1 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 2 && posicaoAtualJ2 == 13
						|| posicaoAtualI2 + 2 == 2 && posicaoAtualJ2 == 13
						|| posicaoAtualI2 == 2 && posicaoAtualJ2 + 2 == 13
						|| posicaoAtualI2 == 2 && posicaoAtualJ2 - 2 == 13) {
					confirmarTaskSecundario2 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 6 && posicaoAtualJ2 == 1
						|| posicaoAtualI2 + 2 == 6 && posicaoAtualJ2 == 1
						|| posicaoAtualI2 == 6 && posicaoAtualJ2 + 2 == 1
						|| posicaoAtualI2 == 6 && posicaoAtualJ2 - 2 == 1) {
					confirmarTaskSecundario3 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 6 && posicaoAtualJ2 == 18
						|| posicaoAtualI2 + 2 == 6 && posicaoAtualJ2 == 18
						|| posicaoAtualI2 == 6 && posicaoAtualJ2 + 2 == 18
						|| posicaoAtualI2 == 6 && posicaoAtualJ2 - 2 == 18) {
					confirmarTaskSecundario4 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 9 && posicaoAtualJ2 == 3
						|| posicaoAtualI2 + 2 == 9 && posicaoAtualJ2 == 3
						|| posicaoAtualI2 == 9 && posicaoAtualJ2 + 2 == 3
						|| posicaoAtualI2 == 9 && posicaoAtualJ2 - 2 == 3) {
					confirmarTaskSecundario5 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 11 && posicaoAtualJ2 == 16
						|| posicaoAtualI2 + 2 == 11 && posicaoAtualJ2 == 16
						|| posicaoAtualI2 == 11 && posicaoAtualJ2 + 2 == 16
						|| posicaoAtualI2 == 11 && posicaoAtualJ2 - 2 == 16) {
					confirmarTaskSecundario6 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 15 && posicaoAtualJ2 == 5
						|| posicaoAtualI2 + 2 == 15 && posicaoAtualJ2 == 5
						|| posicaoAtualI2 == 15 && posicaoAtualJ2 + 2 == 5
						|| posicaoAtualI2 == 15 && posicaoAtualJ2 - 2 == 5) {
					confirmarTaskSecundario7 += 1;
					cont++;
				} else if (posicaoAtualI2 - 2 == 17 && posicaoAtualJ2 == 9
						|| posicaoAtualI2 + 2 == 17 && posicaoAtualJ2 == 9
						|| posicaoAtualI2 == 17 && posicaoAtualJ2 + 2 == 9
						|| posicaoAtualI2 == 17 && posicaoAtualJ2 - 2 == 9) {
					confirmarTaskSecundario8 += 1;
					cont++;
				}
			}
			cont++;
		}
	}

	public static void testeTaskFeitaJogadorTerciario() {
		int cont = 0;
		while (cont < 1) {
			if (posicaoAtualI3 - 1 == 1 && posicaoAtualJ3 == 1 || posicaoAtualI3 + 1 == 1 && posicaoAtualJ3 == 1
					|| posicaoAtualI3 == 1 && posicaoAtualJ3 + 1 == 1
					|| posicaoAtualI3 == 1 && posicaoAtualJ3 - 1 == 1) {
				confirmarTaskTerciario1 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 2 && posicaoAtualJ3 == 13
					|| posicaoAtualI3 + 1 == 2 && posicaoAtualJ3 == 13
					|| posicaoAtualI3 == 2 && posicaoAtualJ3 + 1 == 13
					|| posicaoAtualI3 == 2 && posicaoAtualJ3 - 1 == 13) {
				confirmarTaskTerciario2 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 6 && posicaoAtualJ3 == 1 || posicaoAtualI3 + 1 == 6 && posicaoAtualJ3 == 1
					|| posicaoAtualI3 == 6 && posicaoAtualJ3 + 1 == 1
					|| posicaoAtualI3 == 6 && posicaoAtualJ3 - 1 == 1) {
				confirmarTaskTerciario3 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 6 && posicaoAtualJ3 == 18
					|| posicaoAtualI3 + 1 == 6 && posicaoAtualJ3 == 18
					|| posicaoAtualI3 == 6 && posicaoAtualJ3 + 1 == 18
					|| posicaoAtualI3 == 6 && posicaoAtualJ3 - 1 == 18) {
				confirmarTaskTerciario4 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 9 && posicaoAtualJ3 == 3 || posicaoAtualI3 + 1 == 9 && posicaoAtualJ3 == 3
					|| posicaoAtualI3 == 9 && posicaoAtualJ3 + 1 == 3
					|| posicaoAtualI3 == 9 && posicaoAtualJ3 - 1 == 3) {
				confirmarTaskTerciario5 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 11 && posicaoAtualJ3 == 16
					|| posicaoAtualI3 + 1 == 11 && posicaoAtualJ3 == 16
					|| posicaoAtualI3 == 11 && posicaoAtualJ3 + 1 == 16
					|| posicaoAtualI3 == 11 && posicaoAtualJ3 - 1 == 16) {
				confirmarTaskTerciario6 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 15 && posicaoAtualJ3 == 5
					|| posicaoAtualI3 + 1 == 15 && posicaoAtualJ3 == 5
					|| posicaoAtualI3 == 15 && posicaoAtualJ3 + 1 == 5
					|| posicaoAtualI3 == 15 && posicaoAtualJ3 - 1 == 5) {
				confirmarTaskTerciario7 += 1;
				cont++;
			} else if (posicaoAtualI3 - 1 == 17 && posicaoAtualJ3 == 9
					|| posicaoAtualI3 + 1 == 17 && posicaoAtualJ3 == 9
					|| posicaoAtualI3 == 17 && posicaoAtualJ3 + 1 == 9
					|| posicaoAtualI3 == 17 && posicaoAtualJ3 - 1 == 9) {
				confirmarTaskTerciario8 += 1;
				cont++;
			}
			// posicao +2
			if (posicaoAtualI3 - 2 >= 0 && posicaoAtualI3 + 2 <= 19 && posicaoAtualJ3 - 2 >= 0
					&& posicaoAtualJ3 + 2 <= 19) {
				if (posicaoAtualI3 - 2 == 1 && posicaoAtualJ3 == 1 || posicaoAtualI3 + 2 == 1 && posicaoAtualJ3 == 1
						|| posicaoAtualI3 == 1 && posicaoAtualJ3 + 2 == 1
						|| posicaoAtualI3 == 1 && posicaoAtualJ3 - 2 == 1) {
					confirmarTaskTerciario1 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 2 && posicaoAtualJ3 == 13
						|| posicaoAtualI3 + 2 == 2 && posicaoAtualJ3 == 13
						|| posicaoAtualI3 == 2 && posicaoAtualJ3 + 2 == 13
						|| posicaoAtualI3 == 2 && posicaoAtualJ3 - 2 == 13) {
					confirmarTaskTerciario2 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 6 && posicaoAtualJ3 == 1
						|| posicaoAtualI3 + 2 == 6 && posicaoAtualJ3 == 1
						|| posicaoAtualI3 == 6 && posicaoAtualJ3 + 2 == 1
						|| posicaoAtualI3 == 6 && posicaoAtualJ3 - 2 == 1) {
					confirmarTaskTerciario3 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 6 && posicaoAtualJ3 == 18
						|| posicaoAtualI3 + 2 == 6 && posicaoAtualJ3 == 18
						|| posicaoAtualI3 == 6 && posicaoAtualJ3 + 2 == 18
						|| posicaoAtualI3 == 6 && posicaoAtualJ3 - 2 == 18) {
					confirmarTaskTerciario4 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 9 && posicaoAtualJ3 == 3
						|| posicaoAtualI3 + 2 == 9 && posicaoAtualJ3 == 3
						|| posicaoAtualI3 == 9 && posicaoAtualJ3 + 2 == 3
						|| posicaoAtualI3 == 9 && posicaoAtualJ3 - 2 == 3) {
					confirmarTaskTerciario5 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 11 && posicaoAtualJ3 == 16
						|| posicaoAtualI3 + 2 == 11 && posicaoAtualJ3 == 16
						|| posicaoAtualI3 == 11 && posicaoAtualJ3 + 2 == 16
						|| posicaoAtualI3 == 11 && posicaoAtualJ3 - 2 == 16) {
					confirmarTaskTerciario6 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 15 && posicaoAtualJ3 == 5
						|| posicaoAtualI3 + 2 == 15 && posicaoAtualJ3 == 5
						|| posicaoAtualI3 == 15 && posicaoAtualJ3 + 2 == 5
						|| posicaoAtualI3 == 15 && posicaoAtualJ3 - 2 == 5) {
					confirmarTaskTerciario7 += 1;
					cont++;
				} else if (posicaoAtualI3 - 2 == 17 && posicaoAtualJ3 == 9
						|| posicaoAtualI3 + 2 == 17 && posicaoAtualJ3 == 9
						|| posicaoAtualI3 == 17 && posicaoAtualJ3 + 2 == 9
						|| posicaoAtualI3 == 17 && posicaoAtualJ3 - 2 == 9) {
					confirmarTaskTerciario8 += 1;
					cont++;
				}
			}
			cont++;

		}
	}

	public static void confirmarTaskJogadorPrincipal() throws InterruptedException {
		System.out.println();
		testeTaskFeitaJogadorPrincipal();
		int cont = 0;
		while (cont < 1) {
			if (confirmarTaskPrincipal1 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal1++;
				cont++;
			} else if (confirmarTaskPrincipal2 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal2++;
				cont++;
			} else if (confirmarTaskPrincipal3 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal3++;
				cont++;
			} else if (confirmarTaskPrincipal4 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal4++;
				cont++;
			} else if (confirmarTaskPrincipal5 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal5++;
				cont++;
			} else if (confirmarTaskPrincipal6 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal6++;
				cont++;
			} else if (confirmarTaskPrincipal7 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal7++;
				cont++;
			} else if (confirmarTaskPrincipal8 == 1) {
				JogadorPrincipalFazerTask();
				confirmarTaskPrincipal8++;
				cont++;
			} else
				cont++;
		}
	}

	public static void confirmarTaskJogadorSecundario() throws InterruptedException {
		testeTaskFeitaJogadorSecundario();
		int cont = 0;
		while (cont < 1) {
			if (confirmarTaskSecundario1 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario1++;
				cont++;
			} else if (confirmarTaskSecundario2 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario2++;
				cont++;
			} else if (confirmarTaskSecundario3 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario3++;
				cont++;
			} else if (confirmarTaskSecundario4 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario4++;
				cont++;
			} else if (confirmarTaskSecundario5 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario5++;
				cont++;
			} else if (confirmarTaskSecundario6 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario6++;
				cont++;
			} else if (confirmarTaskSecundario7 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario7++;
				cont++;
			} else if (confirmarTaskSecundario8 == 1) {
				JogadorSecundarioFazerTask();
				confirmarTaskSecundario8++;
				cont++;
			} else
				cont++;
		}
	}

	public static void confirmarTaskJogadorTerciario() throws InterruptedException {
		testeTaskFeitaJogadorTerciario();
		int cont = 0;
		while (cont < 1) {
			if (confirmarTaskTerciario1 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario1++;
				cont++;
			} else if (confirmarTaskTerciario2 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario2++;
				cont++;
			} else if (confirmarTaskTerciario3 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario3++;
				cont++;
			} else if (confirmarTaskTerciario4 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario4++;
				cont++;
			} else if (confirmarTaskTerciario5 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario5++;
				cont++;
			} else if (confirmarTaskTerciario6 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario6++;
				cont++;
			} else if (confirmarTaskTerciario7 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario7++;
				cont++;
			} else if (confirmarTaskTerciario8 == 1) {
				JogadorTerciarioFazerTask();
				confirmarTaskTerciario8++;
				cont++;
			} else
				cont++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MapaPrincipal();
		imprimeMapa();
		setarJogadorNoMapa();
		imprimeMapa();
		setarImpostor();
		andarJogador();

	}

}
