
package br.edu.editor.testDocumento;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.editor.model.Documento;
import br.edu.editor.service.DocumentoService;

public class TesteDocumentoService {
	
	// TESTES UNITÁRIOS
	
	@Test (expected = RuntimeException.class)
	public void esperadoRetornarErroTituloInvalido() {
		Documento documento = new Documento();
		documento.setTitulo(null);
		documento.setCorpo("Corpo texto pequeno");
		
		DocumentoService documentoService = new DocumentoService();
		assertEquals("Titulo do Documento inválido!",documento, documentoService.salvar(documento));

	}
	@Test (expected = RuntimeException.class)
	public void esperadoRetornarErroCorpoInvalido() {
		Documento documento = new Documento();
		documento.setTitulo("Meu primeiro documento");
		documento.setCorpo(null);
		
		DocumentoService documentoService = new DocumentoService();
		assertEquals("Corpo do Documento inválido!",documento, documentoService.salvar(documento));
	}
	@Test (expected = RuntimeException.class)
	public void esperadoRetornarErroQuandoDocumentoTiverUmId() {
		Documento documento = new Documento();
		documento.setId(1l);
		documento.setTitulo("Meu primeiro documento");
		documento.setCorpo("Texto do corpo do meu primeiro documento");
		
		DocumentoService documentoService = new DocumentoService();
		assertEquals("Já exite um documento com esse ID.",documento, documentoService.salvar(documento));

	}
	
	@Test(expected=RuntimeException.class)
	public void esperadoRetornarErroQuandoDocumentoNenhumTiverId() {
		
		Documento documento = new Documento();
		documento.setId(null);
		DocumentoService documentoService = new DocumentoService();
		
		assertEquals("Esperado um Id valido.",documento, documentoService.atualizar(documento));
	}
	
	
	// TESTE DE INTEGRAÇÃO MOKADOS
	
//	public void esperadoRetornarErroSeDocumentoForInvalido() {
//		
//	}
//	public void esperadoRetornarListaDeDocumentoSalvos() {
//		
//	}
//	public void esperadoAtualizarDocumentoValido() {
//		
//	}
//	public void esperadoExcluirDocumentoPeloIdValido() {
//		
//	}
//	public void esperadoRetornarListaDocumentoBuscadosPeloTitulo() {
//		
//	}
	

}
