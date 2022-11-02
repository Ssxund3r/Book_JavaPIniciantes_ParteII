package capitulo9tratamentoExcecoes;

/**
 * Esta variaçaõ encapsula o código que abre
 * e acessa o arquivo dentro do mesmo bloco try.
 * O arquivo é fechado pelo bloco finally.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileVTwo {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;

		// Primeiro confirma se um nome de arquivo foi especificado.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile fileName");
			return;
		}
		/**
		 * A seguir abre um arquivo, lÊ caracteres até EOF ser alcançado e então fecha o
		 * arquivo via um bloco finally.
		 */
		try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if (i != -1)
					System.out.println((char) i);
			} while (i != -1);

		} catch (FileNotFoundException exc) {
			System.out.println("File Not Found");
		} catch (IOException exc) {
			System.out.println("An I/O Error Occured");
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing File.");
			}
		}
	}
}
