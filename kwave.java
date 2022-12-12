package jj01; //원하는 나라를 검색하면 그 나라의 한류 현황을 알 수 있는 프로그램
import java.util.*;
public class kwave {

		public static void main(String[] args) {
			// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
			Map<String, String> dic = new HashMap<String, String>();
			
			// 3 개의 (key, value) 쌍을 dic에 저장
			dic.put("japan", "K-POP음원 시장 2.7조원 규모, 넷플릭스를 통한 이태원클라쓰, 사랑의 불시착 열풍"); // "나라"는 key, "한류 현황"은 value
			dic.put("china", "K-POP그룹 앨범 최대 구매력, 별에서온그대로 인한 치킨 열풍"); 
			dic.put("thai", "한국 드라마 인기를 통한 많은 드라마 리메이크, 한국 최대 음악 시상식 2022 MAMA 태국 개최 예정");	
			dic.put("America", "영화 '기생충' 아카데미 시상식 4관왕 수상, 방탄소년단 미국 시상식 AMA 공연, 빌보드 탑 백에 K-POP곡 차트인");

			// 나라를 입력받고 이에따른 value 검색. "exit" 입력받으면 종료
			Scanner scanner = new Scanner(System.in);
			String[] name= new String[5]; //입력받은 나라를 저장할 배열
			int count=0; //배열에 index에 따른 저장을 위한 숫자
			while(true) {
				
				System.out.print("영어로 나라를 입력해주세요?");
				String eng = scanner.next(); 
			
				
				if(eng.equals("exit")) {
					System.out.println("지금까지 검색한 나라 길이입니다" + name.length );
					System.out.println("종료합니다");
					break;}	
				// 해시맵에서 '키' eng의 '값' kor 검색
				String kor = dic.get(eng);
				
				if( kor == null) 
					paint(new notexist()); //존재하지않으면 해당 클래스 호출
					
	
				else { 
					eng = name[count]; //배열에 저장
					System.out.println(kor); //해당 나라 현황 출력
					paint(new lo()); // 해당 클래스 호출
					count = count+1;}	
			

			}}
				
		public static void paint(lo s) {s.show(); } //각 paint의 알맞은 문구 호출
			
	
}
		
