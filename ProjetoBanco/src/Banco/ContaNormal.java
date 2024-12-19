package Banco;

public class ContaNormal extends Conta {

	 public void creditar (double valor) {
	 saldo = saldo + valor;
	 }

	 public void debitar (double valor) {
	 if ((saldo-valor) >= 0) {
	 saldo = saldo - valor;
	 }
	 }
}
