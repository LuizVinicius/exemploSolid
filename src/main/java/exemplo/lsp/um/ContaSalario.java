package exemplo.lsp.um;

public class ContaSalario extends ContaCorrenteComum {
	
	public void rende() {
        throw new Exception("Essa conta não possui rendimento");
  }
  
}