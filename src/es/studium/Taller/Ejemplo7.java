package es.studium.Taller;

public class Ejemplo7
{
	public static void main(String[] args)
	{
		// NegativeArraySizeException
		try
		{
			final int TAM = -3;
			int[] tabla = new int[TAM];
			for(int i = 0; i < TAM; i++)
			{
				tabla[i] = i;
			}
			for(int i: tabla)
			{
				System.out.println(i);
			}
		}
		catch(NegativeArraySizeException nase)
		{
			System.out.println("El tamaño del array no puede ser negativo.");
		}
		catch(Exception e)
		{
			System.out.println("Error desconocido");
		}
		finally
		{
			System.out.println("Fin de la transmición");
		}
	}
}