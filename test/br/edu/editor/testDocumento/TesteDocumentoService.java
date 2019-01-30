
package br.edu.editor.testDocumento;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.editor.model.Documento;
import br.edu.editor.service.DocumentoService;

public class TesteDocumentoService {
	
	@Test
	public void esperadoDocumentoValidoParaSalvar() {
		// cenário
		Documento doc = new Documento();
		doc.setId((long)1);
		doc.setTitulo("texto titulo pequeno");
		doc.setCorpo("Corpo texto pequeno");
		doc.setData("2019-01-22 18:32:00");
		
	//gfkgfjgkjfgsdflgjsdfgjsdjglsdfjg
		//ação
		DocumentoService docServ = new DocumentoService();
		Documento docFinal = docServ.salvar(doc);
		
		
		// teste
		assertNotNull(docFinal);
		assertEquals(docFinal.getTitulo(), doc.getTitulo());
		
		
	}
	

}
