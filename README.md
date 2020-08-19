# MLSellersAndItems

  La app MLSellersAndItems consiste que dado un userId, se devuelva todas las publicaciones que tenga en el sitio web "Mercado Libre" en un archivo Log. Para realizar
dicha acci�n, se utilizar� el lenguaje de programaci�n "Java". Tambi�n se utilizar� la Api p�blica de mercado libre, que dado un usuario y su regi�n devuelve la informaci�n
de todas las publicaciones dadas. La url de la api es "https://api.mercadolibre.com/sites/$site_id/search?seller_id=$user_id".
  La aplicaci�n es simple, solamente consiste en en ingresar el user_id que ser� pedido por consola. Cabe aclarar que la aplicaci�n esta creada de tal manera que la
zona corresponde a Mercado Libre Argentina. Esto se puede modificar cambiando el $site_id de la url de la api.
  Una vez otorgado el user_id, la aplicaci�n obtendr� la informaci�n desde la api, y realizar� las operaciones necesarias para transformar dicha informaci�n en objetos
VOPublications. Dichos objetos deben tener 4 variables las cuales representan a las publicaciones:
	� "Id" del item
	� "Title" del item
	� "Category_id" de donde se encuetra publicada
	� "name" de la categoria

Unas vez que se tengan todos las p�blicaciones, estas ser�n escritos en un archivo txt y otorgado al usuario. Por defecto, el ruta del archivo LOG estar� en C:/Users/Public 
con el nombre "items.txt". Dicha ruta puede ser modificada en la l�nea 44 de la clase main. "String route = 'route'".

  Un ejemplo del output de la aplicaci�n es el archivo FileLog.txt. Dicho archivo se realiz� con el user_id 179571326. 