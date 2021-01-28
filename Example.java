import javax.swing.*;
public class Example extends JFrame {
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1;
public Example() { }
public Example(String s)
{
	super(s);
}
public void setComponents() {
	l1=new JLabel("addition of two numbers");
	l2=new JLabel("first no");
	l3=new JLabel("second no");
	l4=new JLabel();
	t1=new JTextField();
	t2=new JTextField();
	b1=new JButton("Add");
	
	add(l1);
	add(l2);
	add(t1);
	add(l3);
	add(t2);
	add(b1);
	add(l4);
	
}
	public static void main(String[] args) {
		Example jf=new Example("swing example");
		jf.setComponents();
		jf.setSize(300,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
