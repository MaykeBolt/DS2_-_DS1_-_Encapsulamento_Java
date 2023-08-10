package model;

public class Pessoa {

	//Create private variables.
	private String nome;
	private int idade;
	
	//Necessary?
	private String cargo;
	
	//Constructor.
	public Pessoa(String nome, int idade, String cargo) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
	}
	
	//Create a public method "getNome" to return the variable "Nome". 
	//It will return the private variable nome as public.
	public String getNome() {
		return nome;
	}
	
	//Create a public method "getIdade" to return the variable "Idade".
	public int getIdade() {
		return idade;
	}
	
	//Necessary?
	public String getCargo() {
		return cargo;
	}
	
	//Encapsulation to allow name changing only when having the age of 18 or above.
	public void setNome(String nome) throws Exception {
		System.out.println("Encapsulamento funcionando...");
		
		if (this.idade >= 18) {
			this.nome = nome;
		}
		else {
			throw new Exception();
		}
	}
}
