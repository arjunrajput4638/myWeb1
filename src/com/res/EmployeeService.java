package com.res;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/employees")
public class EmployeeService {
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public java.util.List<Employee> getEmployees_JSON(){
		java.util.List<Employee> listEmps= EmployeeDAO.getAllEmployee();
		return listEmps;
	}
	@GET
	@Path("/{empno}")
	@Produces({MediaType.APPLICATION_XML})
	public Employee getEmployee(@PathParam("empno")String empno) {
		return EmployeeDAO.getEmployee(empno);
	}
}