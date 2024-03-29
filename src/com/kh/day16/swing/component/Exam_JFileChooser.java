package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame {
	private JLabel imgLabel; // JLabel : img
	
	public Exam_JFileChooser() {
		imgLabel = new JLabel();
		setTitle("메뉴와 파일Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(imgLabel); // 이미지를 표시하는 JLabel 추가
		createMenu(); // 메뉴 생성
		
		setSize(350, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		// File
		// ㄴ Open
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Open");
		
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int chosen = 
				chooser.showOpenDialog(null); // 내컴퓨터...? 파일 선택창을 띄운다
				
				// FileChooser 동작 시 비정상적인 상태
				if(chosen != JFileChooser.APPROVE_OPTION) { // Approve_option : 정상적으로 선택됐을 때
					// 메세지 출력: 파일 선택 안하셨는데요?
					JOptionPane.showMessageDialog(null,  "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
					return; // 밑에 있는 코드를 실행하면 NullPointerException 발생하기 때문에 종료해준다.
				}
				
				String filePath = chooser.getSelectedFile().getPath(); // 사용자가 선택한 파일 경로 가져옴
				imgLabel.setIcon(new ImageIcon(filePath)); // JLabel에 Image 표시하기
			}
		}); // Open이 클릭되었을 때 동작

		menu.add(item);
		bar.add(menu);

		setJMenuBar(bar);
	}

	public static void main(String[] args) {
		new Exam_JFileChooser();
	}

}
