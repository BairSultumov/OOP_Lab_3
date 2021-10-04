
public class Main {
	/**
	 * �� �3 ���
	 * ������� �7
	 * @author �������� ����
	 */
	
	public static void main(String[] args) {
		int n=3;
		/* ����������� ������ */
		Employee mas[]=new Employee[n];
		/* ������� 3 ������� ������ � �������� �� � ������ 
		 * ������ �������� ��������� �������� - ((������, 6350), (�������, 10350), (������, 56350))*/
		Employee Ivanov=new Employee("������",6350);
		Employee Sidorov=new Employee("�������",10350);
		Employee Petrov=new Employee("������",56350);
		mas[0]=Ivanov;
		mas[1]=Sidorov;
		mas[2]=Petrov;
		/* ������� �� ����� ������, ���������� �� ���� �������� */
		mas[0].displayInfo();
		mas[1].displayInfo();
		mas[2].displayInfo();
		/* ���������� � ����� ������� �������� �������� � ������� �� ����� */
		int midSalary=0;
		for(int i=0;i<n;i++) {
			midSalary+=mas[i].salary;
		}
		System.out.println("Middle salary= "+midSalary/n);
		
	}
}
class Employee{
	String name;
	int salary;
	/* 1 �����������*/
	{
		name="Undef";
		salary=0;
	}
	/* 2 ����������� ���� ������� ������ ��� */
	Employee(String name){
		this.name=name;
	}
	/* 3 ����������� ���� ������� ��� � �������� */
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	/* ����� ��� ������ �� ������ ������ � �������� */
	void displayInfo() {
		System.out.printf("Name: %s \tSalary: %d\n",name,salary);
	}
}
