abstract class HINHTRON extends HINHHOC {
    protected float banKinh;

    public HINHTRON() {
        super();
        this.banKinh = 0.0f;
    }

    public HINHTRON(float banKinh) {
        super();
        this.banKinh = banKinh;
        this.ten = "Hinh Tron";
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public abstract void xuatTen();

    @Override
    public abstract void inCHUVI();

    @Override
    public abstract void inDIENTICH();

    @Override
    public abstract void inTHETICH();

    protected abstract void tinhCHUVI();
    protected abstract void tinhDIENTICH();
    protected abstract void tinhTHETICH();
}