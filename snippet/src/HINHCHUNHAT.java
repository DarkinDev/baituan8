public abstract class HINHCHUNHAT extends HINHHOC {
    protected float dai; 
    protected float rong; 

    public HINHCHUNHAT() {
        super();
        this.dai = 0.0f;
        this.rong = 0.0f;
    }

    public HINHCHUNHAT(float dai, float rong) {
        super();
        this.dai = dai;
        this.rong = rong;
        this.ten = "Hinh Chu Nhat";
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
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