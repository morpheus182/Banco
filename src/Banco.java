import java.lang.reflect.Array;
import java.util.Arrays;

public class Banco {
	
	private String clientes[];
	private int nCliente;
	
	public void addCliente(String cliente)
	{	
		for(int i = 0; clientes.length <= 9; i++)
		{
			clientes[i] = cliente;
		}
	}
	
	public int getNClientes()
	{
		int cliente = 0;
		cliente = clientes.length;
		return cliente;
	}
	
	public String getCliente(String nombre)
	{
		String cliente = "";
		for(int i = 0; clientes.length<=9; i++)
		{
			if(clientes[i] == nombre)
			{
				cliente = "muestra algo XD";
			}
		}
		return cliente;
	}
}