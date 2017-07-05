public class CuentaCheques extends Cuenta{
	public double retiro(double retiro, double actual)
	{
		
		if (actual <= 5000)
		{
			balance = actual - retiro;
		} else {
			balance = 0;
		}
		return balance;
	}
}
