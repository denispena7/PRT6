package es.studium.Taller;

public class Ejemplo6
{
	public static void main(String[] args)
	{
		// IllegalArgumentException
		try {
			Object a = 0;
			suma(a);
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("Asignación de tipos incorrecta");
		}
		catch(Exception e)
		{
			System.out.println("Error desconocido");
		}
		finally
		{
			System.out.println("Fin del programa");
		}
	}

	private static void suma(int a)
	{
		System.out.println(a);
	}
}