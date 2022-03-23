package jobs;

import java.util.ArrayList;
import java.util.Scanner;

import model.JobDAO;
import model.JobDTO;

//업무목록화면
public class JobList {
	void display(Scanner sc) {
		//Model : DAO,DTO
		//DB를 연결해서
		System.out.println("[직업목록하면]");
		System.out.println("번호 \t직무코드\t\t직무제목");
		JobDAO dao = new JobDAO();
		//유에서 업무목록을 조회해와 화면에 출력한다.
		
		ArrayList<JobDTO> list = dao.jobList();
		
		
		for(int idx = 0; idx<list.size();idx++){
			System.out.println(idx+1 +"  " +list.get(idx).getJob_id() +"   "+ 
						list.get(idx).getJob_title());
			}
//		for(JobDTO dto : list) {
////				int i = 0;
////				++i;
////				number[i] = dto.getJob_id();
//			
//			System.out.println(i +"  \t"+dto.getJob_id() + "    "+ dto.getJob_title());
//			
//		}
		System.out.println("-----------------------------------------");
		System.out.println("1.직무를 하고 있는 사원목록 2.홈으로 0.종료");
	
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("조회할 직무번호: ");
			JobDetail jobDetail = new JobDetail();
			
			try{jobDetail.display(sc, list.get(sc.nextInt()-1).getJob_id());
			}catch(Exception e) {
				System.out.println("잘못된 값");
				JobList jobList = new JobList();
				jobList.display(sc);
			}
			break;
		case 2:
			new EmployeeHome(sc);
			break;
		case 0 :
			System.exit(0);
			break;
		default : System.out.println("잘못입력된 값"); 
			JobList joblist = new JobList();
			joblist.display(sc);
			break;
		}
	}
}
