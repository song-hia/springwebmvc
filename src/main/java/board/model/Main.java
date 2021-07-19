package board.model;

import java.util.List;

import board.dao.BoardDAO;

public class Main {

	public static void main(String[] args) {
		BoardDAO dao=new BoardDAO();
		/*
		BoardVO board=new BoardVO();
		board.setTitle("제목11");
		board.setContent("conten10");
		board.setWriteId("id5");
		board.setWriteName("이름5");
		int result=dao.insert(board);
		System.out.println(result);
		*/
		//dao.list(1);
		
		//new BoardDAO().list(1);
		//list 출력
		List<BoardVO> list=dao.select();
		for(BoardVO b:list) {
			System.out.println(b);
		}
	}

}
