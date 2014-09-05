
package proyecto;
/*
*
*
*Autores:   Diego Juarez        13280
*           Daniel Mejia        13271
*           Esteban Barrera     13413
*/


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.InputMismatchException; 

public class Main 
{
    public static void main(String[] args) 
    {
        //imprimimos un mensaje de bienvenida con un menu
        System.out.println ("Bienvenido"); 
        System.out.println ("");
        System.out.println ("1.HashSet");
        System.out.println ("2.treeset");
        System.out.println ("3.LinkedHashSet");
        System.out.println ("Por favor introduzca una opcion del menu (1,2,3) dependiendo");
        System.out.println ("la implementacion a usar"); 
        System.out.println ("");
        //inicializamos la variable setUsuario que es la que se encarga de indicar al programa que implementacion se desa
        int setUsuario = 0;
        // solicitamos al usuario que ingres una opcion
        Scanner ingresoUsuario = new Scanner (System.in); 
        setUsuario = ingresoUsuario.nextInt  ();

        // en caso de que el usuario ingrese un valor incorrecto para el tipo de implementacion solicitamos al informacion nuevamente
        //esta es la programacion defensiva
        while(setUsuario!=1 && setUsuario!=2 && setUsuario!=3)
        {
            // mostramos un mensaje que solicita nuevamente el ingreso del dato para el usuario
            System.out.println ("Ingreso Erroneo, Por Favor ingrese una opcion del menu (1,2,3)");
            System.out.println ("");
            // mostramos el menu nuevamente
            System.out.println ("1.HashSet");
            System.out.println ("2.treeset");
            System.out.println ("3.LinkedHashSet");
            System.out.println ("Por favor introduzca una opcion del menu (1,2,3) dependiendo");
            System.out.println ("la implementacion a usar"); 
            System.out.println ("");
            setUsuario = 0; 
            // realizamos otra vez la lectura de lo que ingresa el usuario
            ingresoUsuario = new Scanner (System.in); 
            setUsuario = ingresoUsuario.nextInt();
        }
        
        // Variable que indicara al programa que implementacion usar
        String mandaAFactory = "";
        // si es 1 almacenamos hashset
        if (setUsuario==1)
        {
            mandaAFactory = "hashset";
        }
        // si manda 2 almecenamos treeset en la variable
        if (setUsuario==2)
        {
            mandaAFactory = "treeset";
        }
        // si manda 3 almcena linkedhashset en la variable
        if (setUsuario==3)
        {
            mandaAFactory = "linkedhashset";
        }

        // intanciamos variables para controlar la cantidad de datos que seran ingresado por el usuario
        int contador =0;
        int cantidadDePersonas = 0; 
        while (contador == 0)
        {
            try 
            {
                // pedimos al usuario el numero de programadores que se ingresaran
                System.out.println ("Cuantos Programadores ingresara ??"); 
                // leemos el valor ingresado por el usuario
                ingresoUsuario = new Scanner (System.in); 
                cantidadDePersonas = ingresoUsuario.nextInt ();
                contador = 1;
            }
            
            catch(InputMismatchException e) 
            { 
                System.out.println ("Ingreso Errono por favor ingrese un numero positivo "); 
            }

        }
        // intanciamos los conjuntos y conde se almacenaran los datos
        Set<String> conjuntoWeb = null; 
        Set<String> conjuntoJava = null; 
        Set<String> conjuntoCelulares = null; 
        Set<String> respuestaTresConjuntos = null; 
        Set<String> respuestaJavaWeb = null ; 
        Set<String> respuestaJavaNOWeb = null; 
        Set<String> respuestaWebCEL = null; 
        Set<String> respuesta = null; 
        Set<String> respuestaTodo = null; 
        Factory tipoSet= new Factory(); 
        // definimos los conjuntos del tipo que el usuario ingreso
        conjuntoWeb=tipoSet.getImplementacion(mandaAFactory); 
        conjuntoJava=tipoSet.getImplementacion(mandaAFactory);
        conjuntoCelulares=tipoSet.getImplementacion(mandaAFactory);

        respuestaTresConjuntos=tipoSet.getImplementacion(mandaAFactory);
        respuestaJavaWeb=tipoSet.getImplementacion(mandaAFactory);
        respuestaJavaNOWeb=tipoSet.getImplementacion(mandaAFactory);
        respuestaWebCEL=tipoSet.getImplementacion(mandaAFactory);
        respuesta=tipoSet.getImplementacion(mandaAFactory);
        respuestaTodo=tipoSet.getImplementacion(mandaAFactory);
        conjuntoCelulares=tipoSet.getImplementacion(mandaAFactory);
        conjuntoCelulares=tipoSet.getImplementacion(mandaAFactory);
        conjuntoCelulares=tipoSet.getImplementacion(mandaAFactory);

        // ciclo para poder hacer el ingreso de datos
        int cont=0;
        while (cont<cantidadDePersonas)
        {
            cont=cont+1;
            // pedimos el nombre al usario
            System.out.println ("Ingrese El nombre del programador numero: "+cont); 
            String nombreUsuario = "";
            ingresoUsuario = new Scanner (System.in); 
            nombreUsuario = ingresoUsuario.nextLine ();
            // preguntamos si pertenece al conjunto de programadores WEB
            System.out.println ("El(La) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones WEB ? (SI,NO)");
            String proWeb = ""; 
            ingresoUsuario = new Scanner (System.in); 
            proWeb = ingresoUsuario.nextLine ();
            proWeb = proWeb.toUpperCase();

            // programacion defensiva para el ingreso de categoria WEB
            while (!proWeb.equals("NO") && !proWeb.equals("SI") && !proWeb.equals("Si")&& !proWeb.equals("No")&& !proWeb.equals("si")&& !proWeb.equals("no"))
            {
                System.out.println ("Ingreso Erroneo");
                System.out.println ("ingrese Si/No dependiendo si el(la) programador(a) "+ nombreUsuario + " desarrolla Aplicaciones WEB.");
                System.out.println ("Por Favor ingrese si el(la) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones WEB ? (SI,NO)");
                proWeb = ""; 
                ingresoUsuario = new Scanner (System.in); 
                proWeb = ingresoUsuario.nextLine ();
                proWeb = proWeb.toUpperCase();
            }

            // realzamos otra pregunta para saber si el programador pertenece al conjunto de JAVA
            System.out.println ("El(La) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones JAVA ? (SI,NO)");
            String proJava = "";
            // lectura del teclado
            ingresoUsuario = new Scanner (System.in); 
            proJava = ingresoUsuario.nextLine ();
            proJava = proJava.toUpperCase();

            // programacion defensiva para el conjunto de JAVA
            while (!proJava.equals("NO") && !proJava.equals("SI"))
            {
                System.out.println ("Ingreso Erroneo");
                System.out.println ("ingrese Si/No dependiendo si el(la) programador(a) "+ nombreUsuario + " desarrolla Aplicaciones JAVA.");
                System.out.println ("Por Favor ingrese si el(la) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones JAVA ? (SI,NO)");
                proJava = ""; 
                proJava = ingresoUsuario.nextLine ();
                proJava = proJava.toUpperCase();
            }

                // realizamos otra pregunta para poder saber si el programador realiza aplicaciones de celulares
                System.out.println ("El(La) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones para Celulares ? (SI,NO)");
                String proCell = ""; 
                // realizamos la lectura de lo que ngresa el usuario y lo almacenamos en una variable
                ingresoUsuario = new Scanner (System.in); 
                proCell = ingresoUsuario.nextLine ();
                proCell = proCell.toUpperCase();

                // programacion defensiva para poder saber si el programador realiza aplicaciones para celulares
                while (!proCell.equals("NO") && !proCell.equals("SI"))
                {
                    System.out.println ("Ingreso Erroneo");
                    System.out.println ("ingrese Si/No dependiendo si el(la) programador(a) "+ nombreUsuario + " desarrolla Aplicaciones Para Celulares");
                    System.out.println ("Por Favor ingrese si el(la) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones Para Celulares ? (SI,NO)");
                    proCell = ""; 
                    ingresoUsuario = new Scanner (System.in); 
                    proCell = ingresoUsuario.nextLine ();
                    proCell = proCell.toUpperCase();
                }

            // si cada una de las variables es verdadera agregamos al programador al conjunto respectivo
            if (proWeb.equals("SI"))
            { 	
                conjuntoWeb.add(nombreUsuario); 
            }

            if (proCell.equals("SI")){ 	
                conjuntoCelulares.add(nombreUsuario); 
            }

            if (proJava.equals("SI"))
            { 
                conjuntoJava.add(nombreUsuario); 
            } 
        }

        // muestra los programadores que estan en todos los conjuntos (es decir las intersecciones de los 3 conjuntos)
        respuestaTresConjuntos.addAll(conjuntoWeb);
        respuestaTresConjuntos.retainAll(conjuntoCelulares);
        respuestaTresConjuntos.retainAll(conjuntoJava);

        System.out.println("");
        System.out.println("Conjunto de Desarrolladores de las Tres plataformas"+respuestaTresConjuntos);


        //mostramos los programadores que estan tanto en JAVA como en WEB
        respuestaJavaWeb.addAll(conjuntoJava);
        respuestaJavaWeb.removeAll(conjuntoWeb);

        System.out.println("");
        System.out.println("Conjunto de Desarrolladores en Java pero no Web: "+respuestaJavaWeb);

        // mostramos solo los programadores que estan el JAVA
        respuestaJavaNOWeb.addAll(conjuntoWeb);
        respuestaJavaNOWeb.retainAll(conjuntoCelulares);
        respuestaJavaNOWeb.removeAll(conjuntoJava);

        System.out.println("");
        System.out.println("Conjunto de Desarrolladores en Java pero no Web: "+respuestaJavaNOWeb);

        // mostramos todos lo que no se encuentran en java
        respuestaWebCEL.addAll(conjuntoCelulares);
        respuestaWebCEL.addAll(conjuntoWeb);
        respuestaWebCEL.removeAll(conjuntoJava);

        System.out.println("");
        System.out.println("Conjunto de Desarrolladores en web o celulares, pero no en java: "+respuestaWebCEL);

        // bandera para saber si el conjunto WEB esta dentro del conjunto java 
        boolean contiene= conjuntoJava.containsAll(conjuntoWeb);

        if (contiene==true)
        {
            System.out.println("");
            System.out.println(" El conjunto de desarrolladores Java Si es un subconjunto de Desarrolladores Web");
        }
        
        else
        {
            System.out.println("");
            System.out.println(" El conjunto de desarrolladores Java NO es un subconjunto de Desarrolladores Web");
        }
        // variables que nos ayudan a saber en que conjunto hay mas programadores
        int largojava= conjuntoJava.size();
        int largoCell= conjuntoCelulares.size();
        int largoWeb= conjuntoWeb.size();
        String varia="";

        // condicionales para comparar la cantidad de elementos en cada uno de ls conjuntos
        if (largojava>largoCell && largojava>largoWeb)
        {
            System.out.println("");
            System.out.println("La plataforma java es el conjunto que mayor cantidad de desarrolladores posee"+ conjuntoJava);
            respuestaTodo.addAll(conjuntoJava);
            varia="Java";
        }

        if (largoCell>largojava && largoCell> largoWeb)
        {
            System.out.println("");
            System.out.println("La plataforma Celular es el conjunto que mayor cantidad de desarrolladores posee"+ conjuntoCelulares);
            respuestaTodo.addAll(conjuntoCelulares);
            varia="Celular";
        }

        else
        {
            System.out.println("");
            System.out.println("La plataforma WEB es el conjunto que mayor cantidad de desarrolladores posee"+ conjuntoWeb);
            respuestaTodo.addAll(conjuntoWeb);
            varia= "WEB";
        }
        // mostramos a todos los programadores 
        Set ordenAsc= new TreeSet(respuestaTodo);
        System.out.println("");
        System.out.println("El conjunto de desarrolladores es: "+varia+" "+ ordenAsc);
    }
}