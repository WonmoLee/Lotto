package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NumSelect extends JFrame {
	
	private JPanel panel;
	private JButton ReSelectBt;
	private JTextField tfArr[];
	
	public NumSelect() {
		//view
		init();
		
		//번호생성 및 바인딩
		select();
		
		//번호 재생성
		ReSelectBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reSelect();
			}
		});
	}
	
	//view
	private void init() {
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 684, 530);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		tfArr = new JTextField[6];
		for (int i = 0; i < tfArr.length; i++) {
			tfArr[i] = new JTextField();
			tfArr[i].setEditable(false);
			tfArr[i].setFont(new Font("굴림", Font.BOLD, 24));
			tfArr[i].setBounds(26 + i * 110, 107, 78, 63);
			tfArr[i].setHorizontalAlignment(JTextField.CENTER);
			panel.add(tfArr[i]);
		}
		
		ReSelectBt = new JButton("다시뽑기");
		ReSelectBt.setFont(new Font("굴림", Font.PLAIN, 33));
		ReSelectBt.setBounds(224, 257, 237, 160);
		panel.add(ReSelectBt);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Lotto");
		setSize(700,530);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	//번호생성
	private void select() {
		Random random = new Random();
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;
			tfArr[i].setText(String.valueOf(arr[i]));
			
			//중복처리
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
	}
	
	//번호 재생성
	private void reSelect() {
		Random random = new Random();
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;
			tfArr[i].setText(String.valueOf(arr[i]));
			
			//중복처리
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
	}
}
