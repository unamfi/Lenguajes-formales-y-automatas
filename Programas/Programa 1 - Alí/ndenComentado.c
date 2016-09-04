/** PROGRAMA QUE MAPEA DE CUALQUIER DIMENSION DE LOS NATURALES NXNXNXNXN..... 
 * AL DOMINIO DE LOS NATURALES DE UNA SOLA DIMENSION **/

/**  	DOMINGUEZ CABAÑAS OMAR ALÍ	LINEAS EFECTIVAS DE CODIGO: 26		**/

#include<stdio.h>

main()
{
  int dimension, parejas, i, dominio, valor, j=0,k=0, staticdim;
  printf("Dame dimension:\t");
  scanf("%d",&dimension);
  long int natural[dimension];
  staticdim = dimension;
  for(i=0;i<dimension;i++)
  {
    printf("f[%d]= ",i+1);
    scanf("%d",&natural[i]);
  }
  while(dimension != 1)  /// Hasta que la dimension sea de uno hara:
  {
    parejas = dimension/2;  /// Calculamos las parejas que hay en la dimension
      for(i=1; i<=parejas;i++)
      {
	dominio = natural[j] + natural[j+1];  /// Extraemos los elementos que son pareja, que sumados nos dan su dominio en la recta
	dominio = ((dominio*dominio)+dominio)/2;  /// Encontramos el natural en el cual inicia su dominio
	valor = dominio + natural[j+1];  /// Le sumamos su pareja (y) la cual es el corrimiento del dominio
	natural[k] = valor;  /// Lo regresamos al arreglo
	j+=2;  /// Aumentamos en 2 el indice para la siguiente pareja
	k++;  /// Aumentamos en 1 el indice de guardado para el siguiente resultado
      }
    j=0;  /// Reseteamos ambos indices
    k=0;
    if(dimension%2 == 0 )   /// Si la dimension anterior es PAR
      dimension = parejas;  /// Redimensionamos nuestro vector que ahora es igual al numero de parejas
    else  /// Si la dimension anterior fue IMPAR
    {
      natural[parejas] = natural[dimension-1];  /// Movemos el elemento que no hizo pareja, para que sea parte del vecto nuevo
      dimension = parejas + 1; /// La dimension la igualamos al numero de parejas mas uno, pues hay un elemento sin pareja sin calcular
    }
  }
  printf("Su punto de dimension %d corresponde mapeado al %d en los naturales. \n",staticdim,natural[0]);
}


