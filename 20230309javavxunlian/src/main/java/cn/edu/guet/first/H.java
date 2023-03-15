package cn.edu.guet.first;

import java.util.Scanner;

/**
 * @ClassName H
 * @Description TODO
 * @Author 1475
 * @Date 2023/3/11 17:13
 * @Version 1.0
 */

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("请输入你的选择");
            int end=0;
            String a = scanner.next();
            switch (a) {
                case "A":
                    System.out.println("请输入质数查找的范围：");
                    int b = scanner.nextInt();

                    System.out.println(b + "以内的质数有：");
                    for (int i = 1; i <= b; i++) {
                        int h = 1;
                        for (int j = 1; j <= i; j++) {
                            if (i % j == 0 && j != 1 && j != i) {
                                h = 0;
                            }
                        }
                        if (h == 1) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case "B":
                    System.out.println("请指定第一个数字：");
                    int c = scanner.nextInt();
                    System.out.println("请指定第二个数字：");
                    int d = scanner.nextInt();
                    int max = 0;
                    for (int i = 1; i <= Math.min(d, c); i++) {
                        if (d % i == 0 && c % i == 0) {

                            max = i;
                        }
                    }
                    System.out.println(c + "和" + d + "的最大公约数是" + max);
                    break;
                case "C":
                    int i, g, h, j;
                    System.out.print("1000以内的水仙花数有：");
                    for (i = 100; i < 1000; i++) {
                        g = i / 100;
                        h = (i % 100) / 10;
                        j = i % 10;
                        if (i == Math.pow(g, 3) + Math.pow(h, 3) + Math.pow(j, 3)) {
                            System.out.print(i + " ");

                        }
                    }


                    break;
                case "D":
                    System.out.println("请指定奇数的求和范围：");
                    int l = scanner.nextInt();
                    int sum = 0;
                    for (int z = 0; z <= l; z++) {
                        if (z % 2 != 0) {
                            sum += z;
                        }
                    }
                    System.out.println(l + "范围内的奇数和是：" + sum);
                    break;

                default:
                    System.out.println("功能未开放");
                    end=1;
                    break;
            }
            if(end==1)
            {
               break;

            }
        }

                }
        }


