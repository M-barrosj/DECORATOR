package AssinaturaDeStream;

public class Pacote1 extends AssinaturaDecorator{

	public Pacote1(Assinatura assinatura) {
		super(assinatura);
		
	}
	
	@Override
	public void adicionarServico() {
		super.adicionarServico();
		System.out.println("Voc� adicionol o pacote 1 a sua assinatura (Assistir v�deos em v�rios dispositivos R$19,99).");
	}
	

}
