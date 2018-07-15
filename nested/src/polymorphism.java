
public class polymorphism {

	// Figure 10.4: Employee.java
	   // Employee abstract superclass.
	
	   public abstract class Employee
	   {
	      private String firstName;
	      private String lastName;
	      private String socialSecurityNumber;
	
	     // three-argument constructor

	     public Employee( String first, String last, String ssn )
	     {
	        firstName = first;
	        lastName = last;
	        socialSecurityNumber = ssn;
	     } // end three-argument Employee constructor
	
	     // set first name
	     public void setFirstName( String first )
	     {
	        firstName = first;
	     } // end method setFirstName

	
	     // return first name
	     public String getFirstName()
	     {
	        return firstName;
	     } // end method getFirstName
	
	     // set last name

	     public void setLastName( String last )
	     {
	        lastName = last;
	     } // end method setLastName
	
	     // return last name
	     public String getLastName()
	     {
	        return lastName;
	     } // end method getLastName

	
	     // set social security number
	     public void setSocialSecurityNumber( String ssn )
	     {
	        socialSecurityNumber = ssn; // should validate
	     } // end method setSocialSecurityNumber
	
	     // return social security number

	     public String getSocialSecurityNumber()
	     {
	        return socialSecurityNumber;
	     } // end method getSocialSecurityNumber
	
	     // return String representation of Employee object
	     public String toString()
	     {
	        return String.format( "%s %s\nsocial security number: %s",
	           getFirstName(), getLastName(),
	                       getSocialSecurityNumber() );
	     } // end method toString

	
	     // abstract method overridden by subclasses
	     public abstract double earnings(); // no implementation here
	  } // end abstract class Employee


	     
	   // Figure 10.5: SalariedEmployee.java
	      // SalariedEmployee class extends Employee.
	   
	      public class SalariedEmployee extends Employee
	      {
	         private double weeklySalary;
	   
	         // four-argument constructor

	         public SalariedEmployee( String first, String last, String ssn,
	           double salary )
	        {
	           super( first, last, ssn ); // pass to Employee constructor
	           setWeeklySalary( salary ); // validate and store salary
	        } // end four-argument SalariedEmployee constructor

	   
	        // set salary
	        public void setWeeklySalary( double salary )
	        {
	           weeklySalary = salary < 0.0 ? 0.0 : salary;
	        } // end method setWeeklySalary
	   
	        // return salary

	        public double getWeeklySalary()
	        {
	           return weeklySalary;
	        } // end method getWeeklySalary
	   
	        // calculate earnings; override abstract method earnings
	                    // in Employee
	        public double earnings()
	        {
	           return getWeeklySalary();
	        } // end method earnings

	   
	        // return String representation of SalariedEmployee object
	        public String toString()
	        {
	           return String.format( "salaried employee: %s\n%s: $%,.2f",
	              super.toString(), "weekly salary", getWeeklySalary() );
	        } // end method toString

	     } // end class SalariedEmployee
	      
	      
	         // Figure 10.6: HourlyEmployee.java
	         // HourlyEmployee class extends Employee.
	      
	         public class HourlyEmployee extends Employee
	         {
	            private double wage; // wage per hour

	            private double hours; // hours worked for week
	      
	            // five-argument constructor
	           public HourlyEmployee( String first, String last, String ssn,
	              double hourlyWage, double hoursWorked )
	           {
	              super( first, last, ssn );
	              setWage( hourlyWage ); // validate hourly wage

	              setHours( hoursWorked ); // validate hours worked
	           } // end five-argument HourlyEmployee constructor
	      
	           // set wage
	           public void setWage( double hourlyWage )
	           {
	              wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
	           } // end method setWage

	      
	           // return wage
	           public double getWage()
	           {
	              return wage;
	           } // end method getWage
	      
	           // set hours worked

	           public void setHours( double hoursWorked )
	           {
	              hours = ( ( hoursWorked >= 0.0 ) && (
	                           hoursWorked <= 168.0 ) ) ?
	                 hoursWorked : 0.0;
	           } // end method setHours
	      
	           // return hours worked

	           public double getHours()
	           {
	              return hours;
	           } // end method getHours
	      
	           // calculate earnings; override abstract method
	                       // earnings in Employee
	           public double earnings()
	           {
	              if ( getHours() <= 40 ) // no overtime

	                 return getWage() * getHours();
	              else
	                 return 40 * getWage() + ( getHours() - 40 ) * getWage() *
	                                 1.5;
	           } // end method earnings
	      
	           // return String representation of HourlyEmployee object

	           public String toString()
	           {
	              return String.format(
	                             "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
	                 super.toString(), "hourly wage", getWage(),
	                 "hours worked", getHours() );
	           } // end method toString
	        } // end class HourlyEmployee



	            // Figure 10.7: CommissionEmployee.java
	           // CommissionEmployee class extends Employee.
	        
	            public class CommissionEmployee extends Employee
	            {
	               private double grossSales; // gross weekly sales

	               private double commissionRate; // commission percentage
	         
	               // five-argument constructor
	              public CommissionEmployee( String first, String last,
	                              String ssn,
	                 double sales, double rate )
	              {
	                 super( first, last, ssn );
	                 setGrossSales( sales );
	                 setCommissionRate( rate );
	              } // end five-argument CommissionEmployee constructor

	         
	              // set commission rate
	              public void setCommissionRate( double rate )
	              {
	                 commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
	              } // end method setCommissionRate

	         
	              // return commission rate
	              public double getCommissionRate()
	              {
	                 return commissionRate;
	              } // end method getCommissionRate
	         
