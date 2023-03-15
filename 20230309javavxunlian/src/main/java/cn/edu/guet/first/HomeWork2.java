package cn.edu.guet.first;

import java.util.Scanner;

/**
 * @ClassName HomeWork2
 * @Description TODO
 * @Author 1475
 * @Date 2023/3/11 14:37
 * @Version 1.0
 */

public class HomeWork2 {

        public static void main(String[] args) {
            System.out.println("请输入头的总数：");
            Scanner scanner=new Scanner(System.in);
            int a =scanner.nextInt();
            System.out.println("请输入脚的总数：");
            int b=scanner.nextInt();

            int i,j;
            for(i=0;i<=a;i++)
            {
                j=a-i;
                if(2*i+4*j==b)
                {
                    System.out.println("鸡有"+i+"只，兔有"+j+"只");
                    break;
                }
            }
        }


    }

