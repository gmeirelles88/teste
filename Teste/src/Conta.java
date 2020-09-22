
public class Conta {

	int numeroConta;
	String nomeTitular;	
	int saldo;
	
	public void Conta(String nomeTitular, int numeroConta, int saldo) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public double Deposita(double valorAdicional) {
		this.saldo += valorAdicional;
		return saldo;
	}
	
}
