package bt1b3;

public class HinhTron
{
    private final float PI = 3.14f;
    private float banKinh;
    private float chuVi;
    private float dienTich;
    public HinhTron(float PI, banKinh, chuVi, dienTich)
       {
           this.PI = PI
           this.banKinh = banKinh;
           this.chuVi = chuVi;
           this.dienTich = dienTich;
       }
    }
    public int getPI()
    {
        return PI;
    }
    public int getbanKinh()
    {
        return banKinh;
    }
    public int getchuVi()
    {
        return chuVi;
    }
    public int getdienTich()
    {
        return dienTich;
    }
}
public class HinhVuong
{
    private int chieuRong;
    private int chieuDai;
    private int duongCheo;
    private int dienTich;
    private int chuVi;
    public HinhVuong(int chieuRong, chieuDai, duongCheo, dienTich, chuVi)
    {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
        this.duongCheo = duongCheo;
        this.chuVi = chuVi;
        this.dienTich = dienTich;
    }
    public int getchieuRong()
    {
        return chieuRong;
    }
    public int getchieuDai()
    {
        return chieuDai;
    }
    public getduongCheo()
    {
        return duongCheo;
    }
    public int chuVi()
    {
            return chuVi;
    }
    public int dienTich()
    {
        return dienTich;
    }
}
