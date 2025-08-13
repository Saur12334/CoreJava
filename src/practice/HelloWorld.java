package practice;

public class HelloWorld{

	// void and non-parameterised
	public void printName(){
	System.out.println("Saurabh");
	}

	// void and parameterised
	public void printDesignation(String designation){
	System.out.println(designation);
	}

	//return non-parameterised
	public double getSalary(){
	double salary = 123.23;
	return salary;
	}

	//return parameterised
	public String getCity(String city){
	city = "Yavatmal";
	return city;
	}

   public static void main(String [] args){

	HelloWorld e = new HelloWorld();
    e.printName();

    e.printDesignation("Software Engineer");
    
    double salary = e.getSalary();
    System.out.print(salary);

    String city = e.getCity("Wardha");
    System.out.println(city);

}

}



