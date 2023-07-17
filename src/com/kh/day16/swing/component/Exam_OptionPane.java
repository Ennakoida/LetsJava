package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_OptionPane extends JFrame{
	
	public Exam_OptionPane() {
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Mypane(), BorderLayout.NORTH);
		
		setSize(500, 200);
		setVisible(true);
	}
	
	private class Mypane extends Panel {
		private JButton inputBtn;
		private JButton confirmBtn;
		private JButton msgBtn;
		private JTextField tf;
		
		public Mypane() {
			setBackground(Color.LIGHT_GRAY);
			
			inputBtn = new JButton("Input Name");
			confirmBtn = new JButton("Confirm");
			msgBtn = new JButton("Message");
			tf = new JTextField(10);
			
			inputBtn.addActionListener(new ActionListener() { // 익명 클래스 사용하는 경우 :	
				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println("Clicked!!"); // 콘솔창에 출력
					String name = 
					JOptionPane.showInputDialog("이름을 입력하세요."); // 화면에 보일 메세지를 적음(prompt)
					
					if(name != null)
						tf.setText(name); // 텍스트필드에 name(입력값) 출력
					
				}
			}); // input버튼 눌리면 동작하도록 함
			
			confirmBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// showConfirmDialog의 return값 -> int 
					int choice = 
					JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "confirm", JOptionPane.YES_NO_OPTION);
					// 패널 / 메세지 / 입력창 타이틀 / 옵션
					
					if(choice == JOptionPane.CLOSED_OPTION) // x로 창 닫았을 때... 
						tf.setText("창을 닫았습니다.");
					if(choice == JOptionPane.YES_OPTION) // choice의 값을 알 필요 없다. YES_Option, No_Option ...
						tf.setText("YES");
					else if(choice == JOptionPane.NO_OPTION)
						tf.setText("NO");
				}
			});
			
			msgBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요", "message", JOptionPane.ERROR_MESSAGE);
				}
			});
			
			add(inputBtn);
			add(confirmBtn);
			add(msgBtn);
			add(tf);
		}
	}
	
	public static void main(String[] args) {
		new Exam_OptionPane();
	}
}
