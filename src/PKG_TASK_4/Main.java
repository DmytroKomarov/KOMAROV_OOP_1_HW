package PKG_TASK_4;

public class Main {
    public static void main(String[] args) {

        Computer [] computers = new Computer[5];
        for (int i = 0; i<5; i++) {
            computers[i] = new Computer();
        }

        Computer computer_1 = new Computer();
        Computer computer_2 = new Computer();
        Computer computer_3 = new Computer();
        Computer computer_4 = new Computer();
        Computer computer_5 = new Computer();

        computer_1.setPcBrand("Acer");
        computer_1.setPcSeries("C24-963-UA91");
        computer_1.setPcCpu("Intel Core i3");

        computer_2.setPcBrand("ASUS");
        computer_2.setPcSeries("ASUS S340MF");
        computer_2.setPcCpu("Intel Core i3");

        computer_3.setPcBrand("Acer");
        computer_3.setPcSeries("Predator");
        computer_3.setPcCpu("Core i5");

        computer_4.setPcBrand("ASUS");
        computer_4.setPcSeries("ROG Strix GA35DX");
        computer_4.setPcCpu("Ryzen 9 3950X");

        computer_5.setPcBrand("Acer");
        computer_5.setPcSeries("TC-865");
        computer_5.setPcCpu("Core i5");

        for (int i = 0; i<5; i++) {
            switch (i) {
                case 0:
                    computers[i].setPcBrand(computer_1.getPcBrand());
                    computers[i].setPcSeries(computer_1.getPcSeries());
                    computers[i].setPcCpu(computer_1.getPcCpu());
                    break;
                case 1:
                    computers[i].setPcBrand(computer_2.getPcBrand());
                    computers[i].setPcSeries(computer_2.getPcSeries());
                    computers[i].setPcCpu(computer_2.getPcCpu());
                    break;
                case 2:
                    computers[i].setPcBrand(computer_3.getPcBrand());
                    computers[i].setPcSeries(computer_3.getPcSeries());
                    computers[i].setPcCpu(computer_3.getPcCpu());
                    break;
                case 3:
                    computers[i].setPcBrand(computer_4.getPcBrand());
                    computers[i].setPcSeries(computer_4.getPcSeries());
                    computers[i].setPcCpu(computer_4.getPcCpu());
                    break;
                case 4:
                    computers[i].setPcBrand(computer_5.getPcBrand());
                    computers[i].setPcSeries(computer_5.getPcSeries());
                    computers[i].setPcCpu(computer_5.getPcCpu());
                    break;
            }
        }
        for (int i = 0; i<5; i++) {
            System.out.println(computers[i].getPcBrand());
            System.out.println(computers[i].getPcSeries());
            System.out.println(computers[i].getPcCpu());
            System.out.println();
        }

    }
}
