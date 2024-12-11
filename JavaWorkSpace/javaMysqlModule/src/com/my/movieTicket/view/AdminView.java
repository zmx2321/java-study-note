package com.my.movieTicket.view;

import com.my.movieTicket.util.Help;

/**
 *
 * @param 管理员界面
 * @author zmx2321
 *
 */

public class AdminView {
	private static boolean flag = true;  //用于判断是否跳出循环

	//管理员菜单选择
	public static void adminMune(){
		System.out.println("欢迎进入管理员界面：");

		do{
			System.out.println("*********************");
			System.out.println("1:电影管理");
			System.out.println("2:影院管理");
			System.out.println("3:影厅管理");
			System.out.println("4:场次管理");
			System.out.println("5:订单管理");
			System.out.println("6:用户管理");
			System.out.println("0:返回");
			System.out.println("*********************");

			int num = Help.getInt("请输入您需要的选项：");
			switch (num){
				case 1:
					System.out.println("电影管理：\n");
					MovieView.movieMune();
					break;
				case 2:
					System.out.println("影院管理：\n");
					CinemaView.cinemaMune();
					break;
				case 3:
					System.out.println("影厅管理：\n");
					HallView.hallMune();
					break;
				case 4:
					System.out.println("场次管理：\n");
					SeasonView.seasonMune();
					break;
				case 5:
					System.out.println("订单管理：\n");
					TicketView.ticketMune();
					break;
				case 6:
					System.out.println("用户管理：\n");
					UserView.userAdminMune();
					break;
				case 0:
					System.out.println("返回\n");
					flag = false;
					break;
				default:
					System.out.println("输入错误,没有该选项\n");
					break;
			}
		} while (flag);
	}

	//test
	public static void main(String[] args) {
		AdminView.adminMune();
	}
}
