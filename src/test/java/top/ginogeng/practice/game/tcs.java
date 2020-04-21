package top.ginogeng.practice.game;

import java.util.*;

/**
 * Lijie
 * 只需要导入util.*包
 */
public class tcs {

    // 初始化地图
    public static String[][] aa = new String[24][30];

    // 线程休息时间，太快了就会实现无线输出，蛇吃东西越长就会越快
    public static int seet = 100;

    // 记录蛇的集合 关键，用他加上，号隔开，俩个数字，x和y坐标
    public static LinkedList<String> dd = new LinkedList();

    // 定一个用有的变量接受wsad的上下移动端的操作
    public static String nana = "";

    // ****************************************************
    public static void main(String[] args) {
        tcs a = new tcs();
        a.load();
    }

    // 默认加载事件
    public void load() {
        Info();     //添加地图方法
        addList();  //加载蛇的默认位置
        Random();   //随机生成贪吃蛇的食物
        Random();   //调用几次在场上就会有几个食物
        Random();
        print();    //输出地图加上蛇身的方法
        startUp();  //启动线程,开启
    }

    // 创建启动贪吃蛇移动线程
    public void startUp() {
        Thread sd = new Thread(new move(), "杰");
        sd.start();
        while (true) {
            Scanner input = new Scanner(System.in);
            nana = input.next();
            // 如果输入较多就提取第一个
            if (nana.length() >= 2) {
                nana = nana.substring(0, 1);
            }
        }
    }

    // 实现线程移动类
    public class move implements Runnable {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                if (nana.equals("w")) {
                    w();
                } else if (nana.equals("s")) {
                    s();
                } else if (nana.equals("a")) {
                    a();
                } else if (nana.equals("d")) {
                    d();
                } else {
                    // 暂停线程
                    Thread.yield();
                }
                try {
                    // 最低速度80
                    if (seet < 1000) {
                        seet = 1000;
                    }
                    Thread.sleep(seet);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    // ******************************************************

    // 蛇身的x坐标
    public int X(int x) {
        return Integer.parseInt(dd.get(x).split(",")[0]);
    }

    // 蛇身的y坐标
    public int Y(int y) {
        return Integer.parseInt(dd.get(y).split(",")[1]);
    }

    /**
     * 添加地图方法
     */
    public void Info() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 30; j++) {
                if (i == 0) {
                    aa[i][j] = "■";
                }
                if (i == 23) {
                    aa[i][j] = "■";
                } else {
                    if (j == 0 || j == 29) {
                        aa[i][j] = "■";
                    } else {
                        if (i == 0) {

                        } else {
                            aa[i][j] = " ";
                        }
                    }
                }
            }
        }
        // 在此之前都是默认地图******************************
    }

    // 加载蛇身，保存在LinkedLis集合类，，这个集合增删改方便
    public void addList() {
        dd.add("16,14");
        dd.add("16,15");
        dd.add("16,16");
        dd.add("16,17");
    }

    /**
     * 控制台输出方法 ，输出集合，集合内包括蛇和地图
     * 控制集合操作蛇 把集合中的第一个变成蛇头后面的变成蛇尾
     */
    public void print() {
        // 修改添加蛇，配合LinkedList
        for (int i = 0; i < dd.size(); i++) {
            int x = X(i);
            int y = Y(i);
            if (i == 0) {
                aa[x][y] = "●"; // 蛇头●
                continue;
            }
            aa[x][y] = "□";// 身体□
        }

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }

    }

    // 随机添加吃的
    public void Random() {
        int ii = (int) (Math.round(Math.random() * 20 + 2));
        int jj = (int) (Math.round(Math.random() * 26 + 2));
        if (ii == 0 || jj == 0 || ii == 23 || jj == 28) {
            Random();
        } else {
            for (int i = 0; i < dd.size(); i++) {
                int x = X(i);
                int y = Y(i);

                if (x == ii && jj == y) {
                    Random();
                } else {
                    aa[ii][jj] = "○";
                }
            }
        }

    }

    // 上移动方法
    public void w() {
        // 添加蛇头移除蛇尾，实现移动
        dd.addFirst(X(0) - 1 + "," + Y(0));
        ss();// 判断是否撞到围墙或者你自己的身体
        if (aa[X(0)][Y(0)].equals("○")) {// 判断有没有吃到食物
            dd.addFirst(X(0) - 1 + "," + Y(0));
            Random();
            seet -= 15;
        }
        Remove();
    }

    // 下移动方法
    public void s() {
        // 添加蛇头移除蛇尾，实现移动
        dd.addFirst(X(0) + 1 + "," + Y(0));
        ss();// 判断是否撞到围墙或者你自己的身体
        if (aa[X(0)][Y(0)].equals("○")) {// 判断有没有吃到食物
            dd.addFirst(X(0) + 1 + "," + Y(0));
            Random();
            seet -= 15;
        }
        Remove();
    }

    // 左移动方法
    public void a() {
        // 添加蛇头移除蛇尾，实现移动
        dd.addFirst(X(0) + "," + (Y(0) - 1));
        ss();// 判断是否撞到围墙或者你自己的身体
        if (aa[X(0)][Y(0)].equals("○")) {// 判断有没有吃到食物
            dd.addFirst(X(0) + "," + (Y(0) - 1));
            Random();
            seet -= 15;
        }
        Remove();
    }

    // 右移动方法
    public void d() {
        // 添加蛇头移除蛇尾，实现移动
        dd.addFirst(X(0) + "," + (Y(0) + 1));
        ss();// 判断是否撞到围墙或者你自己的身体
        if (aa[X(0)][Y(0)].equals("○")) {// 判断有没有吃到食物
            dd.addFirst(X(0) + "," + (Y(0) + 1));
            Random();
            seet -= 15;
        }
        Remove();
    }

    // 判断是否撞到围墙或者你自己的身体
    public void ss() {
        if (aa[X(0)][Y(0)].equals("■")) {
            System.out.println("凉凉");
            System.exit(0);
        }
        if (aa[X(0)][Y(0)].equals("□")) {
            System.out.println("凉凉");
            System.exit(0);
        }
    }

    // 移除蛇身和蛇尾方法
    public void Remove() {
        // 移除蛇，aa的蛇尾最后一个变成" ",
        aa[X(dd.size() - 1)][Y(dd.size() - 1)] = " ";
        // 移除最后一个
        dd.removeLast();
        // 打印蛇和地图
        print();
    }
}