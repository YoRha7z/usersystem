package usersystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Usersystem {
	public static void main(String[] args) {
		System.out.println("0。添加用户 ");
		System.out.println("1.删除用户 ");
		System.out.println("2。查找用户 ");
		System.out.println("3。更改用户 ");
		System.out.println("4.退出系统 ");
		ArrayList lineuplist=new  ArrayList();
		addVxuserlist (lineuplist);
		while (true)
		{
			System.out.println("输入操作序号 ");
			Scanner scan=new Scanner(System.in);
			int commed=scan.nextInt();
			switch(commed){
				case 0:
					adduser(lineuplist);
					break;
				case 1:
					deluser(lineuplist);
					break;
				case 2 :
					finduser(lineuplist);
					break;
				case 3:
					changeuser(lineuplist);
					break;
				case 4:
					exit();
					break;
				default:
					System.out.println("输入操作序号错误 ");	
			}
		}
	}
	private static void addVxuserlist(ArrayList lineuplist){
		lineuplist.add("张三");
		lineuplist.add("李四");
		System.out.println("当前用户列表"+lineuplist);
	}
	private static void adduser(ArrayList lineuplist){
		System.out.println("输入需要添加的用户名字 ");
		String name= new Scanner(System.in).nextLine();
		lineuplist.add(name);
		System.out.println("已添加的用户名字 "+name);
		System.out.println("当前用户列表"+lineuplist);
		
	}
	private static void deluser(ArrayList lineuplist){
		System.out.println("输入需要删除的用户名字 ");
		String name= new Scanner(System.in).nextLine();
		lineuplist.remove(name);
		System.out.println("已删除的用户名字 "+name);
		System.out.println("当前用户列表"+lineuplist);
	}
	private static void finduser(ArrayList lineuplist){
		System.out.println("输入需要查找的用户名字 ");	
		String name= new Scanner(System.in).nextLine();
		System.out.println("是否包含该名字 "+lineuplist.contains(name));
	}
	private static void changeuser(ArrayList lineuplist){
		System.out.println("当前用户列表"+lineuplist);
		System.out.println("输入第几个需要更改的用户 ");	
		int name1= new Scanner(System.in).nextInt();
		System.out.println("输入需要更改后的用户名字 ");
		String name2= new Scanner(System.in).nextLine();
		lineuplist.set(name1-1, name2);
		System.out.println("当前用户列表"+lineuplist);
	}
	private static void exit(){
		System.out.println("退出成功 ");	
		System.exit(0);
	}
}

