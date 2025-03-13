public abstract class HINHTRU extends HINHTRON {
    protected float chieuCao;

    public HINHTRU() {
        super();
        this.chieuCao = 0.0f;
    }

    public HINHTRU(float banKinh, float chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
        this.ten = "Hinh Tru";
    }

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
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