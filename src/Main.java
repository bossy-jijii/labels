import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;



public class Main {
    public static void main(String[] args) {

        //JLabel= a GUI display area for a string of text , an image or both
        Border border = BorderFactory.createLineBorder(Color.black,7);

        ImageIcon image=new ImageIcon("icoon.jpeg");
        JLabel label= new JLabel(); //creates a label

        label.setText("Bro, do you even code? ");//set text of a label
        label.setIcon(image);
        label.setIconTextGap(-40); // FIN GHADI YHET TEXT BNISBA L IMAGE
        label.setHorizontalTextPosition(JLabel.CENTER);//SET TEXT LEFT,CENTER,RIGHT OF IMAGEICON
        label.setVerticalTextPosition(JLabel.TOP);//SET TEXT TOP,CENTER,BOTTOM OF IMAGEICON
        label.setFont(new Font("Arial", Font.BOLD,30 ));//SET FONT OF TEXT
        label.setForeground(new Color(224,255,255));//SET FONT COLOR OF TEXT
        label.setBackground(Color.PINK);//SET BACKGROUND COLOR
        label.setOpaque(true);//DISPLAYS IT
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//SET VERTICAL POSITION OF ICON+TEXT
        label.setHorizontalAlignment(JLabel.CENTER);//SET HORIZONTAL POSITION OF ICON+TEXT
        //label.setBounds(10,10,450,450);//kaydecider fin ayhet label dyalna fina blasa f lframe




        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null); kankhdmoh m3a bounds hada kay annuler lina aya haja f frame mn label hada kaythkem lina fina blasa f l frame bina label yban

        frame.add(label);//dimaa khas nbdaw b add label 3ad pack
        //frame.pack();//resize the frame to compatible with all the components that you have it fits l cadre dyalna
    }
}
