package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Ecommerce;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Ecommerce> listaProdutos = new ArrayList<Ecommerce>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var ecommerce = buscarNaCollection(numero);
		
		if (ecommerce != null)
			ecommerce.visualizar();
		else
			System.out.println("\nO produto número: " +  numero + " não foi encontrado!");
		
	}

	@Override
	public void listarTodos() {
		for (var ecommerce : listaProdutos) {
			ecommerce.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Ecommerce ecommerce) {
		listaProdutos.add(ecommerce);
		System.out.println("\nO produto de número: " + ecommerce.getNumero() + " foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Ecommerce ecommerce) {
		var buscarProduto = buscarNaCollection(ecommerce.getNumero());
		
		if (buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto), ecommerce);
			System.out.println("\nO produto número: " + ecommerce.getNumero() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto número: " + ecommerce.getNumero() + " não foi econtrado!");
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirar(int numero, int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colocar(int numero, int valor) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}

	public Ecommerce buscarNaCollection(int numero) {
		for (var ecommerce : listaProdutos) {
			if (ecommerce.getNumero() == numero) {
				return ecommerce;
			}
		}
		
		return null;
	}
	
}
