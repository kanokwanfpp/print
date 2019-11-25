
import java.applet.*;
import java.awt.*;
public class doraemon2556 extends Applet implements Runnable {
Thread timer;   
int scene = 1;
int i;
int liph=100;
int eyex=10;
// 01 - init
public void init() { 
  setBackground(Color.orange); 
  timer = new Thread(this);
  timer.start();
}
// 02 - run
public void run() {
  Thread me = Thread.currentThread();
  while (timer == me) {
    try {
      Thread.currentThread().sleep(1000);
	  if (i++ % 2 ==0)	{ liph = 80; eyex=10; } else { liph = 100; eyex=0; } 
      if (i % 5 == 0) { scene++; }
    } catch (InterruptedException e) { }
    repaint();
  }
} 
// 03 - paint
public void paint(Graphics g) {
if (scene %2 == 0) {

// หน้า
g.setColor(Color.black);
g.drawArc(55,0,300,300,0,360);
g.setColor(Color.blue);
g.fillArc(55,0,300,300,0,360);
g.setColor(Color.black);
g.drawArc(80,55,250,250,0,360);
g.setColor(Color.white);
g.fillArc(80,55,250,250,0,360);
// ตัว
g.setColor(Color.blue);
g.fillRect(80,250,250,100);
g.setColor(Color.black);
g.drawArc(55,185,300,300,140,250);
g.setColor(Color.blue);
g.fillArc(55,185,300,300,140,250);
g.setColor(Color.black);
g.drawArc(100,300,200,200,342,210);
g.setColor(Color.white);
g.fillArc(100,300,200,200,342,210);
// ปลอกคอ
g.setColor(Color.black);
g.drawRect(80,230,250,20);
g.setColor(Color.red);
g.fillRect(80,230,250,20);
g.setColor(Color.black);
g.drawArc(175,230,50,50,0,360);
g.setColor(Color.yellow);
g.fillArc(175,230,50,50,0,360);
g.setColor(Color.black);
g.drawRect(177,242,46,2);
g.drawRect(199,260,2,20);
g.fillRect(199,260,2,20);
g.drawArc(196,252,8,8,0,360);
g.fillArc(196,252,8,8,0,360);
// จมูก
g.setColor(Color.black);
g.drawArc(185,70,30,30,0,360);
g.setColor(Color.red);
g.fillArc(185,70,30,30,0,360);
// หนวด
g.setColor(Color.black);
g.drawLine(80,60,170,100);
g.drawLine(70,115,170,110);
g.drawLine(80,170,170,120);
g.drawLine(230,100,320,60);
g.drawLine(230,110,330,115);
g.drawLine(230,120,320,170);

// - มือซ้าย
g.setColor(Color.black);
g.drawArc(0,280,60,60,0,360);
g.setColor(Color.white);
g.fillArc(0,280,60,60,0,360);
// - มือขวา
g.setColor(Color.black);
g.drawArc(340,280,60,60,0,360);
g.setColor(Color.white);
g.fillArc(340,280,60,60,0,360);
// - เท้าซ้าย
g.setColor(Color.black);
g.drawOval(50,370,80,130);
g.setColor(Color.white);
g.fillOval(50,370,80,130);
// - เท้าขวา
g.setColor(Color.black);
g.drawOval(270,370,80,130);
g.setColor(Color.white);
g.fillOval(270,370,80,130);
// ตาซ้าย
g.setColor(Color.black);
g.drawOval(145 + eyex,10,55,75);
g.setColor(Color.white);
g.fillOval(145 + eyex,10,55,75);
// ตาขาว
g.setColor(Color.black);
g.drawOval(200 + eyex,10,55,75);
g.setColor(Color.white);
g.fillOval(200 + eyex,10,55,75);
// ลูกตา
g.setColor(Color.black);
g.drawOval(172,60,10,20);
g.fillOval(172,60,10,20);
g.drawOval(227,60,10,20);
g.fillOval(227,60,10,20);
// - ปาก
g.setColor(Color.black);
g.drawArc(135,100,130,liph,180,180);
g.setColor(Color.red);
g.fillArc(135,100,130,liph,180,180);
} else {

// แขน
g.setColor(Color.black);
g.drawOval(60,340,300,100);
g.drawOval(190,340,300,100);
// ตัว
g.drawArc(123,322,300,300,0,360);
g.setColor(Color.blue);
g.fillArc(123,322,300,300,0,360);
g.fillOval(60,340,300,100); //รอยต่อตรงแขน
g.fillOval(190,340,300,100); //รอยต่อตรงแขน
g.setColor(Color.black);
g.drawArc(178,315,190,190,0,360);
g.setColor(Color.white);
g.fillArc(178,315,190,190,0,360);
g.setColor(Color.black);
g.drawArc(220,330,110,110,180,180);
g.drawLine(330,385,220,385);
// มือ
g.setColor(Color.black);
g.drawArc(20,350,80,80,0,360);
g.drawArc(440,350,80,80,0,360);
g.setColor(Color.white);
g.fillArc(20,350,80,80,0,360);
g.fillArc(440,350,80,80,0,360);
// หน้า
g.setColor(Color.black);
g.drawArc(105,30,350,320,0,360);
g.setColor(Color.blue);
g.fillArc(105,30,350,320,0,360);
g.setColor(Color.black);
g.drawArc(126,85,300,270,0,360);
g.setColor(Color.white);
g.fillArc(126,85,300,270,0,360);
// ตา
g.setColor(Color.black);
g.drawOval(210,40,65,95);
g.setColor(Color.white);
g.fillOval(210,40,65,95);
g.setColor(Color.black);
g.drawOval(275,40,65,95);
g.setColor(Color.white);
g.fillOval(275,40,65,95);
// ลูกตา
g.setColor(Color.black);
g.drawOval(240,70,15,25);
g.fillOval(240,70,15,25);
g.drawOval(300,70,15,25);
g.fillOval(300,70,15,25);
// จมูก
g.drawArc(255,120,40,40,0,360);
g.setColor(Color.red);
g.fillArc(255,120,40,40,0,360);
// ปาก
g.setColor(Color.black);
g.drawArc(200,180,140,120,180,180);
g.drawLine(275,160,275,300);
// หนวด
g.drawLine(250,190,160,150);
g.drawLine(250,200,150,200);
g.drawLine(250,210,160,250);
g.drawLine(380,250,300,210);
g.drawLine(390,200,300,200);
g.drawLine(380,150,300,190);
// ปลอกคอ
g.drawRect(195,330,165,30);
g.setColor(Color.red);
g.fillRect(195,330,165,30);
g.setColor(Color.black);
g.drawArc(260,340,30,30,0,360);
g.setColor(Color.yellow);
g.fillArc(260,340,30,30,0,360);
g.setColor(Color.black);
g.drawLine(275,370,275,350);
g.drawArc(271,346,8,8,0,360);
g.fillArc(271,346,8,8,0,360);
// เท้า
g.setColor(Color.black);
g.drawOval(100,480,135,165);
g.drawOval(325,480,135,165);
g.setColor(Color.white);
g.fillOval(100,480,135,165);
g.fillOval(325,480,135,165);
}
} // end paint
} // end class