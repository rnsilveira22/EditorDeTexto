package br.edu.editor.dao;

import java.sql.Connection;
import java.util.ArrayList;

import br.edu.editor.model.Documento;

public class DocumentoDao {
	
	public Documento salvar(Documento documento) {
		Connection con = null;
		
		return documento;
	}
	public Documento atulizar(Documento documento) {
		return documento;
	}
	public void excluir(Documento documento) {
		
	}
	public ArrayList<Documento> listarTodos() {
		ArrayList<Documento> documentos = new ArrayList<>();
		return documentos;
	}
	public ArrayList<Documento> buscarPorTitulo(Documento documento){
		ArrayList<Documento> documentos = new ArrayList<>();
		return documentos;
	}
	public Documento buscarPorId(Documento documento){
		return documento;
	}
}
