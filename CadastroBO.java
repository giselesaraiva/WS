package Model.BO;

import Model.DAO.CadastroDAO;
import Model.VO.UsuarioVO;

public class CadastroBO {

	private CadastroDAO cadastroDao;

	public CadastroBO() {

		cadastroDao = new CadastroDAO();

	}

	public boolean cadastrarUsuario(String nome, String sobrenome, String datanasc, String nomeUsuario, String senha,
			String grauEscola) {

		try {
			
			if (nome.isEmpty() || sobrenome.isEmpty() || datanasc.isEmpty() || nomeUsuario.isEmpty() || senha.isEmpty()
					|| grauEscola.equals("Escolha uma das opções:")) {

				System.out.println(nome);
				System.out.println(sobrenome);
				System.out.println(datanasc);
				System.out.println(nomeUsuario);
				System.out.println(senha);
				System.out.println(grauEscola);
				return false;
			}

			UsuarioVO usuario = new UsuarioVO(nome, sobrenome, datanasc, nomeUsuario, senha, grauEscola);
			cadastroDao.cadastrarUsuario(usuario);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}