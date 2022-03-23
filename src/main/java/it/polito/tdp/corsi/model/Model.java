package it.polito.tdp.corsi.model;
import java.util.*;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	//Controller chiama il modello che a sua volta chiama il DAO, devo creare un riferimento al DAO
	private CorsoDAO corsoDao;
	public Model () {
		this.corsoDao= new CorsoDAO();
	}
	public List <Corso> getCorsiByPeriodo (int periodo) {
		return this.corsoDao.getCorsiByPeriodo(periodo);
	}
	
}
