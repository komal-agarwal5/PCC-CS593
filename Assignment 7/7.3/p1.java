class EmployeeController {
    Employee model;
    EmployeeView view;

    EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    void setEmployeeSalary(int salary) {
        model.setSalary(salary);
    }

    int getEmployeeSalary() {
        return model.getSalary();
    }

    void updateView() {
        view.printEmployeeDetails(model.getId(), model.getName(), model.getSalary());
    }
}