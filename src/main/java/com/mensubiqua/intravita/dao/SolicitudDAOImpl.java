package com.mensubiqua.intravita.dao;

import com.mensubiqua.intravita.auxiliar.Funciones;
import com.mensubiqua.intravita.model.Publicacion;
import com.mensubiqua.intravita.model.Solicitud;
import com.mensubiqua.intravita.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import java.util.ArrayList;
import java.util.Collection;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component
public class SolicitudDAOImpl implements SolicitudDAO{

    private final String ID = "_id"; //TODO

    public void insert(Solicitud s) {
        DBBroker.get().insertOne(s, "solicitudes");
    }
    
    public void update(String solicitante, String solicitado, boolean aceptado)
    {
    	
    }

    public void delete(String solicitante, String solicitado) {
    	// Se envia una solicitud y hay que eliminar
    	// la solicitud en las que esten los dos usuarios
    	// puede en la posicion que se manda y en la inversa
    }

	public ArrayList<User> findAmigos(String nickname) {
		ArrayList<User> amigos = new ArrayList<User>();
		
		//Busca los usuarios que tienen una solicitud
		// aprobada con el usuario 
		
		
		return amigos;
	}
	
	public boolean isAmigo(String nick1, String nick2)
	{
		//Comprueba si son amigos
		return false;
	}
	
	public boolean isPendiente(String nick1, String nick2)
	{
		//Comprueba si la solicitud esta pendiente de aceptar
		return false;
	}
	
	public ArrayList<User> selectAll(String nick)
	{
		ArrayList<User> solicitudes = new ArrayList<User>();
		//Devuelve todos los usuarios que le han solicitado amistad
		// y todavia no han respondido, o sea, en los que esta en
		// el segundo campo
		
		return solicitudes;
	}

	public int countAmigos(String nickname) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	public int countPendientes(String nickname) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}


}
