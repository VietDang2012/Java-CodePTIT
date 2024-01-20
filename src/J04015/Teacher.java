package J04015;

public class Teacher {
    private String ID, Name;
    private long Money, Rank, Reward, Income;

    public Teacher(String ID, String Name, long Money) {
        this.ID = ID;
        this.Name = Name;
        this.Money = Money;
        if (ID.charAt(1) == 'T') {
            this.Reward = 2000000;
        } else if (ID.charAt(1) == 'P') {
            this.Reward = 900000;
        } else {
            this.Reward = 500000;
        }
        if (ID.substring(2).charAt(0) == '0') {
            this.Rank = ID.substring(2).charAt(1) - '0';
        } else {
            this.Rank = (ID.substring(2).charAt(0) - '0') * 10 + ID.substring(2).charAt(1) - '0';
        }
        this.Income = (Money * Rank) + Reward;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setMoney(long money) {
        Money = money;
    }

    public long getMoney() {
        return Money;
    }

    public long getRank() {
        return Rank;
    }

    public long getReward() {
        return Reward;
    }

    public long getIncome() {
        return Income;
    }
}
