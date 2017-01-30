package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// c:\\naver.txt ������ �б����� ��ü(FileInputStream)
			// �� �����Ѵ�.
			fis = new FileInputStream("C://workKH//KH//src//kh//study03//testIo1.txt");

			// FileOutputStream ��ü ������ �Ű������� �ݵ�� ��ΰ�
			// �����ؾ� ��. ���� ��ΰ� �����ϸ� FileOutputStream ��ü
			// ������ naver1.txt ���ϵ� �������.

			fos = new FileOutputStream("C://workKH//KH//src//kh//study02//testIo1.txt");

			// 1byte read => 1 byte write

//			int readByte = 0;
//			// fis.read() => ���� �Է� ��Ʈ���� 1 byte�� ���� ��
//			// �� �̻� ���� ����Ʈ�� ������ -1�� ��ȯ�Ѵ�.
//			while ((readByte = fis.read()) != -1) {
//				// fos.write => ���� ��� ��Ʈ���� 1 byte ����
//				fos.write(readByte);
//			}

			int readByteCnt = 0;
			byte[] b = new byte[3];
			// fis.read(b) => b���� ��ŭ �о ���� ����Ʈ�� b�� ����
			// ��ȯ���� ���� ����Ʈ ��
			while ((readByteCnt = fis.read(b)) != -1) {
				// fos.write(b,0,readByteCnt) b�� ����� ����Ʈ��
				// 0���� readByteCnt ��ŭ ����
				fos.write(b, 0, readByteCnt);
				System.out.print(new String(b, 0, readByteCnt));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// IO�� �ݵ�� close() �ؾ� ��.
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		System.out.println("����Ϸ�");

	}
}
