package AssinaturaDeStream;

public class Pacote1 extends AssinaturaDecorator{

	public Pacote1(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Você adicionol o pacote 1 a sua assinatura (Assistir vídeos em vários dispositivos R$19,99).");
	}
	

}
