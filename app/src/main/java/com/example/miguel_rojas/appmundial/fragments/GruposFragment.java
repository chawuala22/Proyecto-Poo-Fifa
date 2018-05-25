package com.example.miguel_rojas.appmundial.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miguel_rojas.appmundial.R;


public class GruposFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grupos, container, false);
        // Inflate the layout for this fragment


        return view;

    }




   /* private void cargarDatos(){

        ArrayList<String> grupoA = new ArrayList<>();
        ArrayList<String> grupoB = new ArrayList<>();
        ArrayList<String> grupoC = new ArrayList<>();
        ArrayList<String> grupoD = new ArrayList<>();
        ArrayList<String> grupoE = new ArrayList<>();
        ArrayList<String> grupoF = new ArrayList<>();
        ArrayList<String> grupoG = new ArrayList<>();
        ArrayList<String> grupoH = new ArrayList<>();

        team.add("Grupo A");
        team.add("Grupo B");
        team.add("Grupo C");
        team.add("Grupo D");
        team.add("Grupo E");
        team.add("Grupo F");
        team.add("Grupo G");
        team.add("Grupo H");

        grupoA.add("Egipto");
        grupoA.add("Rusia");
        grupoA.add("Arabia Saudita");
        grupoA.add("Urugay");

        grupoB.add("Iran");
        grupoB.add("Marruecos");
        grupoB.add("Portugal");
        grupoB.add("España");


        grupoC.add("Australia");
        grupoC.add("Dinamarca");
        grupoC.add("Francia");
        grupoC.add("Peru");

        grupoD.add("Argentina");
        grupoD.add("Croacia");
        grupoD.add("Islandia");
        grupoD.add("Nigeria");

        grupoE.add("Brasil");
        grupoE.add("Costa Rica");
        grupoE.add("Serbia");
        grupoE.add("Suiza");


        grupoF.add("Alemania");
        grupoF.add("Corea");
        grupoF.add("Mexico");
        grupoF.add("Suecia");

        grupoG.add("Belgica");
        grupoG.add("Inglaterra");
        grupoG.add("Panama");
        grupoG.add("Tunez");

        grupoH.add("Colombia");
        grupoH.add("Japon");
        grupoH.add("Polonia");
        grupoH.add("Senegal");

        mapChild.put(team.get(0),grupoA);
        mapChild.put(team.get(1),grupoB);
        mapChild.put(team.get(2),grupoC);
        mapChild.put(team.get(3),grupoD);
        mapChild.put(team.get(4),grupoE);
        mapChild.put(team.get(5),grupoF);
        mapChild.put(team.get(6),grupoG);
        mapChild.put(team.get(7),grupoH);

        adapter = new CustomAdapter(this,team,mapChild);
        elv.setAdapter(adapter);

    }*/

}
