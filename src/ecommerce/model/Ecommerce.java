package ecommerce.model;

public class Ecommerce {
	
	private int numero;
	private int quantidade;
	private String nome;
	private float preco;

	public Ecommerce(int numero, int quantidade, String nome, float preco) {
		this.numero = numero;
		this.quantidade = quantidade;
		this.nome = nome;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}




	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}


	public void visualizar() {

		
	System.out.println("\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
	System.out.println("Dados do produto:");
	System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
	System.out.println("ID do produto: " + this.numero);
	System.out.println("Nome do produto: " + this.nome);
	System.out.println("Quantidade do produto: " + this.quantidade);
	System.out.println("Valor unitário: " + this.preco);
	
	}
}
