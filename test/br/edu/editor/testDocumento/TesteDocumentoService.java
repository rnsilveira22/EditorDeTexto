
package br.edu.editor.testDocumento;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
		
	
		//ação
		DocumentoService docServ = new DocumentoService();
		Documento docFinal = docServ.salvar(doc);
		
		
		// teste
		assertNotNull(docFinal);
		assertEquals(docFinal.getTitulo(), doc.getTitulo());
		
		
	}
	@Test
	public void esperadoListaTodosDocumentos() {
		//cenario
		ArrayList<Documento> documentos = new ArrayList<>();
		Documento doc1 = new Documento();
		doc1.setId((long)1);
		doc1.setTitulo("texto titulo pequeno");
		doc1.setCorpo("Corpo texto pequeno");
		doc1.setData("2019-01-22 18:32:00");
		
		Documento doc = new Documento();
		doc.setId((long)2);
		doc.setTitulo("texto titulo grande 123456487979/*");
		doc.setCorpo("Corpo texto grande312111131321321 ");
		doc.setData("2019-01-22 15:33:00");
		
//		documentos.add(doc);
		documentos.add(doc1);
		
				
		//acao
		
		DocumentoService docServ = new DocumentoService();
		docServ.listar(documentos);
		
		
		//teste
		
		assertEquals(0,documentos.size());
	}
	

}
