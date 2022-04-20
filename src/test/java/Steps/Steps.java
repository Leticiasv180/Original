package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Ent�o;


public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();
	

	@Dado("^que o usuario acesse a URL \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_URL(String site) throws Throwable {
	    m.executarNavegador(site);
	    m.pausa(1000);
	    
	}
 
	@Dado("^selecione o campo abrir conta$")
	public void selecione_o_campo_abrir_conta() throws Throwable {
	   m.clicar(e.getBtnAbrirConta());
	   m.pausa(1000);
		
	}

	@Dado("^selecione o tipo de pessoa fisica$")
	public void selecione_o_tipo_de_pessoa_fisica() throws Throwable {
	   m.clicar(e.getBtnAbrirContaPf());
	   m.pausa(1000);
	   
	}

	@Dado("^preencha os dados$")
	public void preencha_os_dados() throws Throwable {
		m.preencher(e.getCampoNome(), "teste");
	    m.pausa(1000);
	    m.preencher(e.getCampoTelefone(), "2222222222222");
	    m.pausa(1000);
		m.preencher(e.getCampoEmail(), "leticiasv@outlook.com");
		m.pausa(1000);
		m.preencher(e.getCampoCpf(), "678987667898");
		m.pausa(1000);
		m.clicar(e.getBtnQueroSerCliente());  
		m.pausa(1000);
	}

	@Quando("^selecionar o bot�o quero abrir conta$")
	public void selecionar_o_bot�o_quero_abrir_conta() throws Throwable {
	    m.clicar(e.getBtnQueroSerCliente());
	    m.pausa(1000);
	}

	@Ent�o("^realizo a valida��o do texto falta pouco$")
	public void realizo_a_valida��o_do_texto_falta_pouco() throws Throwable {
		m.validartexto(null, null);
		m.pausa(1000); 
	   
	}


}