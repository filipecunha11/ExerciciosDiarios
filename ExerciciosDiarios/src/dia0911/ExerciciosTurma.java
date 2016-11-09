package dia0911;

import java.util.Random;
import java.util.Scanner;

public class ExerciciosTurma {

	public ExerciciosTurma() {
		
		//exercicio1();
		//exercicio2();
		exercicio3();
		
	}

	public void exercicio1()
	{
		/* EXERCICIO 1  - Dificuldade I
		 * Peça 5 valores ao utilizador entre 1 e 100 e guarde-os num array
		 * Através de um ciclo, determine qual é o maior valor e o menor
		 * 
		 */
		int[] nums = new int [5]; int max=0, min=101;
		
		System.out.println("Insira 5 valores:");
		for (int i = 0; i < 5; i++)
		{
			do
			{
			System.out.print("Numero " + i+1 + ":	");
			nums[i] = (new Scanner(System.in)).nextInt();
			} while (nums[i] <= 0 && nums[i] > 100);
			
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
		}
		System.out.println("O numero maior é: " + max);
		System.out.println("O numero menor é: " + min);
	}
	
	public void exercicio2()
	{
		/* EXERCICIO 2  - Dificuldade I
		 * Peça 5 valores ao utilizador, em que 1 desses valores tem de corresponder a 0, e guarde-os num array.
		 * De seguida, percorra o array e descubra em que casa foi guardado o valor 0 e retorne ao utilizador, tendo
		 *  em conta que array[0] corresponde à primeira casa.
		 */
		 
		int[] nums = new int [5];
		System.out.println("Insira 5 valores:");
		
		for (int i = 0; i < 5; i++)
			nums[i] = (new Scanner(System.in)).nextInt();
		
		for (int i = 0; i < 5; i++)
			if (nums[i] == 0)
				System.out.println("O 0 foi inserido na " + i+1 + "ª casa.");
		
	}
	
	public void exercicio3()
	{
		/* EXERCICIO 3 - Dificuldade III
		 * Crie um array com 50 espaços e preencha-o com os números de 1 a 50
		 * De seguida, gere 3 números aleatórios que irão corresponder às casas do array com premio
		 * Pergunte ao utilizador quanto € pretende apostar
		 * Peça três valores ao utilizador entre 1-50 e verifique se corresponde aos valores das casas do
		 * array que contêm prémio.
		 * Consoante o número de valores acertados, calcule o valor do prémio do utilizador. O premio é 
		 * calculado da seguinte forma: ((valorApostado^2)^2)^2. Cada expoente corresponde a 1 valor acertado
		 * Utilize 3 arrays, um para os valores inseridos pelo utilizador, outra para os numeros da lotaria e outro para os nums gerados
		 * 
		 * É recomendado utilizar o tipo DOUBLE para a variavel que guarda o valor ganho pelo utilizador
		 * Para calcular exponenciais utilize a função: Math.pow(base,exp)
		 */
		final int VALORMAX = 49;
		Random r = new Random();
		
		int[] valorRandom = {r.nextInt(VALORMAX), r.nextInt(VALORMAX), r.nextInt(VALORMAX)};
		int[] valorUser = new int[3];
		int[] numLotaria = new int[50];
		double valorApostado;
		int nAcertados = 0;
		boolean validado = false;
		
		
		for (int i = 0; i < 50; i++)
			numLotaria[i] = i+1;
		
		
		//Apenas para saber quais são os valores da lotaria
		System.out.println(numLotaria[valorRandom[0]] + ", " + numLotaria[valorRandom[1]] + ", " + numLotaria[valorRandom[2]]);
		
		do
		{
		System.out.println("Quanto pretende apostar? Mínimo 2€  ");
		valorApostado = (new Scanner(System.in)).nextInt();
		} while (valorApostado < 2);
		
		System.out.println("");
		System.out.println("Apostou " + valorApostado + "€, poderá ganhar um total de: " + Math.pow(valorApostado,8));
		for (int i = 0; i < 3; i++)
		{
			do
			{
			System.out.print(i+1 + "º numero:  ");
			valorUser[i] = (new Scanner(System.in)).nextInt();
			if (valorUser[i] > 0 && valorUser[i] < 51)
				validado = true;
			} while(!validado);
		}
		
		for (int i = 0; i < 3; i++)
		{
			if (valorUser[i] == numLotaria[valorRandom[i]])
			{
				valorApostado = Math.pow(valorApostado,2);
				nAcertados++;
			}
		}

		System.out.println("");
		System.out.println("");
		
		if (nAcertados == 0)
		{
			System.out.println("Não acertou nada, inseriu " + valorUser[0] + ", " + valorUser[1] + ", " + valorUser[2]+ "... ");
			valorApostado = 0;
		}
		else if(nAcertados == 1)
			System.out.println("Acertou 1 valor! Inseriu " + valorUser[0] + ", " + valorUser[1] + ", " + valorUser[2]+ ".");
		else if(nAcertados == 2)
			System.out.println("Acertou 2 valores! Inseriu " + valorUser[0] + ", " + valorUser[1] + ", " + valorUser[2]+ ".");
		else
			System.out.println("ACERTOU TODOS OS VALORES! Inseriu " + valorUser[0] + ", " + valorUser[1] + ", " + valorUser[2]+ ".");
		System.out.println("Os valores da lotaria eram " + numLotaria[valorRandom[0]] + ", " + numLotaria[valorRandom[1]] + ", " + numLotaria[valorRandom[2]]+ ".");

		System.out.println("Ganhou um total de " + valorApostado + "€.");
	}
}
