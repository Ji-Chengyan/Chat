package MyFrame;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        mainFrame();
    }


    public static void mainFrame(){
        //����������
        JFrame mainFrame = new JFrame();
        //��ȡ��Ļ��С
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //����������
        mainFrame.setTitle("������");
        //���������ڴ�С
        mainFrame.setSize(400,700);
        //����������λ��
        mainFrame.setLocation(screenSize.width/2-400/2,screenSize.height/2-700/2);
        //������ɫ
        mainFrame.getContentPane().setBackground(new Color(100,100,255));
        mainFrame.getContentPane().setBackground(Color.BLUE);
        //�رմ���
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�ؼ�����
        Container container = mainFrame.getContentPane();
        /**
         *
         */
        container.setLayout(null);
        Button login = new Button("Login");
        login.setBounds(mainFrame.getSize().width/2-50/2,mainFrame.getSize().height/2-20/2,50,20);
        login.setBackground(Color.BLUE);
        container.add(login);

        //���ӻ�
        mainFrame.setVisible(true);
    }
}
