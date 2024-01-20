package J07056;

public class Family {
    private static int cnt = 0;
    private String name, type, id;
    private int eNumber, firstNumber, lastNumber, quota;

    public Family() {
    }

    public Family(String name, String type, int firstNumber, int lastNumber) {
        this.id = String.format("KH%02d", ++cnt);
        this.name = nameFormatted(name);
        this.type = type;
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        this.eNumber = lastNumber - firstNumber;
        if (type.equals("A")) {
            this.quota = 100;
        } else if (type.equals("B")) {
            this.quota = 500;
        } else {
            this.quota = 200;
        }
    }

    public String getType() {
        return type;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getLastNumber() {
        return lastNumber;
    }

    public int inQuotaPrice() {
        if (eNumber < quota) {
            return eNumber * 450;
        } else {
            return quota * 450;
        }
    }

    public int outQuotaPrice() {
        if (eNumber > quota) {
            return (eNumber - quota) * 1000;
        } else {
            return 0;
        }
    }

    public int VAT() {
        return outQuotaPrice() * 5 / 100;
    }

    public int payPrice() {
        return inQuotaPrice() + outQuotaPrice() + VAT();
    }

    public static String nameFormatted(String ten) {
        StringBuilder tenChuanHoa = new StringBuilder();
        String[] words = ten.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                String chucaiDau = word.substring(0, 1).toUpperCase();
                String chucaiConLai = word.substring(1).toLowerCase();
                tenChuanHoa.append(chucaiDau).append(chucaiConLai).append(" ");
            }
        }
        return tenChuanHoa.toString().trim();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", id, name, inQuotaPrice(), outQuotaPrice(), VAT(), payPrice());
    }
}
