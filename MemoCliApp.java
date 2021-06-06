package memo.view;

import java.util.ArrayList;

import memo.access.MemoList;
import memo.access.ScannerUtil;
import memo.model.Memo;

public class MemoCliApp {
	MemoList m = new MemoList();
	

	
	public void start() {
		int num;
		do {
			menuTitle();
			num = ScannerUtil.readInt();
			switch(num){
				case 1 : insert(); break;
				case 2 : update(); break;
				case 3 : delete(); break;
				case 4 : selectAll(); break;
				case 5 : selectOne(); break;
				case 6 : dateSearch(); break;
				case 7 : contentSearch(); break;
			}
		}while (num != 0);
	}
	
	


	private void insert() {
		Memo me = ScannerUtil.readMemo();
		m.insert(me);
		
	}
	
	private void update() {
		Memo me = new Memo();
		me.getDate();
		me.setDate(ScannerUtil.readStr());
		m.update(me);
	}
	
	private void delete() {
		String content = ScannerUtil.readStr();
		m.delete(content);
	}
	
	private void selectAll() {
		ArrayList<Memo> list = m.selectAll();
		for(Memo memo : list) {
			System.out.println(memo);
		}
	}
	
	private void selectOne() {
		String Title = ScannerUtil.readStr();
		Memo memo = m.SelectOne(Title);
		System.out.println(memo);
	}
	
	private void dateSearch() {
		String date = ScannerUtil.readStr();
		Memo memo = m.dateSearch(date);
		System.out.println(memo);
	}


	private void contentSearch() {
		String content = ScannerUtil.readStr();
		Memo memo = m.SelectOne(content);
		System.out.println(memo);		
	}

	private void menuTitle() {
		System.out.println("==메모관리=");
		System.out.println("=1. 메모추가=");
		System.out.println("=2. 메모수정=");
		System.out.println("=3. 메모삭제=");
		System.out.println("=4. 전체조회=");
		System.out.println("=5. 제목으로조회=");
		System.out.println("=6. 날짜로조회=");
		System.out.println("=7. 내용으로조회=");
		System.out.println("=0.종료=");
	}

}
