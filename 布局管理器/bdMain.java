import javax.swing.*;
import java.awt.*;

public class bdMain{

public static void main(String[]args){

JFrame jf =new JFrame("测试窗口");
jf.setSize(350,250);
jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//创建内容面板容器，指定使用 边界布局
JPanel panel = new JPanel(new BorderLayout());

//创建5个按钮
JButton btnN=new JButton("Button_North");
JButton btnS=new JButton("Button_South");
JButton btnW=new JButton("Button_West");
JButton btnE=new JButton("Button_East");
JButton btnC=new JButton("Button_Center");

//把五个按钮添加到容器中的五个方位
panel.add(btnN,BorderLayout.NORTH);
panel.add(btnS,BorderLayout.SOUTH);
panel.add(btnW,BorderLayout.WEST);
panel.add(btnE,BorderLayout.EAST);
panel.add(btnC,BorderLayout.CENTER);

jf.setContentPane(panel);
jf.setLocationRelativeTo(null);
jf.setVisible(true);


}
}