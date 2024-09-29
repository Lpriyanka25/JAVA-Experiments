//Experiment no 03
class Employee
{
 String F_name;
 String L_name;
 double M_salary;
 Employee(String fn,String ln,double ms)
 {
 F_name=fn;
 L_name=ln;
 M_salary=ms;
 }
 void setFName(String fn)
 {
 F_name=fn;
 }
 String getFName()
 {
 return F_name;
 }
 void setLName(String ln)
 {
 L_name=ln;
 }
 String getLName()
 {
 return L_name;
 }
 void setMsalary(double s)
 {
 if (s<0)
 {
 M_salary=0;
 }
 else
 M_salary=s;
 }
 double getMsalary()
 {
 return M_salary;
 }
 void Raise()
 {
 M_salary=M_salary+(M_salary*0.1);
 } }
