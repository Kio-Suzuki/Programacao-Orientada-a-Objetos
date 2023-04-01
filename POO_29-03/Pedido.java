public class Pedido{

	private int quantidade = 0;
	private double preco = 0;

	private SmartPhone sp;


	public Pedido(int quantidade, double preco, SmartPhone sp){
		this.quantidade = quantidade;
		this.preco = preco;
		this.SmartPhone = sp;

	public int getQuantidade(){
		return quantidade;
	}

	public double getPreco(){
		return preco;
	}

	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public SmartPhone

}