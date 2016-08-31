/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt6;
import java.util.*;
/**
 *
 * @author JuanPablo
 */
public class FactorySet {
    public Set crearConjunto(String param){
    Set conjunto = null;
        if (param.equalsIgnoreCase("TreeSet")){
            conjunto = new TreeSet();
        }
        else if (param.equalsIgnoreCase("LinkedSet")){
            conjunto = new LinkedHashSet();
        }
        else if (param.equalsIgnoreCase("HashSet")){
            conjunto = new HashSet();
        }
        return conjunto;
    }
}
