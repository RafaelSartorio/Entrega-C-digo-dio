public class Conta 
{
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected int agencia = 1;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente)
    {
        this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
    }

    public void sacar(double valor)
    {           
        saldo = saldo - valor;
    }
    public void depositar(double valor)
    {           
        saldo = saldo + valor;
    }
    public void transferencia(double valor, Conta contaDestino )
    {           
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() 
    {
        return agencia;
    }
    public int getConta() 
    {
        return conta;
    }
    
    public double getSaldo() 
    { 
        return saldo;
    }
    
    protected void infoConta()
    {
        System.out.println("Titular" + this.cliente.getNome());
        System.out.println(" Agencia de numero: " + this.agencia);
        System.out.println(" conta de numero: " + this.conta);
        System.out.println(" Saldo disponivelo " + this.saldo);    
    }

}
