	
public class Conta2 {
	private String titular;
	protected int numero;
	protected String agencia;
	private double saldo;
	protected Data dtAbertura;
	private double limite;
	private static int totalDeContas =0 ;
	
	Conta2(){
		Conta2.totalDeContas = totalDeContas +1; 
	}
	Conta2(int numero, String titular){
		this.titular = titular;
		this.numero = numero;
		Conta2.totalDeContas = totalDeContas +1; 
	}
	public static int getTotalDeContas() {
		return Conta2.totalDeContas;
	}
	public void sacar(double valorSaque) {
		if (valorSaque > this.saldo) {
			System.out.println("Nao pode sacar.");
		}else {
			this.saldo = this.saldo - valorSaque;
		}
	}
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	// getter and stters
	public String getTitular() {
		return titular;
	}
public int getNumero() {
	return numero;
}
	// fim
	protected void deposita(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	double CalculaRendimento() {
		return this.saldo * 0.1;
	}
	
	public String RecuperaDadosDaImpressao() {
		String dados = "Titular: " + this.getTitular();
		dados += "\n Numero: " + this.getNumero();
		dados += "\n Agencia: " + this.agencia;
		dados += "\n Saldo: " + this.getSaldo();
		dados += "\n data abertura: " + this.dtAbertura.DtFormatada();
		dados +=  "\n Rendimento " + CalculaRendimento();
		dados +=  "\n Total Contas " + getTotalDeContas();
		return dados;
	}
}
