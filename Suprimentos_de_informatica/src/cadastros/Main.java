package cadastros;

public class Main {

	public static void main(String[] args) {
		Clientes cliente = new Clientes();
		//cliente.cadastrar();
		//cliente.imprimir();
		
		Funcionarios funcionarios = new Funcionarios();
		//funcionarios.cadastrar();
		//funcionarios.imprimir();
		
		Fornecedores fornecedor = new Fornecedores();
		//fornecedor.cadastrar();
		//fornecedor.imprimir();
		
		Produtos produto = new Produtos();
		produto.cadastrar();
		produto.imprimir();

	}

}
