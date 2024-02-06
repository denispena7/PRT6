package es.studium.Taller;

public class Ejemplo1
{
	public static void main(String[] args)
	{
		int i = 0;
		String vectorS [] = {"Hola mundo 1", "Hola mundo 2", "Hola mundo 3"};
		while (i < 4 )
		{
			try
			{
				System.out.println(vectorS[i]);
			}
			catch(ArrayIndexOutOfBoundsException aioobe)
			{
				System.out.println("Acceso fuera del rango");
			}
			i++;
		}
	}
}