package emp;

import java.sql.*;

//DTO(Date Transfer Object)
//DB조화결과데이터 -> 화면으로
//화면에서 입력한 정보 -> DB에서 실행
public class EmployeeDTO {
	//DB의 테이블이 갖는 컬럼명으로 필드선언
	private int employee_id,department_id,salary,commission_pct,manager_id;
	private String last_name,first_name,name,email,phone_number,job_id,department_name,job_title;
	private Date hire_date;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFist_name(String first_name) {
		this.first_name = first_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
	
	
	//DB에서 조회한 컬럼정보를 필드에 담는다. -setter 메소드
	//조회한 정보를 리턴하는 메소드-getter 메소드
	//set필드명(파라미터){}
	//필드 = 파라미터값;
	//필드의 데이터타입 get필드명(){
	//return 필드명; }
}
