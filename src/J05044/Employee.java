// package J05044;

// public class Employee {
// private String id, name, position;
// private double basicSalary, allowance;
// private int daysWorked;
// private static int cnt = 0;

// public Employee(String name, String position, double basicSalary, int
// daysWorked) {
// this.id = "NV" + String.format("%02d", ++cnt);
// this.name = name;
// this.position = position;
// this.basicSalary = basicSalary;
// this.daysWorked = daysWorked;
// if (position.equals("GD")) {
// allowance = 500;
// } else if (position.equals("PGD")) {
// allowance = 400;
// } else if (position.equals("TP")) {
// allowance = 300;
// } else if (position.equals("KT")) {
// allowance = 250;
// } else {
// allowance = 100;
// }
// }

// public String getPosition() {
// return position;
// }

// public int calculateAdvance() {
// double totalIncome = (allowance + basicSalary * daysWorked) * 2 / 3;
// if (totalIncome < 25000) {
// return (int) (totalIncome / 1000) * 1000;
// } else {
// return 25000;
// }
// }

// public int calculateRemaining() {
// return (int) (basicSalary * daysWorked - calculateAdvance() + allowance);
// }

// @Override
// public String toString() {
// return id + " " + name + " " + (int) allowance + " " + (int) (basicSalary *
// daysWorked) + " "
// + calculateAdvance() + " " + calculateRemaining();
// }
// }