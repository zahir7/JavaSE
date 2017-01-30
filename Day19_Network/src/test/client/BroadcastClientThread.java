package test.client;

import java.io.IOException;

public class BroadcastClientThread extends Thread{
	private BroadcastClient bc;
	public BroadcastClientThread(BroadcastClient bc) {
		this.bc = bc;
	}
	public void run(){
		boolean isStop = false;
		while(!isStop){  
			try {
				//server => client
				//msg�� �ΰ��� ����
				//1. 1#id#message => �Ϲݸ޼���
				//2. 2#id         => ����޼���
				String msg = bc.getBufferedReader().readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("0")){
					//���Ӹ޼���
					if(!temp[1].equals(bc.getId())){
						//�������� ���� ���̵�(temp[1])�� JFrame�� �ִ� ���̵�
						//��ġ���� �ʴ� ��쿡�� �޼����� ����Ѵ�.��, �ڱ��ڽ� 
						//JFrame���� �޼����� ������� ����.
						bc.getJTextArea().append(
								temp[1]+" ���� �����Ͽ����ϴ�."+
								System.getProperty("line.separator"));
							//JTextArea�� ��ũ�� ������ ���.
							bc.getJTextArea().setCaretPosition(
						bc.getJTextArea().getDocument().getLength());
					}
				}else if(temp[0].equals("1")){
					//�Ϲ� �޼���
					//JTextArea�� �������� ���� �޼��� ���
					bc.getJTextArea().append(
						temp[1]+" : "+temp[2]+
						System.getProperty("line.separator"));
					//JTextArea�� ��ũ�� ������ ���.
					bc.getJTextArea().setCaretPosition(
						bc.getJTextArea().getDocument().getLength());
				}else if(temp[0].equals("2")){
					
					if(temp[1].equals(bc.getId())){
						//���� �޼���
						//������ ����
						isStop = true;
						
					}else{
						bc.getJTextArea().append(
								temp[1]+" ���� �����ϼ̽��ϴ�."+
								System.getProperty("line.separator"));
							//JTextArea�� ��ũ�� ������ ���.
							bc.getJTextArea().setCaretPosition(
						bc.getJTextArea().getDocument().getLength());
					}
					
					
				}else if(temp[0].equals("3")){
					//3#id1,id2,id3,id4,....
					//temp[0] => 3
					//temp[1] => id1,id2,id3,id4,....
					String[] listMember = temp[1].split(",");
					bc.getJlist().setListData(listMember);
				}
			} catch (IOException e) {
				isStop = true;
				
			}
		}//end while
		
		//Socket�� IO ����
		bc.closeAll();
		//���α׷� ����
		bc.exit();
		
	}//end run
}

