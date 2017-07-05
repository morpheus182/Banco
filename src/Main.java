/**Programa que entrega un numero al azar del 1 al 19
*@author Miguel Olvera 03/07/2017
*/ 
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		double balance = 5010.0;
		double deposito = 0.0;
		double retiro = 0.0;
		double result = 0.0;
		double resultDep = 0.0;
		double resultRetiro = 0.0;
		String resp = "";
		String nombre = "";
		
		Scanner in = new Scanner (System.in);
		Cliente client = new Cliente("Miguel", "Olvera");
		Cuenta cuen = new Cuenta();
		client.setCuenta(cuen);
		
		CuentaAhorro cuenAhorro = new CuentaAhorro(balance);
		Cliente cliente2 = new Cliente("Ramses","Cabrera");
		cliente2.setCuenta(cuenAhorro);
		
		Banco ban = new Banco();
		
		System.out.println("Cuanto vas a retirar?");
		retiro = in.nextDouble();
		resultRetiro = cliente2.getCuenta().retiro(retiro, balance);
		
		System.out.println("tu total es de: " + resultRetiro);
		/*
		for(int i = 0; i<=9;i++)
		{
			System.out.println("Ingresa un nombre");
			nombre = in.next();
			//ban.addCliente(nombre);
		}
		*/
		
		/*
		System.out.println("tu nombre es: " + client.getNombre());
		System.out.println("tu apellido es: " + client.getApellido());
		
		System.out.println("tu cuenta es: " + client.getCuenta());
		
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
		
		System.out.println("------------------------------");
		
		System.out.println(client.getCuenta().getBalance(balance));
		*/
	}
}