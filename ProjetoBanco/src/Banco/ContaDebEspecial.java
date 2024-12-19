package Banco;

public class ContaDebEspecial extends ContaEspecial{

	 ContaDebEspecial() {
	 super();
	 }

	 ContaDebEspecial(String n,double s, double l){
	 numero = n;
	saldo = s;
	limite = l;
	 }

	 void debitar (double valor) {
	 if ((limite + saldo - valor) >= 0) {
	 saldo = saldo - valor;
	 }
	 }
}
