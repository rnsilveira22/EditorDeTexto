package br.edu.editor.service;

import br.edu.editor.model.Documento;

public class DocumentoService {

	private void validaTitulo(Documento documento) {
		if (documento.getTitulo() == null || documento.getTitulo().isEmpty() || documento.getTitulo().length() > 50) {
			throw new RuntimeException("Titulo do Documento inválido!");
		}
	}

	private void validaCorpo(Documento documento) {
		if (documento.getCorpo() == null || documento.getCorpo().isEmpty() || documento.getCorpo().length() > 500) {
			throw new RuntimeException("Corpo do Documento inválido!");
		}
	}

	private void validaDocumentoComId(Documento documento) {

		if (documento.getId() != null) {
			throw new RuntimeException("Já exite um documento com esse ID.");
		}

	}
	private void validaDocumentoSemId(Documento documento) {
		if(documento.getId()==null) {
			throw new RuntimeException("Esperado um Id valido.");
		}
	}

	public Documento salvar(Documento documento) {
		validaDocumentoComId(documento);
		validaTitulo(documento);
		validaCorpo(documento);

		return documento;

	}

	public Documento atualizar(Documento documento) {
		validaDocumentoSemId(documento);
		validaTitulo(documento);
		validaCorpo(documento);
		return documento;
	}

}
