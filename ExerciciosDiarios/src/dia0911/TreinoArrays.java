package dia0911;

public class TreinoArrays {

	public TreinoArrays() {
		// Sporting - Celtic
		
		// tipo[] nomeVar = inicializaçao tipo [tamanho]
		int[] golos = new int[2];
		
		//atribuir variaveis ao array
		golos[0] = 2;
		golos[1] = 1;
		
		// region Instanciaçao com inicializaçao de var
		int[] resultJogo = {2, 1};

		
		System.out.println(" ______________________________________________");
		System.out.println("|                                              |");
		System.out.println("|            Sporting "+ resultJogo[0] + " - " + resultJogo[1] + " Celtic             |");
		System.out.println("|  A equipa da casa (Sporting) marcou " + golos[0] + " golos  |");
		System.out.println("|  A equipa visitante (Celtic) marcou " + golos[1] + " golos  |");
		System.out.println("|                                              |");
		System.out.println("|______________________________________________|");

		int[] portoBenfica = {1, 1};
		int[] sportingArouca = {3, 0};
		int[] maritimoBraga = {1, 0};
		
		int[][] primeiraLiga = new int[3][2];
		
		primeiraLiga[0][0] = portoBenfica[0];
		primeiraLiga[0][1] = portoBenfica[1];
		primeiraLiga[1][0] = sportingArouca[0];
		primeiraLiga[1][1] = sportingArouca[1];
		primeiraLiga[2][0] = maritimoBraga[0];
		primeiraLiga[2][1] = maritimoBraga[1];
		
		
		System.out.println("     RESULTADOS 1ª LIGA");
		System.out.println("    Porto "+ primeiraLiga[0][0] + " - " + primeiraLiga[0][1] + " Benfica");
		System.out.println(" Sporting "+ primeiraLiga[1][0] + " - " + primeiraLiga[1][1] + " Arouca");
		System.out.println(" Maritimo "+ primeiraLiga[2][0] + " - " + primeiraLiga[2][1] + " Braga");
	}

}
