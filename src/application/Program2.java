package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println("=========TEST 1 ============ findById======= " + department);
		
		List<Department> list = departmentDao.findAll();
		System.out.println("=======TEST 2 ======= findAll========");
		list.forEach(System.out :: println);
		
		
		System.out.println("=========TEST 3==========insert======");
		Department newdepartment = new Department("Cosmetics", null);
		departmentDao.insert(newdepartment);
		System.out.println("insertion test completed");

		System.out.println("==========TEST 4==================update=====");
		newdepartment = new Department("Production", 3);
		departmentDao.update(newdepartment);
		System.out.println("Update success");
		
		System.out.println("========TEST 5========deleteById=====");
		System.out.println("Enter Id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();

	}

}
