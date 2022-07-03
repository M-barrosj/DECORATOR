package AssinaturaDeStream;

public class Pacote2 extends AssinaturaDecorator{

	public Pacote2(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Voc� adicionol o pacote 2 a sua assinatura (Frete Gr�tis em produtos R$9,99).");
	}

}
