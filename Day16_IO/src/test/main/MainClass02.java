package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// c:\\naver.txt 파일을 읽기위한 객체(FileInputStream)
			// 를 생성한다.
			fis = new FileInputStream("C://workKH//KH//src//kh//study03//testIo1.txt");

			// FileOutputStream 객체 생성시 매개변수는 반드시 경로가
			// 존재해야 함. 또한 경로가 존재하면 FileOutputStream 객체
			// 생성시 naver1.txt 파일도 만들어짐.

			fos = new FileOutputStream("C://workKH//KH//src//kh//study02//testIo1.txt");

			// 1byte read => 1 byte write

//			int readByte = 0;
//			// fis.read() => 파일 입력 스트림의 1 byte을 읽은 값
//			// 더 이상 읽을 바이트가 없으면 -1를 반환한다.
//			while ((readByte = fis.read()) != -1) {
//				// fos.write => 파일 출력 스트림의 1 byte 쓰기
//				fos.write(readByte);
//			}

			int readByteCnt = 0;
			byte[] b = new byte[3];
			// fis.read(b) => b길이 만큼 읽어서 읽은 바이트를 b에 저장
			// 반환값은 읽은 바이트 수
			while ((readByteCnt = fis.read(b)) != -1) {
				// fos.write(b,0,readByteCnt) b에 저장된 바이트를
				// 0부터 readByteCnt 만큼 쓰기
				fos.write(b, 0, readByteCnt);
				System.out.print(new String(b, 0, readByteCnt));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// IO는 반드시 close() 해야 함.
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
		System.out.println("실행완료");

	}
}
