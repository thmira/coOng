package organizacoes;

import java.util.ArrayList;
import java.util.Scanner;

public class OngDoador extends Organizacao {
	
	ArrayList<OngDoador> organizacaoLista = new ArrayList<OngDoador>();
	Scanner scan = new Scanner(System.in);
	
	public OngDoador() {
	}

	public OngDoador(String nome, String regiao, String contato, int pix, String tipoOng) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setContato(contato);
		this.setPix(pix);
		this.setTipoOng(tipoOng);
	}

	public void adicionarOngsPredefinidas() {
		organizacaoLista.add(new OngDoador("Ceu azul", "Zona norte", "ceuazul@gmail.com", 423432432, "doador"));
		organizacaoLista.add(new OngDoador("Generation","Zona norte","generation@gmail.com",12345678,"doador"));
		organizacaoLista.add(new OngDoador("Campo verde","Zona leste","campoverde@gmail.com",12345678,"doador"));
		organizacaoLista.add(new OngDoador("Campo azul","Zona leste","campoazul@gmail.com",12345678,"doador"));
		organizacaoLista.add(new OngDoador("Florido","Zona sul","florido@gmail.com",12345678,"doador"));
		organizacaoLista.add(new OngDoador("Amor em a��o","Zona sul","amoracao@gmail.com",12345678,"doador"));
		organizacaoLista.add(new OngDoador("Beautiful soul","Zona oeste","beautifulsoul@gmail.com",12345678,"doador"));
		organizacaoLista.add(new OngDoador("Abra�o de m�e","Zona oeste","abracomae@gmail.com",12345678,"doador"));
	}

	@Override
	public String nome() {
		System.out.println();
		return null;
	}

	@Override
	public String regiao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String contato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int pix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String necessidades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "\n______________________________________________\n" + "\nNome da ONG: " + this.getNome() + "\nRegi�o: "
				+ this.getRegiao() + "\nContato: " + this.getContato() + "\nPix: " + this.getPix()
				+ "\n______________________________________________\n\n";
	}

	@Override
	public String definirOng(String regiao) {
		adicionarOngsPredefinidas();
		for(int i = 0; i < organizacaoLista.size(); i++) {
			if (organizacaoLista.get(i).getRegiao().equalsIgnoreCase(regiao)) {
				System.out.println("\n______________________________________________\n" + "\nNome da ONG: "
						+ organizacaoLista.get(i).getNome() + "\nRegi�o: " + organizacaoLista.get(i).getRegiao() + "\nContato: " + organizacaoLista.get(i).getContato()
						+ "\nPix: " + organizacaoLista.get(i).getPix() + "\n______________________________________________\n\n");
			}
		}
		
		System.out.println("\nSelecione uma ONG:");
		String ongSelecionada = scan.nextLine();

		for (int i = 0; i < organizacaoLista.size(); i++) {
			if (organizacaoLista.get(i).getNome().equalsIgnoreCase(ongSelecionada) && organizacaoLista.get(i).getRegiao().equalsIgnoreCase(regiao)) {
				System.out.println("Voc� escolheu a ong: ");
				System.out.println("\n______________________________________________\n" + "\nNome da ONG: "
						+ organizacaoLista.get(i).getNome() + "\nRegi�o: " + organizacaoLista.get(i).getRegiao() + "\nContato: " + organizacaoLista.get(i).getContato()
						+ "\nPix: " + organizacaoLista.get(i).getPix() + "\n______________________________________________\n\n");
				System.out.println("\nMuito obrigado pela doa��o para ong " + organizacaoLista.get(i).getNome() + "!");
				return organizacaoLista.get(i).getNome();
			}
		}
		return "Ong selecionada incorretamente";
	}
}
