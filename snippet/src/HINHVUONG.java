public abstract class HINHVUONG extends HINHCHUNHAT {
    public HINHVUONG() {
        super();
    }

    public HINHVUONG(float canh) {
        super(canh, canh);
        this.ten = "Hinh Vuong";
    }

    @Override
    public void setDai(float dai) {
        super.setDai(dai);
        super.setRong(dai);
    }

    @Override
    public void setRong(float rong) {
        super.setDai(rong);
        super.setRong(rong);
    }

    @Override
    public abstract void xuatTen();

    @Override
    public abstract void inCHUVI();

    @Override
    public abstract void inDIENTICH();

    @Override
    public abstract void inTHETICH();

    @Override
    protected abstract void tinhCHUVI();

    @Override
    protected abstract void tinhDIENTICH();

    @Override
    protected abstract void tinhTHETICH();
}