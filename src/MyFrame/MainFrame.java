package MyFrame;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        mainFrame();
    }


    public static void mainFrame(){
        //创建主窗口
        JFrame mainFrame = new JFrame();
        //获取屏幕大小
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //主窗口名称
        mainFrame.setTitle("聊天室");
        //设置主窗口大小
        mainFrame.setSize(400,700);
        //设置主窗口位置
        mainFrame.setLocation(screenSize.width/2-400/2,screenSize.height/2-700/2);
        //设置颜色
        mainFrame.getContentPane().setBackground(new Color(100,100,255));
        mainFrame.getContentPane().setBackground(Color.BLUE);
        //关闭窗口
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //控件容器
        Container container = mainFrame.getContentPane();
        /**
         *
         */
        container.setLayout(null);
        Button login = new Button("Login");
        login.setBounds(mainFrame.getSize().width/2-50/2,mainFrame.getSize().height/2-20/2,50,20);
        login.setBackground(Color.BLUE);
        container.add(login);

        //可视化
        mainFrame.setVisible(true);
    }
}
