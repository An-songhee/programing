package jj01;
import java.util.*;
public class kwave {

		public static void main(String[] args) {
			// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
			Map<String, String> dic = new HashMap<String, String>();
			
			// 3 ���� (key, value) ���� dic�� ����
			dic.put("japan", "K-POP���� ���� 2.7���� �Ը�, ���ø����� ���� ���¿�Ŭ��, ����� �ҽ��� ��ǳ"); // "����"�� key, "�ѷ� ��Ȳ"�� value
			dic.put("china", "K-POP�׷� �ٹ� �ִ� ���ŷ�, �������±״�� ���� ġŲ ��ǳ"); 
			dic.put("thai", "�ѱ� ��� �α⸦ ���� ���� ��� ������ũ, �ѱ� �ִ� ���� �û�� 2022 MAMA �±� ���� ����");	
			dic.put("America", "��ȭ '�����' ��ī���� �û�� 4���� ����, ��ź�ҳ�� �̱� �û�� AMA ����, ������ ž �鿡 K-POP�� ��Ʈ��");

			// ���� �Է¹ް� �̿����� value �˻�. "exit" �Է¹����� ����
			Scanner scanner = new Scanner(System.in);
			String[] name= new String[5]; //�Է¹��� ���� ������ �迭
			int count=0; //�迭�� index�� ���� ������ ���� ����
			while(true) {
				
				System.out.print("����� ���� �Է����ּ���"?");
				String eng = scanner.next(); 
			
				
				if(eng.equals("exit")) {
					System.out.println("���ݱ��� �˻��� ���� �����Դϴ�" + name.length );
					System.out.println("�����մϴ�");
					break;}	
				// �ؽøʿ��� 'Ű' eng�� '��' kor �˻�
				String kor = dic.get(eng);
				
				if( kor == null) 
					paint(new notexist()); //�������������� �ش� Ŭ���� ȣ��
					
	
				else { 
					eng = name[count]; //�迭�� ����
					System.out.println(kor); //�ش� ���� ��Ȳ ���
					paint(new lo()); // �ش� Ŭ���� ȣ��
					count = count+1;}	
			

			}}
				
		public static void paint(lo s) {s.show(); } //�� paint�� �˸��� ���� ȣ��
			
	
}
		
