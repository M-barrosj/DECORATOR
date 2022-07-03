package AssinaturaDeStream;

public class app {

	public static void main(String[] args) {
		
		Assinatura assinaturaCompleta = new Pacote5(new Pacote4(new Pacote3(new Pacote2(new Pacote1(new AssinaturaBasica())))));
		assinaturaCompleta.adicionarServico();
		
		Assinatura assinaturaBasica = new AssinaturaBasica();
		assinaturaBasica.adicionarServico();
		
		Assinatura assinaturaComPacote5 = new Pacote5(assinaturaBasica);
		assinaturaComPacote5.adicionarServico();
		

	}

}
