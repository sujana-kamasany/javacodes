import java.awt.event.*;
import javax.swing.*;
public class SwingEg extends JFrame implements ActionListener {

    public static void main(String[] args) {
        JFrame f = new JFrame("Label EVent");
       JTextField tf = new JTextField();
        JLabel l = new JLabel();
        JButton b = new JButton("Click");
        
        tf.setBounds(100,230,150,40);
        l.setBounds(100,200,150,40);
        b.setBounds(100,270,150,40);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b){
                l.setText("Label: "+tf.getText());      
            }
        }});
        f.add(l);
       f.add(b);f.add(tf);
       f.setSize(500,500);f.setLayout(null);f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
        }   
}
