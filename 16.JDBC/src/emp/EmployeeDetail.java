package emp;
import java.util.Scanner;
//특정사번 사원의 상세정보화면
public class EmployeeDetail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 사원의 사번? ");
		int id = sc.nextInt();
		
		System.out.println("[사원정보상세화면]");
		//DB연결
		EmployeeDAO dao = new EmployeeDAO();
		//DB에서 입력한 사번 사원의 정보를 조회해와 화면에 출력
		EmployeeDTO dto = dao.employeeDetail(id);
		System.out.printf("%-15s\t: %d\n","사번",dto.getEmployee_id());
		System.out.printf("%-15s\t: %s\n","성명",dto.getName());
		System.out.printf("%-15s\t: %s\n" ,"이메일",dto.getEmail());
		System.out.printf("%-15s\t: %s\n" ,"핸드폰",dto.getPhone_number());
		System.out.printf("%-15s\t: %d\n" ,"급여",dto.getSalary());
		System.out.printf("%-15s\t: %d\n" ,"커미션(%)",dto.getCommission_pct());		
		System.out.printf("%-15s\t: %s\n" ,"입사일자",dto.getHire_date());
		System.out.printf("%-15s\t: %s\n" ,"부서명",dto.getDepartment_name());
		System.out.printf("%-15s\t: %s\n" ,"업무제목",dto.getJob_title());
		
		sc.close();
	}
}
