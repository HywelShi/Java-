package 项目实训;

import java.util.Scanner;

/**
 * 随机生成一个1-100的随机数
 * 用户输入猜测的数字
 * 提示猜大了 猜小了 猜对了
 * 猜对了提示是否继续 yes/no
 * 提示用语自动提示范围
 * 10次猜测机会 猜完了游戏结束
 * 输入exit强制结束游戏
 * @author hywel
 *
 */
public class Test03 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100+1);
		Scanner scan = new Scanner(System.in);
		int max = 100;
		int min = 1;
		int count = 10;
		while(true) {
			if(count<=0) {
				System.out.println("游戏结束！");
				break;
			}else {
				System.out.println("请输入你要猜测的数字:"+min+"~"+max);
				String input = scan.next();
				if("exit".equals(input.toLowerCase())) {
					System.out.println("游戏结束！");
					break;
				}else {
					int guess = Integer.parseInt(input);
					if(guess>num) {
						System.out.println("猜大了！");
						max = guess;
					}else if(guess<num) {
						System.out.println("猜小了！");
						min = guess;
					}else {
						System.out.println("猜对了！是否继续 yes/no？");
						String msg = scan.next();
						if("yes".equals(msg)) {
							System.out.println("游戏继续！");
							max = 100;
							min = 1;
							num = (int)(Math.random()*100+1);
						}else {
							System.out.println("游戏结束！");
							break;
						}
					}
				}
			}
			
		}
		
	}
}
