
public class Main {
	/**
	 * ЛР №3 ООП
	 * Вариант №7
	 * @author Султумов Баир
	 */
	
	public static void main(String[] args) {
		int n=3;
		/* Объявляется массив */
		Employee mas[]=new Employee[n];
		/* Создать 3 объекта класса и добавить их в массив 
		 * Задать объектам следующие значения - ((Иванов, 6350), (Сидоров, 10350), (Петров, 56350))*/
		Employee Ivanov=new Employee("Иванов",6350);
		Employee Sidorov=new Employee("Сидоров",10350);
		Employee Petrov=new Employee("Петров",56350);
		mas[0]=Ivanov;
		mas[1]=Sidorov;
		mas[2]=Petrov;
		/* Вывести на экран данные, хранящиеся во всех объектах */
		mas[0].displayInfo();
		mas[1].displayInfo();
		mas[2].displayInfo();
		/* Рассчитать в цикле среднюю зарплату служащих и вывести на экран */
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
	/* 1 конструктор*/
	{
		name="Undef";
		salary=0;
	}
	/* 2 конструктор если введено только имя */
	Employee(String name){
		this.name=name;
	}
	/* 3 конструктор если введены имя и зарплата */
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	/* метод для показа на экране данных о служащем */
	void displayInfo() {
		System.out.printf("Name: %s \tSalary: %d\n",name,salary);
	}
}
