public class CuentaAhorro extends Cuenta{
	public CuentaAhorro(double balance)
	{
		//super(balance);
	}
	
	public double retiro(double retiro, double balance)
	{
		//double balance = 0.0;
		if (balance > 5000)
		{
			balance = balance - retiro;
		} else {
			balance = 0;
		}
		return balance;
	}
}