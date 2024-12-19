package Banco;
public class ContaEstudantil extends ContaNormal {
	 private double emprestimo;
	 public void creditar (double valor) {
	 saldo = saldo + valor;
	 }

	 public void debitar (double valor) {
	 if ((saldo-valor+emprestimo) >= 0) {
	 saldo = saldo - valor;
	    }
	 }
	
	 
public void setEmprestimo(double e) {
    emprestimo = e;
}
	
public double getEmprestimo() {
	return emprestimo;
}

}