	              // set gross sales amount

	              public void setGrossSales( double sales )
	              {
	                 grossSales = ( sales < 0.0 ) ? 0.0 : sales;
	              } // end method setGrossSales
	         
	              // return gross sales amount
	              public double getGrossSales()
	              {
	                 return grossSales;
	              } // end method getGrossSales

	         
	              // calculate earnings; override abstract method earnings
	                          // in Employee
	              public double earnings()
	              {
	                 return getCommissionRate() * getGrossSales();
	              } // end method earnings
	         
	              // return String representation of CommissionEmployee object

	              public String toString()
	              {
	                 return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
	                    "commission employee", super.toString(),
	                    "gross sales", getGrossSales(),
	                    "commission rate", getCommissionRate() );
	              } // end method toString
	           } // end class CommissionEmployee
	            
	            
	            
	               // Figure 10.8: BasePlusCommissionEmployee.java
	               // BasePlusCommissionEmployee class extends CommissionEmployee.
	            
	               public class BasePlusCommissionEmployee extends CommissionEmployee
	               {
	                  private double baseSalary; // base salary per week

	            
	                  // six-argument constructor
	                  public BasePlusCommissionEmployee( String first, String last,
	                    String ssn, double sales, double rate, double salary )
	                 {
	                    super( first, last, ssn, sales, rate );
	                    setBaseSalary( salary ); // validate and store base salary

	                 } // end six-argument BasePlusCommissionEmployee constructor
	            
	                 // set base salary
	                 public void setBaseSalary( double salary )
	                 {
	                    baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // non-negative

	                 } // end method setBaseSalary
	            
	                 // return base salary
	                 public double getBaseSalary()
	                 {
	                    return baseSalary;
	                 } // end method getBaseSalary

	            
	                 // calculate earnings; override method earnings in
	                             // CommissionEmployee
	                 public double earnings()
	                 {
	                    return getBaseSalary() + super.earnings();
	                 } // end method earnings
	            
	                 // return String representation of BasePlusCommissionEmployee
	                             // object
	                 public String toString()
	                 {
	                    return String.format( "%s %s; %s: $%,.2f",
	                       "base-salaried", super.toString(),
	                       "base salary", getBaseSalary() );
	                 } // end method toString

	              } // end class BasePlusCommissionEmployee



	                  // Figure 10.9: PayrollSystemTest.java
	                  // Employee hierarchy test program.

	               
	                  public class PayrollSystemTest
	                  {
	                     public  void main( String args[] )
	                     {
	                        // create subclass objects
	                        SalariedEmployee salariedEmployee =
	                          new SalariedEmployee( "John", "Smith", "111-11-1111",
	                                      800.00 );
	                       HourlyEmployee hourlyEmployee =
	                          new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75,
	                                      40 );
	                       CommissionEmployee commissionEmployee =
	                          new CommissionEmployee(
	                          "Sue", "Jones", "333-33-3333", 10000, .06 );
	                       BasePlusCommissionEmployee basePlusCommissionEmployee =
	                          new BasePlusCommissionEmployee(
	                          "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
	               
	                       System.out.println( "Employees processed individually:\n" );
	               
	                       System.out.printf( "%s\n%s: $%,.2f\n\n",
	                          salariedEmployee, "earned", salariedEmployee.earnings() );
	                       System.out.printf( "%s\n%s: $%,.2f\n\n",
	                          hourlyEmployee, "earned", hourlyEmployee.earnings() );
	                       System.out.printf( "%s\n%s: $%,.2f\n\n",
	                          commissionEmployee, "earned",
	                                      commissionEmployee.earnings() );
	                       System.out.printf( "%s\n%s: $%,.2f\n\n",
	                          basePlusCommissionEmployee,
	                          "earned", basePlusCommissionEmployee.earnings() );
	               
	                       // create four-element Employee array

	                       Employee employees[] = new Employee[ 4 ];
	               
	                       // initialize array with Employees
	                       employees[ 0 ] = salariedEmployee;
	                       employees[ 1 ] = hourlyEmployee;
	                       employees[ 2 ] = commissionEmployee;
	                       employees[ 3 ] = basePlusCommissionEmployee;
	               
	                       System.out.println(
	                                       "Employees processed polymorphically:\n" );
	               
	                       // generically process each element in array employees
	                       for ( Employee currentEmployee : employees )
	                       {
	                          System.out.println( currentEmployee ); // invokes toString

	               
	                          // determine whether element is a BasePlusCommissionEmployee
	                          if (
	                                          currentEmployee instanceof BasePlusCommissionEmployee )
	                          {
	                             // downcast Employee reference to
	                             // BasePlusCommissionEmployee reference

	                             BasePlusCommissionEmployee employee =
	                                ( BasePlusCommissionEmployee ) currentEmployee;
	               
	                             double oldBaseSalary = employee.getBaseSalary();
	                             employee.setBaseSalary( 1.10 * oldBaseSalary );
	                             System.out.printf(
	                                "new base salary with 10%% increase is: $%,.2f\n",
	                                employee.getBaseSalary() );
	                          } // end if
	               
	                          System.out.printf(
	                             "earned $%,.2f\n\n", currentEmployee.earnings() );
	                       } // end for
	               
	                       // get type name of each object in employees array
	                       for ( int j = 0; j < employees.length; j++ )
	                          System.out.printf( "Employee %d is a %s\n", j,
	                             employees[ j ].getClass().getName() );
	                    } // end main

	                 } // end class PayrollSystemTest
	                  
	                  
	                  
}












	