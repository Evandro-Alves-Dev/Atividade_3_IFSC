package cadastros;

import java.util.Scanner;
import java.util.Random;

public class Produtos {
	
	private String descricao;
	private int codigo;
	private float peso;
	private float valor;
	
	public void cadastrar() {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Descri��o: ");
		this.setDescricao(scan1.nextLine());		
		Random codigo = new Random();
		for (int i = 0; i < 100; i++) {
			this.setCodigo(codigo.nextInt(100));
		}		
		Scanner scan3 = new Scanner(System.in);
		System.out.print("Peso: ");
		this.setPeso(scan3.nextFloat());
		Scanner scan4 = new Scanner(System.in);
		System.out.print("Valor: ");
		this.setValor(scan4.nextFloat());		
	}
	
	public void imprimir() {
		System.out.println("Descri��o " + getDescricao());
		System.out.println("C�digo interno " + getCodigo());
		System.out.println("Peso " + getPeso());
		System.out.println("Valor R$ " + getValor());		
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}	

}
