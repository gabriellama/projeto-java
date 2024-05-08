package ecommerce.repository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository {

	// CRUD 
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Ecommerce ecommerce);
	public void atualizar(Ecommerce ecommerce);
	public void deletar(int numero);
	
	// metodos
	public void retirar(int numero, int valor);
	public void colocar(int numero, int valor);

	
}
