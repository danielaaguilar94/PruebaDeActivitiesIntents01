# PruebaDeActivitiesIntents01
Prueba de intent y envío de dato a otra actividad 

En esta prueba, se diseñaron un EditText, un TextView y dos botones(Ingresar y Enviar), la cual funciona de la siguiente manera:
Se ingresa un dato por el EditText
Al presionar "Ingresar", se produce  un onClickListener para ese botón el cual tendrá la función de al realizar la acción 
de dar clic, se obtiene el dato del EditText y se almacena en una variable del tipo String, y esta a su vez, será la infomación 
que ingresemos en el TextView para que pueda ser visualizado.
En el caso del botón Guardar, se crea un Intent con el fin de iniciar una nueva actividad la cual hacemos referencia en el 
constructor de dicho objeto, y para enviar el dato y se muestre en la siguiente actividad o siguiente pantalla se crea un bundle
que será dicho de una manera simple nuestro "paquete" en donde se almacenará la información del EditText, la cual se ingresa en el 
método putString y nos pide una llave que será la encargada de identificar dicho dato en la siguiente actividad, 
Se pondra esa información en el Intent con putExtras(), y se iniciará la siguiente Actividad.
La otra Actividad llamada BienvenidaActivity, recibirá ese valor a traves del bundle y de obtener el Intent detectado y si el 
bundle es diferente de null, especificamos el valor a obtener y mediante la llave ingresada en la actividad anterior, podremos 
obtener ese dato en específico, y se mostrará en un TextView concatenado con un mensaje de Bienvenid@.


