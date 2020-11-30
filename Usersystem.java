package usersystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Usersystem {
	public static void main(String[] args) {
		System.out.println("0������û� ");
		System.out.println("1.ɾ���û� ");
		System.out.println("2�������û� ");
		System.out.println("3�������û� ");
		System.out.println("4.�˳�ϵͳ ");
		ArrayList lineuplist=new  ArrayList();
		addVxuserlist (lineuplist);
		while (true)
		{
			System.out.println("���������� ");
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
					System.out.println("���������Ŵ��� ");	
			}
		}
	}
	private static void addVxuserlist(ArrayList lineuplist){
		lineuplist.add("����");
		lineuplist.add("����");
		System.out.println("��ǰ�û��б�"+lineuplist);
	}
	private static void adduser(ArrayList lineuplist){
		System.out.println("������Ҫ��ӵ��û����� ");
		String name= new Scanner(System.in).nextLine();
		lineuplist.add(name);
		System.out.println("����ӵ��û����� "+name);
		System.out.println("��ǰ�û��б�"+lineuplist);
		
	}
	private static void deluser(ArrayList lineuplist){
		System.out.println("������Ҫɾ�����û����� ");
		String name= new Scanner(System.in).nextLine();
		lineuplist.remove(name);
		System.out.println("��ɾ�����û����� "+name);
		System.out.println("��ǰ�û��б�"+lineuplist);
	}
	private static void finduser(ArrayList lineuplist){
		System.out.println("������Ҫ���ҵ��û����� ");	
		String name= new Scanner(System.in).nextLine();
		System.out.println("�Ƿ���������� "+lineuplist.contains(name));
	}
	private static void changeuser(ArrayList lineuplist){
		System.out.println("��ǰ�û��б�"+lineuplist);
		System.out.println("����ڼ�����Ҫ���ĵ��û� ");	
		int name1= new Scanner(System.in).nextInt();
		System.out.println("������Ҫ���ĺ���û����� ");
		String name2= new Scanner(System.in).nextLine();
		lineuplist.set(name1-1, name2);
		System.out.println("��ǰ�û��б�"+lineuplist);
	}
	private static void exit(){
		System.out.println("�˳��ɹ� ");	
		System.exit(0);
	}
}

