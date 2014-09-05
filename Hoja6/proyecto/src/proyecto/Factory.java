/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

/**
 *
 * @author Esteban
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet; 

public class Factory 
{
    //clase factory, para elelegir las implimentaciones a usar
    public Set<E> getImplementacion(String tipo)
    { //recibe el dato de la implementacion elegida por el usuario
        if (tipo.equals("hashset"))
        { //se compara la eleccion hecha por el usuario
            return new HashSet<E>(); //se envia la implementacion
        }

        if (tipo.equals("treeset"))
        { //se se compara la eleccion hecha por el usuario
            return new TreeSet<E>(); //se envia la implementacion
        }

        if (tipo.equals("linkedhashset"))
        { //se se compara la eleccion hecha por el usuario
            return new LinkedHashSet<E>(); //se envia la implementacion
        }

        return null;
    }
}
