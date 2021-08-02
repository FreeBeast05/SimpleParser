import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Department departmentIT = new Department(1, "IT отдел", 0);
        Department departmentHR = new Department(2, "HR отдел", 0);
        Department departmentFinans = new Department(3, "Бухгатерия", 0);
        String file = "src/main/resources/Employees.csv";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Cp1251"))) {
            String s;
            List<Employee> employees = new LinkedList<>();
            while ((s = br.readLine()) != null) {
                String[] sPars = s.split(";");

                if (ValidEmployee.validNameOrSecondName(sPars[1]) && ValidEmployee.validNameOrSecondName(sPars[2]) && ValidEmployee.validSalary((Integer.parseInt(sPars[4]))))
                {
                    if (sPars[3].equals(departmentIT.getTitle())){
//                        Employee emp = new Employee(Integer.parseInt(sPars[0],
//                                sPars[1],
//                                sPars[2],
//                                departmentIT,
//                                Integer.parseInt(sPars[4])));
                        
                    }
                    else {
                        System.out.println(false);
                    }

//                    employees.add(new Employee(sPars[0], sPars[1],sPars[2], sPars[3], sPars[4]));

                }



            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
