//Experiment no 05
importjava.time.LocalDate;
importjava.time.Period;
class Person
{
Stringname;
LocalDatebirthdate;
doubleheight;
doubleweight;
Stringaddress;
publicPerson(Stringname,LocalDatebirthdate,doubleheight,doublew
eight,Stringaddress)
{
this.name=name;
this.birthdate=birthdate;
this.height=height;
this.weight=weight;
this.address=address;
}
publicintCalculateAge()
{
LocalDatetoday=LocalDate.now();
returnPeriod.between(birthdate,today).getYears();
}
}
classStudentextendsPerson
{
introllno;
double[]marks;
publicStudent(Stringname,LocalDatebirthdate,doubleheight,doublew
eight,String
address,introllno,double[]marks)
{
super(name,birthdate,height,weight,address);
this.rollno=rollno;
this.marks=marks;
}
publicdoubleCalculateAvg()
{
doublesum=0;
for(doublemark:marks)
{
sum+=mark;
}
returnsum/marks.length;
}
}
classEmployeeextendsPerson
{
intempid;
doublesalary;
publicEmployee(Stringname,LocalDatebirthdate,doubleheight,doubl
eweight,String
address,intempid,doublesalary)
{
super(name,birthdate,height,weight,address);
this.empid=empid;
this.salary=salary;
}
publicdoubleCalculateTax()
{
//assumetaxis5%ofthesalary
returnsalary*0.05;
}
}
publicclassInheritenceTest
{
publicstaticvoidmain(String[]args)
{
Studentstudent=newStudent("shruti",LocalDate.of(2004,1,1),155,45,
"Ichalkaranji",
11,newdouble[]{91,90,89,95,88});
System.out.println("Thestudentnameis"+student.name);
System.out.println("Theageofstudentis"+student.CalculateAge());
System.out.println("TheAvergemarksofstudentsare"+student.Calcula
teAvg());
Employeeemployee=newEmployee("Payal",LocalDate.of(2004,10,04)
,162.40,"Ich",19,
50000);
System.out.println("Employeenameis"+employee.name);
System.out.println("Emplyeeageis"+employee.CalculateAge());
System.out.println("Employeesalaryis"+employee.salary);
System.out.println("Employee'sTotaltaxis"+employee.CalculateTax())
;
}
}
