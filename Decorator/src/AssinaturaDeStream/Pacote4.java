package AssinaturaDeStream;

public class Pacote4 extends AssinaturaDecorator{

	public Pacote4(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Voc� adicionol o pacote 4 a sua assinatura (Cart�o de cr�dito Platinum R$49,99).");
	}

}
