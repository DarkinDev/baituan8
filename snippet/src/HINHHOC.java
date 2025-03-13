abstract class HINHHOC {
    public static final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public HINHHOC(String ten) {
        this.ten = "";
        this.chuVi = 0.0f;
        this.dienTich = 0.0f;
        this.theTich = 0.0f;
    }

    public String getTen() {
        return ten;
    }

    public String setTen(String ten) {
        return this.ten = ten;
    }

    public float getChuVi() {
        return chuVi;
    }

    public float setChuVi(float chuVi) {
        return this.chuVi = chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public float setDienTich(float dienTich) {
        return this.dienTich = dienTich;
    }

    public float getTheTich() {
        return theTich;
    }

    public float setTheTich(float theTich) {
        return this.theTich = theTich;
    }

    public abstract void xuatTen();
    public abstract void inCHUVI();
    public abstract void inDIENTICH();
    public abstract void inTHETICH();
}