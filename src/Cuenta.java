/** Programa de ejercicio
 * @author Olvera
 */ 
public class Cuenta {

		protected double balance = 0.0;
		
		public double getBalance(double balance)
		{
			this.balance = balance;
			return balance;
		}
		
		public double deposito(double deposito, double balance)
		{
			double total = balance + deposito;
			
			return total;
		}
		
		public double retiro(double retiro, double balance)
		{
			double total = balance - retiro;
			return total;
		}
		
	}