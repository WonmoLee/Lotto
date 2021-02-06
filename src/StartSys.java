

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class StartSys extends JFrame {
	
	private JPanel panel;
	private JLabel lottoLabel;
	private JButton NumSelectBt;
	private ImageIcon img;
	
	//생성자
	public StartSys() {
		//view
		init();
		
		//번호뽑기 창 열기
		NumSelectBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NumSelect();
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
		
		img = new ImageIcon(getClass().getClassLoader().getResource("lotto.png"));
		lottoLabel = new JLabel(img);
		lottoLabel.setFont(new Font("굴림", Font.BOLD, 46));
		lottoLabel.setBounds(107, 62, 462, 121);
		lottoLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lottoLabel);
		
		NumSelectBt = new JButton("번호뽑기");
		NumSelectBt.setFont(new Font("굴림", Font.PLAIN, 33));
		NumSelectBt.setBounds(224, 257, 237, 160);
		panel.add(NumSelectBt);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Lotto");
		setSize(700,530);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new StartSys();
	}
}
