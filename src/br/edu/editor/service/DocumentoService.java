package br.edu.editor.service;

import br.edu.editor.model.Documento;

public class DocumentoService {
	
	private boolean validaTitulo (String titulo){
		if (titulo == null ||titulo==""||titulo.length()>50) {
			System.out.println("Titulo Invalido");
			return false;
		}
		return true;
	}
	private boolean validaCorpo (String corpo){
		if (corpo == null ||corpo==""||corpo.length()>500) {
			System.out.println("Corpo Invalido");
			return false;
		}

		return true;
	}
	
	public Documento salvar(Documento doc) {
		if(validaTitulo(doc.getTitulo())== true && validaCorpo(doc.getCorpo())== true){
			
			return doc;
		}
		return null;
	}

}
