package csc.minhanh.module1;

public class Food {
    int hinhfood;
    String tenfood;
    String giafood;

    public Food(int hinhfood, String tenfood, String giafood) {
        this.hinhfood = hinhfood;
        this.tenfood = tenfood;
        this.giafood = giafood;
    }

    public int getHinhfood() {
        return hinhfood;
    }

    public void setHinhfood(int hinhfood) {
        this.hinhfood = hinhfood;
    }

    public String getTenfood() {
        return tenfood;
    }

    public void setTenfood(String tenfood) {
        this.tenfood = tenfood;
    }

    public String getGiafood() {
        return giafood;
    }

    public void setGiafood(String giafood) {
        this.giafood = giafood;
    }
}
