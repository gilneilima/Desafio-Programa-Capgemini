package Questoes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SenhaForte {

	private static final int tamanhoSenhaMinima = 6;
	private static final int tamanhoSenhaMaxima = 8;

	private static final String MODELO_SENHA = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{"
			+ tamanhoSenhaMinima + "," + tamanhoSenhaMaxima + "}$";

	private static final Pattern pattern = Pattern.compile(MODELO_SENHA);

	public static boolean validarSenha(final String senha) {
		Matcher matcher = pattern.matcher(senha);
		if (matcher.matches() == true) {
			System.out.println("Senha validada com Sucesso!");
		}
		return matcher.matches();
	}

	public static String validarTamanho(String senha) {
		if (senha.length() < tamanhoSenhaMinima) {
			int digitos = ((tamanhoSenhaMinima) - (senha.length()));
			System.out.println("Digitos que falta para formar senha mínima: " + digitos);
		}
		return senha;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			boolean senhaValidada;
			do {
				System.out.println("Sua senha deve possuir: \r\n" + "No mínimo 6 caracteres.\r\n"
						+ "No mínimo 1 digito.\r\n" + "No mínimo 1 letra em minúsculo.\r\n"
						+ "No mínimo 1 letra em maiúsculo.\r\n" + "No mínimo 1 caractere especial: !@#$%^&*()-+\r\n");
				System.out.println("Digite sua senha: ");
				String senha = input.nextLine();
				senhaValidada = validarSenha(validarTamanho(senha));
				if (senhaValidada == false) {
					System.err.println("Senha não validada!");
				}
			} while (!senhaValidada == true);
		} catch (Exception e) {
			System.err.println("Senha Inválida");
		} finally {
			input.close();
		}

	}

}
