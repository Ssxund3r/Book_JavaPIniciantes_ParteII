package capitulo9tratamentoExcecoes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copia um arquivo de texto. Para usar esse programa, especifique o nome do
 * arquivo de origem e do arquivo de destino. Por exemplo, para copiar um
 * arquivo chamado FIRTS.TXT em um arquivo chamado SECOND.TXT, use a linha de
 * comando a seguir.
 * 
 * java CopyFile FIRTS.TXT SECOND.TXT
 */
public class CopyFile {
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;

		// Primeiro verifica se os dois arquvios forma especificados.
		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}

		// Copia um arquivo
		try {
			// Tenta abrir os arquivos....
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);

			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);

		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException exc) {
				System.out.println("Error Closing Input File");
			}
			try {
				if (fout != null)
					fout.close();
			} catch (IOException exc) {
				System.out.println("Error Closing Output File");
			}
		}
	}
}
