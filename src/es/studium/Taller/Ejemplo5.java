package es.studium.Taller;

public class Ejemplo5
{
	public static void main(String[] args)
	{
		// ArrayStoreException
		try
		{
			Object x[] = new String[3];
			x[0] = 5;
		}
		catch(ArrayStoreException ase)
		{
			System.out.println("Asignación de tipos incorrecta");
		}
		catch(Exception e)
		{
			System.out.println("Fin de la transmisión");
		}
	}
}