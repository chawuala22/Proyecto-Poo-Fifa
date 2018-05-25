package com.example.miguel_rojas.appmundial.Grupo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miguel_rojas.appmundial.R;
import com.example.miguel_rojas.appmundial.fragments.GruposFragment;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by miguel-rojas on 18/05/18.
 */

public class CustomAdapter extends BaseExpandableListAdapter {


    private Context context;
    private ArrayList<String> team;
    private Map<String, ArrayList<String>> mapChil;


    public CustomAdapter(Context context, ArrayList<String> team, Map<String, ArrayList<String>> mapChil) {
        this.context = context;
        this.team = team;
        this.mapChil = mapChil;
    }

    @Override
    public int getGroupCount() {
        return team.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mapChil.get(team.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPositions) {
        return team.get(groupPositions);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mapChil.get(team.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        convertView=LayoutInflater.from(context).inflate(R.layout.activity_teams,null);
        String tituloCategoria =(String) getGroup(groupPosition);
        TextView nameTv =(TextView)convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView)convertView.findViewById(R.id.imageView1);
       /*if(convertView==null){
            convertView=inflater.inflate(R.layout.activity_teams, null);
        }
*/

        String name=tituloCategoria;
        nameTv.setText(name);

        if(name== "Grupo A" ){
            img.setImageResource(R.drawable.a);
        }else if(name == "Grupo B"){
           img.setImageResource(R.drawable.b);
        }else if(name == "Grupo C"){
        img.setImageResource(R.drawable.c);
        }else if(name == "Grupo D"){
            img.setImageResource(R.drawable.d);
        }else if(name == "Grupo E"){
            img.setImageResource(R.drawable.e);
        }else if(name == "Grupo F"){
            img.setImageResource(R.drawable.f);
        }else if(name == "Grupo G"){
            img.setImageResource(R.drawable.g);
        }else if(name == "Grupo H"){
            img.setImageResource(R.drawable.h);
        }

        convertView.setBackgroundColor(Color.DKGRAY);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String child=(String) getChild(groupPosition,childPosition);

        if(convertView==null){
            LayoutInflater infalInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView= infalInflater.inflate(R.layout.activity_equipo, null);
        }

        TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);

        nameTv.setText(child);
        String teamName =getGroup(groupPosition).toString();

        if(teamName == "Grupo A"){

            if(child== "Egipto"){
                img.setImageResource(R.drawable.egipto);
            }else if(child=="Rusia"){
                img.setImageResource(R.drawable.rusia);
            }else if(child=="Arabia Saudita"){
                img.setImageResource(R.drawable.arabia);
            }else if(child== "Uruguay"){
                img.setImageResource(R.drawable.uruguay);
            }

        }else if(teamName == "Grupo B"){

            if(child== "Iran"){
                img.setImageResource(R.drawable.iran);
            }else if(child=="Marruecos"){
                img.setImageResource(R.drawable.marruecos);
            }else if(child=="Portugal"){
                img.setImageResource(R.drawable.portugal);
            }else if(child== "España"){
                img.setImageResource(R.drawable.espana);
            }

        }else if(teamName == "Grupo C"){

        if(child== "Australia"){
            img.setImageResource(R.drawable.australia);
        }else if(child=="Dinamarca"){
            img.setImageResource(R.drawable.dinamarca);
        }else if(child=="Fracia"){
            img.setImageResource(R.drawable.francia);
        }else if(child== "Peru"){
            img.setImageResource(R.drawable.peru);
        }
    }else if(teamName == "Grupo D"){

        if(child== "Argentina"){
            img.setImageResource(R.drawable.argentina);
        }else if(child=="Croacia"){
            img.setImageResource(R.drawable.croacia);
        }else if(child=="Islandia"){
            img.setImageResource(R.drawable.islandia);
        }else if(child== "Nigeria"){
            img.setImageResource(R.drawable.nigeria);
        }
    }else if(teamName == "Grupo E"){

            if(child== "Brasil"){
                img.setImageResource(R.drawable.brasil);
            }else if(child=="Costa Rica"){
                img.setImageResource(R.drawable.costarica);
            }else if(child=="Serbia"){
                img.setImageResource(R.drawable.serbia);
            }else if(child== "Suiza"){
                img.setImageResource(R.drawable.suiza);
            }
    }else if(teamName == "Grupo F"){

            if(child== "Alemania"){
                img.setImageResource(R.drawable.alemania);
            }else if(child=="Corea"){
                img.setImageResource(R.drawable.corea);
            }else if(child=="Mexico"){
                img.setImageResource(R.drawable.mexico);
            }else if(child== "Suecia"){
                img.setImageResource(R.drawable.suecia);
            }
    }else if(teamName == "Grupo G"){

        if(child== "Belgica"){
            img.setImageResource(R.drawable.belgica);
        }else if(child=="Inglaterra"){
            img.setImageResource(R.drawable.inglaterra);
        }else if(child=="Panama"){
            img.setImageResource(R.drawable.panama);
        }else if(child== "Tunez"){
            img.setImageResource(R.drawable.tunez);
        }
    }else if(teamName == "Grupo H"){

        if(child== "Colombia"){
            img.setImageResource(R.drawable.colombia);
        }else if(child=="Japon"){
            img.setImageResource(R.drawable.japon);
        }else if(child=="Polonia"){
            img.setImageResource(R.drawable.polonia);
        }else if(child== "Sengal"){
            img.setImageResource(R.drawable.senegal);
        }
    }

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
