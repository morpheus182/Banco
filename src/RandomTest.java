/**Programa que entrega un numero al azar del 1 al 19
*@author Miguel Olvera 03/07/2017
*/ 
import java.util.Scanner;
public class RandomTest{
	public static void main(String[] args) {
		double balance = 10.0;
		double deposito = 0.0;
		double retiro = 0.0;
		double result = 0.0;
		double resultDep = 0.0;
		double resultRetiro = 0.0;
		
		Scanner in = new Scanner (System.in);
		
		//Random rand = new Random();
		//resultado = rand.nextInt(20);
		//System.out.println(resultado);
		
		Cuenta cuen = new Cuenta();
		
		result = cuen.getBalance(balance);
		result = cuen.getBalance(balance);
		
		System.out.println(result);
		
		System.out.println("Cuanto vas a depositar?");
		deposito = in.nextDouble();
		
		resultDep = cuen.deposito(deposito, balance);
		
		System.out.println("tu total es de: " + resultDep);
		balance = resultDep;
		
		System.out.println("Cuanto vas a retirar?");
		retiro = in.nextDouble();
		resultRetiro = cuen.retiro(retiro, balance);
		System.out.println("tu total es de: " + resultRetiro);
	}
}