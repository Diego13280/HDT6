
package proyecto;

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