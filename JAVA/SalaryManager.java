public class SalaryManager {
    double monSal;
    double work;
    double nat;
    double health;
     // 인스턴스 변수 선언;
    public static void main(String[] args) {
        SalaryManager total = new SalaryManager(); // 객체 생성
        total.getMonthlySalary(20000000);
        total.totalResult();
    
        
    } // main method
    public double getMonthlySalary(int yearlySalary) {
        double yearlySalary1 = yearlySalary; // 범위가 큰 타입으로 형변환을 하므로 별도 명시하지 않음.
        double monthlySalary = yearlySalary1 / 12.0;
        monSal = monthlySalary;
        calculateTax(monSal); // work에 할당
        calculateNationalPension(monSal); // nat에 할당
        calculateHealthInsurance(monSal); // health에 할당
        monSal -= (work + nat + health);
        return monSal;
    } // 한달 급여 계산하는 메소드.
    public double calculateTax(double monthSalary) {
        double tax = monthSalary * 12.5 / 100;
        work = tax;
        return work;
    } // 근로소득세 리턴.   
    public double calculateNationalPension(double monthSalary){
        double nationalPension = monthSalary * 8.1 / 100;
        nat = nationalPension;
        return nat;
        } // 연금 리턴.
    public double calculateHealthInsurance(double monthSalary) {
        double healthInsurance = monthSalary * 13.5 / 100;
        health = healthInsurance;
        return health;
    } // 건강 보험 리턴.
    public void totalResult() {
        System.out.println(monSal);
    }
    
}