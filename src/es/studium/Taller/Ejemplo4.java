package es.studium.Taller;

public class Ejemplo4
{
	public static void main(String[] args)
	{
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try
		{
			array[4]= 5; // Acceso a una posición no disponible
			valor = valor/cero; // División por cero
		}
		catch(ArithmeticException e)
		{
			System.out.println( "División por cero" );
		}
		catch(Exception e)
		{
			System.out.println( "Se ha producido un error:"+e.getMessage());
		}
		finally
		{
			System.out.println("Esto se mostrará siempre");
		}

	}
}