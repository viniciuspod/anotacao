package exemplo;


/**
 * 
 * @author vinicius.dantas
 *
 */

// anotaçao é uma orientação para o programa

public class Conta {
	
	private String titular;
	protected String saldo;
	private String agencia;
	private String numero;
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
