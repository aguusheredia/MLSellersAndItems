# MLSellersAndItems

  La app MLSellersAndItems consiste que dado un userId, se devuelva todas las publicaciones que tenga en el sitio web "Mercado Libre" en un archivo Log. Para realizar
dicha acción, se utilizará el lenguaje de programación "Java". También se utilizará la Api pública de mercado libre, que dado un usuario y su región devuelve la información
de todas las publicaciones dadas. La url de la api es "https://api.mercadolibre.com/sites/$site_id/search?seller_id=$user_id".
  La aplicación es simple, solamente consiste en en ingresar el user_id que será pedido por consola. Cabe aclarar que la aplicación esta creada de tal manera que la
zona corresponde a Mercado Libre Argentina. Esto se puede modificar cambiando el $site_id de la url de la api.
  Una vez otorgado el user_id, la aplicación obtendrá la información desde la api, y realizará las operaciones necesarias para transformar dicha información en objetos
VOPublications. Dichos objetos deben tener 4 variables las cuales representan a las publicaciones:
	• "Id" del item
	• "Title" del item
	• "Category_id" de donde se encuetra publicada
	• "name" de la categoria

Unas vez que se tengan todos las públicaciones, estas serán escritos en un archivo txt y otorgado al usuario. Por defecto, el ruta del archivo LOG estará en C:/Users/Public 
con el nombre "items.txt". Dicha ruta puede ser modificada en la línea 44 de la clase main. "String route = 'route'".

  Un ejemplo del output de la aplicación es el archivo FileLog.txt. Dicho archivo se realizó con el user_id 179571326. 