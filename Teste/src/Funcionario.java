
public abstract class Funcionario {
	/*
	 * protected String nome; protected String cpf; protected double salario;
	 * 
	 * public double getBonificacao() { return this.salario = this.salario * 0.10 +
	 * 100; }
	 */
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public abstract double getBonificacao() ;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
