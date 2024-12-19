package Banco;


class Banco {
    public static void main(String args[]) {
        Conta c1;
        c1 = new ContaNormal();
        c1.setNumero("1654-3");
        c1.setSaldo(500);
        
        ContaDebEspecial c2 = new ContaDebEspecial();
        ContaDebEspecial c3 = new ContaDebEspecial("4067-6", 2500, 5050);
        
        c2.setNumero("4067-6");
        c2.setSaldo(2500);
        c2.setLimite(1000.67);
        
        System.out.println("A conta número " + c1.getNumero() + " possui saldo " + c1.getSaldo());
        c1.creditar(1000);
        System.out.println("Após o crédito de R$ 1000,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());
        
        c1.debitar(100);
        System.out.println("Após o débito de R$ 100,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());
        
        System.out.println("");
        System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo());
        
        c2.debitar(500);
        System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " Após débito de R$ 500,00");
        
        c2.setLimite(10000);
        System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " e novo Limite de " + c2.getLimite());
        
        ContaEstudantil c4 = new ContaEstudantil();
    	c4.setNumero(new String("3214-5"));
    	c4.setSaldo(700);
    	System.out.println("");
    	System.out.println("A conta número " + c4.getNumero() + " possui saldo " + c4.getSaldo());
    	c4.creditar(2000);
    	System.out.println("Após o credito de R$ 2000,00, a conta número " + c4.getNumero() + " passou a ter saldo " + c4.getSaldo());
    	
    	c4.setEmprestimo(450);
    	c4.debitar(450);
        System.out.println("Após debitar o empréstimo, a conta número " + c4.getNumero() + " passou a ter saldo " + c4.getSaldo());
        
    	}
}
