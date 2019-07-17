package computer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Computer extends JFrame implements ActionListener{
	
	private JTextField tf;
	private JButton bc;//全删
	private JButton bdi;//除
	private JButton br;//乘
	private JButton bd;//一个一个的删除
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bs;//减
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton ba;//加
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b0;
	private JButton bd1;//小数点
	private JButton be;//等于

	ArrayList<String> number = new ArrayList<String>();
	private Double number1;
	private Double number2;
	private Double result;
	private String trans;
	private char[] in;
	
 	Computer(String title){
		this.setTitle(title);
		this.setSize(400, 538);
		this.setLocationRelativeTo(getOwner());
		this.setResizable(false);		
		init();
		this.setVisible(true);
	}
	//按钮的添加
	public void init() {
		this.setLayout(null);
		
		tf=new JTextField();
		tf.setColumns(20);
		tf.setFont(new Font("宋体",Font.PLAIN,30));
		tf.setBounds(8,25,400,100);
		
		bc=new JButton("C");//全删
		bc.setFont(new Font("宋体",Font.PLAIN,30));
		bc.setBounds(0,125, 100, 75);
		bdi=new JButton("/");//除
		bdi.setFont(new Font("宋体",Font.PLAIN,30));
		bdi.setBounds(100,125, 100,75);
		br=new JButton("*");//乘
		br.setFont(new Font("宋体",Font.PLAIN,30));
		br.setBounds(200, 125, 100,75);
		bd=new JButton("DEL");//一个一个的删除
		bd.setFont(new Font("宋体",Font.PLAIN,30));
		bd.setBounds(300,125, 100, 75);
		b7=new JButton("7");
		b7.setFont(new Font("宋体",Font.PLAIN,30));
		b7.setBounds(0,200,100, 75);
		b8=new JButton("8");
		b8.setBounds(100, 200, 100,75);
		b8.setFont(new Font("宋体",Font.PLAIN,30));
		b9=new JButton("9");
		b9.setBounds(200, 200, 100,75);
		b9.setFont(new Font("宋体",Font.PLAIN,30));
		bs=new JButton("-");//减
		bs.setFont(new Font("宋体",Font.PLAIN,30));
		bs.setBounds(300, 200, 100,75);
		b4=new JButton("4");
		b4.setFont(new Font("宋体",Font.PLAIN,30));
		b4.setBounds(0, 275, 100,75);
		b5=new JButton("5");
		b5.setFont(new Font("宋体",Font.PLAIN,30));
		b5.setBounds(100, 275, 100,75);
		b6=new JButton("6");
		b6.setFont(new Font("宋体",Font.PLAIN,30));
		b6.setBounds(200, 275, 100,75);
		ba=new JButton("+");
		ba.setFont(new Font("宋体",Font.PLAIN,30));
		ba.setBounds(300, 275, 100,75);
		b1=new JButton("1");
		b1.setFont(new Font("宋体",Font.PLAIN,30));
		b1.setBounds(0, 350, 100,75);
		b2=new JButton("2");
		b2.setFont(new Font("宋体",Font.PLAIN,30));
		b2.setBounds(100,350, 100,75);
		b3=new JButton("3");
		b3.setFont(new Font("宋体",Font.PLAIN,30));
		b3.setBounds(200, 350, 100,75);
		b0=new JButton("0");
		b0.setFont(new Font("宋体",Font.PLAIN,30));
		b0.setBounds(0, 425,200,75);
		bd1=new JButton(".");
		bd1.setFont(new Font("宋体",Font.PLAIN,30));
		bd1.setBounds(200,425, 100,75);
		be=new JButton("=");//等于
		be.setFont(new Font("宋体",Font.PLAIN,30));
		be.setBounds(300, 350, 100, 150);
		
		add(tf);
		tf.addActionListener(this);
		add(bc);
		bc.addActionListener(this);
		add(bdi);
		bdi.addActionListener(this);
		add(br);
		br.addActionListener(this);
		add(bd);
		bd.addActionListener(this);
		add(b7);
		b7.addActionListener(this);
		add(b8);
		b8.addActionListener(this);
		add(b9);
		b9.addActionListener(this);
		add(bs);
		bs.addActionListener(this);
		add(b4);
		b4.addActionListener(this);
		add(b5);
		b5.addActionListener(this);
		add(b6);
		b6.addActionListener(this);
		add(ba);
		ba.addActionListener(this);
		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		add(b3);
		b3.addActionListener(this);
		add(b0);
		b0.addActionListener(this);
		add(bd1);
		bd1.addActionListener(this);
		add(be);
		be.addActionListener(this);
	}
	//监听事件
	public void actionPerformed(ActionEvent e) {
		//全删
		if(e.getSource()==bc) {
			tf.setText(null);
			number.clear();
		}
		//乘
		else if(e.getSource()==br) {
			if(!number.isEmpty()) {
				if(number.get(number.size()-1)=="*"||number.get(number.size()-1)=="/"||number.get(number.size()-1)=="-"||number.get(number.size()-1)=="+"||number.get(number.size()-1)==".") {
					number.set(number.size()-1, "*");
					tf.setText((tf.getText().substring(0,tf.getText().length()-1))+"*");
				}
				else {
					tf.setText(tf.getText()+"*");
					number.add("*");
				}
			}	
		}
		//除
		else if(e.getSource()==bdi) {
			if(!number.isEmpty()) {
				if(number.get(number.size()-1)=="*"||number.get(number.size()-1)=="/"||number.get(number.size()-1)=="-"||number.get(number.size()-1)=="+"||number.get(number.size()-1)==".") {
					number.set(number.size()-1, "/");
					tf.setText((tf.getText().substring(0,tf.getText().length()-1))+"/");
				}
				else {
					tf.setText(tf.getText()+"/");
					number.add("/");
				}
			}
		}
		//一个一个的删除
		else if(e.getSource()==bd) {
			if(!number.isEmpty()) {
				tf.setText(tf.getText().substring(0,tf.getText().length()-1));
				number.remove(number.size()-1);
			}
		}
		//7
		else if(e.getSource()==b7) {
			tf.setText(tf.getText()+"7");
			number.add("7");
		}
		//8
		else if(e.getSource()==b8) {
			tf.setText(tf.getText()+"8");
			number.add("8");
		}
		//9
		else if(e.getSource()==b9) {
			tf.setText(tf.getText()+"9");
			number.add("9");
		}
		//减or负号
		else if(e.getSource()==bs) {
			if(!number.isEmpty()) {
				if(number.get(number.size()-1)=="+"||number.get(number.size()-1)=="."||number.get(number.size()-1)=="-") {
					number.set(number.size()-1, "-");
					tf.setText((tf.getText().substring(0,tf.getText().length()-1))+"-");
				}
				else {
					tf.setText(tf.getText()+"-");
					number.add("-");
				}	
			}
			else {
				tf.setText(tf.getText()+"-");
				number.add("-");
			}
		}
		//4
		else if(e.getSource()==b4) {
			tf.setText(tf.getText()+"4");
			number.add("4");
		}
		//5
		else if(e.getSource()==b5) {
			tf.setText(tf.getText()+"5");
			number.add("5");
		}
		//6
		else if(e.getSource()==b6) {
			tf.setText(tf.getText()+"6");
			number.add("6");
		}
		//加
		else if(e.getSource()==ba) {
			if(!number.isEmpty()) {
				if(number.get(number.size()-1)=="+"||number.get(number.size()-1)=="."||number.get(number.size()-1)=="-"||number.get(number.size()-1)=="*"||number.get(number.size()-1)=="/") {
					number.set(number.size()-1, "+");
					tf.setText((tf.getText().substring(0,tf.getText().length()-1))+"+");
				}
				else {
					tf.setText(tf.getText()+"+");
					number.add("+");
				}
			}
		}
		//1
		else if(e.getSource()==b1) {
			tf.setText(tf.getText()+"1");
			number.add("1");
		}
		//2
		else if(e.getSource()==b2) {
			tf.setText(tf.getText()+"2");
			number.add("2");
		}
		//3
		else if(e.getSource()==b3) {
			tf.setText(tf.getText()+"3");
			number.add("3");
		}
		//0
		else if(e.getSource()==b0) {
			tf.setText(tf.getText()+"0");
			number.add("0");
		}
		//小数点
		else if(e.getSource()==bd1) {
			if(!number.isEmpty()) {
				if(number.get(number.size()-1)!="."&&number.get(number.size()-1)!="+"&&number.get(number.size()-1)!="*"&&number.get(number.size()-1)!="-"&&number.get(number.size()-1)!="/") {
					tf.setText(tf.getText()+".");
					number.add(".");
				}
			}
		}
		//等于
		else if(e.getSource()==be){
			if(!number.isEmpty()) {
				while(number.get(number.size()-1)=="."||number.get(number.size()-1)=="*"||number.get(number.size()-1)=="/"||number.get(number.size()-1)=="-"||number.get(number.size()-1)=="+") {
					number.remove(number.size()-1);
					tf.setText((tf.getText().substring(0,tf.getText().length()-1)));
				}
					for(int i=1;i<number.size();i++) {	
						if(number.get(i)==".") {
							number.set(i-1, number.get(i-1)+number.get(i));
							number.remove(i);
							i--;
						}
						else if(number.get(i)!="+"&&number.get(i)!="*"&&number.get(i)!="/"&&number.get(i)!="-") {
							if((i-1)==0) {
									number.set(i-1, number.get(i-1)+number.get(i));
									number.remove(i);
									i--;
							}
							else {
								if(number.get(i-1)!="-") {
									if(number.get(i-1)!="+"&&number.get(i-1)!="*"&&number.get(i-1)!="/") {
										number.set(i-1, number.get(i-1)+number.get(i));
										number.remove(i);
										i--;
									}
								}
								
								else {
									if(number.get(i-2)=="+"||number.get(i-2)=="*"||number.get(i-2)=="/"){
										number.set(i-1, number.get(i-1)+number.get(i));
										number.remove(i);
										i--;
									}
								}
							}
						}
					}
				}
				if(number.size()>1) {
					
				//乘除
					for(int i=1;i<number.size();i++) {
						if(number.get(i)=="*") {
							number1=Double.valueOf(number.get(i-1));
							number2=Double.valueOf(number.get(i+1));
							result=number1*number2;
							number.set(i-1, String.valueOf(result));
							number.remove(i);
							number.remove(i);
							i--;
							i--;
						}
						else if(number.get(i)=="/") {
							number1=Double.valueOf(number.get(i-1));
							number2=Double.valueOf(number.get(i+1));
								result=number1/(number2)*1.0;
								number.set(i-1, String.valueOf(result));
								number.remove(i);
								number.remove(i);
								i--;
								i--;
						}
					}
				//加减
				for(int i=1;i<number.size();i++) {
					
					if(number.get(i)=="+") {
						number1=Double.valueOf(number.get(i-1));
						number2=Double.valueOf(number.get(i+1));
						result=number1+number2;
						number.set(i-1, String.valueOf(result));
						number.remove(i);
						number.remove(i);
						i--;
						i--;
					}
					else if(number.get(i)=="-") {
						number1=Double.valueOf(number.get(i-1));
						
						number2=Double.valueOf(number.get(i+1));
						result=number1-number2;
						number.set(i-1, String.valueOf(result));
						number.remove(i);
						number.remove(i);
						i--;
						i--;
					}
				}
				tf.setText(number.get(0));
			}
				trans= number.get(0);
				in = trans.toCharArray();
				number.clear();
				for(int z=0;z<in.length;z++) {
					String s=String.valueOf(in[z]);
					number.add(s);
			}
		}
	}
	public static void main(String[] args) {
		new Computer("计算器");
	}
}