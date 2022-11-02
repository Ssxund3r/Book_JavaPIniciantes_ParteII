package capitulo9tratamentoExcecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*Exibe um arquivo de texto. 
 *
 *Para usar este programa, especifique.
 *o nome do arquivo que deseja ver.
 *Por exemplo, para ver um arquivo chamado 
 *TEST.TXT, use a linha de comando abaixo.
 *
 *java showFile TEST.TXT*/
public class ShowFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		int i;
		FileInputStream fin;

		// Primeiro verifica se um arquivo foi especificado.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException exc) {
			System.out.println("File Not Found");
			return;
		}

		try {
			// Lê bytes até o EOF ser alcançado
			do {
				i = fin.read(); // Lê o arquivo
				if (i != -1)
					System.out.println((char) i);
			} while (i != 1);
		} catch (IOException exc) {
			System.out.println("Error reading file.");
		}

		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("Error closing file.");
		}

	}
}
