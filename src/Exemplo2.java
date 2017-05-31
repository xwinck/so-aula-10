import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(new FileInputStream(FileDescriptor.in));
		
		PrintWriter saida = new PrintWriter(new FileOutputStream(FileDescriptor.out));

		PrintWriter arquivo = new PrintWriter("src\\filmes.txt");
		
		saida.println("Queremos saber seus 4 filmes favoritos");
		saida.flush();
		
		for(int i = 0; i < 4; i++) {
			saida.print("Nome do filme: ");
			saida.flush();
			String nome = entrada.nextLine();
			arquivo.println(nome);
		}
		
		saida.println("Obrigado por participar da pesquisa!");
		saida.println("Os dados foram gravados em src\\filmes.txt");
		saida.flush();
		
		entrada.close();
		saida.close();
		arquivo.close();
	}

}