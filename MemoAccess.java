package memo.access;

import java.util.ArrayList;

import memo.model.Memo;

public interface MemoAccess {
	public void insert(Memo memo);
	public void update(Memo memo);
	public void delete(String content);
	public ArrayList<Memo> selectAll();
	public Memo SelectOne(String Title); //제목으로 조회
	public Memo dateSearch(String date);
	public Memo contentSearch(String content);
	
	
	
	

}
