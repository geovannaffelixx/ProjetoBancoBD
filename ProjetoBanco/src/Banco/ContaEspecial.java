package Banco;

abstract public class ContaEspecial extends Conta {

	 protected double limite;

	 protected void setLimite ( double value ) {
	 limite = value;
	 }

	 protected double getLimite () {
	 return limite;
	 }

	 public void creditar ( double valor) {
	 saldo = saldo + valor;
	 }
}