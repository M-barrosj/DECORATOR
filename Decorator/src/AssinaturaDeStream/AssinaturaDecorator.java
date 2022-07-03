package AssinaturaDeStream;

public class AssinaturaDecorator implements Assinatura{
	public Assinatura assinatura;
	public AssinaturaDecorator(Assinatura assinatura) {
		this.assinatura = assinatura;
	}
	@Override
	public void adicionarServico() {
		this.assinatura.adicionarServico();
		
	}
	
	

}
