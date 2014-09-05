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
		System.out.println ("Bienvenido"); 
		System.out.println ("");
		System.out.println ("1.HashSet");
		System.out.println ("2.treeset");
		System.out.println ("3.LinkedHashSet");
		System.out.println ("Por favor introduzca una opcion del menu (1,2,3) dependiendo");
		System.out.println ("la implementacion a usar"); 
		System.out.println ("");
		int setUsuario = 0;
		Scanner ingresoUsuario = new Scanner (System.in); 
		setUsuario = ingresoUsuario.nextInt  ();

		while(setUsuario!=1 && setUsuario!=2 && setUsuario!=3)
		{
			System.out.println ("Ingreso Erroneo, Por Favor ingrese una opcion del menu (1,2,3)");
			System.out.println ("");
			System.out.println ("1.HashSet");
			System.out.println ("2.treeset");
			System.out.println ("3.LinkedHashSet");
			System.out.println ("Por favor introduzca una opcion del menu (1,2,3) dependiendo");
			System.out.println ("la implementacion a usar"); 
			System.out.println ("");
			setUsuario = 0; 
			ingresoUsuario = new Scanner (System.in); 
			setUsuario = ingresoUsuario.nextInt();

		}
		String mandaAFactory = "";
		if (setUsuario==1)
		{
			mandaAFactory = "hashset";
		}
		if (setUsuario==2)
		{
			mandaAFactory = "treeset";
		}
		if (setUsuario==3)
		{
			mandaAFactory = "linkedhashset";
		}
		int contador =0;
		int cantidadDePersonas = 0; 
		while (contador == 0){
		try {
		System.out.println ("Cuantos Programadores ingresara ??"); 

		ingresoUsuario = new Scanner (System.in); 
		cantidadDePersonas = ingresoUsuario.nextInt ();
		contador = 1;

		}
		catch(InputMismatchException e) 
		{ 
			System.out.println ("Ingreso Errono por favor ingrese un numero positivo "); 

			}

			}

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

		int cont=0;
		while (cont<cantidadDePersonas)
		{
			cont=cont+1;
			System.out.println ("Ingrese El nombre del programador numero: "+cont); 
			String nombreUsuario = "";
			ingresoUsuario = new Scanner (System.in); 
			nombreUsuario = ingresoUsuario.nextLine ();
			System.out.println ("El(La) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones WEB ? (SI,NO)");
			String proWeb = ""; 
			ingresoUsuario = new Scanner (System.in); 
			proWeb = ingresoUsuario.nextLine ();
			proWeb = proWeb.toUpperCase();
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
			
			
			System.out.println ("El(La) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones JAVA ? (SI,NO)");
			String proJava = "";
			ingresoUsuario = new Scanner (System.in); 
			proJava = ingresoUsuario.nextLine ();
			proJava = proJava.toUpperCase();
			while (!proJava.equals("NO") && !proJava.equals("SI"))
			{
				System.out.println ("Ingreso Erroneo");
				System.out.println ("ingrese Si/No dependiendo si el(la) programador(a) "+ nombreUsuario + " desarrolla Aplicaciones JAVA.");
				System.out.println ("Por Favor ingrese si el(la) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones JAVA ? (SI,NO)");
				proJava = ""; 
				proJava = ingresoUsuario.nextLine ();
				proJava = proJava.toUpperCase();
			}
			
			
			System.out.println ("El(La) programador(a) " + nombreUsuario + " Desarrolla Aplicaciones para Celulares ? (SI,NO)");
			String proCell = ""; 
			ingresoUsuario = new Scanner (System.in); 
			proCell = ingresoUsuario.nextLine ();
			proCell = proCell.toUpperCase();
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
		
		respuestaTresConjuntos.addAll(conjuntoWeb);
		respuestaTresConjuntos.retainAll(conjuntoCelulares);
		respuestaTresConjuntos.retainAll(conjuntoJava);

		System.out.println("");
		System.out.println("Conjunto de Desarrolladores de las Tres plataformas"+respuestaTresConjuntos);
		

		respuestaJavaWeb.addAll(conjuntoJava);
		respuestaJavaWeb.removeAll(conjuntoWeb);

		System.out.println("");
		System.out.println("Conjunto de Desarrolladores en Java pero no Web: "+respuestaJavaWeb);
		

		respuestaJavaNOWeb.addAll(conjuntoWeb);
		respuestaJavaNOWeb.retainAll(conjuntoCelulares);
		respuestaJavaNOWeb.removeAll(conjuntoJava);

		System.out.println("");
		System.out.println("Conjunto de Desarrolladores en Java pero no Web: "+respuestaJavaNOWeb);
		

		respuestaWebCEL.addAll(conjuntoCelulares);
		respuestaWebCEL.addAll(conjuntoWeb);
		respuestaWebCEL.removeAll(conjuntoJava);

		System.out.println("");
		System.out.println("Conjunto de Desarrolladores en web o celulares, pero no en java: "+respuestaWebCEL);
		

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
		
		int largojava= conjuntoJava.size();
		int largoCell= conjuntoCelulares.size();
		int largoWeb= conjuntoWeb.size();
		String varia="";
		
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
		
		Set ordenAsc= new TreeSet(respuestaTodo);
		System.out.println("");
		System.out.println("El conjunto de desarrolladores es: "+varia+" "+ ordenAsc);
	}
}