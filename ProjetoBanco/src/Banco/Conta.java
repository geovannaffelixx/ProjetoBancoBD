package Banco;

abstract public class Conta {
	 protected String numero;
	 protected double saldo;
	 protected String getNumero ( ) {
	 return numero;
	 }

	 protected void setNumero ( String value ) {
	 numero = value;
	 }

	 protected double getSaldo ( ) {
	 return saldo;
	 }
	 protected void setSaldo ( double value ) {
	 saldo = value;
	 }
	 abstract void creditar (double valor);
	 abstract void debitar (double valor);
}
