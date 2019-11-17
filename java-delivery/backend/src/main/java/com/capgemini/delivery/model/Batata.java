package com.capgemini.delivery.model;

import java.util.ArrayList;
import java.util.List;

public class Batata extends Produto{
	
	private List<String> ingredientes = new ArrayList<String>();

	public Batata(String titulo, double preco, String obervacao, Tipo tipo, int id, List<String> ingredientes) {
		super(titulo, preco, obervacao, tipo, id);
		
		this.ingredientes = ingredientes;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		return "Batata [ingredientes=" + ingredientes + "]";
	}

	
	
}
