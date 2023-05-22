package HomeTasks6;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Set<Notebook> setNotebooks = new HashSet<>();

        //main Set
        setNotebooks.add(new Notebook("Acer", "Nitro 5", 8512, 1024, "Windows", "Intel i5", "serial number 1"));
        setNotebooks.add(new Notebook("Acer", "Nitro 6", 12512, 2024, "Ubuntu", "Intel i7", "serial number 2"));
        setNotebooks.add(new Notebook("Acer", "Nitro 5", 512, 512, "Windows", "AMD SX", "serial number 3"));
        setNotebooks.add(new Notebook("Sony", "VAIO", 2512, 1024, "Ubuntu", "AMD FX", "serial number 4"));
        setNotebooks.add(new Notebook("Sony", "VAIO", 2512, 1024, "Windows", "Intel i5", "serial number 5"));
        setNotebooks.add(new Notebook("Sony", "VAIO", 512, 512, "Windows", "Intel i3", "serial number 6"));

        //duplicates for check equals() work
        setNotebooks.add(new Notebook("Acer", "Nitro 5", 8512, 1024, "Windows", "Intel i5", "serial number 1"));
        setNotebooks.add(new Notebook("Sony", "VAIO", 2512, 1024, "Windows", "Intel i5", "serial number 5"));

        //System.out.println(setNotebooks);

        setNotebooksFiltration(setNotebooks, createFilter());
    }

    public static void setNotebooksFiltration(Set<Notebook> setNotebooks, Notebook filterNotebook) {
        for (Notebook n : setNotebooks) {
            if (n.getBrand().contains(filterNotebook.getBrand()) &&
                    n.getNotebook_model().contains(filterNotebook.getNotebook_model()) &&
                    n.getRam_capacity() >= filterNotebook.getRam_capacity() &&
                    n.getHdd_capacity() >= filterNotebook.getHdd_capacity() &&
                    n.getOs().contains(filterNotebook.getOs()) &&
                    n.getCpu_model().contains(filterNotebook.getCpu_model()) &&
                    n.getSerial_number().contains(filterNotebook.getSerial_number()))
                System.out.println(n);
        }
    }

    public static Notebook createFilter() {
        Notebook filterNotebook = new Notebook("", "", 0, 0, "", "", "");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите параметры фильтра:");
            System.out.println("1 - Производитель");
            System.out.println("2 - Модель ноутбука");
            System.out.println("3 - Размер ОЗУ");
            System.out.println("4 - Размер ПЗУ");
            System.out.println("5 - OC");
            System.out.println("6 - Модель процессора");
            System.out.println("7 - S/N");
            System.out.println("Другая цифра- Применить фильтр");
            System.out.print("-->");
            switch (scanner.nextInt()) {
                case 1:
                    filterNotebook.setBrand(parameterValue("Производитель"));
                    break;
                case 2:
                    filterNotebook.setNotebook_model(parameterValue("Модель ноутбука"));
                    break;
                case 3:
                    filterNotebook.setRam_capacity(Integer.parseInt(parameterValue("ОЗУ в МБайтах")));
                    break;
                case 4:
                    filterNotebook.setHdd_capacity(Integer.parseInt(parameterValue("ПЗУ в МБайтах")));
                    break;
                case 5:
                    filterNotebook.setOs(parameterValue("ОС"));
                    break;
                case 6:
                    filterNotebook.setCpu_model(parameterValue("Модель процессера"));
                    break;
                case 7:
                    filterNotebook.setSerial_number(parameterValue("S/N:"));
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        return filterNotebook;
    }

    private static String parameterValue(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значение поля " + text + ":");
        return scanner.nextLine();
    }
}
