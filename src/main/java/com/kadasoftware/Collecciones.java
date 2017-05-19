package com.kadasoftware;

import java.util.*;

import static java.util.Arrays.asList;

public class Collecciones {

    public void prueba(){
//        ArrayList <String> personas = new ArrayList<>(asList);

        Map<String, String> mapaA = new HashMap<>();
        mapaA.put("nombre", "Ana");

        Persona personaA =  new Persona();
        personaA.setName("Jose");

        Persona personaB = new Persona();
        personaB.setName("Andres");

        Map<String, Persona> mapaB = new HashMap<>();

//        mapaA.forEach((k,v) -> );
    }

    public   void probarList() {
        List<String> list = new ArrayList<>();
        list.add("Bote");
        list.add("Kada");
        list.add("Utm");

        for (String elemento : list) {
            if (Character.isLowerCase(elemento.charAt(0))) {
                list.remove(elemento);
            }
        }

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String elemento = iterator.next();

        }
    }

    public void probarSet(){
        Set<String> set = new HashSet<>();

        set.add("Uno");
        set.add("dos");
        set.add("Tres");
        set.add("Bote");
        set.add("calabaza");

        for (String elemento : set ){
            System.out.println(elemento);
        }
    }

    public void otroMapa() {



        Map<String, String> mapa = new TreeMap<>();

        Map<Persona, String> otroMapa = new TreeMap<>( new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        otroMapa.put(new Persona("Luis", 51 ),"develop");
        otroMapa.put(new Persona("Peja", 70),"lantas");
        otroMapa.put(new Persona("Salinas", 73),"autopista");
        otroMapa.put(new Persona("Comanche", 59),"tulum");

        Map<String, String> newMap = new TreeMap<>();

        System.out.println(otroMapa);
    }
}
