package capitulo9tratamentoExcecoes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RWData {
	public static void main(String[] args) {
		int i = 10;
		double d = 1023.56;
		boolean b = true;

		// Grava alguns valores
		try (DataOutputStream dataout = new DataOutputStream(new FileOutputStream("testData"))) {
			System.out.println("Writing " + i);
			dataout.writeInt(i);

			System.out.println("Writing " + d);
			dataout.writeDouble(d);

			System.out.println("Writing " + b);
			dataout.writeBoolean(b);

			System.out.println("Writing " + 12.2 * 7.4);
			dataout.writeDouble(12.2 * 7.4);

		} catch (IOException exc) {
			System.out.println("Write error...");
			return;
		}

		System.out.println();

		// Agora os lÊ
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testData"))) {

			i = dataIn.readInt();
			System.out.println("Reading " + i);

			d = dataIn.readDouble();
			System.out.println("Reading " + d);

			b = dataIn.readBoolean();
			System.out.println("Reading " + b);

			d = dataIn.readDouble();
			System.out.println("Reading " + d);

		} catch (IOException exc) {
			System.out.println("Read error.");
		}
	}
}
